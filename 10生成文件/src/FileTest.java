/**创建目录c:\abc,并创建一个文件a.txt，向该文件中
 写入字符串welcome共五次 */
import java.io.*;
public class FileTest 
{


	public static void main(String[] args) throws IOException
	{
		File file1 = new File("e：\\abc");
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
