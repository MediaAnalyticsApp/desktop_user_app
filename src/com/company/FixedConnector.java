package com.company;

import java.util.ArrayList;

/**
 * Created by Гена on 13.02.18.
 */
public class FixedConnector implements AbstractConnector {
    SiteConnector siteConnector = new SiteConnector();
    @Override
    public String[] findListOfSites() {
        String[] listOfSites = {"www.lenta.ru","www.vk.com","www.mail.ru"};
        return  listOfSites;
    }

    @Override
    public ArrayList<Pretendents> findListOFPeopleWithoutDate()
    {
        ArrayList <Pretendents> listOfPretendentsWithoutDate = new ArrayList<Pretendents>();
        String [] listOfSitesFromWebServer = siteConnector.findListOfSites();
        for (int i = 0; i < listOfSitesFromWebServer.length; i++) {
            listOfPretendentsWithoutDate.add(new Pretendents(listOfSitesFromWebServer[i],"Путин", (i + 1)*4));
            listOfPretendentsWithoutDate.add(new Pretendents(listOfSitesFromWebServer[i],"Медведев", i *3));
            listOfPretendentsWithoutDate.add(new Pretendents(listOfSitesFromWebServer[i],"Навальный", i + 2));
        }

//        listOfPretendentsWithoutDate.add( new Pretendents("turner.ca","Путин",5));
//        listOfPretendentsWithoutDate.add( new Pretendents("turner.ca","Медведев",7));
//        listOfPretendentsWithoutDate.add( new Pretendents("turner.ca","Навальный",12));
//        listOfPretendentsWithoutDate.add( new Pretendents("www.vk.com","Путин",6));
//        listOfPretendentsWithoutDate.add( new Pretendents("www.vk.com","Медведев",8));
//        listOfPretendentsWithoutDate.add( new Pretendents("www.vk.com","Навальный",14));
//        listOfPretendentsWithoutDate.add( new Pretendents("www.mail.ru","Путин",2));
//        listOfPretendentsWithoutDate.add( new Pretendents("www.mail.ru","Медведев",9));
//        listOfPretendentsWithoutDate.add( new Pretendents("www.mail.ru","Навальный",7));
        return listOfPretendentsWithoutDate;
    }

    @Override
    public ArrayList<Pretendents> findListOFPeopleWithDate()
    {
        ArrayList <Pretendents> listOfPretendentsWithDate = new ArrayList<>();
        String [] listOfSitesFromWebServer = siteConnector.findListOfSites();

        for (int i = 0; i < listOfSitesFromWebServer.length; i++) {
            listOfPretendentsWithDate.add(new Pretendents(listOfSitesFromWebServer[i],"Путин", (i + 1)*4, "01.02.2018"));
            listOfPretendentsWithDate.add(new Pretendents(listOfSitesFromWebServer[i],"Медведев", i *3,"01.02.2018" ));
            listOfPretendentsWithDate.add(new Pretendents(listOfSitesFromWebServer[i],"Навальный", i + 2, "01.02.2018"));
            listOfPretendentsWithDate.add(new Pretendents(listOfSitesFromWebServer[i],"Путин", (i + 3)*5, "02.02.2018"));
            listOfPretendentsWithDate.add(new Pretendents(listOfSitesFromWebServer[i],"Медведев", i *3+1,"02.02.2018" ));
            listOfPretendentsWithDate.add(new Pretendents(listOfSitesFromWebServer[i],"Навальный", i*2 + 2, "02.02.2018"));
            listOfPretendentsWithDate.add(new Pretendents(listOfSitesFromWebServer[i],"Путин", (3*i + 1)*4, "03.02.2018"));
            listOfPretendentsWithDate.add(new Pretendents(listOfSitesFromWebServer[i],"Медведев", i+4,"03.02.2018" ));
            listOfPretendentsWithDate.add(new Pretendents(listOfSitesFromWebServer[i],"Навальный", 5*i +1, "03.02.2018"));
        }


//        listOfPretendentsWithDate.add( new Pretendents("www.lenta.ru","Путин",5,"01.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.lenta.ru","Медведев",7,"01.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.lenta.ru","Навальный",12,"01.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.vk.com","Путин",6,"01.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.vk.com","Медведев",8,"01.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.vk.com","Навальный",14,"01.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.mail.ru","Путин",2,"01.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.mail.ru","Медведев",9,"01.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.mail.ru","Навальный",7,"01.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.lenta.ru","Путин",5,"02.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.lenta.ru","Медведев",7,"02.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.lenta.ru","Навальный",12,"02.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.vk.com","Путин",6,"02.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.vk.com","Медведев",8,"02.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.vk.com","Навальный",14,"02.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.mail.ru","Путин",2,"02.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.mail.ru","Медведев",9,"02.02.2018"));
//        listOfPretendentsWithDate.add( new Pretendents("www.mail.ru","Навальный",7,"02.02.2018"));

        return listOfPretendentsWithDate;
    }
}
