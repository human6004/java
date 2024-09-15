package UI.GUI;

import javax.swing.*;

public class JTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Example");
        Object[][] data = {// tao du lieu cho hang
                {"CNTT01", "Nguyen Van Tuan", 3.2},
                {"DTVT01", "Nguyen Thi Hanh", 2.8},
                {"DTVT02", "Nguyen Manh Tuong", 2.5},
                {"CNTT03", "Pham Thi Nhung", 2.9},
                {"CNTT04", "Huynh Van Phan", 2.1}
        };
        String[] col = {"ID", "Name", "Gpa"};// tao du lieu cho cot
        JTable table = new JTable(data, col);// add cot va hang vao table
        JScrollPane scrollPane = new JScrollPane(table);// add table vo de co thanh cuon
        frame.add(scrollPane);// output scrollPane



        table.setBounds(30, 30, 300, 300);
        table.setFillsViewportHeight(true);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
