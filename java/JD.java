import javax.swing.*;
public class JD extends JDialog{   
	public JD(JFrame f,String s) {
		super(f,s);         //���ø���JDialog�Ĺ��췽�������Ի��򴰿�����     
		setBounds(300,300,200,200);//���öԻ��򴰿ڴ�Сλ��
		setVisible(true);       //���öԻ��򴰿��Ƿ�Ϊ�ɼ�
		setModal(false);        //���öԻ��򴰿�ģʽ
                
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE );
	}
	public static void main(String[] args) 	{
		JF0 f=new JF0("������");//���������ڶ���
		JD d1 = new JD(f,"����һ���Ի��򴰿�"); //�����Ի������  
	}

}




