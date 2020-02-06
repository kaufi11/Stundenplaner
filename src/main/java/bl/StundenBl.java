/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import data.Stunden;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.TransferHandler;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author timon_kaufmann
 */
public class StundenBl extends AbstractTableModel{
        private List stunden; 

    public StundenBl(List<Stunden> stunden) {
        this.stunden = stunden; 
    }
    
    public void tableDataChanged()
    { 
        super.fireTableDataChanged();
    }
    
    public Stunden getstunden(int index)
    {
        return (Stunden) this.stunden.get(index);
    }
    
    public void delete(int index)
    {
        this.stunden.remove(index);
        this.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return this.stunden.size();
    }

    @Override
    public int getColumnCount() {
        return this.stunden.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object ob = stunden.get(rowIndex);
        if(ob instanceof Stunden)
        {
            Stunden be = (Stunden) ob;
            switch(columnIndex)
            {
                case 0: return be.getStunde();
                case 1: return be.getVon();
                case 2: return be.getBis();
                default: return "";
            }
        }else{
            return "Fehler";
        }
    }
    
    public int getlastStunde()
    {
        int index = stunden.size();
        Stunden stunde = getstunden(index-1);
        return stunde.getStunde();
    }
    
    
    public void clear(){
        this.stunden.clear();
        this.fireTableDataChanged();
    }
    public void add(Stunden ob)
    {
        this.stunden.add(ob);
        this.fireTableDataChanged();
    }

    public List getDatensaetze() {
        return stunden;
    }

    public static void main(String[] args) {
        Stunden stunden = new Stunden(1, "12.20", "dhdhd");
        Stunden stunden2 = new Stunden(2, "12.20", "dhdhd");
        Stunden stunden3 = new Stunden(3, "12.20", "dhdhd");
        List<Stunden> stunde = new ArrayList<>();
        stunde.add(stunden);
        stunde.add(stunden2);
        stunde.add(stunden3);
        StundenBl bl = new StundenBl(stunde); 
//        
//        bl.add(stunden);
//        bl.add(stunden2);
//        bl.add(stunden3);
//        bl.add(stunden4);
//        bl.add(stunden5);
        System.out.println(bl.getlastStunde()+"");
        
        
    }
     
    
}
