package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Гена on 11.02.18.
 */
public class Data {
    static String SITE_ON_FIRST_TAB = getListOfSites()[0];
    static String SITE_ON_SECOND_TAB= getListOfSites()[0];

    public static String[] getListOfSites() {

        String[] mas = {"www.lenta.ru","www.vk.com","www.mail.ru"};

        return mas;
    }

private static ArrayList <Pretendents> getListOFPeopleWithoutDate()
{
       ArrayList <Pretendents> listOfPretendentsWithoutDate = new ArrayList<Pretendents>();
        listOfPretendentsWithoutDate.add( new Pretendents("www.lenta.ru","Путин",5));
        listOfPretendentsWithoutDate.add( new Pretendents("www.lenta.ru","Медведев",7));
        listOfPretendentsWithoutDate.add( new Pretendents("www.lenta.ru","Навальный",12));
        listOfPretendentsWithoutDate.add( new Pretendents("www.vk.com","Путин",6));
        listOfPretendentsWithoutDate.add( new Pretendents("www.vk.com","Медведев",8));
        listOfPretendentsWithoutDate.add( new Pretendents("www.vk.com","Навальный",14));
        listOfPretendentsWithoutDate.add( new Pretendents("www.mail.ru","Путин",2));
        listOfPretendentsWithoutDate.add( new Pretendents("www.mail.ru","Медведев",9));
        listOfPretendentsWithoutDate.add( new Pretendents("www.mail.ru","Навальный",7));
    return listOfPretendentsWithoutDate;
    }
    public ArrayList <Pretendents> getListOfPeopleWithoutDate(String site)
    {
    ArrayList<Pretendents> list = getListOFPeopleWithoutDate();

        Iterator<Pretendents> iter = list.iterator();
        while(iter.hasNext())
        {
            if (!iter.next().getSite().equals(site))
            {
                iter.remove();
            }
        }

        return list;
    }
}
