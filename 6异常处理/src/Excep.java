
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
				System.out.println("�����±�Խ�磬�����쳣:"+e);
			}
			finally
			{
				if(i<10)
					System.out.println("i="+i+"ʱ,"+"number[i]="+number[i]);
			}
		}
	}

}
