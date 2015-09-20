
public class Fibonacci {


	public static void main(String[] args)
	{
		int foo[] = new int[40];
		for(int i = 0;i < foo.length;i++)
		{
			foo[i] = fibonacci(i);
		}
		System.out.print("ì³²¨ÄÇÆõÊýÁÐ: ");
		
		for(int i = 0;i < foo.length;i++)
		{
			System.out.print(foo[i]+" ");
		}
	

	}
	
	public static int fibonacci(int n)
	{
		if(n <= 1)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}

}
