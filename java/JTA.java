import java.awt.*;
import javax.swing.*;
public class JTA extends JFrame{
	private JTextArea ta1, ta2, ta3, ta4;
	public JTA(JFrame f,JPanel p)	{
		f.add(p); 
		p.setLayout(new GridLayout(4, 1, 5, 5));
		ta1=new JTextArea();//���ò�ͬ�Ĺ��췽�������ı�������
		ta2=new JTextArea(2,8);
        ta3=new JTextArea("3");
        ta4=new JTextArea("4",5,10);
		ta1.setFont(new Font("Serif", Font.PLAIN, 12));//��������
        ta2.setFont(new Font("Serif", Font.PLAIN, 12));
        ta3.setFont(new Font("Serif", Font.PLAIN, 12));
        ta4.setFont(new Font("Serif", Font.PLAIN, 12));
        ta1.setText("JTextArea1");//setText()�����Ὣԭ�����������
        ta2.append("JTextArea2");//append()�����Ὣ���õ��ַ�������ԭ���ı�������֮��.
		ta4.setTabSize(10);//����[Tab]����������뷽��
		ta4.setLineWrap(true);//�Զ����й��ܷ���
        ta4.setWrapStyleWord(true);//���в����ֹ��ܷ���
        
		p.add(new JScrollPane(ta1)); p.add(new JScrollPane(ta2));
		p.add(new JScrollPane(ta3)); p.add(new JScrollPane(ta4));
	}
    public static void main(String[] args) {
        JTA d = new JTA(new JF0("����ı����Ĵ���"),new JPanel());
    }
}
