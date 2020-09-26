import java.awt.*;

public class Picture {
    Room room;
    Window window;
    Tree tree;
    Gift gift;

    public Picture(Room room, Window window, Tree tree, Gift gift) {
        this.room = room;
        this.window = window;
        this.tree = tree;
        this.gift = gift;
    }

    public static void drawPicture (Graphics g, int x, int y, int w, int h) {     //передавать относительные координаты (потому что подарков, например, два)
        Room.drawRoom(g, x, y, w, h);
        Fireplace.drawFireplace(g, x, y, w, h);
        Window.drawWindow(g, x + w/4, y + h/4, w/6, 2*h/7);  //может везде нужно передавать одни координаты
        Tree.drawChristmasTree(g, x + 2*w/3, y + h/3, h);        //и менять их уже внутри draw-методов ???
        Gift.drawGift(g, x + w/4, y + 4*h/5, w/7, h/8);
        Gift.drawGift(g, x + w/2, y + 6*h/7, w/5, h/10);
    }
}
