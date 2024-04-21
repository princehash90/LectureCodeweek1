package org.example.week8.hello_gui_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame{
    private JPanel mainPanel;
    private JButton ClickMeButton;
    private JLabel myFirstLabel;

    HelloGUI(){
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(500,500));// setting the size of the pane
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ClickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //code for button goes here
                myFirstLabel.setText("Hello GUI Programmers!!");
                //this will be printed on clicking the button
            }
        });

    }
}
