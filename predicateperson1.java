package samplejava;

import java.util.List;
import java.util.function.Predicate;

public class predicateperson1 
{
	static Predicate<person1> salaryPredicate = person1-> person1.getSalary() >2000;
	static Predicate<person1> genderPredicate = person1-> person1.getGender().equals("Female" );

	public static void main(String[] args) {
		List<person1> list = personrepository.getAllPersons();
		list.forEach((person1) ->{
			 if((salaryPredicate).and(genderPredicate).test(person1))
			 System.out.println(person1);
		});
	}

}
