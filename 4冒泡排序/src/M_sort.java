/**首先将一组无序的数字排列成一排，再从左端开始将相邻的数字进行比较，
 * 如果左边的数字比右边的数字大，则交换其位置。一轮比较完成后，最大的数字
 * 会在数列最后的位置上“冒出”。重复比较和交换剩下未排序的数字，直到全部
 * 数字“冒出”。
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
		
		
		System.out.println("冒泡排序的结果是： ");
		for(int i = 0;i < numbers.length;i++)
		{
			System.out.print(numbers[i]+" ");
		}
	}

}
