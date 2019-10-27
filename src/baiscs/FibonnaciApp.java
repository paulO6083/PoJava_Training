package baiscs;

public class FibonnaciApp {

	public static void main(String[] args) {
		// fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers
		//fib(0) = 0
		//fib(1) = 1
		//fib(2) = fib(1) + fib(0) =  0 + 1 = 1
		//fib(3) = fib(2) + fib(1) =  1 + 1 = 2
		//fib(4) = fib(3) + fib(2) =  2 + 1 = 3
		//fib(5) = fib(4) + fib(3) =  3 + 2 = 5
		int num = 4;
		System.out.println("Fibonnaci of "+ num + " is " + fib(num));
		System.out.println();
		System.out.println("Factorial of "+ num + " is " + fac(num));
        // factorial number is defined by the product of the 2 previous factors
		//1! = 1 * 1
		//2! = 2 * 1
		//3! = 3 * 2 * 1
		//4! = 4 * 3 * 2 * 1
	}
     public static int fib(int n)
     {
    	 if (n == 0)
    	 {
    		 return 0;
    	 }
    	 else if (n == 1)
    	 {
    		 return 1;
    	 }
    	 return (fib(n-1) + fib(n-2));
     }
     public static int fac(int numb)
     {
    	 if (numb == 0)
    	 {
    		 return 1;
    	 }
    	 return numb * fac(numb - 1);
    	 
     }
}
