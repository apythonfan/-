import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JB extends JFrame{
	private JButton button1, button2;
	public  JB(JFrame f,JPanel p) {
	    f.add(p);     //将面板p加入到窗口f中
		button1 = new JButton("按钮1");//创建按钮对象
	    button1.setFont(new Font("Serif", Font.PLAIN, 20));
	    
	    ImageIcon img1 = new ImageIcon("图片/1.gif");
	    ImageIcon img2 = new ImageIcon("图片/2.gif");
	    button2 = new JButton("按钮2", img2);
	    button2.setRolloverIcon(img1);
	    button2.setFont(new Font("Serif", Font.PLAIN, 14));
	    
	    //为组件注册监听器
	    BHandler h = new BHandler();
	    button1.addActionListener(h);
	    button2.addActionListener(h);
	    
	    //将各种组件添加到内容面板
	    p.add(button1);
	    p.add(button2);
	}
	public static void main(String[] args) 	{
		JB f1 = new JB(new JF0("添加按钮的窗口"),new JPanel());
	}
	private class BHandler implements ActionListener{
		public void actionPerformed(ActionEvent event)	{
			JOptionPane.showMessageDialog(JB.this,	"你按了: " + event.getActionCommand());
		}
	}
}



