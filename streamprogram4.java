package samplejava;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamprogram4 {

	public static void main(String[] args) {
		List<Integer> mylist =Arrays.asList(2,450,78,98,5,43,100);
    Optional<Integer> max=mylist.stream()
		.max(Integer::compare);
	//    .forEach(System.out::println);
		 System.out.println(max);
		
		// TODO Auto-generated method stub

	}

}
