import java.awt.*;
import javax.swing.*;
public class JT extends JFrame{
	private JTextField t1, t2, t3;
	private JPasswordField kl;
	public JT(JFrame f,JPanel p)	{
		f.add(p);     //�����p���뵽����f��
		p.setLayout(new FlowLayout());
	    p.setBackground(Color.YELLOW);

		t1 = new JTextField(10);//�����ı�����󣬿��Ϊ10
		t2 = new JTextField("�������ı�");//�������г�ʼ�ı����ı������
	    t2.setFont(new Font("Serif", Font.PLAIN, 12));
		t3 = new JTextField("���ɱ༭���ı���", 20);//�������г�ʼ�ı����ı��򣬿��Ϊ20,
	    t3.setFont(new Font("Serif", Font.PLAIN, 12));
	    t3.setEditable(false);//���ø��ı���Ϊ���ɱ༭״̬
		kl = new JPasswordField("����",10);//���������
	    
		p.add(t1);	    p.add(t2);	    p.add(t3);	    p.add(kl);
		}
	
	public static void main(String[] args)	{
		JT d = new JT(new JF0("����ı���Ĵ���"),new JPanel());
	}
}

