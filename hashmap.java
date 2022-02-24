package samplejava;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args)
	{
		HashMap m1=new HashMap();
		m1.put("pen",10);
		m1.put("scale",15);
		m1.put("redpen",6);
		m1.put("pencil",20);
		System.out.println(m1);
		System.out.println(m1.get("pen"));
		System.out.println(m1.containsValue(15));
		System.out.println(m1.remove("scale"));
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		System.out.println(m1.containsKey("pen"));
		System.out.println(m1.size());
		m1.clear();
		System.out.println(m1);


		
		// TODO Auto-generated method stub
	}
		// TODO Auto-generated method stub	
	}



