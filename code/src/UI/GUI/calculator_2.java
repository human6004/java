package UI.GUI;

import javax.swing.*;
import java.awt.*;
//tạo 1 class chứa các thành phần của 1 đối tượng
public class calculator_2 extends javax.swing.JFrame {
    private JLabel lblFiFirst, lblFiSecond,  lblResult;
    private JTextField txtFiFirst, txtFiSecond, txtResult;
    private JButton btnClear, btnAdd, btnSubtract, btnMultiply, btnDivide;
    public calculator_2(String calculator) {
        lblFiFirst = new JLabel("Frist Number");
        lblFiSecond = new JLabel("Second Number");
        lblResult = new JLabel("Result");
        this.add(lblFiFirst);
        this.add(lblFiSecond);
        this.add(lblResult);
        lblFiFirst.setBounds(new Rectangle(50, 50, 100, 50));
        lblFiSecond.setBounds(new Rectangle(50, 100, 100, 50));
        lblResult.setBounds(new Rectangle(50, 100, 100, 50));

        this.setSize(500,500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(null);
//        this.setDefaultCloseOperation(null);
//        this.setVisible(true);
    }

    private void setDefaultCloseOperation(Integer o) {
    }
}

