package privatemodifier;

public class Fish extends Animal
{

	public static void main(String[] args) 
	{
		// Trying to call the private method from the animal class
		Animal out1=new Animal();
		// out1.speed();
		// Getting error as speed is a private method
	}
}