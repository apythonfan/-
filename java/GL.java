import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class GL extends JFrame{
   public GL()  {
	   super("使用网格布局管理器的窗口"); setSize(400,300);  setVisible(true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   Container c = getContentPane();
      c.setLayout(new GridLayout(3,3,10,10)); // 调出网格管理器划分c为3行3列9个网格  
       c.add(new JLabel("这里是标签对象"));
	   //通过循环语句创建出5个按钮对象
       for (int i=1; i<=5; i++) {c.add(new JButton("按钮"+i));}
      
	  c.add(new JLabel("标签对象"));c.add(new JButton("按钮6"));
	  c.add(new JLabel(""));
     }
     public static void main(String[] arguments) {GL ct=new GL();}
}


