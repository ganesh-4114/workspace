package assessment;

class Space {
	String planet = "Earth";
}

class ParallelUniverse extends Space {
	String planet = "New Earth";
	void display() {
	System.out.println("Hi I am " + planet + " from Parallel Universe");
	System.out.println(super.planet + " is from MilkyWay Galaxy"); //super is used to previous class variables.
	
}
}

public class Super {
	  
	public static void main(String[] args) {
		ParallelUniverse obj = new ParallelUniverse();
		obj.display();   //calling the display method

	}

}
