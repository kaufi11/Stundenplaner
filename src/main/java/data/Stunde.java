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
    private String Klasse, Fach, Uhrzeitvon, Uhrzeitbis, Tag;
    private Lehrer Lehrer, Lehrer2;

    public Stunde(Lehrer Lehrer, String Klasse, String Fach, String Uhrzeitvon, String Uhrzeitbis, String Tag) {
        this.Lehrer = Lehrer;
        this.Lehrer2 = new Lehrer("", "", false);
        this.Klasse = Klasse;
        this.Fach = Fach;
        this.Uhrzeitvon = Uhrzeitvon;
        this.Uhrzeitbis = Uhrzeitbis;
        this.Tag = Tag;
    }
    public Stunde(Lehrer Lehrer, Lehrer Lehrer2, String Klasse, String Fach, String Uhrzeitvon, String Uhrzeitbis, String Tag) {
        this.Lehrer = Lehrer;
        this.Lehrer2 = Lehrer2;
        this.Klasse = Klasse;
        this.Fach = Fach;
        this.Uhrzeitvon = Uhrzeitvon;
        this.Uhrzeitbis = Uhrzeitbis;
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


    public String getTag() {
        return Tag;
    }

    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public String getUhrzeitvon() {
        return Uhrzeitvon;
    }

    public void setUhrzeitvon(String Uhrzeitvon) {
        this.Uhrzeitvon = Uhrzeitvon;
    }

    public String getUhrzeitbis() {
        return Uhrzeitbis;
    }

    public void setUhrzeitbis(String Uhrzeitbis) {
        this.Uhrzeitbis = Uhrzeitbis;
    }

    public Lehrer getLehrer2() {
        return Lehrer2;
    }

    public void setLehrer2(Lehrer Lehrer2) {
        this.Lehrer2 = Lehrer2;
    }
    
    

    @Override
    public String toString() {
        return "Stunde{" + "Klasse=" + Klasse + ", Fach=" + Fach + ", Uhrzeitvon=" + Uhrzeitvon + ", Uhrzeitbis=" + Uhrzeitbis + ", Tag=" + Tag + ", Lehrer=" + Lehrer + '}';
    }


    
    
    
    
}
