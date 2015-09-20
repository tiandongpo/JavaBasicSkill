
public class TestThread1
{

	//定义主类
	public static void main(String[] args) 
	{
		MyThread thread1 = new MyThread();//创建线程
		thread1.start();//启动线程
	}
	
	
	//定义thread类的子类MyThread
	public static class MyThread extends Thread
	{
		public void run()//重载run方法
		{
			for(int i = 0;i < 11;i++)
				System.out.print(" "+i);//显示1-10
	
		}
	}

}
