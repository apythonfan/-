import java.awt.*;
import javax.swing.*; 
public class NL extends JFrame{
  JButton b1=new JButton("��ť1");
  JButton b2=new JButton("��ť2");
  JButton b3=new JButton("��ť3");

   public NL()  {
	 super("ʹ�����񲼾ֹ������Ĵ���"); setSize(400,300);  setVisible(true);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Container c = getContentPane();
     c.setLayout(null);
	 c.add(b1);
     b1.setBounds(20,20,100,40);//Ϊ��ťָ����c�ϵ�λ�����С
     c.add(b2);
     b2.setBounds(150,20,100,40);
     c.add(b3);
     b3.setBounds(200,100,100,50);
    }
     public static void main(String[] arguments) {
		 NL d=new NL();
		JP1 demo = new JP1();
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 }
}


