import java.awt.*;

public class Picture {
    Graphics g;
    Room room;
    Window window;
    Tree tree;
    Gift gift;
    int x;
    int y;
    int w;
    int h;

    public Picture(Graphics g, int x, int y, int w, int h) {
        this.room = new Room(g, x, y, w, h);
        this.window = new Window(g, x, y, w, h);
        this.tree = new Tree(g, x, y, h);
        this.gift = new Gift(g, x, y, w, h);
        /*this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;*/
    }

    public static void drawPicture (Graphics g, int x, int y, int w, int h) {
        Room.drawRoom(g, x, y, w, h);
        Window.drawWindow(g, x + w/5, y + h/4, w/5, h/3);  //может везде нужно передавать одни координаты
        Tree.drawChristmasTree(g, x + 2*w/3, y + h/3, h);        //и менять их уже внутри draw-методов ???
        Gift.drawGift(g, x + w/4, y + 4*h/5, w/7, h/8);
    }
}
