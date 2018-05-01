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

  public void mousePressed(MouseEvent e) {  // 记录起点坐标，MouseListener接口方法
    x1=e.getX();    y1=e.getY();
  }

  public void mouseClicked(MouseEvent e) {}// 覆盖MouseListener接口方法
  public void mouseEntered(MouseEvent e) {}// 覆盖MouseListener接口方法
  public void mouseExited(MouseEvent e) {}// 覆盖MouseListener接口方法
  public void mouseReleased(MouseEvent e) {}// 覆盖MouseListener接口方法
  public void mouseDragged(MouseEvent e) {  // 记录终点坐标，MouseMotionListener接口方法
    x2=e.getX();
    y2=e.getY();
    repaint();
  }
public void mouseMoved(MouseEvent e) {}//覆盖 MouseMotionListener接口方法
}





