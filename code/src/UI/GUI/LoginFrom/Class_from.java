package UI.GUI.LoginFrom;

import javax.swing.*;

public class Class_from extends javax.swing.JFrame{
    private JLabel lbl1, lbl2;
    private JTextField txt1;
    private JPasswordField txt2;
    private JButton btn1, btn2;

    public Class_from(String title) {
        this.setTitle(title);

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

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(500, 400); // Adjusted size
        this.setLayout(null);
        this.setVisible(true);
    }
}
