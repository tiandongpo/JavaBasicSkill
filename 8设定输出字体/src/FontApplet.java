import java.awt.*;
import java.applet.*;
public  class FontApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.green);
		g.setFont(new Font("Courier",(Font.BOLD+Font.ITALIC),24));
		g.drawString("Font is bold+italic.",30,30);
	}
	

}
