package OOP;

public class BankAccount implements IRate {
	//Define Variables
	String accountNumber;
	
	//Static >> Belongs to the CLASS not the object instance
	//final >> Constant (often static final goes together)
	//When static final is used, it cannot be instantiated (cannot be changed within program)
	private static final String routingNumber = "012345678";

	//Instance variables  (private variables can only be called within the class)
	private String name;
	private String ssn;
	String accountType;
	double balance;
	
	//What are Constructors? They are unique methods
	  //1. They are used to define / setup / initialize properties of an object
	  //2. They are IMPLICITlY called upon INSTANTIATION
	  //3. They have the same name as the class itself
	  //4. They have no return type
	
	BankAccount() {
		//Just for testing - This constructor should print after instantiation in Main
		System.out.println("New Account has been created by instantiation.");
	}
	
	// Overloading >> Calling the same method with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}

	BankAccount(String accountType, double initDeposit){
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: " + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1,000";
		} else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}

	
	//Getters / Setters
	
	//Allow the user to define the name
	public void setName(String name1) {
		this.name = name1;
	}
	
	//Allow user to get the name
	public String getName() {
		return name;
	}

	//Allow the user to define the ssn
	public String getSsn() {
		return ssn;
	}

	//Allow the user to get the ssn
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

    //Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}

	
	
	//Define methods below
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
		
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	//The private method can only be called within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR BALANCE IS: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ". ACCOUNT# " + accountNumber + ". ROUTING# " + routingNumber + ". BALANCE: $" + balance + "]";
	}
}
