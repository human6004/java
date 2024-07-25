package UI;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class codeUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame example");// tạo tên tiêu đề
        frame.setSize(500, 500);// kích thước của bảng
        JLabel label = new JLabel("tài xiu giúp ta đổi đời");// tạo ra label(bảng hiệu)
        label.setBounds(180, 10, 200, 50);
        frame.add(label);
        JButton tai = new JButton("Tài");// tạo nút
        tai.setBounds(200,100,100,50);// kích thước nút
        frame.add(tai);// add vào trong jframe
        JButton le = new JButton("xĩu");
        le.setBounds(200,200,100,50);
        frame.add(le);
        JButton button = new JButton("đặt cược");
        button.setBounds(200, 350, 100, 50);
        frame.add(button);


        //thêm dữ kiện cho nút đặt cược
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("bạn đã thua, vui lòng đặt cược thêm nữa để chơi");
                button.setText("thử lại");// thay đổi text cho nút button ấy
            }
        });
        tai.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("bạn đã đặt tài");
            }
        });

        le.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("bạn đã đặt xĩu");
            }
        });



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// hiên thị nút bấm close tab
        frame.setLocationRelativeTo(null);// giao diện hiện thi chính giữa màn hình
        frame.setLayout(null);// tránh nút khởi tạo bị tràng viền
        frame.setVisible(true);// hiện thi giao diẹn bảng
    }
}
