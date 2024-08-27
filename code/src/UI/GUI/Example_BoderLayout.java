package UI.GUI;

import javax.swing.*;
import java.awt.*;

public class Example_BoderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Boder Layout");
        JButton btn1 = new JButton("North");
        JButton btn2 = new JButton("South");
        JButton btn3 = new JButton("East");
        JButton btn4 = new JButton("West");
        JButton btn5 = new JButton("Center");
        btn1.setBackground(Color.cyan);
        btn2.setBackground(Color.cyan);
        btn3.setBackground(Color.cyan);
        btn4.setBackground(Color.cyan);
        btn5.setBackground(Color.cyan);




        frame.setLayout(new BorderLayout());// tránh nút khởi tạo bị tràng viền
        //hgap: khoang cách giữa hàng trên và hàng dươi
        //vgap: hoang cách giữa hàng trái và hàng phải
        //thêm các nút vào vùng chỉ định
        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.SOUTH);
        frame.add(btn3, BorderLayout.EAST);
        frame.add(btn4, BorderLayout.WEST);
        frame.add(btn5, BorderLayout.CENTER);



        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// hiên thị nút bấm close tab
        frame.setLocationRelativeTo(null);// giao diện hiện thi chính giữa màn hình
        frame.setVisible(true);// hiện thi giao diẹn bảng
    }
}
