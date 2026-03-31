import javax.swing.*;
import java.awt.event.*;

public class Task4 extends JFrame implements ActionListener {

    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JButton btn = new JButton("+");
    JLabel res = new JLabel("Result:");

    Task4() {
        setLayout(null);

        t1.setBounds(50,50,100,30);
        t2.setBounds(50,100,100,30);
        btn.setBounds(50,150,100,30);
        res.setBounds(50,200,200,30);

        add(t1); add(t2); add(btn); add(res);

        btn.addActionListener(this);

        setSize(300,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        res.setText("Result: " + (a+b));
    }

    public static void main(String[] args) {
        new Task4();
    }
}