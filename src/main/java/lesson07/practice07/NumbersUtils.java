package lesson07.practice07;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Yurii Malikov
 */
public class NumbersUtils {

    public static <T extends Number> Number sum(T first, T second){
        if (first instanceof Integer || first instanceof Short
                || first instanceof Byte || first instanceof AtomicInteger ){
            return first.intValue() + second.intValue();
        }

        if (first instanceof Long || first instanceof AtomicLong){
            return first.longValue() + second.longValue();
        }

        if (first instanceof Float){
            return first.floatValue() + second.floatValue();
        }

        return first.doubleValue() + second.doubleValue();
    }

    public static <T extends Number> Number subtract(T first, T second){
        if (first instanceof Integer || first instanceof Short
                || first instanceof Byte || first instanceof AtomicInteger ){
            return first.intValue() - second.intValue();
        }

        if (first instanceof Long || first instanceof AtomicLong){
            return first.longValue() - second.longValue();
        }

        if (first instanceof Float){
            return first.floatValue() - second.floatValue();
        }

        return first.doubleValue() - second.doubleValue();
    }

    public static <T extends Number> Number multiply(T first, T second){
        if (first instanceof Integer || first instanceof Short
                || first instanceof Byte || first instanceof AtomicInteger ){
            return first.intValue() * second.intValue();
        }

        if (first instanceof Long || first instanceof AtomicLong){
            return first.longValue() * second.longValue();
        }

        if (first instanceof Float){
            return first.floatValue() * second.floatValue();
        }

        return first.doubleValue() * second.doubleValue();
    }

}
