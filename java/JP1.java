import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class JP1 extends JFrame{
	
	
	public  JP1(JFrame f, int x,int y,int w,int h) {
	    Container c= getContentPane();//调用getContentPane()方法创建Container内容面板对象c
		c.setLayout(null);   //设置不采用任何布局方式
	    c.setBackground(Color.black);  //设置面板的背景色为黄色
		f.add(c);//将内容面板c加入到窗口对象f中
		JPanel p=new JPanel();//创建面板对象p
		p.setBounds(x,y,w,h);//设置面板p的位置、大小
		p.setBackground(Color.blue);  //设置面板的背景色为蓝色
		c.add(p);     //将面板p加入到窗口的内容面板c中
	}
	public static void main(String[] args) 	{
		JP1 f1 = new JP1(new JF0("添加面板的窗口"),100,50,200,200);
	}
}


