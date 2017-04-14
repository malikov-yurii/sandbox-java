package lesson2;

public class PoolForWrappers127 {
    public static void main(String[] args) {

        short i = 126;
        Short a = i;
        Short b = i;

        i++;
        a++;
        b++;

// TODO: 4/12/2017 check pool only under 127 for Short, Long, Float and Double

        System.out.println(a == i);
        System.out.println(b == i);
        System.out.println(a == b);
        System.out.println(a.equals(b));

    }
}
