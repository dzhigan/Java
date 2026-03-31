import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task4 extends Applet implements ActionListener {

    String message = "";

    public void init() {
        Button btn = new Button("Click");
        add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        message = "Button clicked!";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 100);
    }
}