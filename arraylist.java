package samplejava;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args)
	{
      ArrayList a1= new ArrayList();
      a1.add(4);
      a1.add(10);
   //   System.out.println(a1);
	 a1.add("Hyd");// TODO Auto-generated method stub
	 a1.add(20);//  Auto-generated method stub
     System.out.println(a1);
     System.out.println(a1.size());
     System.out.println(a1.remove(0));
     System.out.println(a1.contains(20));
       a1.set(2,3);
       System.out.println(a1);


	}

}
