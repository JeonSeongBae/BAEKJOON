public class Main1 {
	final static int a = 1;

	public static void main(String[] args) {
		A b = new B();
		b.foo();
		System.out.println(b.i);
		A a = new A();
		System.out.println(a.i);
		a.foo();
	}
}

class B extends A {
	int i = 2;

	@Override
	public void foo() {

		System.out.println("B");
	}
}

class A {
	int i = 1;

	public void foo() {
		System.out.println("A");
	}

}
