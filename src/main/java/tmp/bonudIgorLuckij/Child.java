package tmp.bonudIgorLuckij;

class Parent {

	void justMethod() {
		staticMethod();
	}

	static void staticMethod() {
		System.out.println("Parent");
	}
}

public class Child extends Parent {
	
	static void staticMethod() {
		System.out.println("Child");
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.justMethod();
	}
}
