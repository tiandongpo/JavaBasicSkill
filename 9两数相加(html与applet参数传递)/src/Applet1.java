import java.awt.*;
import java.applet.*;
public class Applet1 extends Applet
{
	Label l1;
	public void init()
	{
		int x = Integer.parseInt(getParameter("x"));
		int y = Integer.parseInt(getParameter("y"));
		int z = x+y;
		l1 = new Label("HTML给出的两个参数"+x+","+y+"之和为"+z);
		add(l1);
	}

}
