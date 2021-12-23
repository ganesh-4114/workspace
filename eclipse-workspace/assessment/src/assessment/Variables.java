package assessment;

public class Variables {
	int num; // I'm a default variable
	
	String name = "ganesh";  //I'm a instance variable 
	
	void display(int a, int b) {
		num = a;         //assigning a value to num variable
		int num2 = b;    // I'm a local variable   
		System.out.println("Addition: " + (a+num2));
	}
	public static void main(String[] args) {
		Variables obj = new Variables();
		
		obj.display(10, 20);
		System.out.println(obj.num);
		
		obj.name = "vamsi";        //Assigning new value to instance variable
		System.out.println(obj.name);   //printing new value
	}

}
