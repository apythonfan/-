import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class DrawLine extends Applet implements MouseListener, MouseMotionListener {
  int x1, y1, x2, y2;
  public void init() {
    addMouseListener(this);
    addMouseMotionListener(this);
  }

  public void paint(Graphics g) { g.drawLine(x1, y1, x2, y2); }

  public void mousePressed(MouseEvent e) {  // ��¼������꣬MouseListener�ӿڷ���
    x1=e.getX();    y1=e.getY();
  }

  public void mouseClicked(MouseEvent e) {}// ����MouseListener�ӿڷ���
  public void mouseEntered(MouseEvent e) {}// ����MouseListener�ӿڷ���
  public void mouseExited(MouseEvent e) {}// ����MouseListener�ӿڷ���
  public void mouseReleased(MouseEvent e) {}// ����MouseListener�ӿڷ���
  public void mouseDragged(MouseEvent e) {  // ��¼�յ����꣬MouseMotionListener�ӿڷ���
    x2=e.getX();
    y2=e.getY();
    repaint();
  }
public void mouseMoved(MouseEvent e) {}//���� MouseMotionListener�ӿڷ���
}





