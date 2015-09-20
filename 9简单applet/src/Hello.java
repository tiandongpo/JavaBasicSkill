import java.awt.*;
import java.applet.*;
public class Hello extends Applet
{
	String hw_text;
	public void init()
	{
		hw_text = "»¶Ó­";
		
	}
	public void paint(Graphics g)
	{
		g.drawString(hw_text, 25, 25);
	}

}
