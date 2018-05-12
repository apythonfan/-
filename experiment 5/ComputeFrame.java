package hello1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ComputeFrame extends JFrame {
    private JLabel labelA, labelB;             //����������
    private JTextField fieldA, fieldB, fieldResult,fieldResult1;
    private JButton buttonAdd, buttonExit,buttonMinus;
    ComputeFrame(String s) {                         //��ComputeFrame�Ĺ��췽��
    	super(s);                       //���ø���Ĺ��췽������������
        Container container = getContentPane();           //�����������
        container.setLayout(new FlowLayout());           //�������ַ�ʽ,FlowLayout�Ĳ��ַ�ʽΪ:�����ҡ����ϵ���
        labelA = new JLabel("A:");                       //������ǩ���ı������(�����ó���)
        fieldA = new JTextField(10);                
        container.add(labelA);                           //������������ǩ���ı��������ӵ���������
        container.add(fieldA);
        labelB = new JLabel("B:");
        fieldB = new JTextField(10);
        container.add(labelB);
        container.add(fieldB);
        fieldResult = new JTextField(30);        
        fieldResult.setEditable(false);                 //�����ı���fieldResultΪ���ɱ༭ģʽ
        container.add(fieldResult);
        buttonAdd = new JButton("Add");                //������ť���󣬲���ӵ�����������
        container.add(buttonAdd);
        fieldResult1 = new JTextField(30);
        fieldResult1.setEditable(false);
        container.add(fieldResult1);
        buttonMinus = new JButton("Minus");
        container.add(buttonMinus);
        buttonExit = new JButton("Exit");
        container.add(buttonExit);
        ActionEventHandler handler = new ActionEventHandler();                  //��������������
        buttonAdd.addActionListener(handler);                     //�ֱ������ťbuttonAdd��buttonMinus��buttonExit
        buttonMinus.addActionListener(handler);
        buttonExit.addActionListener(handler);
        setSize(400,140);                     //���ô�С�Ϳ��ӻ�
        setVisible(true);
    }
    private class ActionEventHandler implements ActionListener {                //����˽����ActionEventHandler���ӿ�ΪActionListener
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == buttonExit)                            //���������buttonExit������ֹӦ�ó���
                System.exit(0);     // Terminate the application(��ֹӦ�ó���)
            else if (event.getSource() == buttonAdd) {                  //���������buttonAdd��
                float a = Float.parseFloat(fieldA.getText());               //���ı���fieldA��fieldB�е��ı�ת��Ϊ������������a
                float b = Float.parseFloat(fieldB.getText());
                String result = String.valueOf(a+b);            //�ٰ�a��b�����������ַ���result
                fieldResult.setText("A+B=" + result);                  
            }
            else{                       //��������˰�ťbuttonMinus
            	float a = Float.parseFloat(fieldA.getText());               //���ı���fieldA��fieldB�е��ı�ת��Ϊ������������a
            	float b = Float.parseFloat(fieldB.getText());
                String result = String.valueOf(a-b);            //�ٰ�a��b��������ַ���result
                fieldResult1.setText("A-B=" + result);    
            }
        }
    }
	public void setDefaultCloseOperation(int exitOnClose) {
		// TODO �Զ����ɵķ������
		
	}

}