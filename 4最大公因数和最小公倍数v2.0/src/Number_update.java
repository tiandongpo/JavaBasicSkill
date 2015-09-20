import java.io.*;
public class Number_update
{

	static String s = "";
    
	
	
	public static String input()
	{
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			s = in.readLine();
		}catch(IOException e){}
		return s;
	}
	
	
	
	public static int cal(int a,int b,int c)
	{
		while(c!=0)
		{
			c = a%b;
			if(c != 0)
			{
				a =b;
				b =c;
			}
		}
		return b;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		int num1,num2,num3,N,M;
		System.out.print("请输入第一个数字： ");
		num1 = Integer.parseInt( input() );
		System.out.print("请输入第二个数字： ");
		num2 = Integer.parseInt( input() );
		System.out.print("请输入第三个数字： ");
		num3 = Integer.parseInt( input() );
		
		//求num1和num2的最大公因数
		N = cal(num1,num2,1);
		//求num1和num2的最小公倍数
		M = num1*num2/N;
		//求N和num3的最大公因数,即求num1,num2和num3的最大公因数
	    N = cal(N,num3,1);
	    //求M和num3的最小公倍数，即求num1,num2和num3的最小公倍数
	    M = M*num3/cal(M,num3,1);
	    System.out.println("这三个数的最大公因数是："+N);
	    System.out.println("这三个数的最小公倍数是：  "+M);
	}
		
		
	
		
		
}

