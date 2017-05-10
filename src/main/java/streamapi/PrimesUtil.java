package streamapi;

import java.util.stream.IntStream;

import static java.lang.StrictMath.sqrt;

/**
 * @author Yurii Malikov
 */
public class PrimesUtil {

    public static long countPrimes(int max) {
        return IntStream.range(1, max).filter(PrimesUtil::isPrime).count();
    }

    public static long parallelCountPrimes(int max) {
        return IntStream.range(1, max).parallel().filter(PrimesUtil::isPrime).count();
    }

    private static boolean isPrime(long n) {
        return n > 1 && IntStream.rangeClosed(2, (int)sqrt(n)).noneMatch(divisor -> n % divisor == 0);
    }

}
