/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import data.Lehrer;
import data.Stunde;
import gui.LehrerDllMain;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 *
 * @author timon_kaufmann
 */
public class TableRendererLehrer extends javax.swing.table.DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        l.setBackground(Color.white);

        if (!data.Var.lehrer.get(row).isAnwesend()) {
            l.setForeground(Color.black);
            l.setBackground(Color.red);
        }
        if (data.Var.lehrer.get(row).isAnwesend()) {
            l.setForeground(Color.black);
            l.setBackground(Color.green);
        }
        return l;

        /*
        if(column == 0 || column == 1 || column == 2 ){
            this.setBackground(Color.WHITE);
            this.setForeground(Color.black);
        }*/
//        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }

    //TODO Farben von UI Team bekommen
    //Falls Lehrer nicht da ist Stunde rot setzen
}
