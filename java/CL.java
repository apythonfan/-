import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class CL extends JFrame{
   JPanel pane= new JPanel();
   JButton button =new JButton("ѡ��Ƭ");
   CardLayout card=new CardLayout();
   public CL()  {
	   super("ʹ�ÿ�Ƭ���ֹ������Ĵ���"); setSize(300,200);  setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
       pane.setLayout(card);//Ϊ���pane������Ƭ���ֹ�����
       //ͨ��ѭ����䴴����5����ť����
       for (int i=1; i<=5; i++) { pane.add(String.valueOf(i), new JButton("��Ƭ��Ϊ��"+i));}
       card.show (pane, String.valueOf(1));

		Container c = getContentPane();
       c.add(pane, BorderLayout.CENTER);//Ϊ�������c�����߽粼�ֹ�����
       c.add(button, BorderLayout.SOUTH);
       //ע�������
       button.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent event) { card.next(pane); }
       });  
     }
     public static void main(String[] arguments) {CL ct=new CL();}
}


