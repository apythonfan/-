import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class CL extends JFrame{
   JPanel pane= new JPanel();
   JButton button =new JButton("选择卡片");
   CardLayout card=new CardLayout();
   public CL()  {
	   super("使用卡片布局管理器的窗口"); setSize(300,200);  setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
       pane.setLayout(card);//为面板pane调出卡片布局管理器
       //通过循环语句创建出5个按钮对象
       for (int i=1; i<=5; i++) { pane.add(String.valueOf(i), new JButton("卡片号为："+i));}
       card.show (pane, String.valueOf(1));

		Container c = getContentPane();
       c.add(pane, BorderLayout.CENTER);//为内容面板c调出边界布局管理器
       c.add(button, BorderLayout.SOUTH);
       //注册监听器
       button.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent event) { card.next(pane); }
       });  
     }
     public static void main(String[] arguments) {CL ct=new CL();}
}


