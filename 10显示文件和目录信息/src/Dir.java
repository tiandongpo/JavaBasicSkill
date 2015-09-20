import java.io.*;
public class Dir 
{


	public static void main(String[] args) 
	{
		File flDir = new File(".");
		System.out.println("Files in"+flDir.getAbsolutePath());
		String strFiles[]=flDir.list();
		//分别用来记录子目录的个数和文件的个数
		int intDirCount = 0,intFileCount = 0;
		//用来几率所有文件的总长度
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
				//判断是否是普通文件
				if(flTemp.isDirectory())
				{
					System.out.println(strFiles[i]+"\t<DIR>");
					intDirCount++;
				}
				//判断是否是目录
				
			}
			
		}
		System.out.println(intFileCount+"file(s)\t"+lngSize+"bytes");
		System.out.println(intDirCount+"dir(s)");
		
	}

}
