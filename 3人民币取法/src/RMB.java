//��ֵΪ1��2��5����������ɣ�ȡ20��ʹ����Ϊ60����ȡ���������֣�����Ǯ�Ҹ�������
public class RMB 
{
	public static void main(String args[])
	{
		int count = 0;
		for(int a = 0;a < 20;a++)
		{
			for(int b=0;b<20;b++)
			{
				for(int c=0;c<20;c++)
				{
					if((a+b+c == 20)&&(1*a+2*b+5*c == 60))
					{
						count ++;
						System.out.print("һԪ������ "+a);
						System.out.print("��Ԫ������ "+b);
						System.out.println("��Ԫ������ "+c);
						
					}
				}
			}
		}
	}

}
