/**����Ŀ¼c:\abc,������һ���ļ�a.txt������ļ���
 д���ַ���welcome����� */
import java.io.*;
public class FileTest 
{


	public static void main(String[] args) throws IOException
	{
		File file1 = new File("e��\\abc");
		file1.mkdir();
		File file2 = new File(file1,"a.txt");
		FileOutputStream out1 = new FileOutputStream(file2);
		String s="welcom";
		byte[] b = s.getBytes();
		for(int i=0;i<5;i++)
		{
			out1.write(b,0,b.length);
		}
	

	}

}
