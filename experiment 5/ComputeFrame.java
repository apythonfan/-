package hello1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ComputeFrame extends JFrame {
    private JLabel labelA, labelB;             //定义各个组件
    private JTextField fieldA, fieldB, fieldResult,fieldResult1;
    private JButton buttonAdd, buttonExit,buttonMinus;
    ComputeFrame(String s) {                         //类ComputeFrame的构造方法
    	super(s);                       //调用父类的构造方法给窗口命名
        Container container = getContentPane();           //创建内容面板
        container.setLayout(new FlowLayout());           //创建布局方式,FlowLayout的布局方式为:从左到右、从上到下
        labelA = new JLabel("A:");                       //创建标签和文本框对象(并设置长度)
        fieldA = new JTextField(10);                
        container.add(labelA);                           //将上面两个标签和文本框对象添加到内容容器
        container.add(fieldA);
        labelB = new JLabel("B:");
        fieldB = new JTextField(10);
        container.add(labelB);
        container.add(fieldB);
        fieldResult = new JTextField(30);        
        fieldResult.setEditable(false);                 //设置文本框fieldResult为不可编辑模式
        container.add(fieldResult);
        buttonAdd = new JButton("Add");                //创建按钮对象，并添加到内容容器中
        container.add(buttonAdd);
        fieldResult1 = new JTextField(30);
        fieldResult1.setEditable(false);
        container.add(fieldResult1);
        buttonMinus = new JButton("Minus");
        container.add(buttonMinus);
        buttonExit = new JButton("Exit");
        container.add(buttonExit);
        ActionEventHandler handler = new ActionEventHandler();                  //创建监听器对象
        buttonAdd.addActionListener(handler);                     //分别监听按钮buttonAdd、buttonMinus和buttonExit
        buttonMinus.addActionListener(handler);
        buttonExit.addActionListener(handler);
        setSize(400,140);                     //设置大小和可视化
        setVisible(true);
    }
    private class ActionEventHandler implements ActionListener {                //创建私有类ActionEventHandler，接口为ActionListener
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == buttonExit)                            //如果按到了buttonExit键，终止应用程序
                System.exit(0);     // Terminate the application(终止应用程序)
            else if (event.getSource() == buttonAdd) {                  //如果按到了buttonAdd键
                float a = Float.parseFloat(fieldA.getText());               //将文本框fieldA和fieldB中的文本转化为浮点数并赋给a
                float b = Float.parseFloat(fieldB.getText());
                String result = String.valueOf(a+b);            //再把a和b加起来赋给字符串result
                fieldResult.setText("A+B=" + result);                  
            }
            else{                       //如果按到了按钮buttonMinus
            	float a = Float.parseFloat(fieldA.getText());               //将文本框fieldA和fieldB中的文本转化为浮点数并赋给a
            	float b = Float.parseFloat(fieldB.getText());
                String result = String.valueOf(a-b);            //再把a和b相减赋给字符串result
                fieldResult1.setText("A-B=" + result);    
            }
        }
    }
	public void setDefaultCloseOperation(int exitOnClose) {
		// TODO 自动生成的方法存根
		
	}

}