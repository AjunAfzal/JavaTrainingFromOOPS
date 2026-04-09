package encapsulationprogram;

public class MainClass 
{
	private int a;
	private int b;
	
	public void setdata(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void getdata()
	{
		System.out.println(a);
		System.out.println(b);
	}
}