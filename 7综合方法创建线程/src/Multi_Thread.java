
class Thread1 extends Thread
//ͨ��Thread������ഴ�����߳�
{
	public void run()
	//�Զ����̵߳�run()����
	{
		System.out.println("this is running...");
	}
}

class Thread2 implements Runnable
//ͨ��runnable�ӿڴ�����һ���߳�
{
	public void run()
	//�Զ����̵߳�run()����
	{
		System.out.println("thread2 is running ...");
	}
}

public class Multi_Thread
//���������
{


	public static void main(String[] args) 
	//����������
	{
		Thread1 threadone = new Thread1();
		//��Thread������ഴ������
		Thread threadtwo = new Thread(new Thread2());
		//��Runnable�ӿ���Ķ��󴴽��߳�
		threadone.start();
		threadtwo.start();
		//start���������߳�
		
	}

}
