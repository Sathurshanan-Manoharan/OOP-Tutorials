import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShowImageFrame extends JFrame {
    JButton btnOne;
    JButton btnTwo;
    JLabel lblImage;
    ImageIcon imageIconZero;
    ImageIcon imageIconOne;
    ImageIcon imageIconTwo;

    public ShowImageFrame() {

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.setBackground(Color.GREEN);

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 2));

        btnOne = new JButton("One");
        p1.add(btnOne);

        btnTwo = new JButton("Two");
        p1.add(btnTwo);

        imageIconZero = new ImageIcon(getClass().getResource("zero.png"));
        lblImage = new JLabel(imageIconZero, JLabel.CENTER);

        cp.add(lblImage, BorderLayout.CENTER);

        cp.add(p1, BorderLayout.SOUTH);

        imageIconOne = new ImageIcon(getClass().getResource("one.png"));
        imageIconTwo = new ImageIcon(getClass().getResource("two.png"));

        MyListener myListener = new MyListener();
        btnOne.addActionListener(myListener);
        btnTwo.addActionListener(myListener);

        lblImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                lblImage.setIcon(imageIconZero);
            }
        });
    }


    private class MyListener implements ActionListener, MouseListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            String btnLabel = evt.getActionCommand();
            if (btnLabel.equals("One")) {
                lblImage.setIcon(imageIconOne);
            } else if (btnLabel.equals("Two")) {
                lblImage.setIcon(imageIconTwo);
            }
        }

        @Override
        public void mouseClicked(MouseEvent evt) {
            lblImage.setIcon(imageIconZero);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }
}
