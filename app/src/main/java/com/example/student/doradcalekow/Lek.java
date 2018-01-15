package com.example.student.doradcalekow;

/**
 * Created by student on 2018-01-15.
 */


public class Lek {
    public String getNazwa() {
        return nazwa;
    }
    public Lek(String nazw, String dawka) {
        this.nazwa = nazw;
        this.dawka = dawka;

    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getDawka() {
        return dawka;
    }

    public void setDawka(String dawka) {
        this.dawka = dawka;
    }

    public String nazwa;
    public String dawka;
}
