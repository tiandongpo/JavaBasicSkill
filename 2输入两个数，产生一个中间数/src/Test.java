import java.io.*;
public class Test {
   public static void main(String argvs[])
   {
	   String s = "";
	   double a,b,min,max,num;
	   System.out.print("请键入第一个数字:");
	   try
	   {
		   BufferedReader in = new BufferedReader(new  InputStreamReader(System.in));
		   s = in.readLine();
	   }
	   catch(IOException e){}
	   a = Double.parseDouble(s);
	  
	   System.out.print("请键入第二个数字：");
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
	   System.out.append("随机产生的中间数为："+num);
   }
}
