import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class BtApplet extends Applet implements ActionListener

{
	Button Button1,Button2;
	public void init()
	{
		Button1 = new Button("按钮1");
		Button1.addActionListener(this);
		add(Button1);
		Button2 = new Button("按钮2");
		Button2.addActionListener(this);
		add(Button2);
		//为按钮注册事件，并加进Applet中
	}
	
	public void actionPerformed(ActionEvent e)
	//处理按钮产生的事件
	{
		if(e.getActionCommand().equals("按钮1"))
			Button1.setLabel("已按过");
		if(e.getActionCommand().equals("按钮2"))
				Button2.setLabel("已按过");
		repaint();
		//调用相关方法实现功能
		
	}

}
