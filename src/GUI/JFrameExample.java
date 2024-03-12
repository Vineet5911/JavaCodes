package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.awt.Color.*;

public class JFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        frame.setBackground(GREEN);
        frame.setForeground(green);
        frame.setSize(1200, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp = new JPanel();
        jp.setBackground(GREEN);
        jp.setForeground(GREEN);
        JButton b = new JButton("Click me");
        b.setBackground(black);
        b.setForeground(white);
        b.setBounds(100,100,100,30);
        JTextField jtf = new JTextField();
        jtf.setBounds(500,300,200,50);
        jtf.setForeground(GREEN);
        jtf.setBackground(BLACK);
        frame.add(b);
        frame.setLayout(null);
        frame.add(jtf);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
            }

            @Override
            public void windowIconified(WindowEvent e) {
                super.windowIconified(e);
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                super.windowDeiconified(e);
            }

            @Override
            public void windowActivated(WindowEvent e) {
                super.windowActivated(e);
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                super.windowDeactivated(e);
            }

            @Override
            public void windowStateChanged(WindowEvent e) {
                super.windowStateChanged(e);
            }
        });

        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jtf.setText("button clicked");
            }
        });
    }
}

