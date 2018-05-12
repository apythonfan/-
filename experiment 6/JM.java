package hello1;

import java.awt.*;
import javax.swing.*;
import java.awt.datatransfer.*;              //java.awt.datatransfer的使用方法请参阅java.awt.datatransfer_360百科
import java.awt.event.*;                    //一般用来实现监听器的方法
public class JM extends JFrame implements ActionListener {
       
  JMenuBar mb=new JMenuBar();  // 创建菜单棒 
  JMenu m1=new JMenu("文件(F)");  // 创建菜单
  JMenuItem open=new JMenuItem("打开(O)...  Ctrl+O"); // 创建菜单项
  JMenuItem close=new JMenuItem("保存(S)...  Ctrl+S");
  JMenuItem exit=new JMenuItem("退出");
  Clipboard clipboard = getToolkit().getSystemClipboard();//获取系统剪贴板。         //声明clipboard对象
 
 

  JMenu m2=new JMenu("编辑(E)");
  JMenuItem copy=new JMenuItem("复制(C)  Ctrl+C");
  JMenuItem cut=new JMenuItem("剪切(T)  Ctrl+X");
  JMenuItem paste=new JMenuItem("粘贴(P)  Ctrl+V");
  
  JMenu m3=new JMenu("帮助(H)");
  JMenuItem content=new JMenuItem("目录");
  JMenuItem index=new JMenuItem("索引");
  JMenuItem about=new JMenuItem("关于");
  
  Container c;                      //声明了一个容器c
  JTextArea editor = new JTextArea();           //创建了一个名为editor的文本区对象
  Font t=new Font("sanserif",Font.PLAIN,12);       //创建了一个新字体t
  JM() {
     super("使用菜单栏的窗口");
    	setSize(400,300);	
        try{UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           } catch(Exception e) { System.err.println("不能设置外观的原因: "+e);}//异常检测机制

	c = getContentPane();              //创建内容面板c
    c.add(new JScrollPane(editor));    //在文本区对象中创建一个滚动条并添加到c内容面板中
	
    //把文本、编辑、帮助菜单添加到内容面板c中并添加菜单棒
    addFileMenu();
    addEditMenu();
    addHelpMenu();
    addJMenuBar();
	setJMenuBar(mb);
    
	setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //设置默认退出方式
	}
	
   private void addFileMenu()  {  //创建文件菜单的方法
	m1.add(open);  // 将菜单项加入到菜单中
    m1.add(close);
    m1.addSeparator();  // 将分隔条加入到菜单中
    m1.add(exit);
    m1.setFont(t);      // 设置菜单字体
   }
   private void addEditMenu()  {//创建编辑菜单的方法
	m2.add(copy);    m2.add(cut);    m2.addSeparator();	m2.add(paste);	m2.setFont(t);
	copy.addActionListener(this);                  //分别对copy、paste、cut按钮进行监听；this当前类对象
    paste.addActionListener(this);
    cut.addActionListener(this);}
   
    //这是命令行必须放在方法中     // 直接把系统剪贴板赋给clipboard对象

	   
   public void actionPerformed(ActionEvent e)
   {
    if(e.getSource() == copy)
    {
     String tempText = editor.getSelectedText();  //拖动鼠标选取文本
    //创建能传输指定 String 的 Transferable。
     StringSelection editText = 
     new StringSelection(tempText);
     /**
     将剪贴板的当前内容设置到指定的 transferable 对象，
    并将指定的剪贴板所有者作为新内容的所有者注册。
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
     editor.replaceRange("",start,end) ; //从Text1中删除被选取的文本。 
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
  
   private void addHelpMenu()    {//创建帮助菜单的方法
	m3.add(content); m3.add(index); m3.addSeparator(); m3.add(about);m3.setFont(t);
   }
   private void addJMenuBar(){// 将菜单加入到菜单棒上的方法
	mb.add(m1); mb.add(m2); mb.add(m3);  mb.setBackground(Color.cyan);
   }
   
  public static void main(String args[]) { 
	  new JM();  }
}
