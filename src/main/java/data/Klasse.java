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
public class Klasse {
    private String name;
    private int wochenstunden, anzahlschueler, jahrgang;

    public Klasse(String name, int wochenstunden, int anzahlschueler, int jahrgang) {
        this.name = name;
        this.wochenstunden = wochenstunden;
        this.anzahlschueler = anzahlschueler;
        this.jahrgang = jahrgang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWochenstunden() {
        return wochenstunden;
    }

    public void setWochenstunden(int wochenstunden) {
        this.wochenstunden = wochenstunden;
    }

    public int getAnzahlschueler() {
        return anzahlschueler;
    }

    public void setAnzahlschueler(int anzahlschueler) {
        this.anzahlschueler = anzahlschueler;
    }

    public int getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }
    
    

    @Override
    public String toString() {
        return "Klasse{" + "name=" + name + ", wochenstunden=" + wochenstunden + ", anzahlschueler=" + anzahlschueler + '}';
    }
    
    
}
