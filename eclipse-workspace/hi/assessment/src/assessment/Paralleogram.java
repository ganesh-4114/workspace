package assessment;
import java.util.*;
public class Paralleogram {
	
	static void Parallelo(int base, int height) {
		double area = base * height;
		System.out.println("Predefined Area: " + area);
	}
	
	public static void main(String[] args) {
		int base, height;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.print("Please provide inputs ");
		base = input.nextInt();
		height = input.nextInt();
		area = base * height;
		System.out.println("Area of Parallelogram: " + area);
		Parallelo(50,100);
	}

}
