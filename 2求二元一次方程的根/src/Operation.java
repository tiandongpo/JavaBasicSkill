import java.io.*;
public class Operation {
	
	public static void main(String[] args) {
	String s = "";
	double a,b,c,r1,r2;
	System.out.println("求二元一次方程的根");
	
	System.out.print("请输入第一个系数a:");
	try
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		s = in.readLine();
	}
	catch(IOException e){}
	a = Double.parseDouble(s);
	
	System.out.print("请输入第二个系数b:");
	try
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		s = in.readLine();
	}
	catch(IOException e){}
	b = Double.parseDouble(s);
	
	System.out.print("请输入第三个系数c:");
	try
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		s = in.readLine();
	}
	catch(IOException e){}
	c = Double.parseDouble(s);
	
	
	r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
	r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
	System.out.println("该一元二次方程的根为:"+r1+"和"+r2);

	
}
}
