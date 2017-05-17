/**
 * @author Yurii Malikov
 */
public class ForwardReference {

    int i =2 ;

    {
        System.out.println(this.j);
    }

    int j = 3;

    public static void main(String[] args) {

        new ForwardReference();
    }

}
