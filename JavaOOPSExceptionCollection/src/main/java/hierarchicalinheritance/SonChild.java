package hierarchicalinheritance;

public class SonChild extends FatherParent
{
	public void sing()
	{
		System.out.println("Son is a Good Singer");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SonChild s=new SonChild();
		s.skills();
		s.sing();
	}
}