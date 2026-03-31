import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task6 extends Applet implements ActionListener {

    TextField tf;
    String name = "";

    public void init() {
        tf = new TextField(20);
        Button btn = new Button("OK");

        add(tf);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        name = tf.getText();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Привет, " + name, 50, 100);
    }
}