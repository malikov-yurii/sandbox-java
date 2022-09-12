package tmp.practice;

/**
 * @author Yurii Malikov
 */
public class FirstTask {

    public static void main(String[] args) {
        try {
            Object object = null;
            object.equals(new Object());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
