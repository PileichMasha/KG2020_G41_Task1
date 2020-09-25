import java.awt.*;
import java.util.Random;

public class Gift {
    Graphics g;
    int x;
    int y;

    public Gift(Graphics g, int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void drawGift(Graphics g, int x, int y, int w, int h) {
        Color[] colors = new Color[] {new Color(254, 220, 62), new Color(220, 20, 60),
                new Color(0, 0, 255)};
        Random rnd = new Random();
        int centX = x + w/2;
        int i = rnd.nextInt(colors.length);
        g.setColor(colors[i]);
        g.fillRect(x, y, w, h);
        g.setColor(Color.WHITE);
        g.fillRect(centX - w/7, y, 2*w/7, h);
        g.fillPolygon(new int[] {centX, centX - w/3, centX - w/3, centX, centX + w/3, centX + w/3},
                new int[] {y, y - h/5, y + h/5, y, y - h/5, y + h/5}, 6);  //можно 2 и 4 точки :10
    }
}
