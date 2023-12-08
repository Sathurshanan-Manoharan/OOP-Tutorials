import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ShowImageFrame myFrame = new ShowImageFrame();
        myFrame.setSize(600, 400);
        myFrame.setTitle("My Frame");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
