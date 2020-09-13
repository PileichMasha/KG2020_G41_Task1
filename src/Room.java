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
        g.fillRect(x + w/6, y + h/6, w - 2*w/6, h - 2*h/6);
        g.setColor(new Color(184, 99, 67));
        g.fillPolygon(new int[] {x, x + w/6, x + 5*w/6, x + w}, new int[] {y + h, y + 5*h/6, y + 5*h/6, y + h}, 4);
        g.setColor(Color.BLACK);
        g.drawLine(x, y, x + w/6, y + h/6);
        g.drawLine(x + 5*w/6, y + h/6, x + w, y);
        //g.drawLine(x, y + h, x + w/6, y + 5*h/6);
    }
}
