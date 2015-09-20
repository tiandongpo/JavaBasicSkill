import java.awt.*;
import java.awt.event.*;
public class EvenTest 
{
	public static void main(String args[])
	{
		Frame fr = new Frame("事件测试");
		ButtonListener aa = new ButtonListener();
		//生成事件处理（监听）对象
		Button b1 = new Button("测试");
		Button b2 = new Button("退出");
		//生成两个按钮
		b1.addActionListener(aa);
		b2.addActionListener(aa);
		//将事件源（两个按钮）注册给事件处理对象 a a
		fr.setLayout(new FlowLayout());
		fr.add(b1);
		fr.add(b2);
		//将按钮加入Frame
		fr.resize(200, 200);
		fr.show();
	}

}
class ButtonListener implements ActionListener
//由于事件源是按钮，实现监听者是ActionListener
{
	public void actionPerformed(ActionEvent e)
	//处理按下按钮事件的方法是actionperformed(),它是监听者
	//ActionListener中定义的方法，e是ActionEvent的实例
	{
		if(e.getActionCommand()== "测试")
			//通过方法getActionCommand判断事件源
		{
			System.out.println("按下按钮");
			//如果事件源是b1,显示信息
		}
		else
		{
			System.exit(0);
			//如果事件源是b2,则退出程序
		}
	}
	
}
