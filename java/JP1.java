import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class JP1 extends JFrame{
	
	
	public  JP1(JFrame f, int x,int y,int w,int h) {
	    Container c= getContentPane();//����getContentPane()��������Container����������c
		c.setLayout(null);   //���ò������κβ��ַ�ʽ
	    c.setBackground(Color.black);  //�������ı���ɫΪ��ɫ
		f.add(c);//���������c���뵽���ڶ���f��
		JPanel p=new JPanel();//����������p
		p.setBounds(x,y,w,h);//�������p��λ�á���С
		p.setBackground(Color.blue);  //�������ı���ɫΪ��ɫ
		c.add(p);     //�����p���뵽���ڵ��������c��
	}
	public static void main(String[] args) 	{
		JP1 f1 = new JP1(new JF0("������Ĵ���"),100,50,200,200);
	}
}


