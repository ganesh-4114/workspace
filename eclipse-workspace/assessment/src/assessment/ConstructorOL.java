package assessment;


public class ConstructorOL {
	
	ConstructorOL(int a, int b) {
		System.out.println("Add: " + (a+b));
	}
	
	ConstructorOL(String a, String b) {
		System.out.println(a + " " + b);
	}
	
	public static void main(String[] args) {
		
		System.out.println("assigning int values");
		ConstructorOL obj = new ConstructorOL(10, 20);    //Passing int values will call 1st constructor
		
		System.out.println();

		System.out.println("Passing Strings");
		ConstructorOL obj1 = new ConstructorOL("Hello", "World"); //passing strings call 2nd constructor
	}

}
