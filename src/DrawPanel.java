import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    //@Override
    public void paint(Graphics g) {
        super.paint(g);
        int w = getWidth();
        int h = getHeight();
        Picture.drawPicture(g, 0, 0, w, h/*600, 550*/);
    }
}
