import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Creating a list of person objects

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Teacher("Sam", new Date(1990,04 - 1,10), 100000));
        list.add(new Student("Sathu", new Date(2004,10 -1 ,05),20220196, "SE"));
        PersonTableModel table = new PersonTableModel(list);

        JTable newTable = new JTable(table);

        JScrollPane scrollPane = new JScrollPane(newTable);

        newTable.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component renderer = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Check the type and set the cell background accordingly
                if ("Teacher".equals(value)) {
                    renderer.setBackground(Color.GREEN);
                } else {
                    renderer.setBackground(Color.BLUE);
                }

                return renderer;
            }
        });
        JFrame frame = new JFrame("Person Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(500, 150);
        frame.setVisible(true);
    }
}
