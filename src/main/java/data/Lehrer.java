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
public class Lehrer {
    private String Name, Kuerzel;
    private int wochenstunden;
    private boolean anwesend;

    public Lehrer(String Name, String Kuerzel, int wochenstunden, boolean anwesend) {
        this.Name = Name;
        this.Kuerzel = Kuerzel;
        this.wochenstunden = wochenstunden;
        this.anwesend = anwesend;
    }



    public Lehrer(String Name, String Kuerzel) {
        this.Name = Name;
        this.Kuerzel = Kuerzel;
    }

    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getKuerzel() {
        return Kuerzel;
    }

    public void setKuerzel(String Kuerzel) {
        this.Kuerzel = Kuerzel;
    }

    public int getWochenstunden() {
        return wochenstunden;
    }

    public void setWochenstunden(int wochenstunden) {
        this.wochenstunden = wochenstunden;
    }

    public boolean isAnwesend() {
        return anwesend;
    }

    public void setAnwesend(boolean anwesend) {
        this.anwesend = anwesend;
    }

    @Override
    public String toString() {
        return "Lehrer{" + "Name=" + Name + ", Kuerzel=" + Kuerzel + ", wochenstunden=" + wochenstunden + '}';
    }
    
    
    
}
