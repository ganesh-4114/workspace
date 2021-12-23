
 class Splendor {
 
	  void run(){System.out.println("running");}  
	}  

	class Splendor1 extends Splendor{  
	  void run(){System.out.println("running safely with 60km");}  
	  
	  public static void main(String args[]){  
	    Splendor1 b = new Splendor1();   //upcasting  
	    b.run();  
	  }  
	}