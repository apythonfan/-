package 书本例题;

import java.applet.Applet;      //java包引入语句

import java.awt.*;

public class GetSquare extends Applet                 //类声明语句
{                 
    Label label1;                                  //成员变量
    public void init() {                              //init方法
    	label1=new Label("前30个数的平方");
    	add(label1);
    }
    public void paint(Graphics g) {            //paint方法  //类体
    	for (int i=0;i<30;i++) {               //循环
    		int x=i%10,y=i/10;
    		g.drawString(String.valueOf((i+1)*(i+1)),20+30*x,50+25*y);
    	}
    }
}
