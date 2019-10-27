package baiscs;

public class CitiesAr {

	public static void main(String[] args) {
		// Declare and define Array
		String[] cities = {"Atlanta","New York","Dallas","Miami","LA"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println();
		
		//Declare Array
		String[] countries;
		
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "Mexico";
		System.out.println("The Country name is " + countries[2] + ".");
		System.out.println();
		
		//Declare & define the array with size
		String[] states = new String[4];
		states[0] = "California";
		states[1] = "Georgia";
		states[2] = "Florida";
		states[3] = "Alabama";
		int i = 0;
		
		//Do loop: Enters the loop then test condition
		do 
		{
			System.out.println("The State name is " + states[i] + ".");
            i++;
            
		} while (i < 4);
		System.out.println();
		
		//While Loop: Test condition first then enters loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound)
		{
			String state = states[n];
			System.out.println(state);
			if (state == "Florida")
			{
			   System.out.println("STATE FOUND!");
               stateFound = true;
		    }
			n++;
		}
		
		System.out.println("\nPRINTING WITH FOR LOOP");
		//For Loop: Best structure for iterating through an array
		for (int x = 0; x < 4; x++)
		{
			System.out.println(states[x]);
		}
	}

}
