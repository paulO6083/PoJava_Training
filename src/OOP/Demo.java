package OOP;

class Person
{
	
	String name;
	String email;
	String phone;
	
	// Every person should walk, eat, and Sleep
	void walk()
	{
		System.out.println(name + " is walking.");
	}
	void eat()
	{
		System.out.println(name + " email is " + email);
	}
	void sleep()
	{
		System.out.println(name + " is sleeping.");
	}
   
}

public class Demo {
  
	public static void main(String[] args) 
	{
		// Instantiating an object
		Person person1 = new Person();
		
		//Binding objects
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "7705556789";
		
		//abstraction getting only information needed
		person1.walk();
		person1.eat();
		person1.sleep();

	}

}
