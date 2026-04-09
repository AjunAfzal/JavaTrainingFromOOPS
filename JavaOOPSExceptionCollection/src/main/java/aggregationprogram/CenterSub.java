package aggregationprogram;

public class CenterSub
{
	int c;
	int d;

	// Entity reference of another class. Classname & Reference
	CityMain t;

	public CenterSub(int c,int d, CityMain t)
		 {
			 this.c=c;
			 this.d=d;
			 this.t=t;
		 }

	public void printdata()
	{
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) 
	{
		// Wont get data from 1st class if 2nd class is called directly
		// So get data from 1st class at first. Then call from 2nd class
		CityMain out1 = new CityMain();
		out1.area(15, 25);
		CenterSub out2 = new CenterSub(50, 100, out1);
		out2.printdata();
	}
}