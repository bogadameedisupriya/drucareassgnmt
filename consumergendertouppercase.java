package samplejava;

import java.util.List;
import java.util.function.Consumer;

public class consumergendertouppercase
{
	  static Consumer<person1> p1=(person1)-> System.out.println(person1);
	  static Consumer<person1> p2=(person1)-> System.out.println(person1.getGender().toUpperCase());
      static List<person1> list=personrepository.getAllPersons();
    
	public static void main(String[] args) 
	{
	       List<person1> list=personrepository.getAllPersons();
	       list.forEach(p1);
	       list.forEach(p2);
	       list.forEach(p1.andThen(p2));

		// TODO Auto-generated method stub
	}

}
