import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class BtApplet extends Applet implements ActionListener

{
	Button Button1,Button2;
	public void init()
	{
		Button1 = new Button("��ť1");
		Button1.addActionListener(this);
		add(Button1);
		Button2 = new Button("��ť2");
		Button2.addActionListener(this);
		add(Button2);
		//Ϊ��ťע���¼������ӽ�Applet��
	}
	
	public void actionPerformed(ActionEvent e)
	//����ť�������¼�
	{
		if(e.getActionCommand().equals("��ť1"))
			Button1.setLabel("�Ѱ���");
		if(e.getActionCommand().equals("��ť2"))
				Button2.setLabel("�Ѱ���");
		repaint();
		//������ط���ʵ�ֹ���
		
	}

}
