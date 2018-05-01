import java.awt.*;
import javax.swing.*; 
public class NL extends JFrame{
  JButton b1=new JButton("按钮1");
  JButton b2=new JButton("按钮2");
  JButton b3=new JButton("按钮3");

   public NL()  {
	 super("使用网格布局管理器的窗口"); setSize(400,300);  setVisible(true);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Container c = getContentPane();
     c.setLayout(null);
	 c.add(b1);
     b1.setBounds(20,20,100,40);//为按钮指定在c上的位置与大小
     c.add(b2);
     b2.setBounds(150,20,100,40);
     c.add(b3);
     b3.setBounds(200,100,100,50);
    }
     public static void main(String[] arguments) {
		 NL d=new NL();
		JP1 demo = new JP1();
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 }
}


