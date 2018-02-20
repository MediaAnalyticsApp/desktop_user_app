package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Гена on 11.02.18.
 */
public class Pretendents {
    String Site;
    String Name;
    Integer numberOfFindings;
    Date dateOFScan = new Date();

    public Pretendents(String site, String name, Integer numberOfFindings) {
        Site = site;
        Name = name;
        this.numberOfFindings = numberOfFindings;
    }

    public Pretendents(String site, String name, Integer numberOfFindings, Date dateOFScan) {
        Site = site;
        Name = name;
        this.numberOfFindings = numberOfFindings;
        this.dateOFScan = dateOFScan;
    }

    public Pretendents(String site, String name, Integer numberOfFindings, String stringDateOFScan) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Site = site;
        Name = name;
        this.numberOfFindings = numberOfFindings;
        try {
            this.dateOFScan = format.parse(stringDateOFScan);
        } catch (ParseException e) {
            System.out.println("Такая дата не существует");
        }
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

    public Date getDateOFScan() {
        return dateOFScan;
    }

    public void setDateOFScan(Date dateOFScan) {
        this.dateOFScan = dateOFScan;
    }
}
