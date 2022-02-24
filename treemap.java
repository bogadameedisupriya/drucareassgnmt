package samplejava;

import java.util.TreeMap;

public class treemap {

	public static void main(String[] args)
	{
		TreeMap map=new TreeMap();
		map.put("chapathi", 80);
		map.put("idle",30);
		map.put("vada",90);
		map.put("puri",60);
		System.out.println(map);
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.remove("idle",30));
		System.out.println(map.containsKey("vada"));
		System.out.println(map.keySet());
		System.out.println(map.size());
		System.out.println(map);






		

	
		
		// TODO Auto-generated method stub

	}

}
