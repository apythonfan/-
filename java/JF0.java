import javax.swing.*;
import java.awt.*;

public class JF0 extends JFrame{
	public JF0(String s){
		super(s);   //���ø���JFrame�Ĺ��췽��������������
		setBounds(200,200,500,400);//���ô���λ�á����ڴ�С
		
	try{//�������
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){}	
		setVisible(true);          //���ô����Ƿ�Ϊ�ɼ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		JF0 d = new JF0("������");
	}
}


