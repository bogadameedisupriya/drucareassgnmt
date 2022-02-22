package samplejava;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args)
	{
		HashSet h1=new HashSet();
		h1.add("d");
		h1.add("two");
		h1.add("four");
		h1.add("a");
		System.out.println(h1);
		System.out.println(h1.add("s"));
		System.out.println(h1.contains("four"));
		System.out.println(h1.remove("two"));
		System.out.println(h1);
		System.out.println(h1.size());
		System.out.println(h1.hashCode());





		
		
		// TODO Auto-generated method stub

	}

}
