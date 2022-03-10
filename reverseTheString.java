package samplejava;

public class reverseTheString {

	public static void main(String[] args) {
		String s="java";
        String reversedstring ="";
        for(int i=s.length()-1;i>=0;i--)
        {
        	reversedstring=reversedstring+s.charAt(i);
        }
		System.out.println("orginal string " +s);
		System.out.println("reversed string "+reversedstring);

		// TODO Auto-generated method stub

	}

}
