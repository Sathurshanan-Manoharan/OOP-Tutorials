import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {
    private JTextField txtField;  // Declare txtField at the class level

    public CalculatorFrame() {
        super("My Calculator");

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3, 10, 10));
        p1.setBackground(Color.BLUE);

        for (int i = 1; i <= 9; i++) {
            final int buttonValue = i;  // Create a final variable inside the loop
            JButton button = new JButton(Integer.toString(i));
            button.setBackground(Color.RED);
            button.setForeground(Color.BLUE);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            p1.add(button);

            // Add action listener for number buttons
            button.addActionListener(e -> {
                String currentText = txtField.getText();
                txtField.setText(currentText + buttonValue);
            });
        }

        JButton zeroButton = new JButton("0");
        p1.add(zeroButton);
        JButton dotButton = new JButton(".");
        p1.add(dotButton);

        zeroButton.setBackground(Color.RED);
        zeroButton.setOpaque(true);
        zeroButton.setBorderPainted(false);
        zeroButton.setForeground(Color.BLUE);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 20));

        dotButton.setBackground(Color.RED);
        dotButton.setOpaque(true);
        dotButton.setBorderPainted(false);
        dotButton.setForeground(Color.BLUE);
        dotButton.setFont(new Font("Arial", Font.BOLD, 20));

        JPanel p2 = new JPanel();
        p2.setBackground(Color.BLUE);
        p2.setLayout(new GridLayout(4, 1, 2, 2));

        JButton plusButton = new JButton("+");
        p2.add(plusButton);
        JButton minusButton = new JButton("-");
        p2.add(minusButton);
        JButton clearButton = new JButton("Clear");
        p2.add(clearButton);
        JButton equalButton = new JButton("=");
        p2.add(equalButton);

        plusButton.setBackground(Color.GREEN);
        plusButton.setOpaque(true);
        plusButton.setBorderPainted(false);
        plusButton.setForeground(Color.BLUE);
        plusButton.setFont(new Font("Arial", Font.BOLD, 20));

        minusButton.setBackground(Color.GREEN);
        minusButton.setOpaque(true);
        minusButton.setBorderPainted(false);
        minusButton.setForeground(Color.BLUE);
        minusButton.setFont(new Font("Arial", Font.BOLD, 20));

        clearButton.setBackground(Color.GREEN);
        clearButton.setOpaque(true);
        clearButton.setBorderPainted(false);
        clearButton.setForeground(Color.BLUE);
        clearButton.setFont(new Font("Arial", Font.BOLD, 20));

        equalButton.setBackground(Color.GREEN);
        equalButton.setOpaque(true);
        equalButton.setBorderPainted(false);
        equalButton.setForeground(Color.BLUE);
        equalButton.setFont(new Font("Arial", Font.BOLD, 20));

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 2));
        p3.add(p1);
        p3.add(p2);

        txtField = new JTextField();  // Initialize txtField at the class level
        txtField.setBackground(Color.YELLOW);
        txtField.setForeground(Color.BLUE);
        txtField.setFont(new Font("Arial", Font.BOLD, 20));

        this.add(p3, BorderLayout.CENTER);
        this.add(txtField, BorderLayout.NORTH);

        // Add action listeners for operation buttons
        plusButton.addActionListener(e -> {
            String currentText = txtField.getText();
            txtField.setText(currentText + "+");
        });

        minusButton.addActionListener(e -> {
            String currentText = txtField.getText();
            txtField.setText(currentText + "-");
        });

        equalButton.addActionListener(e -> {
            String currentText = txtField.getText();
            txtField.setText(currentText);
        });

        // Add action listener for clear button
        clearButton.addActionListener(e -> txtField.setText(""));

        pack();  // Important: Pack the components to ensure proper layout
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        CalculatorFrame myCalculator = new CalculatorFrame();
        myCalculator.setVisible(true);
        myCalculator.setSize(600, 300);
        myCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}