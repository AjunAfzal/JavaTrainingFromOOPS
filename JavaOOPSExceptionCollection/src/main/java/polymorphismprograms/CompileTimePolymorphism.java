package polymorphismprograms;

public class CompileTimePolymorphism 
{
	public void multiplication() 
	{
		System.out.println("Multiplication");
	}

	public void multiplication(int a, int b) 
	{
		int d = a * b;
		System.out.println(d);
	}

	public void multiplication(int a, int b, int c) 
	{
		int d = a * b * c;
		System.out.println(d);
	}

	public static void main(String args[]) 
	{
		CompileTimePolymorphism out = new CompileTimePolymorphism();
		out.multiplication();
		out.multiplication(12, 18);
		out.multiplication(15, 25, 35);
	}
}