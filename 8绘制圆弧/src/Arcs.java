import java.awt.*;
import java.applet.*;
public class Arcs extends Applet 
{
	public void paint(Graphics g)
	{
		g.drawArc(10, 40, 70, 70, 0, 75);
		g.fillArc(100,40,70,70,0,75);
		g.drawArc(100, 100, 70, 90, 0, 270);
		g.fillArc(100,100,70,90,0,270);
		g.drawArc(200, 80, 80, 80, 0, 180);
	}

}
