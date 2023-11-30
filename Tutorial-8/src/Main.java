import java.awt.*; // Using AWT's layouts
import javax.swing.*; // Using Swing components and containers
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        CalculatorFrame myCalculator = new CalculatorFrame();
        myCalculator.setVisible(true);
        myCalculator.setSize(600, 300);
        myCalculator.setBackground(Color r);
        Font f = new Font("SansSerif ", Font.BOLD, 16);
        myCalculator.setFont(Color f);

        myCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}