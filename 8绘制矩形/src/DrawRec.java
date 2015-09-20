import java.applet.*;
import java.awt.*;
public class DrawRec extends Applet
{
	public void paint(Graphics g)
	{
		for(int m=0;m<=80;m+=10)
			for(int n=80;n>=0;n-=10)
			{
				g.drawRect(n,m,80,40);
			}
		g.setColor(Color.green);
		//…Ë÷√«∞æ∞…´
		g.fillRect(20,20,70,60);
		g.clearRect(30, 30, 80, 40);
		g.setColor(Color.black);
		g.setColor(Color.red);
		g.setClip(130,20,60,80);
		g.fillRect(140,20,70,60);
	}

}
