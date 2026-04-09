package genericcollections;

import java.util.LinkedList;
import java.util.List;

public class GenericListMethods 
{
	public static void main(String[] args) 
	{
		List <Integer> l = new LinkedList<Integer>();
		
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		System.out.println("Add Method Result: "+l);
		
		System.out.println("\nGet Method Result: "+l.get(3));
		
		l.set(3, 30);
		System.out.println("\nSet Method Result: "+l);
		
		System.out.println("\nSize Method Result: "+l.size());
		
		System.out.println("\nIsEmpty Method Result: "+l.isEmpty());
		
		System.out.println("\nRemove Method Result: "+l.remove(0));
		System.out.println("After Remove Method: "+l);
		
		System.out.println("\nContains Method Result: "+l.contains(15));
		System.out.println("\nContains Method Result: "+l.contains(55));
		
		System.out.println("\nIndexOf Method Result: "+l.indexOf(30));
		
		System.out.println("\nLastIndexOf Method Result: "+l.lastIndexOf(30));
	}
}