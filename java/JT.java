import java.awt.*;
import javax.swing.*;
public class JT extends JFrame{
	private JTextField t1, t2, t3;
	private JPasswordField kl;
	public JT(JFrame f,JPanel p)	{
		f.add(p);     //将面板p加入到窗口f中
		p.setLayout(new FlowLayout());
	    p.setBackground(Color.YELLOW);

		t1 = new JTextField(10);//创建文本框对象，宽度为10
		t2 = new JTextField("请输入文本");//创建带有初始文本的文本框对象
	    t2.setFont(new Font("Serif", Font.PLAIN, 12));
		t3 = new JTextField("不可编辑的文本框", 20);//创建带有初始文本的文本框，宽度为20,
	    t3.setFont(new Font("Serif", Font.PLAIN, 12));
	    t3.setEditable(false);//设置该文本框为不可编辑状态
		kl = new JPasswordField("口令",10);//创建密码框
	    
		p.add(t1);	    p.add(t2);	    p.add(t3);	    p.add(kl);
		}
	
	public static void main(String[] args)	{
		JT d = new JT(new JF0("添加文本框的窗口"),new JPanel());
	}
}

