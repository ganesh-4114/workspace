package assessment;

import java.util.Scanner;

public class VolCone {
	
	static void Vol(double rad, double height) {
		double vol = ((22*rad*rad*height)/(3*7));
		System.out.println("Volume of Cone: " + vol);
	}
	
	public static void main(String[] args) {
		double rad,height,vol;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the rad: ");
		rad = input.nextDouble();
		System.out.print("Please enter the height: ");
		height = input.nextDouble();
		vol = (22*rad*rad*height)/21;
		System.out.println("Volume of Cone: " + vol);
		Vol(5.5, 12);
	}

}
