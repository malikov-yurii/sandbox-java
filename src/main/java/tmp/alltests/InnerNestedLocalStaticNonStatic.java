package tmp.alltests;

/**
 * @author Yurii Malikov
 */
public class InnerNestedLocalStaticNonStatic {


    private static int staticInt =1 ;

    private int nonStaticInt = 2;

    static class B {
        private static int staticNestedVariable =3;
        private int nonStaticNestedVariable =3;

        class C{
            void ffff(){
                System.out.println(staticInt);
                System.out.println(staticNestedVariable);
                System.out.println(nonStaticNestedVariable);
            }
        }

        void dd(){

        }

        static class D{
            void ffff(){
                System.out.println(staticInt);
            }

            static void sssss(){
                System.out.println(staticInt);
                System.out.println(staticNestedVariable);
            }
        }

    }

    class M{

        void ffff(){
            System.out.println(staticInt);
            System.out.println(nonStaticInt);
        }
    }

    void f() {
        class A {
            void ffff(){
                System.out.println(staticInt);
                System.out.println(nonStaticInt);
            }
        }
    }

    static class K{

        static int staticKvariable = 3;

        void fff(){
            System.out.println(staticInt);
            System.out.println(staticKvariable);
        }
    }

    static void g(){
        class BB{
            int nonStaticKvariable = 3;

            void fff(){
                System.out.println(staticInt);
                System.out.println(nonStaticKvariable);
            }
        }

    }

}
