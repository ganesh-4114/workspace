package assessment;

import java.util.*;

public class VolPrism {
	
	static void vol(double base, double height) {
		double area = base * height;
		System.out.println("volume: " + area);
	}

	public static void main(String[] args) {
		double base, height, volume;
		Scanner input = new Scanner(System.in);
		System.out.print("Base: ");
		base = input.nextDouble();
		System.out.print("height: ");
		height = input.nextDouble();
		volume = base * height;
		System.out.println("Volume of Prism: " + volume);
		vol(10, 20);
	}
	
}
