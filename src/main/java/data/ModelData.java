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
public class ModelData {
    private String nummer, zeitvon, zeitbis, montag, dienstag, mittwoch, donnerstag, freitag;

    public ModelData(String nummer, String zeitvon, String zeitbis, String montag, String dienstag, String mittwoch, String donnerstag, String freitag) {
        this.nummer = nummer;
        this.zeitvon = zeitvon;
        this.zeitbis = zeitbis;
        this.montag = montag;
        this.dienstag = dienstag;
        this.mittwoch = mittwoch;
        this.donnerstag = donnerstag;
        this.freitag = freitag;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public String getZeitvon() {
        return zeitvon;
    }

    public void setZeitvon(String zeitvon) {
        this.zeitvon = zeitvon;
    }

    public String getZeitbis() {
        return zeitbis;
    }

    public void setZeitbis(String zeitbis) {
        this.zeitbis = zeitbis;
    }

    public String getMontag() {
        return montag;
    }

    public void setMontag(String montag) {
        this.montag = montag;
    }

    public String getDienstag() {
        return dienstag;
    }

    public void setDienstag(String dienstag) {
        this.dienstag = dienstag;
    }

    public String getMittwoch() {
        return mittwoch;
    }

    public void setMittwoch(String mittwoch) {
        this.mittwoch = mittwoch;
    }

    public String getDonnerstag() {
        return donnerstag;
    }

    public void setDonnerstag(String donnerstag) {
        this.donnerstag = donnerstag;
    }

    public String getFreitag() {
        return freitag;
    }

    public void setFreitag(String freitag) {
        this.freitag = freitag;
    }
    
    
}
