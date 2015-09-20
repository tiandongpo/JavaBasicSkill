/**输入任何一个大于2的偶数，然后将该数字表示为两个素数只和*/
import java.io.*;
public class Ge {


	public static void main(String[] args)
	
	{
	    int num,a,b;
	    String s = "";
	    System.out.print("请输入一个大于2的偶数: ");
	    
	    try
	    {
	    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    	s = in.readLine();
	    }catch(IOException e){}
	     
	    num = Integer.parseInt(s);
	    for(int i =2;i < num; i++)

	    {
	    	a=i;
	    	if(!isZhishu(a))continue;
	    	b=num-a;
	    	if(isZhishu(b))
	    	{
	    		System.out.println(num+"="+a+"+"+b);
	    		break;
	    	}
	    }
		

	}
	
	public static boolean isZhishu(int b)
	{
		for(int i=2;i<b;i++)
		{
			if(b%i ==0)return false;
		}
		return true;
	}

}
