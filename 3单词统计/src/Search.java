import java.io.*;

public class Search 
{
	public static void main(String args[])
	{
		int first=0,second=0,count=0;
		String text = "Sorry i have to miss your get-together i have to go to fred's to meet the in-laws " +
				"What a drag Next time Thank you for the kind invitation Unfortunately i hava a perior engagement " +
				"that evening hepe we hava another opportunity to meet the first apology was written to my friend My " +
				"grammaer is more casual and i user slang in the sentence written to my boss i'm more careful with my " +
				"vocabulary and grammar ";
		String s="";
		String subText = text;
		System.out.println(text);
		
		
		
		System.out.println("������Ҫͳ�Ƶĵ��ʣ� ");
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			s = in.readLine();
		}
		catch(IOException e){}
		
	
		
		
		
		for(int i=0;i<text.length();i+=second+1)
		{
			second = subText.indexOf(" ");
			
			String temp = subText.substring(first, second);
			if(s.equalsIgnoreCase(temp)) count++;
            subText = subText.substring(second+1);
			
			
		}
		
		//�������һ�����ʣ��ı�forѭ������<n���ַ������һλ��Ҫ�ǿո�
	
		
		
		if(count == 0)
			System.out.println("����"+s+"û�г��֡�");
		else
			System.out.println("����"+s+"������"+count+"��");
		
	}

}
