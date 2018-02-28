package com.company;

import sun.rmi.runtime.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Гена on 26.02.18.
 */
public class JsonExample {
    public static String getJSON(String urle) {

        try {
            URL url = new URL(urle);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");
            //con.setRequestProperty("Content-length", "0");
           // con.setConnectTimeout(30000);

            con.connect();
            String v = con.getResponseMessage();
           con.getPermission();

            int resp = con.getResponseCode();
            if(resp == 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

                String line;
                StringBuilder sb = new StringBuilder();
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }
                br.close();

                return sb.toString();
            } else {
                System.out.println("Ошибочка вышла");    ;
            }

        } catch(Exception e) { e.printStackTrace(); }

        return null;
    }
}
