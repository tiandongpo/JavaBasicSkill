/**先将一组无序的数字排成一排，再将其最大的数字与最后一个数字交换位置，最大的
  数字为已排序数字。然后将剩下的未排序的数字中最大的数字与最后一个未排序的数字
  交换位置，成为已排序数字。重复以上步骤，知道所有数字都成已排序数字
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
		System.out.println("选择排序的结果是： ");
		for(int i = 0;i < numbers.length;i++)
		{
			System.out.print(numbers[i]+" ");
		}
	}

}
