import javax.swing.*;
public class JD extends JDialog{   
	public JD(JFrame f,String s) {
		super(f,s);         //调用父类JDialog的构造方法，给对话框窗口命名     
		setBounds(300,300,200,200);//设置对话框窗口大小位置
		setVisible(true);       //设置对话框窗口是否为可见
		setModal(false);        //设置对话框窗口模式
                
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE );
	}
	public static void main(String[] args) 	{
		JF0 f=new JF0("主窗口");//创建主窗口对象
		JD d1 = new JD(f,"这是一个对话框窗口"); //创建对话框对象  
	}

}




