package privatemodifier;

public class Animal 
{

	private void speed()
	{
		System.out.println("Animals are usually fast runners");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Animal out=new Animal();
		out.speed();
	}
}