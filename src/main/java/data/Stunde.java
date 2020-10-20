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

    private String Klasse, Fach, Fach2,Fach3, Klasse2, Klasse3, Klasse4, Uhrzeitvon, Uhrzeitbis, Tag;
    private Lehrer Lehrer, Lehrer2, Lehrer3;

    public Stunde(Lehrer Lehrer, String Klasse, String Fach, String Uhrzeitvon, String Uhrzeitbis, String Tag) {
        this.Lehrer = Lehrer;
        this.Lehrer2 = new Lehrer("", "", false);
        this.Lehrer3 = new Lehrer("", "", false);
        this.Klasse = Klasse;
        this.Klasse2 = "";
        this.Klasse3 = "";
        this.Klasse4 = "";
        this.Fach = Fach;
        this.Fach2 = "";
        this.Fach3 = "";
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

    public String getFach2() {
        return Fach2;
    }

    public void setFach2(String Fach2) {
        this.Fach2 = Fach2;
    }

    public String getKlasse2() {
        return Klasse2;
    }

    public void setKlasse2(String Klasse2) {
        this.Klasse2 = Klasse2;
    }

    public String getKlasse3() {
        return Klasse3;
    }

    public void setKlasse3(String Klasse3) {
        this.Klasse3 = Klasse3;
    }

    public String getKlasse4() {
        return Klasse4;
    }

    public void setKlasse4(String Klasse4) {
        this.Klasse4 = Klasse4;
    }

    public String getFach3() {
        return Fach3;
    }

    public void setFach3(String Fach3) {
        this.Fach3 = Fach3;
    }

    public Lehrer getLehrer3() {
        return Lehrer3;
    }

    public void setLehrer3(Lehrer Lehrer3) {
        this.Lehrer3 = Lehrer3;
    }

    
    @Override
    public String toString() {
        return "Stunde{" + "Klasse=" + Klasse + ", Fach=" + Fach + ", Uhrzeitvon=" + Uhrzeitvon + ", Uhrzeitbis=" + Uhrzeitbis + ", Tag=" + Tag + ", Lehrer=" + Lehrer + '}';
    }

}
