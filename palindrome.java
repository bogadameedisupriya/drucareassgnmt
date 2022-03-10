package samplejava;

public class palindrome {

	public static void main(String[] args) {
		String s="kik";
		String reverse="";
		int length=s.length();
        for(int i=s.length()-1;i>=0;i--)
        {
        	reverse=reverse+s.charAt(i);
        }
        if(s.equals(reverse))
        {
		System.out.println("palindrome "+s);
        }else
		System.out.println("is not a palindrome "+reverse);
		// TODO Auto-generated method stub

	}

}
