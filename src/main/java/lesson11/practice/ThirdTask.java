package lesson11.practice;

/**
 * @author Yurii Malikov
 */
public class ThirdTask {
    public static void main(String[] args) {
        System.out.println(firstMethod(null));
    }

    public static String firstMethod(Object object){
        try {
            if (object == null) {
                throw new RuntimeException("Non initialized argument object provided for method.");
            }
        } catch (Throwable e) {
            System.out.println("Hi from catch sout!");
            return "Hi from catch return!";
        } finally {
            System.out.println("Hi from finally sout!");
            return "Hi from finally return!";
        }
    }

}
