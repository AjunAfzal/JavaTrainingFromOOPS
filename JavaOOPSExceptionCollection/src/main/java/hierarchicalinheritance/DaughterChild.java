package hierarchicalinheritance;

public class DaughterChild extends FatherParent
{
	public void sports()
	{
		System.out.println("Daughter is a Great Runner");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DaughterChild d=new DaughterChild();
		d.skills();
		d.sports();
	}
}