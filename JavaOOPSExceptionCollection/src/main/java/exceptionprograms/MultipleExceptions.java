package exceptionprograms;

public class MultipleExceptions 
{
	// For any number of exception, use a single try block along with multiple catch blocks
	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[3]; 	
			a[3]=23/0;
		}
		
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println(i);
		}
		// Output will be given only for ArithmeticException as 23/0 is calculated first which causes an exception.
		// ArrayIndexOutOfBoundsException happens after that
		// So, whichever exception takes place first, it will be provided in output. But all exceptions will be handled
	}
}