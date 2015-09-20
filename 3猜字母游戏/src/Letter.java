import java.io.*;


public class Letter 
{

	
	public static void main(String[] args) 
	{
		int letter = 0;//保存用户每次输入的字母
		int times = 0;//保存用户猜测次数
		
		int num = (int)(Math.random()*26) + 97;
		do
		{
			System.out.print("请输入所猜的字母（a-z):");
			try
			{
				letter = System.in.read();
				System.in.skip(2);
				
			}
			catch(IOException e){}
			times++;
		
		if(letter > num)
			System.out.println("大了，已经猜了"+times+"次");
		if(letter < num)
			System.out.println("小了，已经猜了"+times+"次");
		}while(letter != num);
		
        System.out.println("猜对了!您共用了"+times+"次");
	}

}
