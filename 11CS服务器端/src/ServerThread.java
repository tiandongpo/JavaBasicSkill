import java.io.*;
import java.net.*;
public class ServerThread extends Thread
{
	public class java {

	}

	Socket socket = null;
	//�����뱾�߳���ص�Socket����
	int clientnum;
	//���汾���̵Ŀͻ�����
	public ServerThread(Socket socket,int num)
	//���캯��
	{
		this.socket = socket;
		//��ʼ��socket����
		clientnum = num+1;
		//��ʼ��client number����
	}
	
	public void run()
	{
		//�߳�����
		try
		{
			String readline;
			BufferedReader is =new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//��Socket����õ�����������������Ӧ��BufferedReader����
			PrintWriter os = new PrintWriter(socket.getOutputStream());
			//��socket����õ��������������PrintWriter����
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			//��ϵͳ��׼�����豸����BufferedReader����
			
			System.out.println("Client:"+clientnum+is.readLine());
			//�ڱ�׼����ϴ�ӡ�ӿͻ��˶�����ַ���
			readline = sin.readLine();
			//��ϵͳ��׼����һ���ַ�
			while(!readline.equals("bye"))
				//���ӱ�׼���������ַ���Ϊ��bye"��ֹͣѭ��
			{
				os.println(readline);
				//��ͻ���������ַ���
				os.flush();
				//ˢ���������ʹClient�����յ����ַ���
				System.out.println("Server:"+readline);
				//��ϵͳ��׼����ϴ�ӡ������ַ���
				System.out.println("Client:"+clientnum+is.readLine());
				//��Client����һ�ַ���������ӡ����׼�����
				readline = sin.readLine();
				//��ϵͳ��׼�������һ�ַ���
				
			}//����ѭ��
			os.close();
			is.close();
			socket.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
			//������ӡ������Ϣ
		}
	}

}
