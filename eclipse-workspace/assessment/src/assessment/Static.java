package assessment;

public class Static {
	static int a = 10;   //static variable
	
	static void display(int a , String b) { //static method can be accessed directly 
		System.out.println(a + b);
	}
	
	static {  //static block gets executed first
		int a = 15;
		System.out.println("Initially I will get executed..");
		System.out.println("Merry Christmas");
		System.out.println("A = " + a);
	}
	public static void main(String[] args) {   //main method executes after static block
		System.out.println("Print a");
		display(10, "20");
	}

}
