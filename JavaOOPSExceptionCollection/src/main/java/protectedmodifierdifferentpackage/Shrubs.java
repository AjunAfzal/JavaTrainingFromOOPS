package protectedmodifierdifferentpackage;

import protectedmodifier.Tree;

// Calling method from another package.
// It can be called using inheritance

public class Shrubs extends Tree{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Shrubs outdifferentpackage=new Shrubs();
		outdifferentpackage.growth();
	}
}
