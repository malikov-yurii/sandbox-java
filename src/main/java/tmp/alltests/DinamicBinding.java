package tmp.alltests;

public class DinamicBinding {

    public static void main(String[] args) {

     new B(3);

    }

}

class A{

    int a;

    A(int i){
        a = i + i;
        System.out.println(get());
    }

    int get(){
        return a;
    }
}

class B extends A{
    int b;

    B(int i){
        super(i);
       b = i;
    }

    int get(){
        return b;
    }
}


