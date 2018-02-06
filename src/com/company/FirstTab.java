package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Гена on 05.02.18.
 */
public class FirstTab extends AbstractTab {
    public String[] elements = new String[] {"www.lenta.ru", "www.vk.com", "www.mail.ru"};

    FirstTab(String Name)
    {
        super(Name);
        setName(Name);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //Добавляем всё на основную страницу


        //Заводим первый выбор, сайта (sitepanel)
        JPanel sitePanel = new JPanel();
        JLabel siteLabel = new JLabel("Выберите сайт");
        JComboBox siteComboBox = new JComboBox(elements);
        sitePanel.add(siteLabel);
        sitePanel.add(siteComboBox);
        sitePanel.setMaximumSize(new Dimension(9999,50));


        JPanel panelForTable = new JPanel();
        panelForTable.setLayout(new BoxLayout(panelForTable,BoxLayout.X_AXIS));
        //Создаём 2 технических jframe для краёв
        JPanel leftPanelForTable = new JPanel();
        JPanel rightPanelForTable = new JPanel();
        //Создаём сам frame для добавления таблицы и заголовка
        JPanel MiddlePanelForTable = new JPanel();
        MiddlePanelForTable.setLayout(new BoxLayout(MiddlePanelForTable,BoxLayout.Y_AXIS));
        //Создаём таблицу и добавляем её и заголовки в предыдущий
        JTable table = new JTable(new MyTableModelFirstTab());
        MiddlePanelForTable.add(table.getTableHeader());
        MiddlePanelForTable.add(table);

        //Добавляем всё в поле с таблицей
        panelForTable.add(leftPanelForTable);
        panelForTable.add(MiddlePanelForTable);
        panelForTable.add(rightPanelForTable);



        //Добавляем всё на основную страницу
        this.add(sitePanel);
        this.add(Box.createVerticalStrut(10));
        this.add(panelForTable);
        this.add(Box.createVerticalGlue());
    }
}