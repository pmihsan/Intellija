package com.ihsan.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculator extends JFrame{

    private JTextField numf1;
    private JTextField numf2;
    private JButton addbtn;
    private JButton subbtn;
    private JButton mulbtn;
    private JButton divbtn;

    private JButton modbtn;
    private JLabel resl;

    SwingCalculator(){
        setTitle("Calculator");
        setLayout(new GridLayout(3,2));
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Input Fields
        JPanel inputs = new JPanel(new FlowLayout());
        numf1 = new JTextField(10);
        numf2 = new JTextField(10);
        inputs.add(numf1);
        inputs.add(numf2);

        // Buttons
        JPanel btns = new JPanel(new FlowLayout());
        addbtn = new JButton("+");
        subbtn = new JButton("-");
        mulbtn = new JButton("*");
        divbtn = new JButton("/");
        modbtn = new JButton("%");
        btns.add(addbtn);
        btns.add(subbtn);
        btns.add(mulbtn);
        btns.add(divbtn);
        btns.add(modbtn);

        // Result
        JPanel res = new JPanel(new FlowLayout());
        resl = new JLabel("RESULT: ");

        res.add(resl);

        add(inputs);
        add(btns);

        add(res, BorderLayout.CENTER);

        addbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(numf1.getText());
                    double num2 = Double.parseDouble(numf2.getText());
                    double result = num1 + num2;
                    resl.setText("Result: " + result);
                }
                catch (NumberFormatException ex) {
                    resl.setText("Result: Error");
                }
            }
        });

        subbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(numf1.getText());
                    double num2 = Double.parseDouble(numf2.getText());
                    double result = num1 - num2;
                    resl.setText("Result: " + result);
                }
                catch (NumberFormatException ex) {
                    resl.setText("Result: Error");
                }
            }
        });

        mulbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(numf1.getText());
                    double num2 = Double.parseDouble(numf2.getText());
                    double result = num1 * num2;
                    resl.setText("Result: " + result);
                }
                catch (NumberFormatException ex) {
                    resl.setText("Result: Error");
                }
            }
        });

        divbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(numf1.getText());
                    double num2 = Double.parseDouble(numf2.getText());
                    if(num2 == 0){
                        resl.setText("Result: Error");
                    }
                    else {
                        double result = num1 / num2;
                        resl.setText("Result: " + result);
                    }
                }
                catch (NumberFormatException ex) {
                    resl.setText("Result: Error");
                }
            }
        });

        modbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(numf1.getText());
                    double num2 = Double.parseDouble(numf2.getText());
                    double result = num1 % num2;
                    resl.setText("Result: " + result);
                }
                catch (NumberFormatException ex) {
                    resl.setText("Result: Error");
                }
            }
        });
        pack();
    }

    public static void main(String[] args) {
        SwingCalculator sc = new SwingCalculator();
    }
}
