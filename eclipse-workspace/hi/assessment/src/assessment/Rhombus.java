package assessment;

import java.util.Scanner;

public class Rhombus {
	
	static void area(double d1,double d2) {
		double rhom = (d1*d2)/2;
		System.out.println("Area of rhom: " + rhom);
	}
	
	public static void main(String[] args) {
		double d1, d2, area;
		Scanner input = new Scanner(System.in);
		System.out.print("D1: ");
		d1 = input.nextDouble();
		System.out.print("D2: ");
		d2 = input.nextDouble();
		area = ((d1*d2)/2);
		System.out.println("Area of Rhombus: " + area);
		area(d1,d2);
	}
}
