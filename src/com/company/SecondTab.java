package com.company;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Гена on 05.02.18.
 */
public class SecondTab extends AbstractTab {
    static Date LOCAL_DATE_FROM = new Date();
    static Date LOCAL_DATE_TO = new Date();
    Data data = new Data();

    SecondTab(String Name) {
        super(Name);
        setName(Name);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //Добавляем всё на основную страницу


        //Заводим первый выбор, сайта (sitepanel)
        JPanel sitePanel = new JPanel();
        JLabel siteLabel = new JLabel("Выберите сайт");


        JComboBox siteComboBox = createComboBoxSite(data.getListOfSites());
        sitePanel.add(siteLabel);
        sitePanel.add(siteComboBox);
        sitePanel.setMaximumSize(new Dimension(9999, 50));

        //Задаём часть с датой и кнопкой
        JPanel dateAndButtonPanel = new JPanel();
        dateAndButtonPanel.setLayout(new BoxLayout(dateAndButtonPanel, BoxLayout.X_AXIS));

        JFormattedTextField dateBegin = createDateBeg();
        JFormattedTextField dateEnd = createDateEnd();
        JLabel begDateLabel = new JLabel("Дата начала");
        JLabel endDateLabel = new JLabel("Дата конца");
        JButton button = new JButton("Запустить");

        dateAndButtonPanel.add(begDateLabel);
        dateAndButtonPanel.add(dateBegin);
        dateAndButtonPanel.add(endDateLabel);
        dateAndButtonPanel.add(dateEnd);
        dateAndButtonPanel.add(button);
        dateAndButtonPanel.setMaximumSize(new Dimension(9999, 50));

        //Задаём 4 часть
        JPanel panelForTable = new JPanel();
        panelForTable.setLayout(new BoxLayout(panelForTable, BoxLayout.X_AXIS));
        //Создаём 2 технических jframe для краёв
        JPanel leftPanelForTable = new JPanel();
        JPanel rightPanelForTable = new JPanel();
        //Создаём сам frame для добавления таблицы и заголовка
        JPanel MiddlePanelForTable = new JPanel();
        MiddlePanelForTable.setLayout(new BoxLayout(MiddlePanelForTable, BoxLayout.Y_AXIS));
        //Создаём таблицу и добавляем её и заголовки в предыдущий
        MyTableModelSecondTab tableModel = new MyTableModelSecondTab();
        JTable table = new JTable(tableModel);
        MiddlePanelForTable.add(table.getTableHeader());
        MiddlePanelForTable.add(table);

        //Добавляем всё в поле с таблицей
        panelForTable.add(leftPanelForTable);
        panelForTable.add(MiddlePanelForTable);
        panelForTable.add(rightPanelForTable);

        //Добавляем после добавления таблицы к кнопке листенер
        ActionListener jButtonListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                Data.DATE_OF_SCAN_FROM = (Date) dateBegin.getValue();
                Data.DATE_OF_SCAN_TO = (Date) dateEnd.getValue();
                Data.SITE_ON_SECOND_TAB = (String) siteComboBox.getSelectedItem();
                tableModel.fireTableDataChanged();
            }
        };
        button.addActionListener(jButtonListener);


        //Добавляем всё на основную страницу
        this.add(sitePanel);
        this.add(Box.createVerticalStrut(10));
        this.add(dateAndButtonPanel);
        this.add(Box.createVerticalStrut(10));
        this.add(panelForTable);
        this.add(Box.createVerticalGlue());
        this.repaint();
    }

    private JComboBox createComboBoxSite(String[] list) {
        JComboBox comboBox = new JComboBox(list);
        return comboBox;
    }

    private JFormattedTextField createDateBeg() {
        JFormattedTextField dateBegin = new JFormattedTextField(new SimpleDateFormat("dd.MM.yy"));
        dateBegin.setPreferredSize(new Dimension(70, 25));
        return dateBegin;
    }

    private JFormattedTextField createDateEnd() {
        JFormattedTextField dateEnd = new JFormattedTextField(new SimpleDateFormat("dd.MM.yy"));
        dateEnd.setPreferredSize(new Dimension(70, 25));
        return dateEnd;
    }
}

