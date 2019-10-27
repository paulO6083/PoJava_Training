package OOP;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		BankAccount acct1 = new BankAccount();
		//acct1.name = "Roger Hue";
		
		//Use Encapsulation for name (Call the function SetName to set the name)
		//With Encapsulation, make the variable private in the class, 
		//create a get and set methods in the class and call the methods from the main class (client)
		acct1.setName("Roger Hue");
		System.out.println(acct1.getName()); // call function to get value of name
        acct1.setSsn("01234567");
        System.out.println("Your SSN is: " + acct1.getSsn());
        
        
		acct1.accountNumber = "01609453";
		acct1.balance = 10000;
		acct1.setRate();
		acct1.increaseRate();
		
		
		
		acct1.deposit(1500);
		acct1.deposit(1500);
		acct1.deposit(1500);
		acct1.withdraw(2000);
		
		
		
		System.out.println(acct1.toString());
		
		//Using Interface with LoanAcct
		LoanAccount lnAcct = new LoanAccount();
		lnAcct.setRate();
		
		//Polymorphism by parameters
		BankAccount acct2 = new BankAccount("This is a checking account.");
		acct2.accountNumber = "01609453";
		acct2.checkBalance();

		BankAccount acct3 = new BankAccount("Savings Account", 5000);
		acct3.accountNumber = "01609453";
		
		/*
		acct3.checkBalance();
        
        // Demo for inheritance
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        cd1.interestRate = "4.5";
        cd1.name = "Juan";
        cd1.accountType = "CD Account";
        System.out.println(cd1.toString());
        cd1.compound();
        */
	}

}
