
import java.io.*;
public class Miss 
{
	public static void main(String args[])
	{
		
		
		int Miss[] = new int[10];
		int index;
		String s = "";
		
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.print("������Miss��ţ�1-10��");
			try
			{
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				s = in.readLine();
			}
			catch(IOException e){}
			
			index = Integer.parseInt(s);
			Miss[index-1]=Miss[index-1]+1;
			
		}
		System.out.println();
		System.out.println("   ���湫��Ʊ��");
		for(int i =1;i <= 10;i++)
		{
			System.out.println(i+"��Miss��Ʊ���ǣ�"+Miss[i-1]);
		}
	}

}
