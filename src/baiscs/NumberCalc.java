package baiscs;

public class NumberCalc {
	public static void main(String[] args) {
		System.out.println("Program is starting.");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		int[] totalNum = new int[numA];
		//int totalNumb = sum(totalNum);
		System.out.println("The sum of numbers 1 to " + numA  + " is " + sum(totalNum));
		printName();
		System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
	}
	
	static void printName()
	{
	    System.out.println("My name is Paul.");	
	}
	
	static void addNumbers(int numbA, int numbB)
	{
		int sum = numbA + numbB;
		System.out.println("The sum of numbers " + numbA + " and " + numbB + " is " + sum);
	}

	//Write a function that takes a value n returns the sum of numbers 1 to n
	public static int sum(int[] numbers) 
	{
	    System.out.println("The array length passed is " + numbers.length);
		
	    int sum1=0;
	    for (int i = 0; i < numbers.length; i++) 
	    {
	    	//Load the Array
	    	numbers[i] = i + 1;
	    	// Add the numbers to array
	    	sum1 = sum1 + numbers[i];
	    }
	    return sum1;
	}
	
	static int multiplyNumbers(int valueA, int valueB)
	{
		int product = valueA * valueB;
		addNumbers(product + 50, product);
		return product;
	}

	//find maximum value of the array
	public static int findMax(int[] arr)
	{
	    int max = arr[0];
	    for (int i = 0; i < arr.length; i++) 
	    {
	        if (arr[i] > max) 
	        {
	            max = arr[i];
	        }
	    }
	    return max;
	}

	//find minimum value of the array
	public static int findMin(int[] arr) 
	{
	    int min = arr[0];
	    for (int i = 0; i < arr.length; i++) 
	    {
	        if (arr[i] < min) 
	        {
	            min = arr[i];
	        }
	    }
	    return min;
	}

	//find average value of the array
	public static int findAvg(int[] arr) 
	{
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) 
	    {
	        sum = sum + arr[i];
	    }
	    return sum / arr.length;
	}
}
