package UI.GUI.LoginFrom;

import javax.swing.*;

public class Register_1 extends JFrame {
    private JLabel lbl1, lbl2, lbl3, lbl4;
    private JTextField txt1, txt2;
    private JPasswordField txt3, txt4;
    private JButton btn1;

    public Register_1(String title ) {
        this.setTitle(title);

        lbl1 = new JLabel("Enter email:");
        lbl2 = new JLabel("Username:");
        lbl3 = new JLabel("Enter Password:");
        lbl4 = new JLabel("Confirm Password:");

        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JPasswordField();
        txt4 = new JPasswordField();
        btn1 = new JButton("Register");

        lbl1.setBounds(50, 50, 80, 30);
        lbl2.setBounds(50, 100, 80, 30);
        lbl3.setBounds(50, 150, 110, 30);
        lbl4.setBounds(50, 200, 110, 30);
        txt1.setBounds(200, 50, 230, 30);
        txt2.setBounds(200, 100, 230, 30);
        txt3.setBounds(200, 150, 230, 30);
        txt4.setBounds(200, 200, 230, 30);
        btn1.setBounds(220, 260, 100, 30);// Adjusted position

        this.add(lbl1);
        this.add(lbl2);
        this.add(lbl3);
        this.add(lbl4);
        this.add(txt1);
        this.add(txt2);
        this.add(txt3);
        this.add(txt4);
        this.add(btn1);



        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        this.setLocationRelativeTo();
        this.setSize(500, 400); // Adjusted size
        this.setLayout(null);
        this.setVisible(true);
    }

}
