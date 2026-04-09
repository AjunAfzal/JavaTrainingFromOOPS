package exceptionprograms;

public class VotingException extends Exception 
{

	public VotingException(String str) 
	{
		// TODO Auto-generated constructor stub
		super(str);
		// To connect with parent class and get the message from parent class
	}
	// There is a default exception class that holds all the exceptions.
	// Custom exceptions extends that original class
}