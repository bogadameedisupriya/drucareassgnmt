package samplejava;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {

	public static void main(String[] args)
	{
		SortedSet sorted =new TreeSet();
		sorted.add("abc");
		sorted.add("def");
		sorted.add("jkl");
		sorted.add("op");
		sorted.add("nm");
		System.out.println(sorted);
		System.out.println(sorted.add("two"));
		System.out.println(sorted.contains("def"));
		System.out.println(sorted.first());
		System.out.println(sorted);
		System.out.println(sorted.isEmpty());






		
		// TODO Auto-generated method stub

	}

}
