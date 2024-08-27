package UI.projcet;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcuclator {
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculator");

        JLabel lb1 = new JLabel("First number");
        JLabel lb2 = new JLabel("Second number");
        JLabel lb3 = new JLabel("Result number");
        lb1.setBounds(75,100,150,20);
        lb2.setBounds(75,150,150,20);
        lb3.setBounds(75,200,150,20);

        //nút bấm
        JButton b1 = new JButton("Add");
        JButton b2 = new JButton("Subtract");
        JButton b3 = new JButton("Multiply");
        JButton b4 = new JButton("Divide");
        JButton b6 = new JButton("Clear");
        b1.setBounds(75,290,100,20);
        b2.setBounds(190,290,100,20);
        b3.setBounds(305,290,100,20);
        b4.setBounds(420,290,100,20);
        b6.setBounds(75,250,100,20);


        //nhập liệu từ bàn phím
        JTextField sc1 = new JTextField("");
        JTextField sc2 = new JTextField("");
        JTextField sc3 = new JTextField("");
        sc1.setBounds(200,100,150,20);
        sc2.setBounds(200,150,150,20);
        sc3.setBounds(200,200,150,20);


        //lấy dữ liệu từ bàn phím
        b1.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int a =Integer.parseInt(sc1.getText());
                int b =Integer.parseInt(sc2.getText());
                int c = a+b;

                sc3.setText(String.valueOf(c));
            }
        });
        b2.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int a =Integer.parseInt(sc1.getText());
                int b =Integer.parseInt(sc2.getText());
                int c = a-b;
                sc3.setText(String.valueOf(c));
            }
        });
        b3.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int a =Integer.parseInt(sc1.getText());
                int b =Integer.parseInt(sc2.getText());
                int c = a*b;
                sc3.setText(String.valueOf(c));
            }
        });
        b4.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int a =Integer.parseInt(sc1.getText());
                int b =Integer.parseInt(sc2.getText());
                int c = a/b;
                sc3.setText(String.valueOf(c));
            }
        });
        b6.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                sc1.setText("");
                sc2.setText("");
                sc3.setText("");
            }
        });


        //hiện thị ra ngoài màn hình
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b6);
        frame.add(lb1);
        frame.add(lb2);
        frame.add(lb3);
        frame.add(sc1);
        frame.add(sc2);
        frame.add(sc3);
        frame.setSize(700, 600);


        // lệnh cần thiết khi thiết lập UI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// hiên thị nút bấm close tab
        frame.setLocationRelativeTo(null);// giao diện hiện thi chính giữa màn hình
        frame.setLayout(null);// tránh nút khởi tạo bị tràng viền
        frame.setVisible(true);// hiện thi giao diẹn bảng
    }
}
