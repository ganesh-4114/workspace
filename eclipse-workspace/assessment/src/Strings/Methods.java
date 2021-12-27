package Strings;
import java.util.*;

public class Methods {
	public static void main(String args[]){  
		
		String str = "Merry Christmas and Advaned Happy New Year 2022";
		
		// contains()
		System.out.println("contains : " +str.contains("2022"));
		System.out.println(str.contains("2021"));
		
		// substring()
		System.out.println("substring " +str.substring(6) + "\n");
		
		// join()
		System.out.println("join" +str.join("-", "ganesh", "dandamudi") + "\n");
		
		// replace()	
		
		System.out.println("Replace" +str.replace("g", "c") + "\n");
		
		// replaceAll()
		System.out.println("Replace all" +str.replaceAll("(.*)Merry(.*)", "g") + "\n");
		
		//replaceFirst()
		System.out.println("Replace first" +str.replaceFirst("g", "d") + "\n");
		
		// charAt()
		System.out.println("charAt" +str.charAt(6) +"\n");
		
		// getBytes()
		System.out.println("GET BYTES" + str.getBytes());
		System.out.println(Arrays.toString("ABKRYZab".getBytes())+"\n");
		
		// indexOf()
		System.out.println("INDEX " + str.indexOf("and")+"\n");
		
		// compareTo()
		System.out.println("--- COMPARE ---");
		System.out.println("vignesh".compareTo("ganesh"));
		System.out.println("ravi".compareTo("ravi"));
		System.out.println("Ravi".compareTo("ravi")+"\n");
		
		// compareToIgnoreCase()
		System.out.println("--- COMPARE TO IGNORE ---");
		System.out.println("raghu".compareToIgnoreCase("ravi"));
		System.out.println("Ravi".compareToIgnoreCase("ravi")+"\n");
		
		// trim()
		System.out.println("--- TRIM ---");
		System.out.println(str.trim());
		System.out.println("     Learn   Java Programming ".trim());
		System.out.println("Learn\nJava Programming\n\n   ".trim() + "\n");
		
		// format()
		System.out.println("FORMAT " + String.format("hai %s %s", "Ravi", "Kumar")+"\n");
		
		//split
		String[] result = str.split(" ");
		for(String ss: result) {
			System.out.print("Split: "+ ss + "+ "+"\n");
			
			
			String str1 = "Good Morning, Chennai.";
			// Upper & Lower case
			System.out.println("Lower" + str1.toLowerCase());
			System.out.println("Upper" +str1.toUpperCase() + "\n");
			
			//value of
			System.out.println(String.valueOf(6f));
			// toCharArray 
			char[] ch = str1.toCharArray();
			for (char c: ch) {
				System.out.print(c + " ");
			} System.out.println();
			
			// matches 
			System.out.println("MATCHES");
			String newV = "G.n.s.";
			System.out.println("Ganesh".matches(newV) + "\n");
			
			// contentEquals
			System.out.println("Content Equals");
			System.out.println("ganesh".contentEquals("ganesh"));
			System.out.println("ganesh".contentEquals("ganesH") + "\n");
			
			// startsWith
			System.out.println("Starts with");
			System.out.println(str.startsWith("foo"));
			System.out.println(str.startsWith("foov") + "\n");
			
			// endsWith
			System.out.println(" ENDS WITH ");
			System.out.println(str.endsWith("ai."));
			System.out.println(str.endsWith("ai"));
			
			//isEmpty
			String word = "";
			System.out.println("Is Empty");
			System.out.println(word.isEmpty());
			System.out.println(str.isEmpty());
			
			// intern
			System.out.println("Intern");
			String s1 = new String("ganesh");
			String s2 = "ganesh";
			System.out.println("Intern: " + (s1==s2));
			System.out.println(s1.intern() == s2.intern());	
			
			// hashCode
			System.out.println("Hashcode");
			System.out.println(str.hashCode());
			System.out.println("".hashCode());
			System.out.println(str.subSequence(3, 9));	
		}
}
}
