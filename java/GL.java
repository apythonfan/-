import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class GL extends JFrame{
   public GL()  {
	   super("ʹ�����񲼾ֹ������Ĵ���"); setSize(400,300);  setVisible(true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   Container c = getContentPane();
      c.setLayout(new GridLayout(3,3,10,10)); // �����������������cΪ3��3��9������  
       c.add(new JLabel("�����Ǳ�ǩ����"));
	   //ͨ��ѭ����䴴����5����ť����
       for (int i=1; i<=5; i++) {c.add(new JButton("��ť"+i));}
      
	  c.add(new JLabel("��ǩ����"));c.add(new JButton("��ť6"));
	  c.add(new JLabel(""));
     }
     public static void main(String[] arguments) {GL ct=new GL();}
}


