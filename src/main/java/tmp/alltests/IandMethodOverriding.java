package tmp.alltests;

/**
 * @author Yurii Malikov
 */
public interface IandMethodOverriding {
    
    Number f() throws Exception;
    
    void g() throws Exception;

}

interface IB extends IandMethodOverriding {
    
    Integer f() throws ClassNotFoundException;
    
    void g();
    
}