package exceptionprograms;

public class ThrowException 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10;
		if(a>=18)
		{
			System.out.println("User is eligible to vote");
		}
		else
		{
			throw new ArithmeticException("Not eligible to vote");
		}
	}
}