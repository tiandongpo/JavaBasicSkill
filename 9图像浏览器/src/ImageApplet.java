import java.applet.Applet;
import java.awt.*;
public class ImageApplet extends Applet 
{
	int num = 5;
	//最多浏览5副图像
	Image imgs[];
	public void init()
	{
		imgs = new Image[num];
		for(int i = 0;i <num;i++)
		{
			imgs[i] = getImage(getDocumentBase(),"images/"+"a"+(i+1)+".jpg");
			//读入当前目录下的images目录中以a开头的顺序的图像文件
		}
		this.setBackground(Color.white);
	}
	public void paint(Graphics g)
	{
		while(true)
		{
			for(int i = 0;i<num;i++)
			{
				g.drawImage(imgs[i],0,0,this);
				Thread t = new MyLater();
				//创建进程，延迟一段时间
				t.start();
				try
				{
					t.join();
					
				}
				catch(InterruptedException e){}
				g.clearRect(0,0,this.getBounds().width,this.getBounds().height);
				//给出显示图像的区域
			}
		}
	}

}
class MyLater extends Thread
{
	public void run()
	{
		try
		{
			this.sleep(900);
		}
		catch(InterruptedException e){}
	}
}
