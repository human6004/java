package UI.projcet;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class codeUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame example");// tạo tên tiêu đề
        frame.setSize(500, 500);// kích thước của bảng


        JLabel label = new JLabel("tài xiu giúp ta đổi đời");// tạo ra label(bảng hiệu)
        label.setBounds(180, 10, 200, 50);//tạo kích thước

        // tạo nút
        JButton tai = new JButton("Tài");
        JButton le = new JButton("xĩu");
        JButton button = new JButton("đặt cược");
        // kích thước nút
        tai.setBounds(200,100,100,50);
        le.setBounds(200,200,100,50);
        button.setBounds(200, 350, 100, 50);


        //thêm dữ kiện cho nút đặt cược
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"bạn đã thua vui long đặt cược lại");//JOptionPane được sử dụng để hiển thị các hộp thông báo, hộp xác nhận, hộp đầu vào
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


        // add vào trong jframe
        frame.add(label);
        frame.add(tai);
        frame.add(le);
        frame.add(button);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// hiên thị nút bấm close tab
        frame.setLocationRelativeTo(null);// giao diện hiện thi chính giữa màn hình
        frame.setLayout(null);// tránh nút khởi tạo bị tràng viền
        frame.setVisible(true);// hiện thi giao diẹn bảng

    }
}
