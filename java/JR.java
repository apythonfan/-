import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JR extends JFrame{
    private JPanel p1, p2;
    private JRadioButton red, green, blue;
    private ButtonGroup buttonGroup;
    
	public JR(JFrame f)	{
		Container c= getContentPane();
		f.add(c);
		p1 = new JPanel();//����һ��������ʾ��ɫ��������
		p1.setBackground(Color.RED);
		c.add(p1, BorderLayout.CENTER);
	
		buttonGroup = new ButtonGroup();//������ѡ��ť��
		red = new JRadioButton("��ɫ", true);//������ѡ��ťѡ��
		green = new JRadioButton("��ɫ");
		blue = new JRadioButton("��ɫ");
		red.setFont(new Font("Serif", Font.PLAIN, 14));//��������
		green.setFont(new Font("Serif", Font.PLAIN, 14));
		blue.setFont(new Font("Serif", Font.PLAIN, 14));
		buttonGroup.add(red);buttonGroup.add(green);buttonGroup.add(blue);//���ѡ�ť������

		rHandler h = new rHandler();//����������
		red.addItemListener(h);	blue.addItemListener(h);green.addItemListener(h);
	
		p2 = new JPanel();//������ŵ�ѡ��ť�����
		p2.add(red);p2.add(green);p2.add(blue);
		c.add(p2, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args){	
		JR application = new JR(new JF0("ͨ����ѡ��ѡ����ɫ�Ĵ���"));
		}
	
	private class rHandler implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(red.isSelected())	p1.setBackground(Color.red);
			else if(green.isSelected())	p1.setBackground(Color.GREEN);
			else p1.setBackground(Color.BLUE);
		}
	}
}