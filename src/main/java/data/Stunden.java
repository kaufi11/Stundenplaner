package data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukas
 */
public class Stunden {
   private int stunde;
   private String von, bis;

    public Stunden() {
    }

    public Stunden(int stunde, String von, String bis) {
        this.stunde = stunde;
        this.von = von;
        this.bis = bis;
    }

    public int getStunde() {
        return stunde;
    }

    public void setStunde(int stunde) {
        this.stunde = stunde;
    }

    public String getVon() {
        return von;
    }

    public void setVon(String von) {
        this.von = von;
    }

    public String getBis() {
        return bis;
    }

    public void setBis(String bis) {
        this.bis = bis;
    }

    @Override
    public String toString() {
        return "Stunden{" + "stunde=" + stunde + ", von=" + von + ", bis=" + bis + '}';
    }
   
    
}
