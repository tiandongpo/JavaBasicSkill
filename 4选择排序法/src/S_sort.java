/**�Ƚ�һ������������ų�һ�ţ��ٽ����������������һ�����ֽ���λ�ã�����
  ����Ϊ���������֡�Ȼ��ʣ�µ�δ������������������������һ��δ���������
  ����λ�ã���Ϊ���������֡��ظ����ϲ��裬֪���������ֶ�������������
 */
public class S_sort 
{
	public static void main(String args[])
	{
		int[]numbers = {5,3,6,9,4,7,2};
		int max,temp;
		
		
		
		for(int i=numbers.length-1; i>0; i--)
		{
			max = 0;
			for(int j =1;j <= i;j++)
			{
				if(numbers[max]<numbers[j])
					max = j;
				
			}
			temp = numbers[max];
			numbers[max] = numbers[i];
			numbers[i] = temp;
		}
		System.out.println("ѡ������Ľ���ǣ� ");
		for(int i = 0;i < numbers.length;i++)
		{
			System.out.print(numbers[i]+" ");
		}
	}

}
