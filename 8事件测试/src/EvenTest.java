import java.awt.*;
import java.awt.event.*;
public class EvenTest 
{
	public static void main(String args[])
	{
		Frame fr = new Frame("�¼�����");
		ButtonListener aa = new ButtonListener();
		//�����¼���������������
		Button b1 = new Button("����");
		Button b2 = new Button("�˳�");
		//����������ť
		b1.addActionListener(aa);
		b2.addActionListener(aa);
		//���¼�Դ��������ť��ע����¼�������� a a
		fr.setLayout(new FlowLayout());
		fr.add(b1);
		fr.add(b2);
		//����ť����Frame
		fr.resize(200, 200);
		fr.show();
	}

}
class ButtonListener implements ActionListener
//�����¼�Դ�ǰ�ť��ʵ�ּ�������ActionListener
{
	public void actionPerformed(ActionEvent e)
	//�����°�ť�¼��ķ�����actionperformed(),���Ǽ�����
	//ActionListener�ж���ķ�����e��ActionEvent��ʵ��
	{
		if(e.getActionCommand()== "����")
			//ͨ������getActionCommand�ж��¼�Դ
		{
			System.out.println("���°�ť");
			//����¼�Դ��b1,��ʾ��Ϣ
		}
		else
		{
			System.exit(0);
			//����¼�Դ��b2,���˳�����
		}
	}
	
}
