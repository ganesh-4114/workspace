package assessment;

import java.util.Scanner;

public class Triangle {
	
	static void Area(double side) {
		double area = ((Math.sqrt(3)/4)*(side*side));
		System.out.println("Area of Triangle: " + area);
		
	}

	public static void main(String[] args) {
		double side, area;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side of Triangle: ");
		side = input.nextDouble();
		area = ((Math.sqrt(3)/4)*(side*side));
		System.out.println("Area of Equi Triangle: " + area);
		Area(5);
	}

}
