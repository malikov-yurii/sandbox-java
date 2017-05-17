import java.io.IOException;

/**
 * @author Yurii Malikov
 */
public class ArgsMethodOverriding {

        Number f(Number number) throws Exception{return null;}

        void g(Number number) throws Exception{}

    }

    class ChildArgsMethodOverriding extends ArgsMethodOverriding{

        @Override
        Double f(Number number) throws ClassNotFoundException, IOException{ return null;}

        @Override
        void g(Number number) throws Exception{}

    }
