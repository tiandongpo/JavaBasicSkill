/**双缓冲技术的应用*/
import java.awt.*;
import java.applet.*;
public class BoLang extends Applet implements Runnable
{
	String s = null;
	int direct =1;
	int Hrad =12;
	int Vrad =12;
	Thread thread =null;
	char words[];
	int phase = 0;
	Image offI;
	Graphics offG;
	Color colors[];
	private Font f;
	private FontMetrics fm;
	
	public void init()
	{
		String param = null;
		s = getParameter("word");
		//获取HTML中的参数
		setBackground(Color.black);
		words = new char[s.length()];
		s.getChars(0, s.length(), words, 0);
		//讲字符串读入字符数组
	    offI = createImage(getSize().width,getSize().height);
		offG = offI.getGraphics();
		//创建一个离屏图像区域offI和图形环境offG
		f = new Font("TimesRoman",Font.BOLD,36);
		fm = getFontMetrics(f);
		offG.setFont(f);
		float h;
		colors = new Color[s.length()];
		for(int i=0;i<s.length();i++)
		{
			h =((float)i)/((float)s.length());
			colors[i] = new Color(Color.HSBtoRGB(h, 1.0f,1.0f));
		}
		//为每个字符设定不同的颜色
	}
	public void start()
	//启动线程
	{
		if(thread == null)
		{
			thread = new Thread(this);
			thread.start();
		}
	}
	
	public void stop()
	{
		if(thread != null)
		{
			thread.stop();
			thread = null;
		}
	}
	public void run()
	{
		while(thread != null)
		{
			try
			{
				Thread.sleep(200);
				
			}
			catch(InterruptedException e){}
			repaint();
			//每隔一段时间调用一次repaint()
		}
		
	}
	
	public void update(Graphics g)
	//定义update方法
	{
		int x,y;
		double ang;
		offG.setColor(Color.black);
		offG.fillRect(0,0,getSize().width,getSize().height);
		phase += direct;
		phase %= 8;
		for(int i=0;i<s.length();i++)
			//在离屏环境中绘制下一幅图像
		{
			ang = ((phase - i*direct)%8)/4.0*Math.PI;
			//确定下一个字符的显示位置
			x=20+fm.getMaxAdvance()*i+(int)(Math.cos(ang)*Hrad);
			y=60+(int)(Math.sin(ang)*Vrad);
			offG.setColor(colors[(phase+i)%s.length()]);
			//确定下一个字符的显示颜色
			offG.drawChars(words, i, 1, x, y);
		}
		paint(g);
		//讲离屏图像发送到实际的显示屏上
	}
	
	public void paint(Graphics g)
	//定义paint()方法
	{
		g.drawImage(offI,0,0,this);
	}

}
