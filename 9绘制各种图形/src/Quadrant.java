import java.awt.*;
import java.applet.*;
public class Quadrant extends Applet 
{
	public static final int polygon = 0;
	public static final int circle = 2;
	public static final int square = 4;
	public static final int arc = 6;
	private int drawnShape = polygon;
	int xvals[] = {150,180,120};
	int yvals[] = {120,170,170};
	int num = xvals.length;
	
	public boolean mouseMove(Event e,int x, int y)
	{
		if(x<100 && y<100)
		{
			drawnShape = circle;
		}
		else if(x>100&&y<100)
		{
			drawnShape=square;
		}
		else if(x<100&&y>100)
		{
			drawnShape = arc;
		}
		else if(x>100&&y>100)
		{
			drawnShape = polygon;
		}
		repaint();
		return true;
	}
	public void paint(Graphics g)
	{
		g.clearRect(0,0,200,200);
		g.drawLine(100,0,100,200);
		g.drawLine(0,100,200,100);
		if(drawnShape == circle)
		{
			g.setColor(Color.red);
			g.drawOval(10, 10, 80, 80);
		}
		
		else if(drawnShape == square)
		{
			g.setColor(Color.green);
			g.fillRect(110, 10, 80, 80);
		}
		else if(drawnShape == arc)
		{
			g.setColor(Color.blue);
			g.fillArc(10,130,80,35,50,250);
			
		}
		else if(drawnShape == polygon)
		{
			g.setColor(Color.yellow);
			g.drawPolygon(xvals,yvals,num);
		}
	}
	public void init()
	{
		repaint();
	}
	
	

}
