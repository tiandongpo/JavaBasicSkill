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
			s="Äã¸Õ¸ÕÇÃµÄ×ÖÄ¸ÊÇ"+ch+"Æä¼üÅÌÂëÎª"+code;
		else
			s ="Äã¸Õ¸ÕÇÃµÄ²»ÊÇ×ÖÄ¸";
		repaint();
	}
	
	public void keyReleased(KeyEvent e)//ÊÍ·Å¼ü
	{}
	public void keyTyped(KeyEvent e)//ÇÃ»÷¼ü
	{}
}
