package hello1;

import java.awt.*;
import javax.swing.*;
public class JM2 extends JM {
  JMenu m11=new JMenu("新建");
  JMenuItem i21=new JMenuItem("普通文本文件");
  JMenuItem i22=new JMenuItem("HTML页面文件");

  JM2() {
    m1.add(m11,0);// 将菜单项m11加入到父类m1（文件）的第一位置上
    m11.add(i21);  // 直接为二级菜单m2加入菜单项
    m11.addSeparator();
	m11.add(i22);  // 直接为二级菜单m2加入菜单项
  }
  public static void main(String arg[]) { new JM2();  }
}

