package tmp.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Yurii Malikov
 */
public class StreamBasics {

    public static void main(String[] args) {

        // team viewer code:   m06-428-427

        // Example 1 Print letters in alphabet order
        IntStream streamFromString = "ed2c4ab".chars();
        streamFromString
                .filter(Character::isLetter)
                .sorted()
                .forEach((e)->System.out.print((char) e + ", "));
        System.out.println( "; Stream implementation: "
                + streamFromString.getClass().getName());
    /*  Console output:
        a, b, c, d, e, ; Stream implementation:
         java.util.stream.IntPipeline$Head
    */

        // Example 2 Print third element
        Arrays.stream(new String[]{"a", "b", "c"})
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);
    /*  Console output:
        c
    */

        // Example 3 Infinite streams

        Stream.iterate(1, n -> n + 1)
                .limit(3)
                .mapToInt(n -> 2 * n)
                .average()
                .ifPresent(System.out::println);
    /*  Console output:
        4.0
    */

        Stream.generate(() -> "a1")
                .limit(2)
                .forEach(System.out::println);
    /*  Console output:
            a1
            a1
    */

        // Example 4 Print max int
        Stream.<String>builder()
                .add("c1").add("c3").add("c2").build()
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

    /*  Console output:
        3
    */

        // Example 5 Map primitive stream to reference stream
        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "w" + i)
                .forEach(System.out::println);
    /*  Console output:
        w1
        w2
        w3
    */

        // Example 6 Intermediate operators are lazy!
        Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
                .filter(s -> {
                    System.out.println("Filter: " + s);
                    return true;
                });
    /* Prints nothing! No terminal operation! */


        Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
                .filter(s -> {
                    System.out.println("Filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("Print using forEach: " + s));
    /*  Filter:  dd2
        Print using forEach forEach: dd2
        Filter: aa2
        Print using forEach forEach: aa2
        Filter: bb1
        Print using forEach forEach: bb1
    */

        // Example 7 Find if any element matches predicate
        System.out.println(
                Stream.of("dd2", "aa2", "bb1")
                        //.noneMatch(s -> s.startsWith("a"))
                        //.allMatch(s -> s.startsWith("a"))
                        .anyMatch(s -> {
                            System.out.println("anyMatch: " + s);
                            return s.startsWith("a");
                        })
        );
    /*  anyMatch: dd2
        anyMatch: aa2
        true
    */

        // Example 8 Sort is one level operation
        Stream.of("d", "a2", "a1", "b")
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s <-> %s\n", s1, s2);
                    return s1.compareTo(s2);})
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    /*  sort: a2 <-> d
        sort: a1 <-> a2
        sort: b <-> a1
        sort: b <-> a2
        sort: b <-> d
        filter: a1
        map: a1
        forEach: A1
        filter: a2
        map: a2
        forEach: A2
        filter: b
        filter: d
    */

        // Example 9 Streams can be used just once
        Stream<String> stream =
                Stream.of("dd2", "aa2", "bb1", "bb3", "cc")
                        .filter(s -> s.startsWith("a"));

        stream.anyMatch(s -> true);    // works fine

        //stream.noneMatch(s -> true);
        // here we have Exception, because stream can be run processed only once


        // Example 10 FlatMap returns stream of all users skills as one level sequence
        IntStream.range(1, 3)
                .mapToObj(i -> new Person("Person" + i))
                .peek(person -> IntStream.rangeClosed(1, 3)
                        .mapToObj(i -> new Skill("Skill" + i
                                + " of " + person.getName()))
                        .forEach(person.getSkills()::add))
                .flatMap(person -> person.getSkills().stream())
                .forEach(skill -> System.out.println(skill.getName()));
    /*  Console output:
        Skill1 of Person1
        Skill2 of Person1
        Skill3 of Person1
        Skill1 of Person2
        Skill2 of Person2
        Skill3 of Person2
    */
    }

}
