/**将一组无序排列的数字排列成一排，左端第一个数字为已经完成排序的数字其它为未排序的数字。
 * 然后从左到右依次将未排序的数字插入到已排序的数字钟*/
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
		
		
		System.out.println("插入排序的结果是： ");
		for(int i = 0;i < numbers.length; i++)
		{
			System.out.print(numbers[i]+ " ");
		}
	}
	

}
