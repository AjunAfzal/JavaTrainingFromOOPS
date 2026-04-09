package genericcollections;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {
	public static void main(String[] args) 
	{
		Set s= new HashSet();
		Set l= new HashSet();
	
		s.add(11);
		s.add(12);
		s.add(13);
		s.add(14);
		s.add(15);
	
		l.add(21);
		l.add(22);
		l.add(23);
		l.add(24);
		l.add(25);
	
		System.out.println("Add Method Set 1: "+s);
		System.out.println("\nAdd Method Set 2: "+l);
	
		s.addAll(l);
		System.out.println("\nAddAll Method: "+s);
	
		System.out.println("\nSize Method: "+s.size());
	
		System.out.println("\nIsEmpty Method: "+s.isEmpty());
	
		System.out.println("\nContains Method: "+s.contains(23));
	
		System.out.println("\nContainsAll Method: "+s.containsAll(l));
	
		s.remove(23);
		System.out.println("\nAfter removing: "+s);
	
		s.removeAll(l);
		System.out.println("\nAfter RemoveAll: "+s);
	
		s.clear();
		System.out.println("\nAfter clear: "+s);
	}
}
