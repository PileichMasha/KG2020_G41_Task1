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
        x = x + w/4; y = y + h/4; w = w/6; h = 2*h/7;     //координаты окна
        int dx = w/20;
        g.setColor(new Color(160, 82, 45));
        g.fillRect(x, y, w, h);
        g.setColor(new Color(25, 25, 112));
        g.fillRect(x + dx, y + dx, w - 2*dx, h - 2*dx);
        drawSnowflakes(g, x, y, w, h);
        g.setColor(new Color(160, 82, 45));
        g.fillRect(x + w/2 - dx/2, y, dx, h);
        g.fillRect(x, y + h/2 - dx/2, w, 2*dx);
    }

    private static void drawSnowflakes(Graphics g, int x, int y, int w, int h) {
        g.setColor(Color.WHITE);
        int dx = w/20;
        int xMin = x + 3*dx; int xMax = x + w - 3*dx;
        int yMin = y + 3*dx; int yMax = y + h/2 - 3*dx;

        xMax -= xMin;
        yMax -= yMin;

        int n = (int) ((Math.random() * 8) + 1);
        for (int i = 0; i < n/2; i++) {
            int xSnow = (int) ((Math.random() * ++xMax) + xMin);
            int ySnow = (int) ((Math.random() * ++yMax) + yMin);
            drawSnowflake(g, xSnow, ySnow, w);
        }
        yMin += h/2;
        yMax = y + h - 3*dx;
        yMax -= yMin;
        for (int i = 0; i < n/2; i++) {
            int xSnow = (int) ((Math.random() * ++xMax) + xMin);
            int ySnow = (int) ((Math.random() * ++yMax) + yMin);
            drawSnowflake(g, xSnow, ySnow, w);
        }
    }

    private static void drawSnowflake(Graphics g, int x, int y, int wW) {
        int n = 12;
        int r = wW/20;
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx = r * Math.cos(da * i);
            double dy = r * Math.sin(da * i);
            g.drawLine(x, y, x + (int) dx, y + (int) dy);
        }
    }
}
