package bonudIgorLuckij;

class A {
	int x = 0;

	void getX() {
		System.out.println(x);
	}

}

public class B extends A {
	int x = 1;
	
	public static void main(String[] args) {
		B b = new B();
		b.getX();

		C c = new C();
		c.getX();
	}
}

class C extends B {
	int x = 2;
}
