import java.io.*;

public class NumberInput
{
	public static void main(String args[])
	{
		try
		{
			InputStreamReader ir;
			BufferedReader in;
			ir= new InputStreamReader(System.in);
			//�Ӽ��̽�����һ���ַ���������,��������һ���ַ�����������
			in = new BufferedReader(ir);
			String s = in.readLine();
			//��������in�ж���һ�У�������ȡ��ֵ��ֵ���ַ�������s
			System.out.println("Input value is:"+s);
			int i = Integer.parseInt(s);
			//ת��������
			i *= 2;
			System.out.println("Input value changed after doubled: "+i);
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
