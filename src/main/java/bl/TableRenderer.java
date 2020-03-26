/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;

/**
 *
 * @author timon_kaufmann
 */
public class TableRenderer extends javax.swing.table.DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        if (row % 2 == 0) {
            this.setBackground(Color.WHITE);
            this.setForeground(Color.black);
        } else {
            this.setBackground(Color.CYAN);
            this.setForeground(Color.black);
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

    }

    //TODO Farben von UI Team bekommen
    //Falls Lehrer nicht da ist Stunde rot setzen
    
}
