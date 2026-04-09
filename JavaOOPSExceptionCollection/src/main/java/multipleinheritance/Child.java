package multipleinheritance;

public class Child implements FatherParent,MotherParent
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Child c=new Child();
		c.masculine();
		c.feminine();
	}
	
	@Override
	public void masculine()
	{
		System.out.println("Father is masculine");
	}
	
	public void feminine()
	{
		System.out.println("Mother is feminine");
	}
}