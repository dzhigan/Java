import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task10 extends Applet implements ActionListener {

    TextField tf;
    String text = "";
    Color color = Color.BLACK;

    public void init() {
        tf = new TextField(20);
        Button btn = new Button("Show");

        add(tf);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        text = tf.getText();

        // меняем цвет случайно
        color = new Color((int)(Math.random()*255),
                          (int)(Math.random()*255),
                          (int)(Math.random()*255));

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(50, 150, 100, 100);

        g.setColor(Color.BLACK);
        g.drawString(text, 50, 100);
    }
}