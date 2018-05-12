package hello1;

import java.awt.*;
import javax.swing.*;
import java.awt.datatransfer.*;              //java.awt.datatransfer��ʹ�÷��������java.awt.datatransfer_360�ٿ�
import java.awt.event.*;                    //һ������ʵ�ּ������ķ���
public class JM extends JFrame implements ActionListener {
       
  JMenuBar mb=new JMenuBar();  // �����˵��� 
  JMenu m1=new JMenu("�ļ�(F)");  // �����˵�
  JMenuItem open=new JMenuItem("��(O)...  Ctrl+O"); // �����˵���
  JMenuItem close=new JMenuItem("����(S)...  Ctrl+S");
  JMenuItem exit=new JMenuItem("�˳�");
  Clipboard clipboard = getToolkit().getSystemClipboard();//��ȡϵͳ�����塣         //����clipboard����
 
 

  JMenu m2=new JMenu("�༭(E)");
  JMenuItem copy=new JMenuItem("����(C)  Ctrl+C");
  JMenuItem cut=new JMenuItem("����(T)  Ctrl+X");
  JMenuItem paste=new JMenuItem("ճ��(P)  Ctrl+V");
  
  JMenu m3=new JMenu("����(H)");
  JMenuItem content=new JMenuItem("Ŀ¼");
  JMenuItem index=new JMenuItem("����");
  JMenuItem about=new JMenuItem("����");
  
  Container c;                      //������һ������c
  JTextArea editor = new JTextArea();           //������һ����Ϊeditor���ı�������
  Font t=new Font("sanserif",Font.PLAIN,12);       //������һ��������t
  JM() {
     super("ʹ�ò˵����Ĵ���");
    	setSize(400,300);	
        try{UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           } catch(Exception e) { System.err.println("����������۵�ԭ��: "+e);}//�쳣������

	c = getContentPane();              //�����������c
    c.add(new JScrollPane(editor));    //���ı��������д���һ������������ӵ�c���������
	
    //���ı����༭�������˵���ӵ��������c�в���Ӳ˵���
    addFileMenu();
    addEditMenu();
    addHelpMenu();
    addJMenuBar();
	setJMenuBar(mb);
    
	setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //����Ĭ���˳���ʽ
	}
	
   private void addFileMenu()  {  //�����ļ��˵��ķ���
	m1.add(open);  // ���˵�����뵽�˵���
    m1.add(close);
    m1.addSeparator();  // ���ָ������뵽�˵���
    m1.add(exit);
    m1.setFont(t);      // ���ò˵�����
   }
   private void addEditMenu()  {//�����༭�˵��ķ���
	m2.add(copy);    m2.add(cut);    m2.addSeparator();	m2.add(paste);	m2.setFont(t);
	copy.addActionListener(this);                  //�ֱ��copy��paste��cut��ť���м�����this��ǰ�����
    paste.addActionListener(this);
    cut.addActionListener(this);}
   
    //���������б�����ڷ�����     // ֱ�Ӱ�ϵͳ�����帳��clipboard����

	   
   public void actionPerformed(ActionEvent e)
   {
    if(e.getSource() == copy)
    {
     String tempText = editor.getSelectedText();  //�϶����ѡȡ�ı�
    //�����ܴ���ָ�� String �� Transferable��
     StringSelection editText = 
     new StringSelection(tempText);
     /**
     ��������ĵ�ǰ�������õ�ָ���� transferable ����
    ����ָ���ļ�������������Ϊ�����ݵ�������ע�ᡣ
    */
     clipboard.setContents(editText,null);
    }else if(e.getSource() == cut)
    {
     String tempText = editor.getSelectedText();
     StringSelection editText = 
       new StringSelection(tempText);
     clipboard.setContents(editText,null);
     int start= editor.getSelectionStart();
     int end  = editor.getSelectionEnd(); 
     editor.replaceRange("",start,end) ; //��Text1��ɾ����ѡȡ���ı��� 
   }else if(e.getSource() == paste)
    {
     Transferable contents = clipboard.getContents(this);
       DataFlavor  flavor= DataFlavor.stringFlavor;
        if( contents.isDataFlavorSupported(flavor))
        {
       try
       {  
        String str;
        str = (String)contents.getTransferData(flavor);
        editor.append(str);
       }catch(Exception ex)
       {
        ex.printStackTrace();
       }
        }
    }
   }
  
   private void addHelpMenu()    {//���������˵��ķ���
	m3.add(content); m3.add(index); m3.addSeparator(); m3.add(about);m3.setFont(t);
   }
   private void addJMenuBar(){// ���˵����뵽�˵����ϵķ���
	mb.add(m1); mb.add(m2); mb.add(m3);  mb.setBackground(Color.cyan);
   }
   
  public static void main(String args[]) { 
	  new JM();  }
}
