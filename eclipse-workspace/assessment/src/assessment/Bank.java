package assessment;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		int amount = 500, deposit, withdraw;
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
				System.out.println("Choose your Options");  
	            System.out.println("Select 1 for Deposit");  
	            System.out.println("Select 2 for Withdraw");  
	            System.out.println("Select 3 for Balance");  
	            System.out.println("Select 4 for EXIT"); 
	            
	            int option = input.nextInt();
	            
	            switch(option) 
	            {
	            case 1: 
	            	System.out.print("Enter Deposit amount: ");
	            	deposit = input.nextInt();
	            	
	            	amount = amount + deposit;  
	            	System.out.println();
				        System.out.println("Your Money "+ deposit + " has been successfully depsited");  
				        System.out.println("Your total balance: " + amount);  
				        System.out.println("");
				        break; 
				        
	            case 2: 
	            	System.out.print("Enter withdraw amount: ");
	            	
	            	withdraw = input.nextInt();
	            	
	            	if(amount >= withdraw)  
			        {  
		 
	            		amount = amount - withdraw; 
	            		System.out.println("You've succesfully withdrawn " + withdraw + " successfully") ;
	            		System.out.println();
			            System.out.println("Please collect cash and Remove your card");
			            System.out.println("");
			        }  
			        else  
			        {  
		
			            System.out.println("Insufficient Funds");  
			        }  
			        System.out.println("");  
			        break;  
			        
	            case 3:
	            	System.out.println("Balance : "+amount);  
			        System.out.println("");  
			        break;  
			    
	            case 4: 
	            	System.out.println("Please re-insert your card");
	            	System.exit(0);

	            	
	            default: System.out.println("Please choose a correct option");
	            }
		}
	}
}
