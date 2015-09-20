import java.io.*;
public class Dir 
{


	public static void main(String[] args) 
	{
		File flDir = new File(".");
		System.out.println("Files in"+flDir.getAbsolutePath());
		String strFiles[]=flDir.list();
		//�ֱ�������¼��Ŀ¼�ĸ������ļ��ĸ���
		int intDirCount = 0,intFileCount = 0;
		//�������������ļ����ܳ���
		long lngSize = 0;
		for(int i=0;i<strFiles.length;i++)
		{
			File flTemp = new File(strFiles[i]);
			if(flTemp.exists())
			{
				if(flTemp.isFile())
				{
					System.out.println(strFiles[i]+"\t"+flTemp.length());
					intFileCount++;
					lngSize = lngSize + flTemp.length();
				}
				//�ж��Ƿ�����ͨ�ļ�
				if(flTemp.isDirectory())
				{
					System.out.println(strFiles[i]+"\t<DIR>");
					intDirCount++;
				}
				//�ж��Ƿ���Ŀ¼
				
			}
			
		}
		System.out.println(intFileCount+"file(s)\t"+lngSize+"bytes");
		System.out.println(intDirCount+"dir(s)");
		
	}

}
