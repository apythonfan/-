import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JB1 extends JFrame{
	public  JB1(JFrame f,JPanel p) {
	    f.add(p);     //�����p���뵽����f��
		p.add(new Label("��һ�°�ť������������", Label.CENTER));
	     Button b=new Button("��ť");
        p.add(b);
        BHandler h = new BHandler();// �����¼�����������
		   b.addActionListener (h);  // ע���¼�����������
	}
	public static void main(String[] args) 	{
		JB1 f1 = new JB1(new JF0("������ť�¼�"),new JPanel());
	}
	private class BHandler implements ActionListener{
		public void actionPerformed(ActionEvent e)	{
			Toolkit.getDefaultToolkit ().beep(); 
		}
	}




