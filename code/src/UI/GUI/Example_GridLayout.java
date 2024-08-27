package UI.GUI;

import javax.swing.*;
import java.awt.*;

public class Example_GridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example GridLayout");


        //tao nut bang vòng for
        JButton[] buttons = new JButton[9];
        for(int i= 0; i < buttons.length; i++){
            buttons[i] = new JButton(i+1 + "");
        }

        frame.setLayout( new GridLayout(3,3));

        //them nut vao giao dien
        for(int i = 0; i < buttons.length; i++){
            frame.add(buttons[i]);
        }




        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
