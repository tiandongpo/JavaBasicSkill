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
		System.out.print("�������һ�����֣� ");
		num1 = Integer.parseInt( input() );
		System.out.print("������ڶ������֣� ");
		num2 = Integer.parseInt( input() );
		System.out.print("��������������֣� ");
		num3 = Integer.parseInt( input() );
		
		//��num1��num2���������
		N = cal(num1,num2,1);
		//��num1��num2����С������
		M = num1*num2/N;
		//��N��num3���������,����num1,num2��num3���������
	    N = cal(N,num3,1);
	    //��M��num3����С������������num1,num2��num3����С������
	    M = M*num3/cal(M,num3,1);
	    System.out.println("������������������ǣ�"+N);
	    System.out.println("������������С�������ǣ�  "+M);
	}
		
		
	
		
		
}

