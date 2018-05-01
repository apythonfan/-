import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Jlb extends JFrame {
    private JComboBox lbk;
    private JLabel label;
    private String names[] = {"北京大学", "复旦大学", "南京大学", "武汉大学"};
    
	public Jlb(JFrame f) {
		Container c = getContentPane();	
		c.setBackground(Color.YELLOW);
		f.add(c);		
		lbk = new JComboBox(names);//创建下拉列表对象
		lbk.setMaximumRowCount(4);//设置下拉列表所能显示的列表项的最大数目
		lbk.setSelectedIndex(0);//设置默认的选择项
		lbk.setFont(new Font("Serif", Font.PLAIN, 14));//设置字体
		lbk.addItemListener(new lbHandler());//注册监听器
		
		label = new JLabel("你选择了: 北京大学");
	    label.setFont(new Font("Serif", Font.PLAIN, 14));
		c.add(lbk,BorderLayout.NORTH);	c.add(label,BorderLayout.CENTER);
	}
	
	public static void main(String[] args){Jlb d = new Jlb(new JF0("下拉列表窗口"));	}
	
	private class lbHandler implements ItemListener{
		public void itemStateChanged(ItemEvent e){
		    if(e.getStateChange() == e.SELECTED) {
		    	label.setText("你选择了: " + names[lbk.getSelectedIndex()]);
		    }
		}
	}
}
