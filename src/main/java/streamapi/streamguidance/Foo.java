package streamapi.streamguidance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yurii Malikov
 */
public class Foo {
    String name;
    List<Bar> bars = new ArrayList<>();

    Foo(String name) {
        this.name = name;
    }
}

class Bar {
    String name;

    Bar(String name) {
        this.name = name;
    }
}

