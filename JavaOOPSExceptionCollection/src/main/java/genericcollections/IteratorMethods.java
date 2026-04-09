package genericcollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorMethods 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Integer> l=new LinkedList<Integer>();
		
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		
		System.out.println("List Elements: "+l);
		
		Iterator<Integer> i = l.iterator();
		
		while(i.hasNext())
		{
			System.out.println("\nIterator Print Method: "+i.next());
		}
		
		i.remove();
		System.out.println("\nIterator Remove Method: "+l);
	}
}