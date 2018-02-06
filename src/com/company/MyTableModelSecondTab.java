package com.company;

import javax.swing.table.AbstractTableModel;

/**
 * Created by Гена on 07.02.18.
 */
public class MyTableModelSecondTab extends AbstractTableModel {
    @Override
    public int getRowCount() {
        return 3;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return "Вася";
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {

            case 0:
                return "Дата упоминания";
            case 1:
                return "Имя";
            case 2:
                return "Количество упоминаний";
            default:
                return "Лишнее";
        }
    }
}
