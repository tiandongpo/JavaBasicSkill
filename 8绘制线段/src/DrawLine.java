import java.applet.*;
import java.awt.*;
public class DrawLine extends Applet
{

	
	public void paint(Graphics g)
	//ʹ��Applet�����е�paint()��������ͼ
	{
		
		int x1,x2,y1,y2;
		x1 = 20;
		x2 = 130;
		y1 = 90;
		y2 = 210;
		//�����߶ε������յ�
		g.drawLine(x1, y1, x2, y2);
		//��Graphics���ʵ��g����drawLine����
	}

}
