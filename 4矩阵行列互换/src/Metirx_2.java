
public class Metirx_2 
{
	public static void main(String args[])
	{
		int[][]m = new int[4][4];
		for(int i = 0;i <= 3;i++)
		{
			for(int j = 0;j <= 3;j++)
			{
				m[i][j] = (i+1)*10 +(j+1);
			}
		}
		
		
		
		for(int i=0;i<=3;i++)
		{
			for(int j = 0;j <= 3;j++)
			{
				System.out.print(m[j][i]+"\t");
			}
			System.out.println();
		}
	}
	

}
