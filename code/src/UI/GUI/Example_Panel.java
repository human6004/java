package UI.GUI;

import javax.swing.*;
import java.awt.*;

public class Example_Panel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel");
        //tạo ra bảng nằm bên trong frame
        JPanel pn1 = new JPanel();
        JPanel pn2 = new JPanel();
        pn1.setBounds(50, 50, 200, 200);
        pn2.setBounds(260, 50, 200, 200);
        pn1.setBackground(Color.cyan);
        pn2.setBackground(Color.YELLOW);

        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        btn1.setBounds(10, 10, 100, 30);
        btn2.setBounds(10, 10, 100, 30);
        btn1.setBackground(Color.green);
        btn2.setBackground(Color.red);


        pn1.add(btn1);
        pn2.add(btn2);
        frame.add(pn1);
        frame.add(pn2);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
