import java.applet.Applet;
import java.awt.*;
public class ImageApplet extends Applet 
{
	int num = 5;
	//������5��ͼ��
	Image imgs[];
	public void init()
	{
		imgs = new Image[num];
		for(int i = 0;i <num;i++)
		{
			imgs[i] = getImage(getDocumentBase(),"images/"+"a"+(i+1)+".jpg");
			//���뵱ǰĿ¼�µ�imagesĿ¼����a��ͷ��˳���ͼ���ļ�
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
				//�������̣��ӳ�һ��ʱ��
				t.start();
				try
				{
					t.join();
					
				}
				catch(InterruptedException e){}
				g.clearRect(0,0,this.getBounds().width,this.getBounds().height);
				//������ʾͼ�������
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
