import java.io.*;
public class Number
{
	public static void main(String args[])
	{
		int num1,num2,num3,N,M;
		String s ="";
		System.out.print("�������һ������: ");
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			s = in.readLine();
		}
		catch(IOException e){}
		num1 = Integer.parseInt(s);
		
		
		
		System.out.print("������ڶ�������: ");
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			s = in.readLine();
		}
		catch(IOException e){}
		num2 = Integer.parseInt(s);
		
		
		System.out.print("���������������: ");
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			s = in.readLine();
		}
		catch(IOException e){}
		num3 = Integer.parseInt(s);
		
		
		/*��num1,num2���������*/
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
		
		/*��num1��num2����С������*/
	    M = num1 * num2 / N;
		
		/*��N��num3���������������num1,num2��num3���������*/
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
		System.out.println("������������������ǣ� "+N);
		System.out.println("������������󹫱����ǣ� "+ M);
	}
		

}
