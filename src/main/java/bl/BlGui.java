/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.TransferHandler;

/**
 *
 * @author timon_kaufmann
 */
public class BlGui {
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
}
