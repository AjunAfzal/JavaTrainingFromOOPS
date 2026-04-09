package genericcollections;

import java.util.ArrayList;
import java.util.List;

public class ForEachList 
{
	public static void main(String[] args) 
	{

		List<String> s = new ArrayList<String>();
		s.add("RED");
		s.add("BLACK");
		s.add("BLUE");
		s.add("GREEN");
		s.add("PINK");
		s.add("YELLOW");
		
		System.out.println("Add Method Result: "+s);

		System.out.println("\nFor Each Result: ");
		for (String p : s) 
		{
			System.out.println(p);
		}
	}
}