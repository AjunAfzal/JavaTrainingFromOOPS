package polymorphismprograms;

public class AthleteChild extends RunningParent
{
	public void speed()
	{
		super.speed();
		System.out.println("Athlete runs fast");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AthleteChild out=new AthleteChild();
		RunningParent out1=new AthleteChild();
		out.speed();
		out1.speed();
	}
}