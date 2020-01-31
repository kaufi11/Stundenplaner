/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

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
    int pause1 = 2;
    int pause2 = 5;
    
  @Override public boolean canImport(TransferHandler.TransferSupport support) {
    return getPropertyDataFlavor(String.class, support.getDataFlavors()) != null;
  }
  @Override public boolean importData(TransferHandler.TransferSupport support) {
    if (!canImport(support)) {
      return false;
    }

    DataFlavor flavor = getPropertyDataFlavor(String.class, support.getDataFlavors());
    
    String data;
    try {
      data = (String) support.getTransferable().getTransferData(flavor);
    } catch (UnsupportedFlavorException | java.io.IOException e) {
      return false;
    }

    JTable.DropLocation dl = (JTable.DropLocation) support.getDropLocation();
    JTable table = (JTable) support.getComponent();
    if(dl.getColumn() ==0){
        JOptionPane.showMessageDialog(null, "Stunde kann nicht in eine Uhrzeit gezogen werden", "Fehler", JOptionPane.ERROR_MESSAGE);
    }else if(dl.getRow() ==pause1){
        JOptionPane.showMessageDialog(null, "Stunde kann nicht in eine Pause gezogen werden", "Fehler", JOptionPane.ERROR_MESSAGE);
    }else if(dl.getRow() ==pause2){
        JOptionPane.showMessageDialog(null, "Stunde kann nicht in eine Pause gezogen werden", "Fehler", JOptionPane.ERROR_MESSAGE);
    }else
    table.setValueAt(data, dl.getRow(), dl.getColumn());
    return true;
  }
  private DataFlavor getPropertyDataFlavor(Class<?> k, DataFlavor[] flavors) {
    for (int i = 0; i < flavors.length; i++) {
      DataFlavor flavor = flavors[i];
      if ("application".equals(flavor.getPrimaryType()) &&
          "x-java-jvm-local-objectref".equals(flavor.getSubType()) &&
          k.isAssignableFrom(flavor.getRepresentationClass())) {
        return flavor;
      }
    }
    return null;
  }
  
}
