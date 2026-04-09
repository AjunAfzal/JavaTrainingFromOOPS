package interfaceprogram;

public class Hardware implements Mobile
{
	public void show()
	{
		System.out.println("Message From Show Method");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Hardware hw=new Hardware();
		hw.show();
		hw.performance();
	}
	
	@Override
	public void performance()
	{
		System.out.println("Message From Interface");
	}
}