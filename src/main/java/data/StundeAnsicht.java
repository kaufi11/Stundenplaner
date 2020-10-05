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
    private boolean isenabled;

    public StundeAnsicht(Stunde hour, int row, int column, boolean isenabled) {
        this.hour = hour;
        this.row = row;
        this.column = column;
        this.isenabled = isenabled;
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

    public boolean isIsenabled() {
        return isenabled;
    }

    public void setIsenabled(boolean isenabled) {
        this.isenabled = isenabled;
    }
    
    

    @Override
    public String toString() {
        return "StundeAnsicht{" + "hour=" + hour + ", row=" + row + ", column=" + column + '}';
    }

    
    
}
