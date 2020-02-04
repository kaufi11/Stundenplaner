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
public class Zeit {
    private String art, von, bis;

    public Zeit(String art, String von, String bis) {
        this.art = art;
        this.von = von;
        this.bis = bis;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
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
        return "Zeit{" + "art=" + art + ", von=" + von + ", bis=" + bis + '}';
    }
    
    
}
