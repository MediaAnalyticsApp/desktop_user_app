package com.company;

import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Гена on 07.02.18.
 */
public class MyTableModelSecondTab extends AbstractTableModel {

    Data data = new Data();
    ArrayList<Pretendents> listOfPeople;

    @Override
    public int getRowCount()
    {
        listOfPeople = data.getListOfPeopleWithDate(Data.SITE_ON_SECOND_TAB,Data.DATE_OF_SCAN_FROM,Data.DATE_OF_SCAN_TO);
        return listOfPeople.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pretendents pretendent = listOfPeople.get(rowIndex);
        switch (columnIndex) {
            case 0:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
                String date = dateFormat.format(pretendent.getDateOFScan());
                return date;
            case 1:
                return pretendent.getName();
            case 2:
                return String.valueOf(pretendent.getNumberOfFindings());
            default:
                return "";
        }
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
