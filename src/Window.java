import java.awt.*;

public class Window {
    Graphics g;
    int x;
    int y;

    public Window(Graphics g, int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void drawWindow(Graphics g, int x, int y, int w, int h) {
        int dx = w/20;
        g.setColor(new Color(160, 82, 45));
        g.fillRect(x, y, w, h);
        g.setColor(new Color(25, 25, 112));
        g.fillRect(x + dx, y + dx, w - 2*dx, h - 2*dx);
        g.setColor(new Color(160, 82, 45));
        g.fillRect(x + w/2 - dx/2, y, dx, h);
        g.fillRect(x, y + h/2 - dx/2, w, 2*dx);
    }
}
