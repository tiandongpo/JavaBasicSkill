//����һ�����ʣ����Ǵ�д�������Сд������Сд�������д��
import java.io.*;
public class Convert 
{ 
	

	public static void main(String args[])
	{
		String s = "";
		System.out.print("����Ҫת���ĵ��ʣ�");
	   try
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		s = in.readLine();
	}
	catch(IOException e ){}
	String word = s.equals(s.toUpperCase())?s.toLowerCase():s.toUpperCase();
	System.out.println("���ʵ�����ʽΪ"+word);
}
}
