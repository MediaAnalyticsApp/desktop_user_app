package com.company;

import javax.swing.*;
import java.awt.*;

import static java.lang.Boolean.TRUE;

/**
 * Created by Гена on 04.02.18.
 */
public class StartScreen extends JFrame {
    StartScreen(int nX, int nY, String nameOfScreen)
    {
        super(nameOfScreen);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 100, nX, nY);
        //setSize(nX, nY);
        setResizable(TRUE);
        int leftSize = Math.round(nX/3);
        int rightSize = nX-leftSize;

        JPanel firstScreen = new JPanel();
        firstScreen.setLayout(new BoxLayout(firstScreen,BoxLayout.X_AXIS));




        JPanel leftSizePanel = new JPanel();
        JButton button1 = new JButton("Общая статистика");
        JButton button2 = new JButton("Ежедневная статистика");
        leftSizePanel.setLayout(new BoxLayout(leftSizePanel, BoxLayout.Y_AXIS));
        leftSizePanel.add(button1);
        leftSizePanel.add(button2);
        leftSizePanel.add(Box.createVerticalGlue());

        leftSizePanel.setPreferredSize(new Dimension(leftSize, nY));

        leftSizePanel.setBackground(Color.GRAY);


        JPanel rightSizePanel = new JPanel();
        rightSizePanel.setPreferredSize(new Dimension(rightSize,nY));

        firstScreen.add(leftSizePanel);
        firstScreen.add(rightSizePanel);
        //leftSizePanel.setSize(leftSize, nY);
        //leftSizePanel.setBackground(Color.GRAY);
        //rightSizePanel.setSize(rightSize,nY);




        setContentPane(firstScreen);


    }
}
