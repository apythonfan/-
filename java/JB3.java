import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JB3 extends JFrame  implements ActionListener{
	public  JB3(JFrame f,JPanel p) {
	    f.add(p);     //�����p���뵽����f��
		p.add(new Label("��һ�°�ť������������", Label.CENTER));
	     Button b=new Button("��ť");
        p.add(b);
       // ע���¼�����������
		b.addActionListener (this);  
	}
	public void actionPerformed(ActionEvent e)	{
			Toolkit.getDefaultToolkit ().beep(); 
		}
	public static void main(String[] args) 	{
		JB3 f1 = new JB3(new JF0("������ť�¼�"),new JPanel());
	}
	
	}




