import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JApplet;

public class JAppletMouse extends JApplet {
	boolean flag = false;
	int x0, y0;// 定义起始点坐标
	int x1, y1;// 定义终点坐标
	int width, height;
	Container pane1;

	public void init() {
		pane1 = getContentPane();
		pane1.addMouseListener(new MouseAdapter()
		// 使用鼠标注册适配器注册事件
				{
					public void mouserPressed(MouseEvent e)
					// 按下鼠标的处理方法
					{
						flag = true;
						x0 = e.getX();
						y0 = e.getY();
						// 按下鼠标时的坐标位置
					}

					public void mouseReleased(MouseEvent e)
					// 松开鼠标的处理方法
					{
						x1 = e.getX();
						y1 = e.getY();
						repaint();

					}

				});

	}

	public void paint(Graphics g) {
		if (flag) {
			width = Math.abs(x1 - x0);
			height = Math.abs(y1 - y0);
			// 取绝对值
			if (x0 > x1 && y0 > y1)
			// 取得矩形框左上角的坐标(x0,y0)
			{
				x0 = x1;
				y0 = y1;
			} else if (x0 > x1 && y0 < y1)
				x0 = x1;
			else if (x0 < x1 && y0 > y1)
				y0 = y1;
			g.drawRect(x0, y0, width, height);
			// 画矩形
		}

	}
}
