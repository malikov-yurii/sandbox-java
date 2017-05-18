package barber.util;

/**
 * @author Yurii Malikov
 */
public class StopWatch {

    private static long startPoint;

    public static void reset(){
        startPoint = System.currentTimeMillis();
    }

    public static String getTimePoint(){
        return String.format("TIMEPOINT[%05d]", (System.currentTimeMillis() - startPoint) % 10_000);
    }

}
