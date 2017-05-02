package lesson07.practice07;

/**
 * @author Yurii Malikov
 */
public class NumbersUtils {

    public static <T extends Number> Number sum(T first, T second){
        if (first instanceof Integer){
            return first.intValue() + second.intValue();
        }
        if (first instanceof Long){
            return first.longValue() + second.longValue();
        }
        if (first instanceof Float){
            return first.floatValue() + second.floatValue();
        }

        return first.doubleValue() + second.doubleValue();
    }

    public static <T extends Number> Number subtract(T first, T second){
        if (first instanceof Integer){
            return first.intValue() - second.intValue();
        }
        if (first instanceof Long){
            return first.longValue() - second.longValue();
        }
        if (first instanceof Float){
            return first.floatValue() - second.floatValue();
        }

        return first.doubleValue() - second.doubleValue();
    }

    public static <T extends Number> Number multiply(T first, T second){
        if (first instanceof Integer){
            return first.intValue() * second.intValue();
        }
        if (first instanceof Long){
            return first.longValue() * second.longValue();
        }
        if (first instanceof Float){
            return first.floatValue() * second.floatValue();
        }

        return first.doubleValue() * second.doubleValue();
    }

}
