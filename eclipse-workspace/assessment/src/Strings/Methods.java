package Strings;

public class Methods {
	public static void main(String args[]){  
		
		//charAt method
		String name="javatpoint";  
		char ch=name.charAt(4);  
		System.out.println(ch + "\n");  
		
		//compareTo
		String nu1 = "Hello Java";
		System.out.println(name.compareTo(nu1) + "\n");
		
		//conatins
		System.out.println(name.contains("java") + "\n");
		
		//endsWith
		System.out.println("endsWith: " +   name.endsWith("int") + "\n");
		}
}
