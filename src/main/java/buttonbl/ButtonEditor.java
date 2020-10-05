/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonbl;

import data.Lehrer;
import data.Stunde;
import gui.LehrerDllMain;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author lukas
 */
public class ButtonEditor extends DefaultCellEditor {

    protected JButton button;
    private String label;
    private boolean isPushed;
    private LehrerDllMain main = new LehrerDllMain();
    private List<Lehrer> lehrer;

    public ButtonEditor(JCheckBox checkBox) {
        super(checkBox);
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped();
            }
        });

    }

    int row, column;

    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
        if (isSelected) {
            button.setForeground(table.getSelectionForeground());
            button.setBackground(table.getSelectionBackground());
        } else {
            button.setForeground(table.getForeground());
            button.setBackground(table.getBackground());
        }
        label = (value == null) ? "" : value.toString();
//        button.setText("Anwesend");
        isPushed = true;

        this.row = row;
        this.column = column;

        return button;
    }

    public Object getCellEditorValue() {
        if (isPushed) {
//            JOptionPane.showMessageDialog(button, label + ": Ouch!");

            System.out.println(row + " , " + column);
            if (column == 1) {
                //anwesend
                for (Stunde stunde : data.Var.hour) {
                    if (stunde.getLehrer().getName().equals(data.Var.lehrer.get(row).getName())) {

                        stunde.getLehrer().setAnwesend(true);
                    }
                }

                data.Var.lehrer.get(row).setAnwesend(true);

            } else if (column == 2) {
                for (Stunde stunde : data.Var.hour) {
                    if (stunde.getLehrer().getName().equals(data.Var.lehrer.get(row).getName())) {

                        stunde.getLehrer().setAnwesend(false);
                    }
                }
                data.Var.lehrer.get(row).setAnwesend(false);

            }

        }
        isPushed = false;
        return new String(label);
    }

    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }

    protected void fireEditingStopped() {
        super.fireEditingStopped();
    }
}
