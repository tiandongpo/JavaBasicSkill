import java.io.*;
public class Test {
   public static void main(String argvs[])
   {
	   String s = "";
	   double a,b,min,max,num;
	   System.out.print("������һ������:");
	   try
	   {
		   BufferedReader in = new BufferedReader(new  InputStreamReader(System.in));
		   s = in.readLine();
	   }
	   catch(IOException e){}
	   a = Double.parseDouble(s);
	  
	   System.out.print("�����ڶ������֣�");
       try
	   {
		   BufferedReader in = new BufferedReader(new  InputStreamReader(System.in));
		   s = in.readLine();
	   }
	   catch(IOException e){}
	   b = Double.parseDouble(s);
	   
	   min = Math.min(a, b);
	   max = Math.max(a,b);
	   num = Math.random()*(max - min) + min;
	   System.out.append("����������м���Ϊ��"+num);
   }
}
