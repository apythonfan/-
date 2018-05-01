import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class DrawLine1 extends Applet {
  int x1, y1, x2, y2;

  public void init() {
    addMouseListener(new M1());
    addMouseMotionListener(new M2());
  }

  public void paint(Graphics g) { g.drawLine(x1, y1, x2, y2);  }

  class M1 extends MouseAdapter {
    public void mousePressed(MouseEvent e) {
      x1=e.getX();   y1=e.getY();
    }
  }

  class M2 extends MouseMotionAdapter {
    public void mouseDragged(MouseEvent e) {
      x2=e.getX();   y2=e.getY();
      repaint();
    }
  }
}






