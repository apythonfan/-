import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Jlb extends JFrame {
    private JComboBox lbk;
    private JLabel label;
    private String names[] = {"������ѧ", "������ѧ", "�Ͼ���ѧ", "�人��ѧ"};
    
	public Jlb(JFrame f) {
		Container c = getContentPane();	
		c.setBackground(Color.YELLOW);
		f.add(c);		
		lbk = new JComboBox(names);//���������б����
		lbk.setMaximumRowCount(4);//���������б�������ʾ���б���������Ŀ
		lbk.setSelectedIndex(0);//����Ĭ�ϵ�ѡ����
		lbk.setFont(new Font("Serif", Font.PLAIN, 14));//��������
		lbk.addItemListener(new lbHandler());//ע�������
		
		label = new JLabel("��ѡ����: ������ѧ");
	    label.setFont(new Font("Serif", Font.PLAIN, 14));
		c.add(lbk,BorderLayout.NORTH);	c.add(label,BorderLayout.CENTER);
	}
	
	public static void main(String[] args){Jlb d = new Jlb(new JF0("�����б���"));	}
	
	private class lbHandler implements ItemListener{
		public void itemStateChanged(ItemEvent e){
		    if(e.getStateChange() == e.SELECTED) {
		    	label.setText("��ѡ����: " + names[lbk.getSelectedIndex()]);
		    }
		}
	}
}
