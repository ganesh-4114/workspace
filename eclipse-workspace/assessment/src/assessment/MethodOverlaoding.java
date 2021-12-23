package assessment;

class A {
	void display(int a, int b) {
		System.out.println("Add: " + (a+b));
	}
}

class B extends A  {
	void dispaly(String a, String b) {
		System.out.println(a+" "+b);
	}
}

public class MethodOverlaoding  {

	public static void main(String[] args) {
		B obj = new B();
		obj.display(10, 20);
		obj.dispaly("Hello", "World");
	}

}
