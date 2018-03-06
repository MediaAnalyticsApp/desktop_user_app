package com.company;

import org.json.simple.parser.ParseException;

import java.util.ArrayList;

/**
 * Created by Гена on 27.02.18.
 */
public class SiteConnector implements AbstractConnector {

    public final String site = "http://54.64.85.75:3000/api/v1/";
    public final String listOfsitesFromWebService = site + "/sites.json";
    public final String listOfPeopleWithoutDate = site + "/pages.json";


    @Override
    public String[] findListOfSites() {

        String JsonString = JsonFromSite.getJSON(listOfsitesFromWebService);
        String[] listOfSites = new String[0];
        try {
            listOfSites = JSonDecoders.decodeListOfSites(JsonString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  listOfSites;
    }

    @Override
    public ArrayList<Pretendents> findListOFPeopleWithoutDate()
    {
        String JsonString = JsonFromSite.getJSON(listOfPeopleWithoutDate);
        ArrayList<Pretendents> pret = new ArrayList<Pretendents>();
        try {
            pret = JSonDecoders.decodeListOfPeopleWithoutDate(JsonString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return pret;
    }

    @Override
    public ArrayList<Pretendents> findListOFPeopleWithDate() {
        return null;
    }
}
