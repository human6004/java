package UI.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class_NameConverter extends javax.swing.JFrame {
    private JLabel lbl1, lbl2;
    private JTextField txt1, txt2;
    private JButton btn1;
    public Class_NameConverter(String title) {
        this.setTitle(title);
        lbl1 = new JLabel("Full Name");
        lbl2 = new JLabel("Result");
        txt1 = new JTextField();
        txt2 = new JTextField();
        btn1 = new JButton("Convert");

        lbl1.setBounds(50,50,100,30);
        lbl2.setBounds(50,100,100,30);
        txt1.setBounds(150,50,150,30);
        txt2.setBounds(150,100,150,30);
        btn1.setBounds(150,150,100,30);
        this.add(lbl1); this.add(lbl2);
        this.add(txt1);this.add(txt2);
        this.add(btn1);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fullName = txt1.getText();
                String[] arr = fullName.split("\\s+");
                String res = "";
                for(String s : arr) {
                    res += Character.toUpperCase(s.charAt(0));
                    for(int i = 1; i < s.length(); i++) {
                        res += Character.toLowerCase(s.charAt(i));
                    }
                    res += " ";
                }
                res = res.trim();
                txt2.setText(res);
            }
        });
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}
