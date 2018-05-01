import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JL1 extends JFrame{
	private JLabel label;
	public  JL1(JFrame f,JPanel p) {
	    f.add(p);     //将面板p加入到窗口f中
		label = new JLabel("显示文字的标签");//使用文本创建一个标签对象
		label.setFont(new Font("Serif", Font.PLAIN, 20));//设置标签字体
		label.setToolTipText("这是标签对象"); //设置标签的工具提示
		p.add(label); //将标签对象添加到面板对象p上
	}
	public static void main(String[] args) 	{
		JL1 f1 = new JL1(new JF0("添加标签的窗口"),new JPanel());
	}
}


