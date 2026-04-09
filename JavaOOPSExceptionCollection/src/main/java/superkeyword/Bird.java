package superkeyword;

// Use of super with Methods
// Refer immediate parent class method

public class Bird extends Animal
{
	public void speed()
	{
		super.speed();
		System.out.println("Birds fly fast");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bird out=new Bird();
		out.speed();
	}
}