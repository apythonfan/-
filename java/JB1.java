import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JB1 extends JFrame{
	public  JB1(JFrame f,JPanel p) {
	    f.add(p);     //将面板p加入到窗口f中
		p.add(new Label("按一下按钮可听到响声！", Label.CENTER));
	     Button b=new Button("按钮");
        p.add(b);
        BHandler h = new BHandler();// 创建事件监听器对象
		   b.addActionListener (h);  // 注册事件监听器对象
	}
	public static void main(String[] args) 	{
		JB1 f1 = new JB1(new JF0("单击按钮事件"),new JPanel());
	}
	private class BHandler implements ActionListener{
		public void actionPerformed(ActionEvent e)	{
			Toolkit.getDefaultToolkit ().beep(); 
		}
	}




