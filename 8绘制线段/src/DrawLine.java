import java.applet.*;
import java.awt.*;
public class DrawLine extends Applet
{

	
	public void paint(Graphics g)
	//使用Applet程序中的paint()方法来绘图
	{
		
		int x1,x2,y1,y2;
		x1 = 20;
		x2 = 130;
		y1 = 90;
		y2 = 210;
		//设置线段的起点和终点
		g.drawLine(x1, y1, x2, y2);
		//用Graphics类的实例g调用drawLine方法
	}

}
