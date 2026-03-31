import java.applet.Applet;
import java.awt.*;

public class Task8 extends Applet implements Runnable {

    int x = 0;

    public void init() {
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            x += 5;
            if (x > 300) x = 0;

            repaint();

            try {
                Thread.sleep(50);
            } catch (Exception e) {}
        }
    }

    public void paint(Graphics g) {
        g.fillOval(x, 100, 50, 50);
    }
}