//使用RandomAccessFile类及其方法，把文件a.txt中的内容“welcom"分两次
//显示在屏幕上。第一次直接显示，第二次给出每一行显示添加的行号.
import java.io.*;
public class RandFile 
{

	public static void main(String[] args) throws IOException
	{
		RandomAccessFile randomfile = new RandomAccessFile("a.txt","r");
		String s;
		while((s =randomfile.readLine()) != null)
		{
			System.out.println(s);
		}
		long filePointer = 0,fileLength = randomfile.length();
		randomfile.seek(0);
		//文件指针已到文件尾，将文件指针重设到文件开始位置
		int i = 1;
		while(filePointer < fileLength)
		{
			s=randomfile.readLine();
			System.out.println((i++)+"  "+s);
			filePointer = randomfile.getFilePointer();
		}
		
		randomfile.close();
		

	}

}
