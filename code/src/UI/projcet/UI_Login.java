package UI.projcet;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI_Login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GARENA");

        // nhãn hiện thị
        JLabel lb1 = new JLabel("Đăng nhập tài khoản");
        JLabel lb2 = new JLabel("username");
        JLabel lb3 = new JLabel("password");
        lb1.setBounds(180,70,150,20);
        lb2.setBounds(75,150,150,20);
        lb3.setBounds(75,200,150,20);

        // chỗ nhập text từ bàn phím
        JTextField name = new JTextField("");
        JPasswordField password = new JPasswordField();
//        JPasswordField
        name.setBounds(170,150,150,20);
        password.setBounds(170,200,150,20);

        //nút bấm
        JButton login = new JButton("Login");
        login.setBounds(210,300,70,20);


        //lấy dữ liệu từ bàn phím
        login.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(name.getText());
                String s = String.valueOf(password.getPassword());
                System.out.println(s);
            }
        });



        //hiện thị ra ngoài màn hình
        frame.add(lb1);
        frame.add(lb2);
        frame.add(lb3);
        frame.add(name);
        frame.add(login);
        frame.add(password);
        frame.setSize(500, 500);


        // lệnh cần thiết khi thiết lập UI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// hiên thị nút bấm close tab
        frame.setLocationRelativeTo(null);// giao diện hiện thi chính giữa màn hình
        frame.setLayout(null);// tránh nút khởi tạo bị tràng viền
        frame.setVisible(true);// hiện thi giao diẹn bảng
    }
}
