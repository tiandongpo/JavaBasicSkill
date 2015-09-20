//面值为1，2，5的人民币若干，取20张使总量为60，求取法共多少种，各种钱币各多少张
public class RMB 
{
	public static void main(String args[])
	{
		int count = 0;
		for(int a = 0;a < 20;a++)
		{
			for(int b=0;b<20;b++)
			{
				for(int c=0;c<20;c++)
				{
					if((a+b+c == 20)&&(1*a+2*b+5*c == 60))
					{
						count ++;
						System.out.print("一元张数： "+a);
						System.out.print("二元张数： "+b);
						System.out.println("五元张数： "+c);
						
					}
				}
			}
		}
	}

}
