/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import data.Zeit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.TransferHandler;

/**
 *
 * @author timon_kaufmann
 */
public class BlGui {

    public static void enableTablebearbeiten(JTable table) {
        table.setAutoCreateRowSorter(true);
        table.setTransferHandler(new bl.DragAndDrop());
    }

    public static void enableLabelsbearbeiten(JLabel label) {
        label.setTransferHandler(new TransferHandler("text"));
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                JComponent c = (JComponent) e.getSource();
                c.getTransferHandler().exportAsDrag(c, e, TransferHandler.COPY);
            }
        });
    }

    public static void pausenrechner() {
        int i = 0;

        while (!data.Var.stundenende[i].isEmpty()) {
            if (data.Var.stundenanfang[i + 1].isEmpty()) {
                Zeit z = new Zeit(i + 1 + ".", data.Var.stundenanfang[i], data.Var.stundenende[i]);
                data.Var.times.add(z);
            }else if (data.Var.stundenende[i].equals(data.Var.stundenanfang[i + 1])) {
                Zeit z = new Zeit(i + 1 + ".", data.Var.stundenanfang[i], data.Var.stundenende[i]);
                data.Var.times.add(z);
            } else if (!data.Var.stundenende[i].equals(data.Var.stundenanfang[i + 1])) {
                if (!data.Var.stundenanfang[i + 1].isEmpty()) {
                    Zeit z = new Zeit(i + 1 + ".", data.Var.stundenanfang[i], data.Var.stundenende[i]);
                    Zeit zz = new Zeit("Pause", data.Var.stundenende[i], data.Var.stundenanfang[i + 1]);
                    data.Var.times.add(z);
                    data.Var.times.add(zz);
                }

            }

            i++;
        }
    }

}
