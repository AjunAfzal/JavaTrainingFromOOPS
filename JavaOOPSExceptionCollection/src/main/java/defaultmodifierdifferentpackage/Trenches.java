package defaultmodifierdifferentpackage;

//Accessing default modifier within different package

import defaultmodifier.Ocean;

public class Trenches 
{
	public static void main(String[] args) 
	{	
		Ocean out = new Ocean();
		//out.size();
		// Gets error as default cannot be accessed outside the package
	}
}