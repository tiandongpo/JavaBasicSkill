import java.awt.*;
//引入AWT包
public class Frame1 
{


	public static void main(String[] args) 
	
	{
		Frame fm1 = new Frame("Hello");
		//调用Frame的构造方法，设置Frame标题
		fm1.setSize(400,300);
		//设置Frame窗口的大小
		fm1.setBackground(Color.gray);
		//设置Frame的背景色为灰色
		fm1.setVisible(true);
		//使Frame可见
	
	}

}
