package tmp.alltests;

/**
 * @author Yurii Malikov
 */
public interface IArgsAndOverriding {


    Number f(Number number) throws Exception;

    void g() throws Exception;

}

interface ChildIArgsAndOverriding extends IArgsAndOverriding {

    Integer f(Object number) throws Throwable;

    Integer f(Number number) throws ClassNotFoundException;

    void g();

}