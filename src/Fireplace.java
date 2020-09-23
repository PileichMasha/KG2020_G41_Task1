import java.awt.*;

public class Fireplace {
    Graphics g;
    int x;
    int y;

    public Fireplace(Graphics g, int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void drawFireplace(Graphics g, int x, int y, int w, int h) {
        g.setColor(new Color(128, 0, 0));
        g.fillRect(x + w/5, y + 4*h/7, 3*w/7, 2*h/7);
        int wF = 3*w/7;
        int hF = 2*h/7;

        g.setColor(new Color(139, 69, 19));
        int xi = x + w/5;
        while (xi < x + w/5 + 2*w/7) {
            g.drawLine(xi + wF/6, y + 4*h/7, xi + wF/6, y + 5*h/7 );
            xi += wF/6;
        }
        int yi = y + 4*h/7;
        while (yi < y + 4*h/7 + hF) {
            g.drawLine(x + w/5, yi, x + w/5 + 3*w/7, yi);
            yi += hF/4;
        }

        g.setColor(new Color(255, 140, 0));
        g.fillRect(x + w/5 + wF/6, y + 4*h/7 + hF/4, 2*wF/3, 3*hF/4);

        drawFire(g, x, y, wF, hF);
    }

    private static void drawFire(Graphics g, int x, int y, int wF, int hF) {
        x = x + (7*wF/3)/5;  //пересчитала для fireplace
        y = y + 4*(7*hF/2)/7;

        g.setColor(new Color(180, 0, 0));
        int dx = wF/8;
        int xi = x;
        while (xi < x + 3*wF/4 - 2*dx) {
            g.fillPolygon(new int[]{xi + wF/6, xi + wF/6 + dx, xi + wF/6 + 2*dx}, new int[]{y + hF, y + hF/2, y + hF}, 3);
            xi += dx;
        }

        g.setColor(new Color(255, 215, 0));
        xi = x + dx/2;
        while (xi < x + 3*wF/4 - 3*dx) {
            g.fillPolygon(new int[]{xi + wF/6 + dx/2, xi + wF/6 + 2*dx/2, xi + wF/6 + 3*dx/2}, new int[]{y + hF, y + 2*hF/3, y + hF}, 3);
            xi += dx;
        }

        g.setColor(new Color(230, 0, 0));
        xi = x;
        while (xi < x + 3*wF/4 - 3*dx) {
            g.fillPolygon(new int[]{xi + wF/6 + dx/2, xi + wF/6 + 2*dx/2, xi + wF/6 + 3*dx/2}, new int[]{y + hF, y + 6*hF/7, y + hF}, 3);
            xi += dx/2;
        }
    }
}
