import java.time.ZoneId;

public class TestClass{
    public static void main(String[] args) {
        System.out.println(new Integer(100).longValue());
    }

    public static void g(){
        System.out.println(ZoneId.getAvailableZoneIds());
    }
}

class AA {
    public static AA a(){return new AA();}
}
