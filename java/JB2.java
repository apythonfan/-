import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JB2 extends JFrame{
	public  JB2(JFrame f,JPanel p) {
	    f.add(p);     //�����p���뵽����f��
		p.add(new Label("��һ�°�ť������������", Label.CENTER));
	     Button b=new Button("��ť");
        p.add(b);
       // ע���¼�����������
		b.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
			Toolkit.getDefaultToolkit ().beep(); 
		    }
		});  
	}
	public static void main(String[] args) 	{
		JB2 f1 = new JB2(new JF0("������ť�¼�"),new JPanel());
	}
	
	}




