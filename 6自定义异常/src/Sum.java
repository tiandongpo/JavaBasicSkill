import java.io.*;
public class Sum
{


	public static void main(String[] args)
	{
		int num1,num2;
		String s="";
		try
		{
			System.out.println("请输入第一个数字： ");
			BufferedReader in1 = new BufferedReader(new InputStreamReader(System.in));
			s = in1.readLine();
			num1 = Integer.parseInt(s);
			System.out.println("请输入第二个数字：");
			BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
			s = in2.readLine();
			num2 = Integer.parseInt(s);
			
			System.out.println("两个数的和为："+sum(num1,num2));
		}
		catch(NumberRangeException e)
		{
			System.out.println(e.getMessage());
		}
		catch(IOException e){}
		
	}
	
	public static int sum(int num1,int num2)throws NumberRangeException
	{
		if((num1<0)||(num1>1000)||(num2<0)||(num2>1000))
		{
			throw(new NumberRangeException("输入的数字必须是0到1000内！"));
		}
		return num1+num2;
		
		
	}
	public static  class NumberRangeException extends Exception
	{
		
		public NumberRangeException()
		{
			super();
		}
		public NumberRangeException(String s)
		{
			System.out.println(s);
		}
	}
	

}
