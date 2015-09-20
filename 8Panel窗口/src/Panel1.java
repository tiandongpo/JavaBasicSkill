import java.awt.*;
public class Panel1 
{

	
	public static void main(String[] args) 
	{
		Frame fm1 = new Frame("Hello");
		Panel pn1 = new Panel();
		Panel pn2 = new Panel();
		Panel pn3 = new Panel();
		//创建三个panel
		fm1.setSize(400,380);
		fm1.setBackground(Color.gray);
		fm1.setLayout(null);
		//取消默认布局管理器
		pn1.setSize(100,100);
		pn1.setBackground(Color.red);
		pn1.setLocation(0,80);
		pn2.setSize(100,100);
		pn2.setLocation(100,180);
		pn2.setBackground(Color.yellow);
		pn3.setSize(100,100);
		pn3.setBackground(Color.green);
		//分别设置3个panel的大小和背景色
		pn3.setLocation(200,280);
		fm1.add(pn1);
		fm1.add(pn2);
		fm1.add(pn3);
		//将3个panel加入到Frame中
		fm1.setVisible(true);

	}

}
