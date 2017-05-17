/**
 * @author Yurii Malikov
 */
public class ClassAndMethodOverriding {

    Number f() throws Exception{return null;}

    void g() throws Exception{}

}

class ChildClassAndMethodOverriding extends ClassAndMethodOverriding{

    @Override
    Double f() { return null;}

    @Override
    void g() throws Exception{}

}