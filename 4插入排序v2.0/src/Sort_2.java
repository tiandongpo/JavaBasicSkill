
public class Sort_2 
{
	public static void main(String args[])
	{
		int[]numbers ={5,3,6,9,4,7,2};
		insertionSort(numbers,numbers.length-1);//���÷�����������
		System.out.println("�ݹ��������Ľ���ǣ� ");
		for(int i = 0;i < numbers.length;i++)
			System.out.print(numbers[i]+" ");

	}
	
	public static void insertionSort(int[] numbers,int i)
	{
		if(i == 0)return;
		insertionSort(numbers,i-1);
		insert(numbers,i);
		
	}
	
	public static void insert(int[]numbers,int j)
	{
		if(j>0&&numbers[j]<numbers[j-1])
		{
			swap(numbers,j,j-1);
			insert(numbers,j-1);
		}
	}
	
	public static void swap(int[]numbers,int i,int j)
	{
		int temp;
		temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

}
