package com.company;

import java.util.ArrayList;

/**
 * Created by Гена on 27.02.18.
 */
public class SiteConnector implements AbstractConnector {

    public final String site = "http://54.64.85.75:3000/api/v1/";
    public final String listOfsitesFromWebService = site + "/sites.json";


    @Override
    public String[] findListOfSites() {
        String[] listOfSites = null;
        String JsonString = JsonFromSite.getJSON(listOfsitesFromWebService);
        return  listOfSites;
    }

    @Override
    public ArrayList<Pretendents> findListOFPeopleWithoutDate() {
        return null;
    }

    @Override
    public ArrayList<Pretendents> findListOFPeopleWithDate() {
        return null;
    }
}
