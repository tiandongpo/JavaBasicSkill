/**��һ���������е��������г�һ�ţ���˵�һ������Ϊ�Ѿ�����������������Ϊδ��������֡�
 * Ȼ����������ν�δ��������ֲ��뵽�������������*/
public class Sort 
{
	public static void main(String args[])
	{
		int[] numbers = {5,3,6,9,4,7,2};
		
		
		for(int i = 1;i < numbers.length;i++)
		{
			for(int j = i;j > 0;j--)
			{
				if(numbers[j] < numbers[j-1])
				{
					int temp;
					temp = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		
		System.out.println("��������Ľ���ǣ� ");
		for(int i = 0;i < numbers.length; i++)
		{
			System.out.print(numbers[i]+ " ");
		}
	}
	

}
