import java.io.*;
public class Operation {
	
	public static void main(String[] args) {
	String s = "";
	double a,b,c,r1,r2;
	System.out.println("���Ԫһ�η��̵ĸ�");
	
	System.out.print("�������һ��ϵ��a:");
	try
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		s = in.readLine();
	}
	catch(IOException e){}
	a = Double.parseDouble(s);
	
	System.out.print("������ڶ���ϵ��b:");
	try
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		s = in.readLine();
	}
	catch(IOException e){}
	b = Double.parseDouble(s);
	
	System.out.print("�����������ϵ��c:");
	try
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		s = in.readLine();
	}
	catch(IOException e){}
	c = Double.parseDouble(s);
	
	
	r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
	r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
	System.out.println("��һԪ���η��̵ĸ�Ϊ:"+r1+"��"+r2);

	
}
}
