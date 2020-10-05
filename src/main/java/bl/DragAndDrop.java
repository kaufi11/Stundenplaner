/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import data.Zeit;
import gui.EntryDlg;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.TransferHandler;

/**
 *
 * @author timon_kaufmann
 */
public class DragAndDrop extends TransferHandler {

    @Override
    public boolean canImport(TransferHandler.TransferSupport support) {
        return getPropertyDataFlavor(String.class, support.getDataFlavors()) != null;
    }

    @Override
    public boolean importData(TransferHandler.TransferSupport support) {
        if (!canImport(support)) {
            return false;
        }

        DataFlavor flavor = getPropertyDataFlavor(String.class, support.getDataFlavors());

        String datas;
        try {
            datas = (String) support.getTransferable().getTransferData(flavor);
        } catch (UnsupportedFlavorException | java.io.IOException e) {
            return false;
        }

        JTable.DropLocation dl = (JTable.DropLocation) support.getDropLocation();
        JTable table = (JTable) support.getComponent();

        boolean ok = true;

        if (dl.getColumn() == 0) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Stunde kann nicht in eine Uhrzeit gezogen werden", "Fehler", JOptionPane.WARNING_MESSAGE);
        } else if (dl.getColumn() == 1) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Stunde kann nicht in eine Uhrzeit gezogen werden", "Fehler", JOptionPane.WARNING_MESSAGE);
        } else if (dl.getColumn() == 2) {
            ok = false;
            JOptionPane.showMessageDialog(null, "Stunde kann nicht in eine Uhrzeit gezogen werden", "Fehler", JOptionPane.WARNING_MESSAGE);
        } else if (data.Var.times.get(dl.getRow()).getArt().equals("Pause")) {
            if (datas.equals("Aufsicht")) {
                EntryDlg dialog = new EntryDlg(new javax.swing.JFrame(), true, dl.getRow(), dl.getColumn(), datas);
                dialog.setVisible(true);
                if (gui.EntryDlg.open == false) {
                    if (gui.EntryDlg.ok) {
                        table.setValueAt(datas, dl.getRow(), dl.getColumn());
                    } else {
                        JOptionPane.showMessageDialog(null, "Stunde nicht hinzugefügt", "Fehler", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } else {
                ok = false;
                JOptionPane.showMessageDialog(null, "Stunde kann nicht in eine Pause gezogen werden", "Fehler", JOptionPane.WARNING_MESSAGE);
            }
        } else if (ok) {
            EntryDlg dialog = new EntryDlg(new javax.swing.JFrame(), true, dl.getRow(), dl.getColumn(), datas);
            dialog.setVisible(true);
            if (gui.EntryDlg.open == false) {
                if (gui.EntryDlg.ok) {
                    table.setValueAt(datas, dl.getRow(), dl.getColumn());
                } else {
                    JOptionPane.showMessageDialog(null, "Stunde nicht hinzugefügt", "Fehler", JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        return true;
    }

    private DataFlavor getPropertyDataFlavor(Class<?> k, DataFlavor[] flavors) {
        for (int i = 0; i < flavors.length; i++) {
            DataFlavor flavor = flavors[i];
            if ("application".equals(flavor.getPrimaryType())
                    && "x-java-jvm-local-objectref".equals(flavor.getSubType())
                    && k.isAssignableFrom(flavor.getRepresentationClass())) {
                return flavor;
            }
        }
        return null;
    }

}
