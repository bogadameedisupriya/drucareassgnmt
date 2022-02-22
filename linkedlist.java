package samplejava;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args)
	{
		LinkedList list1=new LinkedList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1);
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());
		System.out.println(list1.get(0));
		list1.add(100);
		list1.add("hyd");
		System.out.println(list1);
		System.out.println(list1.containsAll(list1));
		System.out.println(list1.removeFirst());
		System.out.println(list1.removeLast());



		
		// TODO Auto-generated method stub

	}

}
