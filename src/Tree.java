import java.awt.*;
import java.util.Random;

public class Tree {
    Graphics g;
    int x;
    int y;
    int h;  //высота комнаты

    public Tree(Graphics g, int x, int y, int h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }

    public static void drawChristmasTree(Graphics g, int x, int y, int h) {
        //drawTree(g, x, y, a, n);
        int a = h/5;
        drawTree(g, x, y, h);
        int dy = (int)(a*Math.sqrt(3)/3);
        int dx = a / 6;
        int maxY = y - h/3 + 2*h/3;
        while (y <= maxY) {
            drawLights(g, x, y, a);
            y = y + dy;
            a = a + dx;
        }
    }

    private static void drawTree (Graphics g, int x, int y, int h) {   //a - "сторона" ёлки
        int a = h/5;  //temporally
        int dy = (int)((a*Math.sqrt(3)/3));
        int dx = a / 6;
        int maxY = y - h/3 + 2*h/3;   //когда перестать рисовать треугольники. может другие координаты передавать ?
        while (y <= maxY) {
            drawTriangle(g, x, y, a);
            y = y + dy;
            a = a + dx;
        }
        g.setColor(new Color(87, 65, 47));
        g.fillRect(x - a/10, y + dy, 2*a/10, 3*a/10);
    }

    private static void drawTriangle (Graphics g, int x, int y, int a) {
        int y2 = (int)(y + a*Math.sqrt(3)/2);
        g.setColor(new Color(40, 128, 0));
        g.fillPolygon(new int[] {x, x - a, x + a}, new int[] {y, y2, y2}, 3);
    }

    private static void drawLights (Graphics g, int x, int y, int a) {
        //g.setColor(new Color(254, 220, 62));
        Color[] colors = new Color[] {new Color(254, 220, 62), new Color(220, 20, 60),
                                new Color(0, 0, 255)};
        Random rnd = new Random();

        int dy = (int)(a*Math.sqrt(3)/2);
        //g.drawLine(x - a/2, y + dy/2, x + a, y + dy);
        int r = a / 8;
        int dx = 2*r;
        int maxX = x + a;
        int maxY = y + dy;
        while (x <= maxX && y <= maxY) {
            int i = rnd.nextInt(colors.length);
            g.setColor(colors[i]);
            g.fillOval(x - a/2, y + dy/2, r, r);
            x = x + dx;
            y = y + r/2;
        }
    }
}
