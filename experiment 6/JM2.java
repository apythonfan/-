package hello1;

import java.awt.*;
import javax.swing.*;
public class JM2 extends JM {
  JMenu m11=new JMenu("�½�");
  JMenuItem i21=new JMenuItem("��ͨ�ı��ļ�");
  JMenuItem i22=new JMenuItem("HTMLҳ���ļ�");

  JM2() {
    m1.add(m11,0);// ���˵���m11���뵽����m1���ļ����ĵ�һλ����
    m11.add(i21);  // ֱ��Ϊ�����˵�m2����˵���
    m11.addSeparator();
	m11.add(i22);  // ֱ��Ϊ�����˵�m2����˵���
  }
  public static void main(String arg[]) { new JM2();  }
}

