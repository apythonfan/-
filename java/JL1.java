import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JL1 extends JFrame{
	private JLabel label;
	public  JL1(JFrame f,JPanel p) {
	    f.add(p);     //�����p���뵽����f��
		label = new JLabel("��ʾ���ֵı�ǩ");//ʹ���ı�����һ����ǩ����
		label.setFont(new Font("Serif", Font.PLAIN, 20));//���ñ�ǩ����
		label.setToolTipText("���Ǳ�ǩ����"); //���ñ�ǩ�Ĺ�����ʾ
		p.add(label); //����ǩ������ӵ�������p��
	}
	public static void main(String[] args) 	{
		JL1 f1 = new JL1(new JF0("��ӱ�ǩ�Ĵ���"),new JPanel());
	}
}


