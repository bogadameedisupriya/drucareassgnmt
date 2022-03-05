package samplejava;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class biconsumerhobbiessalary {
	static BiConsumer<Integer,String> p1=(salary,hobbies) -> System.out.println("Salary:"+salary+"hobbies:"+hobbies);
	static Consumer<person1> p2=(person1) -> System.out.println(person1.getGender().toUpperCase());
	static 		List<person1> list = personrepository.getAllPersons();
	public static void main(String[] args) {
	//	List<person1> list = personrepository.getAllPersons();
		 		fetchHobbiesSalary();
	}
     static void fetchHobbiesSalary(){
    	 list.forEach(person1->
        person1.accept(person1.getSalary(),person1.getHobbies()));  
     	 list.forEach(p2);
      }
}
	


