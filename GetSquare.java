package �鱾����;

import java.applet.Applet;      //java���������

import java.awt.*;

public class GetSquare extends Applet                 //���������
{                 
    Label label1;                                  //��Ա����
    public void init() {                              //init����
    	label1=new Label("ǰ30������ƽ��");
    	add(label1);
    }
    public void paint(Graphics g) {            //paint����  //����
    	for (int i=0;i<30;i++) {               //ѭ��
    		int x=i%10,y=i/10;
    		g.drawString(String.valueOf((i+1)*(i+1)),20+30*x,50+25*y);
    	}
    }
}
