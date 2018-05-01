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
		p1 = new JPanel();//创建一个用来显示颜色的面板对象
		p1.setBackground(Color.RED);
		c.add(p1, BorderLayout.CENTER);
	
		buttonGroup = new ButtonGroup();//创建单选按钮组
		red = new JRadioButton("红色", true);//创建单选按钮选项
		green = new JRadioButton("绿色");
		blue = new JRadioButton("蓝色");
		red.setFont(new Font("Serif", Font.PLAIN, 14));//设置字体
		green.setFont(new Font("Serif", Font.PLAIN, 14));
		blue.setFont(new Font("Serif", Font.PLAIN, 14));
		buttonGroup.add(red);buttonGroup.add(green);buttonGroup.add(blue);//添加选项按钮到组中

		rHandler h = new rHandler();//创建监听器
		red.addItemListener(h);	blue.addItemListener(h);green.addItemListener(h);
	
		p2 = new JPanel();//创建存放单选按钮的面板
		p2.add(red);p2.add(green);p2.add(blue);
		c.add(p2, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args){	
		JR application = new JR(new JF0("通过单选框选择颜色的窗口"));
		}
	
	private class rHandler implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			if(red.isSelected())	p1.setBackground(Color.red);
			else if(green.isSelected())	p1.setBackground(Color.GREEN);
			else p1.setBackground(Color.BLUE);
		}
	}
}