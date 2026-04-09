package multilevelinheritance;

public class SonChild extends FatherChild
{
	public void build()
	{
		System.out.println("Son is of a lean build and of 10 years of age");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SonChild out=new SonChild();
		out.age();
		out.health();
		out.build();
	}
}