package assessment;

import java.util.Scanner;

public class SquarePer {
	
	static void Peri(int side) {
		double peri = (4 * side);
		System.out.println("Perimeter: " + peri);
	}

	public static void main(String[] args) {
		int side;
		double peri;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter side value: ");
		side = input.nextInt();
		peri = (4*side);
		System.out.println("Perimeter of Square: " + peri);
		Peri(5);
	}

}
