package exceptionprograms;

public class SingleException 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			int num=10/0;
			System.out.println(num);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Program to try exception handling");
		}
	}
}