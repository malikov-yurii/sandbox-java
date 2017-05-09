package streamapi.streamguidance;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Yurii Malikov
 */
public class StreamBasics {

    public static void main(String[] args) {

        // Example 1
        IntStream streamFromString = "ed2c4ab".chars();
        streamFromString
                .filter(Character::isLetter)
                .sorted()
                .forEach((e)->System.out.print((char) e + ", "));
        System.out.println( "; Stream implementation: " + streamFromString.getClass().getName());
    /*  Console output:
        a, b, c, d, e, ; Stream implementation: java.util.stream.IntPipeline$Head
    */

        // Example 2
        Arrays.stream(new String[]{"a1", "a2", "a3"})
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);
    /*  Console output:
        a3
    */

        // Example 3
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

        // Example 4
        Stream.<String>builder()
                .add("c1").add("c3").add("c2").build()
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

    /*  Console output:
        3
    */

        // Example 5
        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "w" + i)
                .forEach(System.out::println);
    /*  Console output:
        w1
        w2
        w3
    */

        // Example 6
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

        // Example 7
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

        // Example 8
        Stream.of("dd2", "aa2", "bb1")
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    /*  sort: aa2; dd2
        sort: bb1; aa2
        sort: bb1; dd2
        sort: bb1; aa2
        filter: aa2
        map: aa2
        forEach: AA2
        filter: bb1
        filter: dd2
    */

        // Example 9
        Stream<String> stream =
                Stream.of("dd2", "aa2", "bb1", "bb3", "cc")
                        .filter(s -> s.startsWith("a"));

        stream.anyMatch(s -> true);    // works fine
        //stream.noneMatch(s -> true);   // here we have Exception, because stream can be run processed only once


        // Example 10
        IntStream.range(1, 3)
                .mapToObj(i -> new Foo("Foo" + i))
                .peek(f -> IntStream.rangeClosed(1, 3)
                        .mapToObj(i -> new Bar("Bar" + i + " from " + f.name))
                        .forEach(f.bars::add))
                .flatMap(f -> f.bars.stream())
                .forEach(b -> System.out.println(b.name));
    /*  Console output:
        Bar1 from Foo1
        Bar2 from Foo1
        Bar3 from Foo1
        Bar1 from Foo2
        Bar2 from Foo2
        Bar3 from Foo2
    */
    }

}
