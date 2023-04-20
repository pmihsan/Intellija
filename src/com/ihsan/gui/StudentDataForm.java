package com.ihsan.gui;

import javax.swing.*;
import java.awt.*;

public class StudentDataForm extends JFrame{

    public StudentDataForm(){
        // Title
        setVisible(true);
        setSize(400,300);
        setLayout(new GridLayout(6,2));
        setTitle("Student Data Management App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Adding LOGO - Failed
        ImageIcon icon = new ImageIcon("logo.jpg");
        setIconImage(icon.getImage());

        // Text Field
        JPanel nfs = new JPanel(new FlowLayout());
        JLabel name = new JLabel("Name: ");
        JTextField namef = new JTextField(20);

        nfs.add(name);
        nfs.add(namef);
        add(nfs);

        // Radio Button
        JPanel dfs = new JPanel(new FlowLayout());
        JLabel dept = new JLabel("Department: ");
        JRadioButton cse,ece,it;
        cse = new JRadioButton("CSE");
        ece = new JRadioButton("ECE");
        it = new JRadioButton("IT");

        ButtonGroup deptBG = new ButtonGroup();
        deptBG.add(cse);
        deptBG.add(ece);
        deptBG.add(it);
        dfs.add(dept);
        dfs.add(cse);
        dfs.add(ece);
        dfs.add(it);
        add(dfs);

        // Radio Button
        JPanel gfs = new JPanel(new FlowLayout());
        JLabel gender = new JLabel("Gender: ");
        JRadioButton m,f;
        m = new JRadioButton("MALE");
        f = new JRadioButton("FEMALE");

        ButtonGroup genderBG = new ButtonGroup();
        genderBG.add(m);
        genderBG.add(f);
        gfs.add(gender);
        gfs.add(m);
        gfs.add(f);
        add(gfs);

        // CheckBox
        JPanel afs = new JPanel(new FlowLayout());
        JLabel aoi = new JLabel("Area Of Interest:");
        JCheckBox code, books, docker,linux;
        code = new JCheckBox("Coding");
        docker = new JCheckBox("Docker");
        linux = new JCheckBox("Linux");

        afs.add(aoi);
        afs.add(code);
        afs.add(docker);
        afs.add(linux);
        add(afs);

        // ComboBox
        JPanel hfs = new JPanel(new FlowLayout());
        JLabel hob = new JLabel("Hobbies:");
        String[] h = {"Reading", "Travelling", "Painting", "Cooking"};
        JComboBox<String> hc = new JComboBox<>(h);

        hfs.add(hob);
        hfs.add(hc);
        add(hfs);

        // Button
        JPanel bfs = new JPanel(new FlowLayout());
        JButton s,c,e;
        s = new JButton("SUBMIT");
        c = new JButton("CONFIRM");
        e = new JButton("EXIT");
        bfs.add(s);
        bfs.add(c);
        bfs.add(e);
        add(bfs);

        pack();
    }

    public static void main(String[] args) {
        StudentDataForm sf = new StudentDataForm();
    }
}
