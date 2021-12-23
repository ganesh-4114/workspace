package gcd;

class JavaExample{
	  static int i = 100;
	  static String s = "Beginnersbook";
	  final int  z = 100;
	  
	  //Static block
	  static {
		  System.out.println("Hello Hi");	  
	  }
	  
	  //Static method
	  static void display()
	  {
	     System.out.println("i: "+i);
	     System.out.println("i: "+s);
	  }

	  //non-static method
	  void funcn()
	  {
	      //Static method called in non-static method
	      display();
	      System.out.println(z);
	  }
	  
	  //main method
	  public static void main(String args[])
	  {
		  
		  JavaExample obj = new JavaExample();
		  //You need to have object to call this non-static method
		  obj.funcn();
		  display();
	      //Static method called in another static method
	   }
	}