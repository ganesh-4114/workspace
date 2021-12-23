package gcd;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		int len,breadth;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.print("Length & Breadth: ");
		len = input.nextInt();
		breadth = input.nextInt();
		area = len * breadth;
		System.out.println("Area of rectangle: " + area);
		

	}

}
