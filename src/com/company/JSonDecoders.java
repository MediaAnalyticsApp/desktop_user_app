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

    public String [] decodeListOfSites(String input) throws ParseException {
        String str = null;
        ArrayList[] arr = null;
        JSONParser parser = new JSONParser();
        try {

            Object obj = parser.parse(input);

            JSONObject jsonObject = (JSONObject) obj;

//            String name = (String) jsonObject.get("name");

            // loop array
            JSONArray msg = (JSONArray) jsonObject.get("");
            Iterator<Integer,String> iterator = msg.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

        return null;
    }
}
