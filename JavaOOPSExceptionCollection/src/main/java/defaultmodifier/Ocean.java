package defaultmodifier;

// Accessing within same class

public class Ocean 
{
	void size()
	{
		System.out.println("Ocean is vast");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Ocean out = new Ocean();
		out.size();
	}
}