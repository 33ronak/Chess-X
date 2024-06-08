package main;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse extends MouseAdapter{

    public int x, y;
    public boolean pressed;

    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        pressed = true;
    }

    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        pressed = false;
    }

    public void mouseDragged(MouseEvent e) {
        super.mouseDragged(e);
        x = e.getX();
        y = e.getY();
    }

    // @Override
    public void mouseMoved(MouseEvent e) {
        super.mouseMoved(e);
        x = e.getX();
        y = e.getY();
    }

}
