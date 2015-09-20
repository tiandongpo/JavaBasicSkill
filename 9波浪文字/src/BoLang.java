/**˫���弼����Ӧ��*/
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
		//��ȡHTML�еĲ���
		setBackground(Color.black);
		words = new char[s.length()];
		s.getChars(0, s.length(), words, 0);
		//���ַ��������ַ�����
	    offI = createImage(getSize().width,getSize().height);
		offG = offI.getGraphics();
		//����һ������ͼ������offI��ͼ�λ���offG
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
		//Ϊÿ���ַ��趨��ͬ����ɫ
	}
	public void start()
	//�����߳�
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
			//ÿ��һ��ʱ�����һ��repaint()
		}
		
	}
	
	public void update(Graphics g)
	//����update����
	{
		int x,y;
		double ang;
		offG.setColor(Color.black);
		offG.fillRect(0,0,getSize().width,getSize().height);
		phase += direct;
		phase %= 8;
		for(int i=0;i<s.length();i++)
			//�����������л�����һ��ͼ��
		{
			ang = ((phase - i*direct)%8)/4.0*Math.PI;
			//ȷ����һ���ַ�����ʾλ��
			x=20+fm.getMaxAdvance()*i+(int)(Math.cos(ang)*Hrad);
			y=60+(int)(Math.sin(ang)*Vrad);
			offG.setColor(colors[(phase+i)%s.length()]);
			//ȷ����һ���ַ�����ʾ��ɫ
			offG.drawChars(words, i, 1, x, y);
		}
		paint(g);
		//������ͼ���͵�ʵ�ʵ���ʾ����
	}
	
	public void paint(Graphics g)
	//����paint()����
	{
		g.drawImage(offI,0,0,this);
	}

}
