

public class StrBufferMeths {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer(); // 16 characters
		StringBuffer s2 = new StringBuffer(25); // explicitly sets the size
		StringBuffer str = new StringBuffer("Ganesh Dandamudi");
		
		// insert
		System.out.println("INSERT: " +str.insert(6, "357"));
				
		// append
		System.out.println("APPEND: " +str.append(" spinebiz"));

		// replace
		System.out.println("REPLACE: " + str.replace(0, 7, "elysium"));
		
		// delete
		System.out.println("DELETE: " + str.delete(14, 56));
		
		StringBuffer s4 = new StringBuffer("ivar");
		System.out.println("REVERSE: " + s4.reverse());
		
		// capacity
		System.out.println(s1.capacity());
		System.out.println(s2.capacity());
		
		//subString
		StringBuffer s5 = new StringBuffer("chennai");
		System.out.println(s5.substring(5));
		
		// other
		System.out.println("OTHER:");
		StringBuffer s6 = new StringBuffer("Rajahmundry");
		    
		System.out.println(s6.charAt(1));
		System.out.println(s6.indexOf("to"));
		System.out.println(s6.indexOf("u"));
		System.out.println(s6.lastIndexOf("u"));
		

	}

}

