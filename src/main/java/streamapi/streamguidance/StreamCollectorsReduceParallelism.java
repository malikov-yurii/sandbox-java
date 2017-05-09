package streamapi.streamguidance;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Yurii Malikov
 */
public class StreamCollectorsReduceParallelism {

    public static void main(String[] args) throws Exception{

        //****************** Collectors ******************

        // Example 11
        File file = new File("file.txt");
        file.deleteOnExit();

        PrintWriter out = new PrintWriter(file);
        out.println("Vive la France");
        out.println("Slava Ukraini");
        out.println("God bless America");
        out.close();

        Stream<String> streamFromFiles = Files.lines(Paths.get(file.getAbsolutePath()));
        System.out.println("streamFromFiles = " + streamFromFiles.collect(Collectors.toList()) + "; " +
                "Stream implementation: " + streamFromFiles.getClass().getName());
    /*  Console output:
        streamFromFiles = [Vive la France, Slava Ukraini, God bless America]; Stream implementation: java.util.stream.ReferencePipeline$Head
    */

        // Example 12
        Collection<Person> persons =
                Arrays.asList(
                        new Person("Andrew", 20, true),
                        new Person("Igor", 23, true),
                        new Person("Ira", 23, true),
                        new Person("Vitia", 12, false));

        Map<Integer, List<Person>> personsByAge = persons
                .stream()
                .collect(Collectors.groupingBy(Person::getAge));

        personsByAge
                .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
    /*  Console output:
        age 20: [Andrew]
        age 23: [Igor, Ira]
        age 12: [Vitia]
    */

        Map<Boolean, Integer> programmersAndNonProgrammersAgeSum = persons.stream()
                .collect(Collectors.groupingBy(Person::isProgrammer, Collectors.summingInt(Person::getAge)));

        programmersAndNonProgrammersAgeSum
                .forEach((isProgrammer, ageSum) -> System.out.format("isProgrammer=%b  :  ageSum=%d\n", isProgrammer, ageSum));
    /*  Console output:
        isProgrammer=false  :  ageSum=12
        isProgrammer=true   :  ageSum=66
    */

        // Example 13
        Double averageAge = persons
                .stream()
                .collect(Collectors.averagingInt(Person::getAge));
        System.out.println(averageAge);
    /*  Console output:
        19,5
    */

        // Example 14
        IntSummaryStatistics ageSummary =
                persons
                        .stream()
                        .collect(Collectors.summarizingInt(Person::getAge));

        System.out.println(ageSummary);
    /*  Console output:
        IntSummaryStatistics{count=4, sum=78, min=12, average=19.500000, max=23}
    */

        // Example 15
        String phrase = persons
                .stream()
                .filter(Person::isProgrammer)
                .map(Person::getName)
                .collect(Collectors.joining(" and ", "Hey, ", " are awesome programmers!"));
        System.out.println(phrase);
    /*  Console output:
        Hey, Andrew and Igor and Ira are awesome programmers!
    */

        // Example 16
        Map<Integer, String> map = persons
                .stream()
                .collect(Collectors.toMap(
                        Person::getAge,
                        Person::getName,
                        (name1, name2) -> name1 + ";" + name2));

        System.out.println(map);
    /*  Console output:
        {20=Andrew, 23=Igor;Ira, 12=Vitya}
    */

        // Example 17
        Collector<Person, StringJoiner, String> personNameCollector =
                Collector.of(
                        () -> new StringJoiner(" | "),          // supplier
                        (j, p) -> j.add(p.getName().toUpperCase()),      // accumulator
                        StringJoiner::merge,                             // combiner
                        StringJoiner::toString);                         // finisher
        String names = persons
                .stream()
                .collect(personNameCollector);
        System.out.println(names);
    /*  Console output:
        ANDREW | IGOR | IRA | VITIA
    */

        //****************************  stream.reduce() **********************************

        // Example 18
        persons.stream()
                .reduce((p1, p2) -> p1.getAge() < p2.getAge() ? p1 : p2)
                .ifPresent(System.out::println);
    /*  Console output:
        Vitia
    */

        // Example 20
        Person result =
                persons.stream()
                        .reduce(new Person("", 0, false),
                                (p1, p2) -> {
                                    p1.setAge(p1.getAge() + p2.getAge());
                                    p1.setName(p1.getName() + p2.getName());
                                    return p1;
                                });
        System.out.format("name=%s; age=%s\n", result.getName(), result.getAge());
    /*  Console output:
        name=AndrewIgorIraVitia; age=78
    */

        // Example 21
        System.out.println(
                persons.parallelStream()
                        .reduce(0,
                                (sum, p) -> {
                                    System.out.format("accumulator: sum=%s; person=%s [%s]\n",
                                            sum, p, Thread.currentThread().getName());
                                    return sum += p.getAge();
                                },
                                (sum1, sum2) -> {
                                    System.out.format("combiner: sum1=%s; sum2=%s [%s]\n",
                                            sum1, sum2, Thread.currentThread().getName());
                                    return sum1 + sum2;
                                })
        );
    /*  Console output:
        accumulator: sum=0; person=Ira [main]
        accumulator: sum=0; person=Andrew [ForkJoinPool.commonPool-worker-2]
        accumulator: sum=0; person=Vitia [ForkJoinPool.commonPool-worker-3]
        accumulator: sum=0; person=Igor [ForkJoinPool.commonPool-worker-1]
        combiner: sum1=23; sum2=12 [ForkJoinPool.commonPool-worker-3]
        combiner: sum1=20; sum2=23 [ForkJoinPool.commonPool-worker-1]
        combiner: sum1=43; sum2=35 [ForkJoinPool.commonPool-worker-1]
        78
    */

        // ********************* Streams and parallelism *******************************

        // Example 22
        //List sortedList =
        Arrays.asList("a1", "c1", "d1", "b1")
                .parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .sorted((s1, s2) -> {                                      // Arrays.parallelSort()    underneath!!!
                    System.out.format("sort: %s <> %s [%s]\n",
                            s1, s2, Thread.currentThread().getName());
                    return s1.compareTo(s2);
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",s, Thread.currentThread().getName()));
                //.collect(Collectors.toList());
        //System.out.println(sortedList);
        /*  Console output:
            filter: d1 [main]
            map: d1 [main]
            filter: c1 [ForkJoinPool.commonPool-worker-1]
            map: c1 [ForkJoinPool.commonPool-worker-1]
            filter: a1 [ForkJoinPool.commonPool-worker-2]
            map: a1 [ForkJoinPool.commonPool-worker-2]
            filter: b1 [ForkJoinPool.commonPool-worker-3]
            map: b1 [ForkJoinPool.commonPool-worker-3]
            sort: C1 <> A1 [main]
            sort: D1 <> C1 [main]
            sort: B1 <> D1 [main]
            sort: B1 <> C1 [main]
            sort: B1 <> A1 [main]
            forEach: B1 [ForkJoinPool.commonPool-worker-2]
            forEach: C1 [main]
            forEach: D1 [ForkJoinPool.commonPool-worker-1]
            forEach: A1 [ForkJoinPool.commonPool-worker-3]
        */

        // Example 23
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        System.out.println(commonPool.getParallelism());
        /*  Console output:
            3
        */

        long startTime = System.currentTimeMillis();
        StreamUtil.countPrimes(50000);
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
        /*  Console output:
            154
        */

        startTime = System.currentTimeMillis();
        StreamUtil.parallelCountPrimes(50000);
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        /*  Console output:
            45
        */

        // https://dzone.com/articles/think-twice-using-java-8 Think Twice Before Using Java 8 Parallel Streams

    }

}
