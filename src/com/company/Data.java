package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by Гена on 11.02.18.
 */
public class Data {
    static String SITE_ON_FIRST_TAB;
    static String SITE_ON_SECOND_TAB;
    static Date DATE_OF_SCAN_FROM= new Date(0);
    static Date DATE_OF_SCAN_TO = new Date(0);
//    public final String site = "http://54.64.85.75:3000/api/v1/";
//    public final String listOfsitesFromWebService = site + "/sites.json";

    FixedConnector connector = new FixedConnector();
    SiteConnector connector2 = new SiteConnector();


    public  String[] getListOfSites() {

        String[] mas = connector2.findListOfSites();
        SITE_ON_FIRST_TAB = mas[0];
        SITE_ON_SECOND_TAB = mas[0];

        return mas;
    }


    public ArrayList <Pretendents> getListOfPeopleWithoutDate(String site)
    {
    ArrayList<Pretendents> list = connector.findListOFPeopleWithoutDate();

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


    public ArrayList <Pretendents> getListOfPeopleWithDate(String site,Date dateBegin, Date dateEnd)
    {
        ArrayList<Pretendents> list = connector.findListOFPeopleWithDate();

        Iterator<Pretendents> iter = list.iterator();
        while(iter.hasNext())
        {
            Pretendents pretendent = iter.next();
            Date dateOfScan = pretendent.getDateOFScan();
            boolean isSite = pretendent.getSite().equals(site);
            boolean isDateAfter = dateOfScan.compareTo(dateBegin)>=0;
            boolean isDateBefore = dateOfScan.compareTo(dateEnd)<=0;

            if (! (isSite&&isDateAfter&&isDateBefore))
            {
                iter.remove();
            }
        }

        return list;
    }



}
