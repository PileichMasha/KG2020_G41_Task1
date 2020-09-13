import java.awt.*;

public class Gift {
    Graphics g;
    int x;
    int y;
    int w;
    int h;

    public Gift(Graphics g, int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public static void drawGift(Graphics g, int x, int y, int w, int h) {
        int centX = x + w/2;
        g.setColor(Color.RED);
        g.fillRect(x, y, w, h);
        g.setColor(Color.WHITE);
        g.fillRect(centX - w/7, y, 2*w/7, h);
        g.fillPolygon(new int[] {centX, centX - w/3, centX - w/3, centX, centX + w/3, centX + w/3},
                new int[] {y, y - h/5, y + h/5, y, y - h/5, y + h/5}, 6);  //можно 2 и 4 точки :10
    }
}
