package assessment;

import java.util.Scanner;

class Formula {
	double area;
	void Area(double r) 
	{
		area = (22*r*r)/7;
		System.out.println("Area: " + area);
	}
}

class AreaofCircle extends Formula
	{
	   public static void main(String args[]) 
	    {   
		   double r;
	      Scanner input = new Scanner(System.in);
	         System.out.print("Enter the radius: ");
	          r= input.nextDouble();
	          AreaofCircle obj = new AreaofCircle();
	          obj.Area(r);
	          System.out.println("Area of Circle: " + obj.area);
	                  
	   }
	}


