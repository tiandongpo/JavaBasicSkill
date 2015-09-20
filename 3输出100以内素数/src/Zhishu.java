
public class Zhishu 
{
	public static void main(String args[])
	{
		int a,b;
		System.out.println("100以内的素数是：");
		A1:
			for(a=2;a<=100;a++)
			{ 
				for(b=2;b<a;b++)
				{
					if(a%b == 0)continue A1;
				}
				System.out.print(a+" ");
			}
	}

}
