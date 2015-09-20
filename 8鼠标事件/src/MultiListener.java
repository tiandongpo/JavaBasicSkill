import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MultiListener implements MouseListener,MouseMotionListener,WindowListener
//实现多个监听者接口
{
	private Frame f;
	private TextField tf;
	//申明一个文本框
	public static void main(String args[])
	{
		MultiListener m1 = new MultiListener();
		//生成被监听类的对象
		m1.go();
	}
	
	public void go()
	{
		Frame f = new Frame("多个监听者");
		f.add(new Label("单击和拖动鼠标"),"North");
		//在Frame中加入一个标签，布局管理器是BorderLayout,
		//在Frame的北上部放标签
		tf = new TextField(30);
		//文本框的宽度是30个字符
		f.add(tf,"South");
		//在Frame的南下部放文本框
		f.addMouseListener(this);
		f.addMouseMotionListener(this);
		f.addWindowListener(this);
		//同时监听容器f上发生的多种事件
		f.resize(200,200);
		f.show();
	} 
	
	public void mouseDragged(MouseEvent e)
	//MouseMotionListener中处理鼠标拖动的方法
	{
		String s = "Mouse dragging: X ="+e.getX()+"Y"+e.getY();
		tf.setText(s);
		//通过方法e.getX()获得鼠标位置的坐标信息
		
	}
	public void mouseMoved(MouseEvent e){}
	//尽管没有用到mouseMove方法，也要写上
	public void mouserEntered(MouseEvent e)
	{
		//MouseListener中处理鼠标进入事件的方法
		String s = "The mouse Enter";
		tf.setText(s);
	}
	
	public void mouseExit(MouseEvent e)
	{
		//MouseListener中处理鼠标离开事件的方法
		String s = "The mouse Exited";
		tf.setText(s);
	}
	
	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	//尽管后三个方法体为空，也必须写上
	public void windowClosing(WindowEvent e)
	{
		//WindowListener中关闭窗口的方法
		System.exit(0);
		//退出程序
	}
	public void windowClosed(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	//尽管不用这些方法，也必须写上

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
