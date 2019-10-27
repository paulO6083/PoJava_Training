package studentDB;

import java.text.DecimalFormat;

public class StudentDbApp {
    
	public static void main(String[] args) {
		Student stud1 = new Student("Juan","0161469876");
		Student stud2 = new Student("Theo","0162469876");
		Student stud3 = new Student("Angela","0163469876");
		
		
		stud1.enroll("Math101");
		stud1.enroll("Eng102");
		stud1.enroll("His211");

		stud1.showCourses();
		stud1.checkBalance();
		stud1.payTuition(600);
		stud1.checkBalance();
		System.out.println(stud1.toString());
		
	}

}

class Student {
	private String name;
	private String SSN;
	private String emailID;
	private static int ID = 1000;  //School internal ID for each Student. Make it static so it belongs to only this class
	private String userID;   //Combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
	private String courses = "";
	private static final double costofcourse = 895;
	private double balance = 0;

	private String phone;
	private String city;
	private String state;
	DecimalFormat df2 = new DecimalFormat("#.00");

	
	//Constructor
	public Student(String name, String SSN2) {
		System.out.println("New Student Created");
        this.name = name;
		this.SSN = SSN2;
		setemailID();
		
		ID++;  // Increment ID so it can be unique
		setuserID();
	}

	// set and get phone
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
	// Set and Get City
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	
	//Set and get State
	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return state;
	}
		


	//Set and set email ID
	private void setemailID() {
		emailID = name.toLowerCase() + "." + ID + "@yahoo.com";
		System.out.println("Your email is:" + emailID);
	}
	
	//Function to create userId
	private void setuserID() {
		int random = ((int)(Math.random() * 8001)+1000); // Generate random 4-digit numbers between 1000 and 9000
		userID = ID + "" + random + SSN.substring(SSN.length()- 4);
		
		System.out.println("Your user ID is: " + userID);
	}
	
	public void enroll(String course) {
		  this.courses = this.courses + "\n" + course;
		  balance = balance + costofcourse;
	}
	
	public void payTuition(double amount) {
		System.out.println("You payed $" + df2.format(amount));
		balance = balance - amount;
	}
	
	public void checkBalance() {
	    System.out.println("Your balance is $:" + df2.format(balance));
	}
	
	public void showCourses() {

		System.out.println("Your courses are: " + courses);
	}
	
	@Override
	public String toString() {
		return "[NAME: " + name + "]\n[COURSES: " + courses + "]\n" + "[Balance: " + df2.format(balance) + "]";
	}


}