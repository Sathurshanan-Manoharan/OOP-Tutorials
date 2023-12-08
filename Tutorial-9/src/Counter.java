import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {
    private JLabel lblCount; // Declare component JLabel
    private JTextField tfCount; // Declare component JTextField
    private JButton btnCount; // Declare component JButton
    private int count = 0; // counter's value

    // Constructor to setup UI components and event handlers
    public Counter() {
// sets layout to FlowLayout, which arranges
// Components from left-to-right, then top-to-bottom.
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        lblCount = new JLabel("Counter"); // Construct component Label
        add(lblCount); // "super" Frame adds Label
        tfCount = new JTextField(count + "", 10); // Construct component TextField
        tfCount.setEditable(false); // read-only
        add(tfCount); // "super" Frame adds TextField
        btnCount = new JButton("Count"); // Construct component Button
        add(btnCount); // "super" Frame adds Button
    }

    private class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
        }
    }
}


