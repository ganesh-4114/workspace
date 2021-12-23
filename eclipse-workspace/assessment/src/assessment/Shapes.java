package assessment;

class Shape{
	void n() {
		System.out.println("Area");
	}
}

	class Circle extends Shape{
		 void Draw(int r) {
			System.out.println("You've drawn a circle with radius: "+ r);
		}
		void erase(int a) {
			System.out.println("You've erased the circle with radius: " +a);
		}
	}
	
	
	class Triangle extends Circle {
		void Draw(int b,int h) {
			
			System.out.println("Area of Triangle: " + 0.5*b*h);
			
		}
		void erase(int b, int h) {
			
			System.out.println("Erasing Triangle with " + b + " & " + h);
		}
	}
	
	
	class Square extends Triangle{
		void Draw(float b) {
			System.out.println("Sides of Square equals to: " + b);
		}
		void erase(float a) {
			System.out.println("Erasing Square with float value: " + a);
		}
	}
	

public class Shapes extends Square{
	public static void main(String args[]) {
	
		Shapes obj = new Shapes();
		obj.Draw(3);
		obj.erase(3);
		
		obj.erase(4f);
		obj.Draw(4, 6);
	}
}


