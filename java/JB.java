import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JB extends JFrame{
	private JButton button1, button2;
	public  JB(JFrame f,JPanel p) {
	    f.add(p);     //�����p���뵽����f��
		button1 = new JButton("��ť1");//������ť����
	    button1.setFont(new Font("Serif", Font.PLAIN, 20));
	    
	    ImageIcon img1 = new ImageIcon("ͼƬ/1.gif");
	    ImageIcon img2 = new ImageIcon("ͼƬ/2.gif");
	    button2 = new JButton("��ť2", img2);
	    button2.setRolloverIcon(img1);
	    button2.setFont(new Font("Serif", Font.PLAIN, 14));
	    
	    //Ϊ���ע�������
	    BHandler h = new BHandler();
	    button1.addActionListener(h);
	    button2.addActionListener(h);
	    
	    //�����������ӵ��������
	    p.add(button1);
	    p.add(button2);
	}
	public static void main(String[] args) 	{
		JB f1 = new JB(new JF0("��Ӱ�ť�Ĵ���"),new JPanel());
	}
	private class BHandler implements ActionListener{
		public void actionPerformed(ActionEvent event)	{
			JOptionPane.showMessageDialog(JB.this,	"�㰴��: " + event.getActionCommand());
		}
	}
}



