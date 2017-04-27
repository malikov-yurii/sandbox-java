package lesson06;

/**
 * @author Yurii Malikov
 */
public class BinariLiterals {


        public static void main(String[] args) {
            int i =  0b0111;
            float b = 0b0111L;

            long l = 0B011_1L;

            b = l;

            System.out.println("i = " + i);
            System.out.println("b = " + b);
            System.out.println("l = " + l);
        }

}
