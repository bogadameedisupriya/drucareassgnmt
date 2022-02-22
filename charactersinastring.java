package samplejava;

public class charactersinastring {

		public static void main(String[] args) {
			String s="learn java";
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)!='0'){
					count++;
				}
			}
			System.out.println("count number of characters"+count);
		}
			// TODO Auto-generated method stub

		}



