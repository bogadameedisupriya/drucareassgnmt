package samplejava;

import java.util.List;
import java.util.function.BiPredicate;

public class bipredicate {

	static BiPredicate<Integer,String> heightAndGender = (height,gender) -> height>=120 && gender.equals("Female");

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		List<person1> list = personrepository.getAllPersons();
		list.forEach(person1 ->{
			if(heightAndGender.test(person1.getHeight(), person1.getGender())) {
				System.out.println(person1);
			}
		});
		}

	}
		// TODO Auto-generated method stub
