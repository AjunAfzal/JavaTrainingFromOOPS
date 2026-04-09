package protectedmodifier;

public class Tree 
{
	protected void growth()
	{
		System.out.println("Trees grow fast");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Tree outsameclass=new Tree();
		outsameclass.growth();
	}
}