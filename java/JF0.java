import javax.swing.*;
import java.awt.*;

public class JF0 extends JFrame{
	public JF0(String s){
		super(s);   //调用父类JFrame的构造方法，给窗口命名
		setBounds(200,200,500,400);//设置窗口位置、窗口大小
		
	try{//设置外观
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){}	
		setVisible(true);          //设置窗口是否为可见
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		JF0 d = new JF0("主窗口");
	}
}


