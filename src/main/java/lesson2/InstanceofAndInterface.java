package lesson2;

public class InstanceofAndInterface implements Inerface1{
    public static void main(String[] args) {
        System.out.println(new InstanceofAndInterface() instanceof Inerface1);
    }
}

interface Inerface1 {}
