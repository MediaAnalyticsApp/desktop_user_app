package com.company;

import javax.swing.table.AbstractTableModel;

/**
 * Created by Гена on 06.02.18.
 */
public class MyTableModelFirstTab extends AbstractTableModel
{
    @Override
    public int getRowCount() {
        return 2;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int column) {
        switch (column)
        {
            case 0:
                return "Имя";
            case 1:
                return "Количество упоминаний";
            default: return "Лишнее";
        }
    }

    @Override
    public String getValueAt(int rowIndex, int columnIndex) {
        return "Вася";


    }
}
