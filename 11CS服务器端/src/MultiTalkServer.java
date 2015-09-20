import java.io.*;
import java.net.*;


public class MultiTalkServer 
{
	       static int clientnum = 0;
	       //静态成员变量，记录当前客户的个数

	
	public static void main(String[] args) throws IOException
			{   
		            ServerSocket serverSocket = null;
		            boolean listening = true;
		            try
		            {
		            	serverSocket = new  ServerSocket(2000);
		            	//创建一个ServerSocket在端口2000监听客户请求
		            	
		            }
		            catch(IOException e)
		            {
		            	System.out.println("Cound not listen to prot:2000");
		            	//打印出错信息
		            	System.exit(-1);
		            }
		            int i=0;
		            while(listening)
		            {
		            	//永远循环监听
		            	new ServerThread(serverSocket.accept(),clientnum).start();
		            	//监听到客户请求，根据得到的Socket对象和客户计数创建服务线程并启动
		            	clientnum++;
		            	//增加客户计数
		            	System.out.println(i++);
		            }
		            
		            serverSocket.close();//关闭ServerSocket
		
		          
	         }

}
