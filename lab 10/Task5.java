import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task5 extends Applet implements ActionListener {

    int count = 0;

    public void init() {
        Button btn = new Button("Click");
        add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Count: " + count, 50, 100);
    }
}