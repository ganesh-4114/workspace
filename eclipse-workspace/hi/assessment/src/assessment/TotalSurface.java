package assessment;

import java.util.Scanner;

public class TotalSurface {
		
	static void tsa(double rad, double height) {
		double tsa = (2*22*rad/7)*(rad + height);
		System.out.println("TSA of Cylinder: " + tsa);
	}
	
	public static void main(String[] args) {
		double rad ,height ,area;
		rad = 5; height = 10;
		area = (2*22*rad)*(rad + height);
		Scanner input = new Scanner(System.in);
		System.out.print("radius: ");
		rad = input.nextDouble();
		System.out.print("height: ");
		height = input.nextDouble();
		area = (2*22*rad/7)*(rad + height);
		System.out.println("Total Surface area: " + area);
		tsa(5, 10);
	}
	
	
}
