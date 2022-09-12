package tmp.lesson02;

public class PoolForWrappers127 {
    public static void main(String[] args) {

        // TODO: 4/14/2017 Why -129 is OK?
        long i = -129;
//        long i = 126;
        Long a = i;
        Long b = i;

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
