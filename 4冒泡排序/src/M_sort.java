/**���Ƚ�һ��������������г�һ�ţ��ٴ���˿�ʼ�����ڵ����ֽ��бȽϣ�
 * �����ߵ����ֱ��ұߵ����ִ��򽻻���λ�á�һ�ֱȽ���ɺ���������
 * ������������λ���ϡ�ð�������ظ��ȽϺͽ���ʣ��δ��������֣�ֱ��ȫ��
 * ���֡�ð������
 * @author po
 
 */
public class M_sort 
{
	public static void main(String args[])
	{
		int[]numbers = {5,3,6,9,4,7,2};
		int temp;
		
		System.out.println(numbers.length);
		for(int i = numbers.length-1; i>0;i--)
		{
			for(int j = 0;j<i;j++)
			{
				if(numbers[j] > numbers[j+1])
				{
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		
		
		System.out.println("ð������Ľ���ǣ� ");
		for(int i = 0;i < numbers.length;i++)
		{
			System.out.print(numbers[i]+" ");
		}
	}

}
