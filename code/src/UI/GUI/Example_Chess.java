package UI.GUI;

import javax.swing.*;
import java.awt.*;

public class Example_Chess {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess");

        // Khởi tạo mảng JButton với 64 nút
        JButton[] button = new JButton[64];
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton(); // Khởi tạo từng JButton
        }

        // Đặt màu nền cho các nút
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // Tính chỉ mục của nút
                int index = i * 8 + j;
                // Đặt màu nền
                if ((i + j) % 2 == 0) {
                    button[index].setBackground(Color.BLACK);
                } else {
                    button[index].setBackground(Color.WHITE); // Thêm màu trắng cho ô còn lại
                }
                frame.add(button[index]); // Thêm nút vào frame
            }
        }
//        for (int i = 0; i < button.length; i++) {
//            frame.add(button[i]);
//        }

        frame.setLayout(new GridLayout(8, 8));
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
