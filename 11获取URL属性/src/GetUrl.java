import java.io.*;
import java.net.*;
public class GetUrl
{


	public static void main(String[] args) throws MalformedURLException
	{
		URL lib =new URL("http://dir.sohu.com:80/company/electronics/index.html");
		System.out.println("Э��"+lib.getProtocol());
		System.out.println("�˿�"+lib.getPort());
		System.out.println("������"+lib.getHost());
		System.out.println("�ļ�"+lib.getFile());
		System.out.println("��ַ"+lib.toExternalForm());
	}

}
