package UI.GUI.LoginFrom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Class_from extends javax.swing.JFrame{
    private JLabel lbl1, lbl2;
    private JTextField txt1;
    private JPasswordField txt2;
    private JButton btn1, btn2;

    public Class_from(String title) {
        this.setTitle(title);
//        Image icon = Toolkit.getDefaultToolkit().getImage("https://www.google.com/search?sca_esv=80d0c53c31f1ba3c&sca_upv=1&sxsrf=ADLYWIItEjK7KkMVqTxx2TXor78_dJ1URA:1725895315036&q=logo+sign&udm=2&fbs=AEQNm0D7NTKsOqMPi-yhU7bWDsijXeHIssQxQHiKhz3Orm0Szk2q6O3Esev6DIwpyqAb2Bjzw1c6tpecNpib8dXrzqvm5FMzVkDrTKys67-6kfgAazMCh2q_2K2qBhHmEJZYCshG1iTAvRetXp22SK5ohCSOB6PJIyrTN9FR3xzqGR0ovW4m2ZB55JJTRB7IhjzOCQuJqJTsnB1suhjzOVTDvkNaXS1tQzS-lI2KUfw77X5zkGcSp5Y&sa=X&ved=2ahUKEwjOibCJlbaIAxVu-jgGHelzIwQQtKgLegQIFRAB&biw=1536&bih=695&dpr=1.25#vhid=wq3g-EyJqNzHAM&vssid=mosaic");
//        this.setIconImage(icon);


        lbl1 = new JLabel("Enter Username:");
        lbl2 = new JLabel("Enter Password:");
        txt1 = new JTextField();
        txt2 = new JPasswordField();
        btn1 = new JButton("Login");
        btn2 = new JButton("Register");

        lbl1.setBounds(50, 50, 100, 30);
        lbl2.setBounds(50, 100, 100, 30);
        txt1.setBounds(150, 50, 230, 30);
        txt2.setBounds(150, 100, 230, 30);
        btn1.setBounds(150, 150, 100, 30);
        btn2.setBounds(300, 150, 100, 30); // Adjusted position

        this.add(lbl1);
        this.add(lbl2);
        this.add(txt1);
        this.add(txt2);
        this.add(btn1);
        this.add(btn2);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register_1 reg = new Register_1("Register");
                Class_from.this.setVisible(false);
            }
        });


        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(500, 400); // Adjusted size
        this.setLayout(null);
        this.setVisible(true);
    }
}
