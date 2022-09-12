package tmp.alltests;

import java.io.IOException;

/**
 * @author Yurii Malikov
 */
public class ConstrucorsAndThrowsExceptions {

    ConstrucorsAndThrowsExceptions() throws IOException{

    }

    // TODO: 5/10/2017 Why is enough????????????????????????????????????
    public static void main(String[] args) throws Exception{


        new ConstrucorsAndThrowsExceptions();

    }

}

class ChildConstrucorsAndThrowsExceptions extends  ConstrucorsAndThrowsExceptions{


    ChildConstrucorsAndThrowsExceptions() throws ClassNotFoundException, Throwable {

    }
}
