
public class Excep 
{


	public static void main(String[] args) 
	{
		try
		{
			System.out.println(num(0));
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public static int num(int i) throws ArithmeticException
	{
		if(i == 0)
		{
			ArithmeticException e = new ArithmeticException("除数不能为0！");
			throw e;
		}
		return (10/i);
	}

}
