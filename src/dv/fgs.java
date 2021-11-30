package dv;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fgs {
    private JButton button1;
    private JRadioButton radioButton1;
    private JPanel panelMain;

    public fgs() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("发圣诞节快乐");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("fgs");
        frame.setContentPane(new fgs().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
