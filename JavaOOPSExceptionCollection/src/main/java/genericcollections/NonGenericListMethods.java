package genericcollections;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods 
{
	public static void main(String[] args) 
	{
		List i=new ArrayList();
		  
		i.add(23);
		i.add(43);
		i.add(65);
		i.add(25);
		i.add(65);
		System.out.println("Add Method Result: "+i);
		
		System.out.println("\nGet Method Result: "+i.get(2));

		i.set(1,32);
		System.out.println("\nSet Method Result: "+i);
	  
		System.out.println("\nSize Method Result: "+i.size());
		
		System.out.println("\nIsEmpty Method Result: "+i.isEmpty());
	  
		System.out.println("\nRemove Method Result: "+i.remove(0));
		System.out.println("After Remove Method: "+i);
	  
		System.out.println("\nContains Method Result: "+i.contains(65));
	  
		System.out.println("\nIndexOf Method Result: "+i.indexOf(65));
		
		System.out.println("\nLastIndexOf Method Result: "+i.lastIndexOf(65));
	}
}