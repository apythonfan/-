import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Jcb extends JFrame {
    private JLabel label;    private JCheckBox b, i;
		public Jcb(JFrame f) {
			Container c = getContentPane();c.setLayout(new FlowLayout());
			c.setBackground(Color.YELLOW);
			f.add(c);
			label = new JLabel("请注意观察宋体文字的变化");//创建标签对象，并设置字体
			label.setFont(new Font("Serif", Font.PLAIN, 20));
			c.add(label);
			
			b = new JCheckBox("粗体");//创建复选框
			i = new JCheckBox("斜体");
			b.setFont(new Font("Serif", Font.PLAIN, 16));i.setFont(new Font("Serif", Font.PLAIN, 16));
			b.setBackground(Color.YELLOW);i.setBackground(Color.YELLOW);
			
			CBHandler h = new CBHandler();//创建监听器对象
			b.addItemListener(h);i.addItemListener(h);//注册监听器
			c.add(b);	c.add(i);
		}
	
	public static void main(String[] args){	Jcb d = new Jcb(new JF0("包含复选框的窗口"));}
	
	private class CBHandler implements ItemListener{
		private int vb = Font.PLAIN;		private int vi = Font.PLAIN;
		public void itemStateChanged(ItemEvent e){
			if(e.getSource() == b) vb = b.isSelected()? Font.BOLD : Font.PLAIN;
			if(e.getSource() == i)	vi = b.isSelected()? Font.ITALIC : Font.PLAIN;
			label.setFont(new Font("Serif", vb + vi, 20));
		}
	}
}