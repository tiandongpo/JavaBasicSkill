import java.awt.*;
public class Panel1 
{

	
	public static void main(String[] args) 
	{
		Frame fm1 = new Frame("Hello");
		Panel pn1 = new Panel();
		Panel pn2 = new Panel();
		Panel pn3 = new Panel();
		//��������panel
		fm1.setSize(400,380);
		fm1.setBackground(Color.gray);
		fm1.setLayout(null);
		//ȡ��Ĭ�ϲ��ֹ�����
		pn1.setSize(100,100);
		pn1.setBackground(Color.red);
		pn1.setLocation(0,80);
		pn2.setSize(100,100);
		pn2.setLocation(100,180);
		pn2.setBackground(Color.yellow);
		pn3.setSize(100,100);
		pn3.setBackground(Color.green);
		//�ֱ�����3��panel�Ĵ�С�ͱ���ɫ
		pn3.setLocation(200,280);
		fm1.add(pn1);
		fm1.add(pn2);
		fm1.add(pn3);
		//��3��panel���뵽Frame��
		fm1.setVisible(true);

	}

}
