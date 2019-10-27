package baiscs;

public class SalaryCalculator {
   public static void main(String[] args) {
	   //Declare a variable
	   String career = "SoftWare Developer";
	   System.out.println("Program is Starting.");
	   
	   //Define a variable
	   System.out.println("My career is a "+ career + ".");
	   
	   //Declare and Define
	   int hoursPerWeek = 40;
	   int weeksPerYear = 52;
	   double rate = 42.50;
	   double salary =  rate * hoursPerWeek * weeksPerYear;
	   System.out.println("My salary per year as a "+ career + " is " + salary);
   }
}
