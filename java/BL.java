import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
public class BL extends JFrame{
    BorderLayout bl = new BorderLayout();//创建BorderLayout布局管理器对象
    JButton bN, bS, bW, bE, bC;
    public BL()  {
    	  super("布局管理器");setSize(300, 200);setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        bN=new JButton("北"); 
		bS=new JButton("南");
		bE=new JButton("东");
		bW=new JButton("西");
		bC=new JButton("中");
		Container c = getContentPane();//创建内容面板
	    c.setLayout(bl);//设置内容面板的布局管理器为布局管理器
	    c.add("North", bN);
		c.add("South", bS);
		c.add("East", bE);
		c.add("West", bW);
		c.add("Center", bC);
    }
    public static void main(String[] args) { BL d = new BL(); }  
}