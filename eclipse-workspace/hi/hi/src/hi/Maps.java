package hi;

public class Maps {
	
	String StartP, Dest1;
	int Time; int Distance;
	
	void Travel(String Start, String Dest)
	{	StartP = Start; Dest1 = Dest;
		System.out.println("Journey: " + StartP + "-" + Dest1);
	}
	
	 void Journey( int Time, int Distance) {
		
		if (Dest1 == "Rajahmundry") {			
			System.out.println("By Bus: " + Time + " to cover " + Distance);
		} else {
			System.out.println("No routes found");
		}
	 }	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maps n = new Maps();
		
		n.Travel("Chennai", "Rajahmundr");
		n.Journey(8, 457);
	}

	

}
