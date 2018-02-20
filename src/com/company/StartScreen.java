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
        setResizable(TRUE);

        JTabbedPane startPanel = new JTabbedPane(JTabbedPane.LEFT);
        FirstTab firstTab = new FirstTab("Общая статистика");
        SecondTab secondTab = new SecondTab("Ежедневная статистика");
        startPanel.addTab(firstTab.getName(), firstTab);
        startPanel.addTab(secondTab.getName(),secondTab);
        setContentPane(startPanel);
    }
}
