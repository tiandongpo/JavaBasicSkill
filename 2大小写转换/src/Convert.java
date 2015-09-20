//输入一个单词，若是大写，则输出小写，若是小写则输出大写；
import java.io.*;
public class Convert 
{ 
	

	public static void main(String args[])
	{
		String s = "";
		System.out.print("输入要转换的单词：");
	   try
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		s = in.readLine();
	}
	catch(IOException e ){}
	String word = s.equals(s.toUpperCase())?s.toLowerCase():s.toUpperCase();
	System.out.println("单词的新形式为"+word);
}
}
