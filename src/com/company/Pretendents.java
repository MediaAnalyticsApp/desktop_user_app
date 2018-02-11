package com.company;

import java.text.SimpleDateFormat;

/**
 * Created by Гена on 11.02.18.
 */
public class Pretendents {
    String Site;
    String Name;
    Integer numberOfFindings;
    SimpleDateFormat dateOFScan = new SimpleDateFormat("dd.MM.yyyy");

    public Pretendents(String site, String name, Integer numberOfFindings) {
        Site = site;
        Name = name;
        this.numberOfFindings = numberOfFindings;
    }

    public Pretendents(String site, String name, Integer numberOfFindings, SimpleDateFormat dateOFScan) {
        Site = site;
        Name = name;
        this.numberOfFindings = numberOfFindings;
        this.dateOFScan = dateOFScan;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String site) {
        Site = site;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getNumberOfFindings() {
        return numberOfFindings;
    }

    public void setNumberOfFindings(Integer numberOfFindings) {
        this.numberOfFindings = numberOfFindings;
    }

    public SimpleDateFormat getDateOFScan() {
        return dateOFScan;
    }

    public void setDateOFScan(SimpleDateFormat dateOFScan) {
        this.dateOFScan = dateOFScan;
    }
}
