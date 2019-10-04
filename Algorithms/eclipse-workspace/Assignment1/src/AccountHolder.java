import java.util.Scanner;
import java.io.*;

 class AccountHolder1 {
	
	double annualInterestRate=0.04,balance;
	
	 AccountHolder1 (int d) {
		 
		 balance = d;
		 //System.out.println("I am in constructor");
		 
		System.out.println("Initial Balance is:"+balance);
	}
	 
	 void deposit(double dep) {
		 
		 balance = balance + dep;
		 
		 System.out.println("The new balance after deposit is:"+balance);
				 
	}
	 
	 void withdrawal(double w) {
		 
		 balance = balance - w;
		 System.out.println("The new balance after withdrawal is:"+balance);
		 
		 
		 
	 }
	 
	// System.out.printf("%-10s %-10s %-10s\n", "osne", "two", "thredsfe");

	 void monthlyInterest() {
		int i;
		System.out.println("Monthly Balances for one year at 0.04");
		System.out.println("Balances:");
		System.out.println("Interest rate is:"+annualInterestRate);
		 for(i=0;i<12;i++) {
			 balance += balance * (annualInterestRate / 12.0); 
			 
			 System.out.println("%-10s %-10s %-10s\\n"+"Month");
		 }
	 }
	 
	  void  modifyMonthlyInterest(double b) {
		 
		 annualInterestRate = b;
		 System.out.println("rateUpdate is :"+annualInterestRate);
		 
	 }  
	  
	  /*String toString() {
		  
		  return String.format("$%.2f", balance);
	  }*/
	  
	  boolean checkBalance(double withdrawammount) {
		  System.out.println("Hi i m in it");
		  double newAmmountBalance = balance - withdrawammount;
		  if(newAmmountBalance<100) {
			  System.out.println("Balance cannot be less than 100$ after withdrawal");
			  return true;
			  
			  
		  }
		  
		  
		  else
			  return false;
		  
		
	  }

	
}
 
 
	 
	 class AccountHolder {
	 
		 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 boolean b;
		 double newbalance;
		 Scanner scanner = new Scanner (System.in);
		 System.out.print("Enter your initial balance:");  
		 int initialbalance1 = scanner.nextInt();
		 if(initialbalance1<0) {
			 System.out.println("Balance cannot be negative...Please enter positive balance");
		 }
		 System.out.println("Entered value:"+initialbalance1);
		 
		 AccountHolder1 obj = new AccountHolder1(initialbalance1);
		 
		 //obj.AccountHolder1(initialbalance1);
		 
		 System.out.print("Enter rateUpdate");
		 double rateUpdate = scanner.nextDouble();
		 if(rateUpdate<0||rateUpdate>1) {
			 System.out.println("Rateupdate should be a value between 0 and 1");
		 }
		 
		 
		 //obj.modifyMonthlyInterest(rateUpdate);
		 
		 System.out.println("Enter the deposit ammount");
		 double deposit = scanner.nextDouble();
		 System.out.println("Deposit ammount is :"+deposit);
		 obj.deposit(deposit);
		 
		 System.out.println("Enter the withdrawal ammount");
		 double withdraw = scanner.nextDouble();
		 b=obj.checkBalance(withdraw);
		 if(b==true) {
			 System.out.println("Cannot withdraw money");
		 }
		 else {
		 
		 
		 
		 System.out.println("Withdrawal ammount is :"+withdraw);
		 if(initialbalance1-withdraw>500) {
		 obj.withdrawal(withdraw);
		 
		 }
		 else {
			 newbalance = initialbalance1- withdraw- 50; 
			 System.out.println("The new balance after withdrawal and 50$ deduction:"+newbalance);
		 }
		 
			 
		 }
		 
		 obj.monthlyInterest();
		 
		 
		 
		 
		 
		 
		 
		 }
		 
		 

}
	 
	 
	 
