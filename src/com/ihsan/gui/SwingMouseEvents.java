package com.ihsan.gui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SwingMouseEvents extends JFrame {
    SwingMouseEvents(){
        setTitle("Mouse Position");
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel l = new JLabel("Click to see mouse pos");
        l.setHorizontalAlignment(JLabel.CENTER);
        add(l);

        l.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
//                l.setText("Mouse Clicked at " + x + ", " + y);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                l.setText("Mouse Pressed at " + x + ", " + y);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                l.setText("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        SwingMouseEvents sme = new SwingMouseEvents();
    }
}
