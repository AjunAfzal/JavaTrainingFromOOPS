package superkeyword;

// Use of super with Constructors
// Refer immediate parent class constructor

public class Employee extends Manager
{
	public Employee()
	{
		super();
		System.out.println("This is a message from the child class - Employee");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee out = new Employee();
	}
}