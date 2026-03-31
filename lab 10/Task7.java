import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task7 extends Applet implements ActionListener {

    Color color = Color.BLACK;

    public void init() {
        add(new Button("Red"));
        add(new Button("Green"));
        add(new Button("Blue"));

        for (Component c : getComponents()) {
            ((Button)c).addActionListener(this);
        }
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("Red")) color = Color.RED;
        if (cmd.equals("Green")) color = Color.GREEN;
        if (cmd.equals("Blue")) color = Color.BLUE;

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(100, 100, 100, 100);
    }
}