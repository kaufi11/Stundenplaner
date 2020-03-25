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
public class StundeAnsicht {
    private Stunde hour;
    private int row, column;

    public StundeAnsicht(Stunde hour, int row, int column) {
        this.hour = hour;
        this.row = row;
        this.column = column;
    }

    public Stunde getHour() {
        return hour;
    }

    public void setHour(Stunde hour) {
        this.hour = hour;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    
}
