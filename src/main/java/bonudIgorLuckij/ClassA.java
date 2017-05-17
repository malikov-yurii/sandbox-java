package bonudIgorLuckij;

interface Interface {
	void method();
}

public class ClassA implements Interface {

	public void method() {
		System.out.println("Method A");
	}
}

abstract class ClassB extends ClassA {
	
	public abstract void method();
}

class ClassC extends ClassB implements Interface {
	
	public void method() {
		
	}
	
}
