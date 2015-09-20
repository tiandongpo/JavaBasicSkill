import java.awt.*;
import java.applet.*;
public class DrawPoly extends Applet
{
	public void paint(Graphics g)
	{
		int x[] = {0,100,100,0,0};
		int y[] = {0,0,100,100,0};
		//设置四个顶点坐标
		g.drawPolyline(x,y,5);
		//g.drawline(0.0.100.0)
		//g.drawline(100,0,100,100)
		//g.drawline(100,100,0,100)
		//g.drawline(0,100,0,0)
		for(int n = 0;n <= 100; n+=10)
			for(int m =100;m >=0;m-=10)
			{
				g.drawLine(m,n,n,m);
			}
		g.drawString("画多边形",20,120);
	}

}
