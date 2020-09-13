import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        DrawPanel dp = new DrawPanel();
        this.add(dp);
        //setContentPane(dp);
    }
}
