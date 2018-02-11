package com.company;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 * Created by Гена on 06.02.18.
 */
public class MyTableModelFirstTab extends AbstractTableModel
{
    Data data = new Data();
    ArrayList<Pretendents> listOfPeople = data.getListOfPeopleWithoutDate(Data.SITE_ON_FIRST_TAB);


    @Override
    public int getRowCount()
    {
        //Добавлена строка чтобы при пересчете таблицы пересчитывался источник данных
        listOfPeople = data.getListOfPeopleWithoutDate(Data.SITE_ON_FIRST_TAB);
        return listOfPeople.size();
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
        //ArrayList<Pretendents> listOfPeople = data.getListOfPeopleWithoutDate(Data.SITE_ON_FIRST_TAB);
        Pretendents pretendent = listOfPeople.get(rowIndex);
        switch (columnIndex)
        {
            case 0:
                return pretendent.getName();
            case 1:
                return String.valueOf(pretendent.getNumberOfFindings());
            default:
                return "";
        }


    }
}
