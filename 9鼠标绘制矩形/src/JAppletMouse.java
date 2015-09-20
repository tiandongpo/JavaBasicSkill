import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JApplet;

public class JAppletMouse extends JApplet {
	boolean flag = false;
	int x0, y0;// ������ʼ������
	int x1, y1;// �����յ�����
	int width, height;
	Container pane1;

	public void init() {
		pane1 = getContentPane();
		pane1.addMouseListener(new MouseAdapter()
		// ʹ�����ע��������ע���¼�
				{
					public void mouserPressed(MouseEvent e)
					// �������Ĵ�����
					{
						flag = true;
						x0 = e.getX();
						y0 = e.getY();
						// �������ʱ������λ��
					}

					public void mouseReleased(MouseEvent e)
					// �ɿ����Ĵ�����
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
			// ȡ����ֵ
			if (x0 > x1 && y0 > y1)
			// ȡ�þ��ο����Ͻǵ�����(x0,y0)
			{
				x0 = x1;
				y0 = y1;
			} else if (x0 > x1 && y0 < y1)
				x0 = x1;
			else if (x0 < x1 && y0 > y1)
				y0 = y1;
			g.drawRect(x0, y0, width, height);
			// ������
		}

	}
}
