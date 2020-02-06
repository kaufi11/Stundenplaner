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

    public Lehrer(String Name, String Kuerzel, int wochenstunden) {
        this.Name = Name;
        this.Kuerzel = Kuerzel;
        this.wochenstunden = wochenstunden;
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
    
    
}
