package com.company;

import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

/**
 * Created by Гена on 27.02.18.
 */
public class JSonDecoders {

    public static String[] decodeListOfSites(String input) throws ParseException {
        ArrayList<String> arr = new ArrayList<String>();
        JSONParser parser = new JSONParser();


                Object obj = parser.parse(input);

            JSONArray jsonArray = (JSONArray) obj;
        for (int i = 0; i < jsonArray.size() ; i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            String site = (String) jsonObject.get("name");
            arr.add(site);


        }

            String[] array =  arr.toArray(new String [arr.size()]);


       return array;
 }

    public static ArrayList<Pretendents> decodeListOfPeopleWithoutDate (String input) throws ParseException {
        ArrayList<Pretendents> pret = new ArrayList<Pretendents>();
        JSONParser parser = new JSONParser();


        Object obj = parser.parse(input);

        JSONArray jsonArray = (JSONArray) obj;
        for (int i = 0; i < jsonArray.size() ; i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);


            String site = (String) jsonObject.get("Site");
            String name = (String) jsonObject.get("Name");
            int number = (int) jsonObject.get("Number");
            Pretendents person = new Pretendents(site,name,number);
            pret.add(person);


        }

        return pret;
    }



}
