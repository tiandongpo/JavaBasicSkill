import java.io.*;
import java.net.*;
public class ServerThread extends Thread
{
	public class java {

	}

	Socket socket = null;
	//保存与本线程相关的Socket对象
	int clientnum;
	//保存本进程的客户计数
	public ServerThread(Socket socket,int num)
	//构造函数
	{
		this.socket = socket;
		//初始化socket变量
		clientnum = num+1;
		//初始化client number变量
	}
	
	public void run()
	{
		//线程主体
		try
		{
			String readline;
			BufferedReader is =new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//由Socket对象得到输入流，并构造相应的BufferedReader对象
			PrintWriter os = new PrintWriter(socket.getOutputStream());
			//由socket对象得到输出流，并构造PrintWriter对象
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			//由系统标准输入设备构造BufferedReader对象
			
			System.out.println("Client:"+clientnum+is.readLine());
			//在标准输出上打印从客户端读入的字符串
			readline = sin.readLine();
			//从系统标准读入一串字符
			while(!readline.equals("bye"))
				//若从标准输入读入的字符串为“bye"则停止循环
			{
				os.println(readline);
				//向客户端输出该字符串
				os.flush();
				//刷新输出流，使Client马上收到该字符串
				System.out.println("Server:"+readline);
				//在系统标准输出上打印读入的字符串
				System.out.println("Client:"+clientnum+is.readLine());
				//从Client读入一字符串，并打印到标准输出上
				readline = sin.readLine();
				//从系统标准输入读入一字符串
				
			}//继续循环
			os.close();
			is.close();
			socket.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
			//出错，打印出错信息
		}
	}

}
