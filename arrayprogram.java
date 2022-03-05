package samplejava;

public class arrayprogram {

	public static void main(String[] args)
	{
		int num[]=new int[4];
		num[0]=23;
		num[1]=8;
		num[2]=76;
		num[3]=70;

	for(int i=0;i<4;i++)
		{
		if(i==1)
			num[1]=55;
			System.out.println(num[i]);

		}
	for(int number:num)
	{
		System.out.println(number);
	}
		
		// TODO Auto-generated method stub
		
		
	}

}
