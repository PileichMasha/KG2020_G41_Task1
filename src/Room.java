import java.awt.*;

public class Room {
    Graphics g;
    int x;
    int y;
    int w;
    int h;

    public Room(Graphics g, int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public static void drawRoom(Graphics g, int x, int y, int w, int h) {
        g.setColor(new Color(255, 222, 173));
        g.fillRect(x, y, w, h);
        g.setColor(new Color(222, 184, 135));
        g.fillRect(x + w/7, y + h/7, w - 2*w/7, h - 2*h/7);
        g.setColor(new Color(184, 99, 67));
        g.fillPolygon(new int[] {x, x + w/7, x + 6*w/7, x + w}, new int[] {y + h, y + 6*h/7, y + 6*h/7, y + h}, 4);
        g.setColor(Color.BLACK);
        g.drawLine(x, y, x + w/7, y + h/7);
        g.drawLine(x + 6*w/7, y + h/7, x + w, y);
    }
}
