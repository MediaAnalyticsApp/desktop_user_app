package com.company;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;

/**
 * Created by Гена on 05.02.18.
 */
public class SecondTab extends AbstractTab {
    public String[] elements = new String[] {"www.lenta.ru", "www.vk.com", "www.mail.ru"};

    SecondTab(String Name)
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

        //Задаём часть с датой и кнопкой
        JPanel dateAndButtonPanel = new JPanel();
        dateAndButtonPanel.setLayout(new BoxLayout(dateAndButtonPanel,BoxLayout.X_AXIS));

        JFormattedTextField dateBegin=new JFormattedTextField(new SimpleDateFormat("MM.dd.yy"));
        JFormattedTextField dateEnd=new JFormattedTextField(new SimpleDateFormat("MM.dd.yy"));
        dateBegin.setPreferredSize(new Dimension (70,25));
        dateEnd.setPreferredSize((new Dimension (70,25)));
        JLabel begDateLabel = new JLabel("Дата начала");
        JLabel endDateLabel = new JLabel("Дата конца");
        JButton button = new JButton ("Запустить");

        dateAndButtonPanel.add(begDateLabel);
        dateAndButtonPanel.add(dateBegin);
        dateAndButtonPanel.add(endDateLabel);
        dateAndButtonPanel.add(dateEnd);
        dateAndButtonPanel.add(button);
        dateAndButtonPanel.setMaximumSize(new Dimension(9999,50));

            //Задаём 4 часть
        JPanel panelForTable = new JPanel();
        panelForTable.setLayout(new BoxLayout(panelForTable,BoxLayout.X_AXIS));
        //Создаём 2 технических jframe для краёв
        JPanel leftPanelForTable = new JPanel();
        JPanel rightPanelForTable = new JPanel();
        //Создаём сам frame для добавления таблицы и заголовка
        JPanel MiddlePanelForTable = new JPanel();
        MiddlePanelForTable.setLayout(new BoxLayout(MiddlePanelForTable,BoxLayout.Y_AXIS));
        //Создаём таблицу и добавляем её и заголовки в предыдущий
        JTable table = new JTable(new MyTableModelSecondTab());
        MiddlePanelForTable.add(table.getTableHeader());
        MiddlePanelForTable.add(table);

        //Добавляем всё в поле с таблицей
        panelForTable.add(leftPanelForTable);
        panelForTable.add(MiddlePanelForTable);
        panelForTable.add(rightPanelForTable);



        //Добавляем всё на основную страницу
        this.add(sitePanel);
        this.add(Box.createVerticalStrut(10));
        this.add(dateAndButtonPanel);
        this.add(Box.createVerticalStrut(10));
        this.add(panelForTable);
        this.add(Box.createVerticalGlue());
    }
}
