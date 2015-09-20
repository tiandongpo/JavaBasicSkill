import java.io.*;
import java.net.*;
public class GetUrl
{


	public static void main(String[] args) throws MalformedURLException
	{
		URL lib =new URL("http://dir.sohu.com:80/company/electronics/index.html");
		System.out.println("协议"+lib.getProtocol());
		System.out.println("端口"+lib.getPort());
		System.out.println("主机名"+lib.getHost());
		System.out.println("文件"+lib.getFile());
		System.out.println("地址"+lib.toExternalForm());
	}

}
