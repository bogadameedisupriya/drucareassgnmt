package samplejava;

import java.util.Arrays;
import java.util.List;

public class streamprogram1 {

	public static void main(String[] args) {
		List<Integer> mylist=Arrays.asList(2,34,23,55,67);
		mylist.stream()
	//	.average()
		.filter(n->n%2==0)
		.forEach(System.out::println);
		// TODO Auto-generated method stub

	}

}
