import java.net.*;
public class InetTest
{
	InetAddress myIPaddress = null;
	InetAddress myServer = null;
	public static void main(String[] args)
	{
		InetTest mytool;
		mytool = new InetTest();
		System.out.println("Your host ip is:"+mytool.getMyIP());
		System.out.println("the server ip is: "+mytool.getServerIP());
		
		
	}
	
	public InetAddress getMyIP()
	{
		try
		{
			myIPaddress = InetAddress.getLocalHost();
		}
		catch(UnknownHostException e){}
		return(myIPaddress);
	
	}
	
	public InetAddress getServerIP()
	{
		try
		{
			myServer = InetAddress.getByName("www.baidu.com");
			
		}
		catch(UnknownHostException e){}
		return(myServer);
	}

}
