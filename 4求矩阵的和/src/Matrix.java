
public class Matrix 

{
	public static void main(String args[])
	{
		int[][]m1 = new int[3][3];
		int[][]m2 = {{41,30,-59},{-46,36,79},{79,45,78}};//��ʼ������m2
		int[][]sum = new int[3][3];
		
		
		//��ʼ������m1
		for(int i = 0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				m1[i][j]=(i+1)*10 + (j+1);
			}
		}
		
		
	    //������������ĺ�
		for(int i = 0;i <= 2;i++)
		{
			for(int j = 0;j <= 2; j++)
			{
				sum[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		
		//�����ͺ���¾���
		for(int i = 0;i <= 2;i++)
		{
			for(int j=0;j <= 2;j++)
			{
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}
