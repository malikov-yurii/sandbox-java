package tmp.practice;

/**
 * @author Yurii Malikov
 */
public class SecondTask {

    public static void main(String[] args) {
        secondMethod();
    }

    public static void firstMethod() throws NullPointerException{
        Object object = null;
        object.equals(new Object());
    }

    public static void secondMethod(){
        Throwable throwable = null;
        try {
            firstMethod();
        } catch (Throwable e) {
            throwable = e;
            System.out.println(e);
        } finally {
            if (throwable != null) {
                throwable.printStackTrace();
            }
        }
    }

}
