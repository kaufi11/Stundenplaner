/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author timon_kaufmann
 */
public class Stunde {
    private String Lehrer, Kürzel, Klasse, Fach, Uhrzeit, Tag;

    public Stunde(String Lehrer, String Kürzel, String Klasse, String Fach, String Uhrzeit, String Tag) {
        this.Lehrer = Lehrer;
        this.Kürzel = Kürzel;
        this.Klasse = Klasse;
        this.Fach = Fach;
        this.Uhrzeit = Uhrzeit;
        this.Tag = Tag;
    }

    public String getLehrer() {
        return Lehrer;
    }

    public void setLehrer(String Lehrer) {
        this.Lehrer = Lehrer;
    }

    public String getKürzel() {
        return Kürzel;
    }

    public void setKürzel(String Kürzel) {
        this.Kürzel = Kürzel;
    }

    public String getKlasse() {
        return Klasse;
    }

    public void setKlasse(String Klasse) {
        this.Klasse = Klasse;
    }

    public String getFach() {
        return Fach;
    }

    public void setFach(String Fach) {
        this.Fach = Fach;
    }

    public String getUhrzeit() {
        return Uhrzeit;
    }

    public void setUhrzeit(String Uhrzeit) {
        this.Uhrzeit = Uhrzeit;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String Tag) {
        this.Tag = Tag;
    }
    
    
}