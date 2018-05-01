import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JB2 extends JFrame{
	public  JB2(JFrame f,JPanel p) {
	    f.add(p);     //将面板p加入到窗口f中
		p.add(new Label("按一下按钮可听到响声！", Label.CENTER));
	     Button b=new Button("按钮");
        p.add(b);
       // 注册事件监听器对象
		b.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
			Toolkit.getDefaultToolkit ().beep(); 
		    }
		});  
	}
	public static void main(String[] args) 	{
		JB2 f1 = new JB2(new JF0("单击按钮事件"),new JPanel());
	}
	
	}




