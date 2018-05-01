import java.awt.*;
import javax.swing.*;
public class JTA extends JFrame{
	private JTextArea ta1, ta2, ta3, ta4;
	public JTA(JFrame f,JPanel p)	{
		f.add(p); 
		p.setLayout(new GridLayout(4, 1, 5, 5));
		ta1=new JTextArea();//利用不同的构造方法创建文本区对象
		ta2=new JTextArea(2,8);
        ta3=new JTextArea("3");
        ta4=new JTextArea("4",5,10);
		ta1.setFont(new Font("Serif", Font.PLAIN, 12));//设置字体
        ta2.setFont(new Font("Serif", Font.PLAIN, 12));
        ta3.setFont(new Font("Serif", Font.PLAIN, 12));
        ta4.setFont(new Font("Serif", Font.PLAIN, 12));
        ta1.setText("JTextArea1");//setText()方法会将原来的内容清除
        ta2.append("JTextArea2");//append()方法会将设置的字符串接在原来文本区文字之后.
		ta4.setTabSize(10);//设置[Tab]键的跳离距离方法
		ta4.setLineWrap(true);//自动换行功能方法
        ta4.setWrapStyleWord(true);//断行不断字功能方法
        
		p.add(new JScrollPane(ta1)); p.add(new JScrollPane(ta2));
		p.add(new JScrollPane(ta3)); p.add(new JScrollPane(ta4));
	}
    public static void main(String[] args) {
        JTA d = new JTA(new JF0("添加文本区的窗口"),new JPanel());
    }
}
