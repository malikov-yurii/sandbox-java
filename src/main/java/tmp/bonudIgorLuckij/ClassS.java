package tmp.bonudIgorLuckij;

interface SomeInterface {
	void method();
}

class ClasA {

	public void method() {
		System.out.println("Method A");
	}
}

class ClasB extends ClasA {
	
}

class ClasC extends ClasB implements SomeInterface {
		
}


public class ClassS {
	public static void main(String[] args){
		SomeInterface c = new ClasC();
		c.method();
	}
}
