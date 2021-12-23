package assessment;

class One {
	void display() {
		System.out.println("I will get Overrided");   //To access me, please create a new object with my class.
	}
}

class Two extends One  {
	void dispaly() {
		System.out.println("I just overrided the previous method");  
	}
}



public class MethodOverriding extends Two {

	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.dispaly();
	}

}
