package lesson04;

/**
 * Created by Malikov on 4/21/2017.
 */
public class InitializationOrder {
    public static void main(String[] args) {
        new B();
    }
}

class A {

    private String string_A_1 = print("string_A_1");

    { print("initializer before A");}

    private String string_A_2 = print("string_A_2");

    A(){ print("Constructor A"); }

    { print("initializer after A");}

    static String staticFieldA_1 = print("staticField_A_1");

    static{ print("staticInitializer_A_1"); }

    static String staticFieldA_2 = print("staticField_A_2");

    public static String print(String string){
        System.out.println(string);
        return string;
    }
}

class B extends A {

    static String static_B_1 = print("staticField_B_1");

    static{ print("staticInitializer_B_1");}

    static String static_B_2 = print("staticField_B_2");

    String string_B_1 = print("string b1");

    {print("initializer before B");}

    B(){print("Constructor B");}

    {print("initializer after B");}

    String string_B_2 = print("string b2");

}
