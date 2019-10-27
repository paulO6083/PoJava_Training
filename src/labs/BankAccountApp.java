package labs;
//import java.util.Random;
import java.text.DecimalFormat;


public class BankAccountApp {

	
	public static void main(String[] args) {
		//This is Object
		BankAccount acct1 = new BankAccount("4653298741", 1000.50);
		BankAccount acct2 = new BankAccount("4753298742", 2000);
		BankAccount acct3 = new BankAccount("4853298743", 2500);
		
		acct1.setName("Juan");
		System.out.println("The account holder name is: " + acct1.getName());
		acct1.makeDeposit(500);
		acct1.makeDeposit(600);
		acct1.payBill(1000);
		acct1.accrue();
        System.out.println(acct1.toString());
	}

}

class BankAccount implements IInterest {
	//This is Class
	//Properties of bank account
	private static int ID = 1000;   //Bank internal ID for each Customer. Make it static so it belongs to only this class
	private String accountNumber;   //ID + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "061000228";
	private String name;
	private String SSN;
	private double balance;
	
	//Create a Constructor
	public BankAccount(String SSN2, double initDeposit) {
		balance = initDeposit;
		//System.out.println("New Account Created");
		this.SSN = SSN2;
		ID++;  // Increment ID so it can be unique
		setAccountNumber();
	}

	//Function to create account Number
	private void setAccountNumber() {
		//Random rand = new Random();
		//int rand_int1 = rand.nextInt(100);
		int random = (int) (Math.random() * 100);  // Generate random 2-digit numbers
		accountNumber = ID + "" + random + SSN.substring(0,2);
		
		System.out.println("Your account number is: " + accountNumber);
	}
	
	//Set and Get Name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}

	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making Deposit of: " + amount);
		showBalance();
	}
	
	public void showBalance() {
		DecimalFormat df2 = new DecimalFormat("#.00");

		System.out.println("Your balance is: " + df2.format(balance));
	}

	@Override
	public void accrue() {
      balance = balance * (1 + rate/100);  //Rate is comming from interface (could be set by something else)		
      showBalance();
	}

	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
	}
}