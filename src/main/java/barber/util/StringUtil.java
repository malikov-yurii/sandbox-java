package barber.util;

/**
 * @author Yurii Malikov
 */
public class StringUtil {

    public static String capitalizeFirstLetter(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

}
