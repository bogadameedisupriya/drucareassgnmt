package samplejava;

import java.util.Optional;

public class optionaldemo {

	public static void main(String[] args) {
		String[] s=new String[5];
		s[3]="optional string";
		Optional<String> checkNull=Optional.ofNullable(s[3]);
		if(checkNull.isPresent()) {
		//	String lowercaseString=s[3].toLowerCase();
			String uppercaseString=s[3].toUpperCase();
			System.out.println(uppercaseString);
		}
		else {
			System.out.println("string value not present");

		}
		// TODO Auto-generated method stub

	}

}
