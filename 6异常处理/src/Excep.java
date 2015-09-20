
public class Excep
{
	public static void main(String args[])
	{
		int[] number = new int[10];
		for(int i=0;i<=10;i++)
		{
			try
			{
				number[i] = i+1;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("数组下标越界，产生异常:"+e);
			}
			finally
			{
				if(i<10)
					System.out.println("i="+i+"时,"+"number[i]="+number[i]);
			}
		}
	}

}
