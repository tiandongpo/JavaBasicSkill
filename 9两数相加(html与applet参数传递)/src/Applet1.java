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
		l1 = new Label("HTML��������������"+x+","+y+"֮��Ϊ"+z);
		add(l1);
	}

}
