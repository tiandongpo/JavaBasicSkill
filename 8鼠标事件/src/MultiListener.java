import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MultiListener implements MouseListener,MouseMotionListener,WindowListener
//ʵ�ֶ�������߽ӿ�
{
	private Frame f;
	private TextField tf;
	//����һ���ı���
	public static void main(String args[])
	{
		MultiListener m1 = new MultiListener();
		//���ɱ�������Ķ���
		m1.go();
	}
	
	public void go()
	{
		Frame f = new Frame("���������");
		f.add(new Label("�������϶����"),"North");
		//��Frame�м���һ����ǩ�����ֹ�������BorderLayout,
		//��Frame�ı��ϲ��ű�ǩ
		tf = new TextField(30);
		//�ı���Ŀ����30���ַ�
		f.add(tf,"South");
		//��Frame�����²����ı���
		f.addMouseListener(this);
		f.addMouseMotionListener(this);
		f.addWindowListener(this);
		//ͬʱ��������f�Ϸ����Ķ����¼�
		f.resize(200,200);
		f.show();
	} 
	
	public void mouseDragged(MouseEvent e)
	//MouseMotionListener�д�������϶��ķ���
	{
		String s = "Mouse dragging: X ="+e.getX()+"Y"+e.getY();
		tf.setText(s);
		//ͨ������e.getX()������λ�õ�������Ϣ
		
	}
	public void mouseMoved(MouseEvent e){}
	//����û���õ�mouseMove������ҲҪд��
	public void mouserEntered(MouseEvent e)
	{
		//MouseListener�д����������¼��ķ���
		String s = "The mouse Enter";
		tf.setText(s);
	}
	
	public void mouseExit(MouseEvent e)
	{
		//MouseListener�д�������뿪�¼��ķ���
		String s = "The mouse Exited";
		tf.setText(s);
	}
	
	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	//���ܺ�����������Ϊ�գ�Ҳ����д��
	public void windowClosing(WindowEvent e)
	{
		//WindowListener�йرմ��ڵķ���
		System.exit(0);
		//�˳�����
	}
	public void windowClosed(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	//���ܲ�����Щ������Ҳ����д��

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
