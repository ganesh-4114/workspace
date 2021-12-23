package hi;

import java.util.*;

class Bus{
	void RouteMethod(String dist,String time) {		
		System.out.println("Distance by Bus is : "+dist);
		System.out.println("Time to reach your destination : "+time);
		System.out.println();
	}
}

class Bike extends Bus{
	void RouteMethod(String dist,String time) {
		System.out.println("Distance by Bike is : "+dist);
		System.out.println("Time to reach your destination : "+time);
		System.out.println();
	}
}

class Walk extends Bike{
	void RouteMethod(String dist,String time) {
		System.out.println("Distance by Walk is : "+dist);
		System.out.println("Time to reach your destination : "+time);
		System.out.println();
	}
}

public class GoogleMaps {

	public static void main(String[] args) {
		System.out.print("Enter your destination : ");
		Scanner sc = new Scanner(System.in);
		String startingPlace = sc.nextLine();     
		Bus objBus = new Bus();
		Bike objBike = new Bike();
		Walk objWalk = new Walk();
		
		
		switch(startingPlace) {
		
			case "Kakinada":{
				objBus.RouteMethod("10kms","12mins");
				objBike.RouteMethod("11kms","8mins");
				objWalk.RouteMethod("9kms","30mins");
			};
			break;
			
			case "Vijayawada":{
				objBus.RouteMethod("285kms","13 hrs");
				objBike.RouteMethod("289kms","14 hrs");
				objWalk.RouteMethod("268kms","3 days");
			};
			break;
			
			case "Hyderabad":{
				objBus.RouteMethod("774kms","12 hrs");
				objBike.RouteMethod("785kms","15 hrs");
				objWalk.RouteMethod("750kms","7 days");
			};
			break;
			
			default: {
				System.out.println("No Route available");
			}
		}
		
		
	}
}
