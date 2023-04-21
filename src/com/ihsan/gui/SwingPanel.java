package com.ihsan.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SwingPanel extends JFrame {

    SwingPanel(){
        setTitle("Toggle");
        setVisible(true);
        setSize(300, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel jp = new JPanel(new FlowLayout());
        JButton t = new JButton("toggle");
        jp.add(t, BorderLayout.CENTER);
        jp.setSize(70,70);
        jp.setBackground(Color.DARK_GRAY);
        add(jp);
        t.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jp.setBackground(Color.WHITE);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jp.setBackground(Color.BLACK);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                jp.setBackground(Color.CYAN);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jp.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jp.setBackground(Color.GREEN);
            }
        });
    }

    public static void main(String[] args) {
        SwingPanel sp = new SwingPanel();
    }
}
