package com.company;

import java.util.ArrayList;

/**
 * Created by Гена on 13.02.18.
 */
public interface AbstractConnector {
    String[] findListOfSites();
    ArrayList<Pretendents> findListOFPeopleWithoutDate();
    ArrayList<Pretendents> findListOFPeopleWithDate();


}
