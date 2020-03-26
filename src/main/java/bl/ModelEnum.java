/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
 * @author timon_kaufmann
 */
public enum ModelEnum {

    STUNDE("Stunde"),
    ZEITVON("Von"),
    ZEITBIS("Bis"),
    MONTAG("Montag"),
    DIENSTAG("Dienstag"),
    MITTWOCH("Mittwoch"),
    DONNERSTAG("Donnerstag"),
    FREITAG("Freitag");
    
    private String name;

    private ModelEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
}

