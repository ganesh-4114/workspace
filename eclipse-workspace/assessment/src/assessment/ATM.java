package assessment;

import java.util.Scanner;

public class ATM {
	 public static void main(String args[] )  
	    {  
	        int balance = 100000, withdraw, deposit;  
	           
	        Scanner sc = new Scanner(System.in);  
	          
	        while(true)  
	        {  
	            System.out.println("Choose your Options");  
	            System.out.println("Select 1 for Withdraw");  
	            System.out.println("Select 2 for Deposit");  
	            System.out.println("Select 3 for Check Balance");  
	            System.out.println("Select 4 for EXIT");  
	       
	            int choice = sc.nextInt();  
	            switch(choice)  
	            {  
	                case 1:  
					        System.out.print("Enter money to be withdrawn:");  
					                      
				
					        withdraw = sc.nextInt();  
					                      
				
					        if(balance >= withdraw)  
					        {  
				 
					            balance = balance - withdraw;  
					            System.out.println("Please collect your money");  
					        }  
					        else  
					        {  
				
					            System.out.println("Insufficient Balance");  
					        }  
					        System.out.println("");  
					        break;  
	   
	                case 2:  
	                      
					        System.out.print("Enter money to be deposited:");  
					                      
				  
					        deposit = sc.nextInt();  
					                      
				
					        balance = balance + deposit;  
					        System.out.println("Your Money has been successfully depsited");  
					        System.out.println("");  
					        break;  
	   
	                case 3:   
					        System.out.println("Balance : "+balance);  
					        System.out.println("");  
					        break;  
					   
	                case 4:  
	                		System.exit(0);  
	            }  
	        }  
	    }  
}
