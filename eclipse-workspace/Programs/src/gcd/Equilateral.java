package gcd;

import java.util.Scanner;

public class Equilateral {

	public static void main(String[] args) {
		int a; 
		double area;
		Scanner side = new Scanner(System.in);
		System.out.print("Please enter the side of equilateral triangle: ");
		a = side.nextInt();
		area = ((Math.sqrt(3)/4)*(a*a));
		System.out.println("Area of Equilateral Triangle: " + area);
		side.close();
	}

}
