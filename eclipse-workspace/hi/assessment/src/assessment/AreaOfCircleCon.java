package assessment;

import java.util.Scanner;

class Area
{
	double area;
	Area(double r)
	{
	 area= (22*r*r)/7;
 
	}
}
class AreaOfCircleCon 
{
   public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.print("Enter the radius:");
      double rad= s.nextDouble();      
      Area  a=new Area(rad);
      System.out.println("Area of Circle is: " + a.area);      
   }
 }