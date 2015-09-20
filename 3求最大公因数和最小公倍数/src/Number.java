import java.io.*;
public class Number
{
	public static void main(String args[])
	{
		int num1,num2,num3,N,M;
		String s ="";
		System.out.print("请输入第一个数字: ");
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			s = in.readLine();
		}
		catch(IOException e){}
		num1 = Integer.parseInt(s);
		
		
		
		System.out.print("请输入第二个数字: ");
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			s = in.readLine();
		}
		catch(IOException e){}
		num2 = Integer.parseInt(s);
		
		
		System.out.print("请输入第三个数字: ");
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			s = in.readLine();
		}
		catch(IOException e){}
		num3 = Integer.parseInt(s);
		
		
		/*求num1,num2的最大公因数*/
		int a = num1,b = num2, c = 1;
		while(c!=0)
		{
			c =a%b;
			if(c!=0)
			{
				a = b;
				b = c;
			}
		}
	    N = b;
		
		/*求num1和num2的最小公倍数*/
	    M = num1 * num2 / N;
		
		/*求N和num3的最大公因数，即求num1,num2和num3的最大公因数*/
		a = N; b = num3; c =1;
		while(c!=0)
		{
			c = a%b;
			if(c != 0)
			{
				a = b;
				b = c;
				
			}
			
		}
		N = b;
		a = M; b = num3; c = 1;
		
		while(c != 0)
		{
			c = a%b;
			if(c != 0)
			{
				a = b;
				b = c;
			}
		}
		M = M*num3 / b;
		System.out.println("这三个数的最大公因数是： "+N);
		System.out.println("这三个数的最大公倍数是： "+ M);
	}
		

}
