package streamapi;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.StrictMath.sqrt;

/**
 * @author Yurii Malikov
 */
public class StreamUtil {

//    public static List<MealWithExceed> getFilteredWithExceeded(Collection<Meal> meals, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
//        Map<LocalDate, Integer> caloriesSumByDate = meals.stream()
//                .collect(
//                        Collectors.groupingBy(Meal::getDate, Collectors.summingInt(Meal::getCalories))
//                      Collectors.toMap(Meal::getDate, Meal::getCalories, Integer::sum)
//                );
//
//        return meals.stream()
//                .filter(meal -> TimeUtil.isBetween(meal.getTime(), startTime, endTime))
//                .map(meal -> createWithExceed(meal, caloriesSumByDate.get(meal.getDate()) > caloriesPerDay))
//                .collect(Collectors.toList());
//    }




    static Stream<Node> of(NodeList list) {
        return IntStream.range(0, list.getLength()).mapToObj(list::item);
    }



    public static long countPrimes(int max) {
        return IntStream.range(1, max).filter(StreamUtil::isPrime).count();
    }
    public static long parallelCountPrimes(int max) {
        return IntStream.range(1, max).parallel().filter(StreamUtil::isPrime).count();
    }


    private static boolean isPrime(long n) {
        return n > 1 && IntStream.rangeClosed(2, (int)sqrt(n)).noneMatch(divisor -> n % divisor == 0);
    }

}
