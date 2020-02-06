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
    private String Klasse, Fach, Uhrzeit, Tag;
    private Lehrer Lehrer;

    public Stunde(Lehrer Lehrer, String Klasse, String Fach, String Uhrzeit, String Tag) {
        this.Lehrer = Lehrer;
        this.Klasse = Klasse;
        this.Fach = Fach;
        this.Uhrzeit = Uhrzeit;
        this.Tag = Tag;
    }

    public Lehrer getLehrer() {
        return Lehrer;
    }

    public void setLehrer(Lehrer Lehrer) {
        this.Lehrer = Lehrer;
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

    @Override
    public String toString() {
        return "Stunde{" + ", Klasse=" + Klasse + ", Fach=" + Fach + ", Uhrzeit=" + Uhrzeit + ", Tag=" + Tag + ", Lehrer=" + Lehrer + '}';
    }
    
    
    
    
}
