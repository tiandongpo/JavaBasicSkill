import java.io.*;


public class Letter 
{

	
	public static void main(String[] args) 
	{
		int letter = 0;//�����û�ÿ���������ĸ
		int times = 0;//�����û��²����
		
		int num = (int)(Math.random()*26) + 97;
		do
		{
			System.out.print("���������µ���ĸ��a-z):");
			try
			{
				letter = System.in.read();
				System.in.skip(2);
				
			}
			catch(IOException e){}
			times++;
		
		if(letter > num)
			System.out.println("���ˣ��Ѿ�����"+times+"��");
		if(letter < num)
			System.out.println("С�ˣ��Ѿ�����"+times+"��");
		}while(letter != num);
		
        System.out.println("�¶���!��������"+times+"��");
	}

}
