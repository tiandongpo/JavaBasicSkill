//ʹ��RandomAccessFile�༰�䷽�������ļ�a.txt�е����ݡ�welcom"������
//��ʾ����Ļ�ϡ���һ��ֱ����ʾ���ڶ��θ���ÿһ����ʾ��ӵ��к�.
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
		//�ļ�ָ���ѵ��ļ�β�����ļ�ָ�����赽�ļ���ʼλ��
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
