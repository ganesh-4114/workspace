package assessment;

abstract class People {		//An abstract class contains both abstract & concrete methods
	
	abstract void Role(String person,String role);  //abstract method
	
	void Company(String name) {            //normal method
		System.out.println("Works at " + name);
	}
}

public class Abstract extends People{
	
	void Role(String person, String role) {                    //updating abstract to normal
		System.out.println(person + " is the CEO of " + role);
		
	}

	public static void main(String[] args) {
		Abstract obj = new Abstract();
		obj.Role("Elon Musk","Tesla");
		obj.Company("Tesla Motors");     //accessing normal method
			
	}

	

}
