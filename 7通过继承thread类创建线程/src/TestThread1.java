
public class TestThread1
{

	//��������
	public static void main(String[] args) 
	{
		MyThread thread1 = new MyThread();//�����߳�
		thread1.start();//�����߳�
	}
	
	
	//����thread�������MyThread
	public static class MyThread extends Thread
	{
		public void run()//����run����
		{
			for(int i = 0;i < 11;i++)
				System.out.print(" "+i);//��ʾ1-10
	
		}
	}

}
