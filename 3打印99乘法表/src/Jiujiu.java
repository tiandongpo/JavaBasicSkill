
public class Jiujiu 
{

	
	public static void main(String[] args)
	{
		int sum = 0;
		for(int a=1;a <= 9;a++)
		{
			for(int b=1;b <= 9;b++)
			{
				sum = a*b;
				if(sum >= 10)
					System.out.print(a+"*"+b+"="+sum+" ");
				else
					System.out.print(a+"*"+b+"="+sum+"  ");
			}
			System.out.println();
				
          }
	}

}
