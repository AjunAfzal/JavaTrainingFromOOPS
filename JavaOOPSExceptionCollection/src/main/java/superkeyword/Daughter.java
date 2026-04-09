package superkeyword;

// Use of super with Variables
// Refer immediate parent class instance variable

public class Daughter extends Mother
{
	int age=25;
	public void display()
	{		
		System.out.println("Mothers age is: "+super.age);
		System.out.println("Daughters age is: "+age);
	}
	
	public static void main(String[] args) 
	{
		Daughter out=new Daughter();
		out.display();
		// out.show();
	}
}