import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
public class BL extends JFrame{
    BorderLayout bl = new BorderLayout();//����BorderLayout���ֹ���������
    JButton bN, bS, bW, bE, bC;
    public BL()  {
    	  super("���ֹ�����");setSize(300, 200);setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        bN=new JButton("��"); 
		bS=new JButton("��");
		bE=new JButton("��");
		bW=new JButton("��");
		bC=new JButton("��");
		Container c = getContentPane();//�����������
	    c.setLayout(bl);//�����������Ĳ��ֹ�����Ϊ���ֹ�����
	    c.add("North", bN);
		c.add("South", bS);
		c.add("East", bE);
		c.add("West", bW);
		c.add("Center", bC);
    }
    public static void main(String[] args) { BL d = new BL(); }  
}