package samplejava;

import java.util.Arrays;
import java.util.List;

public class streamprogram2 {

	public static void main(String[] args) {
		List<Integer> mylist=Arrays.asList(2,14,23,15,61);
		mylist.stream()
	 	.map(n->n+"")
	//   .filter(n->n.startsWith("1"))
	    .filter(n->n.endsWith("1"))
	    .forEach(System.out::println);
		// TODO Auto-generated method stub

	}

}
