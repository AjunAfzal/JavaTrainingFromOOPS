package exceptionprograms;

public class ThrowsException 
{
	public static void main(String[] args) throws VotingException
	{
		// TODO Auto-generated method stub
		int a=10;
		if(a>=18)
		{
			System.out.println("User is eligible to vote");
		}
		else
		{
			throw new VotingException("Not eligible to vote");
		}
	}
}