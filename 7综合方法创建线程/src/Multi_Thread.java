
class Thread1 extends Thread
//通过Thread类的子类创建的线程
{
	public void run()
	//自定义线程的run()方法
	{
		System.out.println("this is running...");
	}
}

class Thread2 implements Runnable
//通过runnable接口创建另一个线程
{
	public void run()
	//自定义线程的run()方法
	{
		System.out.println("thread2 is running ...");
	}
}

public class Multi_Thread
//程序的主类
{


	public static void main(String[] args) 
	//申明主方法
	{
		Thread1 threadone = new Thread1();
		//用Thread类的子类创建进程
		Thread threadtwo = new Thread(new Thread2());
		//用Runnable接口类的对象创建线程
		threadone.start();
		threadtwo.start();
		//start方法启动线程
		
	}

}
