package samplejava;

public class assignmentprograms {

	public static void main(String[] args) {
		int a=3;
		System.out.println (a);
		System.out.println (a++);
		System.out.println (a--);
		System.out.println (--a);
		System.out.println (++a);	
		// TODO Auto-generated method stub
    //-----------------------------------
		System.out.println("convert string to lowercase and uppercase.");
	    String s="AbcdEFg";
		System.out.println (s.toLowerCase());
		String ss="AbcdEFg";
		System.out.println (ss.toUpperCase());
	//----------------------------------------------
		System.out.println("program to find length of string");
        String l="program";
		System.out.println(l.length());
	//--------------------------------------
		System.out.println("concatenate two strings without using + symbol");	
		String s1="java";
		String s2="program";
	    String s3=s1.concat(s2);
		System.out.println(s3);
	//------------------------------------
		System.out.println("program to count length of a string");
		String str="j    a   v    a ";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='0')
			{
				count++;
			}
			if(str.charAt(i)==' ')
			{
				count--;
			}		
		}
		System.out.println(str);
		System.out.println("count number of characters "+count);
	//---------------------------------------------------------------
		System.out.println("program to trim the string");
		String str1="ja va pro gram";
		System.out.println(str1.replaceAll("\\s",""));
   //-----------------------------------------------------------
		System.out.println("program to print the float values in next line");
		System.out.println("2.3"+"\n"+"3.5"+"\n"+"9.5"+"\n");
		System.out.println();
   //-----------------------------------------------------------,

	}
}
