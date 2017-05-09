package streamapi;

import java.util.stream.Stream;

/**
 * @author Yurii Malikov
 */
public class Runner {

    public static void main(String[] args) {


/*

        System.out.println("All Honda motorcycles older than 2013: ");
//        MotorcycleUtil.getByBrandAndOlderThan(motorcycles, "Honda", 2013).forEach(System.out::println);


        motorcycles
                .stream()
                .filter(motorcycle -> (motorcycle.getBrand().equals("Honda") && motorcycle.getYear() < 2013))
//                .filter(motorcycle -> motorcycle.getBrand().equals("Honda"))
//                .peek(System.out::println)
//                .filter(motorcycle -> motorcycle.getYear() < 2013)
//                .collect(Collectors.toList())
                .forEach(System.out::println)
        ;


        System.out.println("\nAll sport motorcycles : ");
        MotorcycleUtil.getSportMotorcycles(motorcycles).forEach(System.out::println);

        System.out.println("\n The first motorcycle of 2012 in the list:\n"
                + MotorcycleUtil.getFirstMotorcycleOfYear(motorcycles, 2012));
*/

/*

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList())
                .forEach(System.out::println)
        ;
*/


/*
        System.out.println(
                Stream.of(1, 10, 3, 7, 5)
//                        .peek(num -> System.out.println("will filter " + num))
//                        .filter(x -> x > 15)
//                        .findFirst()
//                        .orElseThrow(RuntimeException::new)
//                        .get()
//                        .orElse(0)
//                        .isPresent()
                        .allMatch(x -> x <11)
        );
*/

/*

//      Sum of odd numbers from collection
        System.out.println(
                IntStream.of(1, 10, 3, 7).filter(n -> n % 2 != 0).reduce((s1, s2) -> s1 + s2).orElse(0)
//                IntStream.of(1, 10, 3, 7).parallel().filter(n -> n % 2 != 0).reduce((s1, s2) -> s1 + s2).orElse(0)
        );
*/



/*
        Collection<Integer> integers = Arrays.asList(1, 2, 3 ,4 ,5 ,6, 7 ,8 ,9);
        Spliterator<Integer> integerSpliterator1 = integers.spliterator();
        System.out.println(integerSpliterator1.characteristics());
        integerSpliterator1.tryAdvance(System.out::println);
        System.out.println(integerSpliterator1.estimateSize());
        Spliterator<Integer> integerSpliterator2 = integerSpliterator1.trySplit();
        System.out.println(integerSpliterator1.estimateSize());
        System.out.println(integerSpliterator2.estimateSize());
        integerSpliterator1.forEachRemaining(System.out::println);
*/

/*

//        https://dzone.com/articles/think-twice-using-java-8 Think Twice Before Using Java 8 Parallel Streams
        long startTime = System.currentTimeMillis();
        StreamUtil.countPrimes(5000);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        startTime = System.currentTimeMillis();
        StreamUtil.parallelCountPrimes(5000);
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
*/

        Stream intStream = Stream.of("1", "2", "2");
        System.out.println(intStream.getClass().getName());


        //    FUUUUUUUUUUUUUUUUUUUUUUUUUUUUL







    }


}
