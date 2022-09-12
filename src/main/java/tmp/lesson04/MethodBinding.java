package tmp.lesson04;

/**
 * Created by Malikov on 4/19/2017.
 */
public class MethodBinding {

    public static void main(String[] args) {
        f(1);
        f(new Integer(1));
    }

    static void f(int i){
        System.out.println("int");
    }
    static void f(Integer i){
        System.out.println("integeer");
    }
}

