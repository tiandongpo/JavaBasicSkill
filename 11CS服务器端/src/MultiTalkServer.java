import java.io.*;
import java.net.*;


public class MultiTalkServer 
{
	       static int clientnum = 0;
	       //��̬��Ա��������¼��ǰ�ͻ��ĸ���

	
	public static void main(String[] args) throws IOException
			{   
		            ServerSocket serverSocket = null;
		            boolean listening = true;
		            try
		            {
		            	serverSocket = new  ServerSocket(2000);
		            	//����һ��ServerSocket�ڶ˿�2000�����ͻ�����
		            	
		            }
		            catch(IOException e)
		            {
		            	System.out.println("Cound not listen to prot:2000");
		            	//��ӡ������Ϣ
		            	System.exit(-1);
		            }
		            int i=0;
		            while(listening)
		            {
		            	//��Զѭ������
		            	new ServerThread(serverSocket.accept(),clientnum).start();
		            	//�������ͻ����󣬸��ݵõ���Socket����Ϳͻ��������������̲߳�����
		            	clientnum++;
		            	//���ӿͻ�����
		            	System.out.println(i++);
		            }
		            
		            serverSocket.close();//�ر�ServerSocket
		
		          
	         }

}
