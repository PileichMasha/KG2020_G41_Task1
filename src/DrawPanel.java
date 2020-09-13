import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    //@Override
    public void paint(Graphics g) {
        super.paint(g);
        /*Room.drawRoom(g, 100, 100, 500, 400);
        Window.drawWindow(g, 150, 150, 100, 170);
        Tree.drawChristmasTree(g, 350, 250, 80, 3);
        Gift.drawGift(g, 150, 450, 100, 60);*/
        Picture.drawPicture(g, 50, 50, 500, 450);
    }
}
