import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class KeyApplet extends Applet implements KeyListener
{
	String s="";
	public void init()
	{
		addKeyListener(this);
		requestFocus();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(s,20,20);
	}
	
	public void  keyPressed(KeyEvent e)
	{
		char ch;
		int code;
		ch = e.getKeyChar();
		code = e.getKeyCode();
		if(((ch>'a')&&(ch<'z'))||((ch>'A')&&(ch<'Z')))
			s="��ո��õ���ĸ��"+ch+"�������Ϊ"+code;
		else
			s ="��ո��õĲ�����ĸ";
		repaint();
	}
	
	public void keyReleased(KeyEvent e)//�ͷż�
	{}
	public void keyTyped(KeyEvent e)//�û���
	{}
}
