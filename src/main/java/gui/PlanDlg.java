package gui;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import static com.sun.source.doctree.AttributeTree.ValueKind.SINGLE;
import data.Stunde;
import data.Var;
import data.Zeit;
import java.awt.print.PrinterException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import static javax.swing.ListSelectionModel.SINGLE_SELECTION;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lukas Grafoner
 */
public class PlanDlg extends javax.swing.JDialog {

    /**
     * Creates new form PlanDlg
     */
    public PlanDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jPanel3.setVisible(false);
        table.getTableHeader().setReorderingAllowed(false);
        list.setSelectionMode(SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menubearbeiten = new javax.swing.JMenuItem();
        menustundenzeiten = new javax.swing.JMenuItem();
        menulehrerbea = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuespeichen = new javax.swing.JMenuItem();
        tabelleladen = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Klein = new javax.swing.JMenuItem();
        Mittel = new javax.swing.JMenuItem();
        Gross = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                on_load(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        list.setBorder(javax.swing.BorderFactory.createTitledBorder("Klassen"));
        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list);

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null},
                {"", null, null, "", null, null, null, null},
                {"", null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null}
            },
            new String [] {
                "Stunde", "Von", "Bis", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel2.add(jScrollPane2);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fächer"));
        jPanel3.setLayout(new java.awt.GridLayout(2, 6));

        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Musik");
        label.setToolTipText("");
        label.setOpaque(true);
        label.setPreferredSize(new java.awt.Dimension(150, 80));
        jPanel3.add(label);

        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Reli");
        label1.setToolTipText("");
        label1.setOpaque(true);
        label1.setPreferredSize(new java.awt.Dimension(150, 80));
        jPanel3.add(label1);

        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("BSP");
        label2.setToolTipText("");
        label2.setOpaque(true);
        label2.setPreferredSize(new java.awt.Dimension(150, 80));
        jPanel3.add(label2);

        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("Werken");
        label3.setToolTipText("");
        label3.setOpaque(true);
        label3.setPreferredSize(new java.awt.Dimension(150, 80));
        jPanel3.add(label3);

        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("FU");
        label4.setToolTipText("");
        label4.setOpaque(true);
        label4.setPreferredSize(new java.awt.Dimension(150, 80));
        jPanel3.add(label4);

        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label5.setText("DAZ");
        label5.setToolTipText("");
        label5.setOpaque(true);
        label5.setPreferredSize(new java.awt.Dimension(150, 80));
        jPanel3.add(label5);

        label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label6.setText("SE");
        label6.setToolTipText("");
        label6.setOpaque(true);
        label6.setPreferredSize(new java.awt.Dimension(150, 80));
        jPanel3.add(label6);

        label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label7.setText("SPF");
        label7.setToolTipText("");
        label7.setOpaque(true);
        label7.setPreferredSize(new java.awt.Dimension(150, 80));
        jPanel3.add(label7);

        label8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label8.setText("SPHL");
        label8.setToolTipText("");
        label8.setOpaque(true);
        label8.setPreferredSize(new java.awt.Dimension(150, 80));
        jPanel3.add(label8);

        label9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label9.setText("GLZ");
        label9.setToolTipText("");
        label9.setOpaque(true);
        label9.setPreferredSize(new java.awt.Dimension(150, 80));
        jPanel3.add(label9);

        label10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label10.setText("UÜ");
        jPanel3.add(label10);

        label11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label11.setText("Chor");
        jPanel3.add(label11);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jMenu1.setText("Ansicht");

        jMenuItem1.setText("Lehreransicht");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Bearbeiten");

        menubearbeiten.setText("Bearbeiten");
        menubearbeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_bearbeiten(evt);
            }
        });
        jMenu2.add(menubearbeiten);

        menustundenzeiten.setText("Stundenzeiten");
        menustundenzeiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menustundenzeitenon_bearbeiten(evt);
            }
        });
        jMenu2.add(menustundenzeiten);

        menulehrerbea.setText("Lehrer");
        menulehrerbea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_lehrer(evt);
            }
        });
        jMenu2.add(menulehrerbea);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Datei");

        jMenuItem3.setText("Drucken");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_print(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        menuespeichen.setText("Tabelle speichern");
        menuespeichen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuespeichenActionPerformed(evt);
            }
        });
        jMenu3.add(menuespeichen);

        tabelleladen.setText("Tabelle laden");
        tabelleladen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabelleladenActionPerformed(evt);
            }
        });
        jMenu3.add(tabelleladen);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Fenster");

        Klein.setText("Klein");
        jMenu4.add(Klein);

        Mittel.setText("Mittel");
        jMenu4.add(Mittel);

        Gross.setText("Groß");
        jMenu4.add(Gross);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void on_bearbeiten(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_bearbeiten
        jPanel3.setVisible(true);

        bl.BlPlan.enableTablebearbeiten(table);

        bl.BlPlan.enableLabelsbearbeiten(label);
        bl.BlPlan.enableLabelsbearbeiten(label1);
        bl.BlPlan.enableLabelsbearbeiten(label2);
        bl.BlPlan.enableLabelsbearbeiten(label3);
        bl.BlPlan.enableLabelsbearbeiten(label4);
        bl.BlPlan.enableLabelsbearbeiten(label5);
        bl.BlPlan.enableLabelsbearbeiten(label6);
        bl.BlPlan.enableLabelsbearbeiten(label7);
        bl.BlPlan.enableLabelsbearbeiten(label8);
        bl.BlPlan.enableLabelsbearbeiten(label9);
        bl.BlPlan.enableLabelsbearbeiten(label10);
        bl.BlPlan.enableLabelsbearbeiten(label11);

    }//GEN-LAST:event_on_bearbeiten

    private void menustundenzeitenon_bearbeiten(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menustundenzeitenon_bearbeiten
        TimesDlg dialog = new TimesDlg(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

        if (TimesDlg.open == false) {
            int columnart = 0;
            int columnvon = 1;
            int columnbis = 2;
            int row = 0;
            for (Zeit time : data.Var.times) {
                table.setValueAt(time.getArt(), row, columnart);
                table.setValueAt(time.getVon(), row, columnvon);
                table.setValueAt(time.getBis(), row, columnbis);
                row++;
            }
        }
    }//GEN-LAST:event_menustundenzeitenon_bearbeiten

    private void on_lehrer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_lehrer
        LehrerDllMain gui = new LehrerDllMain(null, true);
        gui.setVisible(true);
        gui.toFront();
    }//GEN-LAST:event_on_lehrer

    private void menuespeichenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuespeichenActionPerformed
        bl.BlPlan.speichern();
        bl.BlPlan.speicherntimes();
        bl.BlPlan.speichernteacher();
    }//GEN-LAST:event_menuespeichenActionPerformed

    private void tabelleladenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabelleladenActionPerformed
        bl.BlPlan.laden();
        bl.BlPlan.ladentimes();
        bl.BlPlan.ladenteacher();
    }//GEN-LAST:event_tabelleladenActionPerformed

    private void on_load(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_on_load
        bl.BlPlan.laden();
        bl.BlPlan.ladentimes();
        bl.BlPlan.ladenteacher();
        List<Zeit> l2 = bl.BlPlan.ladentimes();
        int i = 0;
        for (Zeit zeit : l2) {
            table.setValueAt(zeit.getArt(), i, 0);
            table.setValueAt(zeit.getVon(), i, 1);
            table.setValueAt(zeit.getBis(), i, 2);
            i++;
        }
        try {
            List<Stunde> l1 = bl.BlPlan.laden();
            int j = 0;
            for (Stunde stunde : l1) {
                int column = 0;
                int row;
                String tag = stunde.getTag();
                if (tag.equalsIgnoreCase("Montag")) {
                    column = 3;
                } else if (tag.equalsIgnoreCase("Dienstag")) {
                    column = 4;
                } else if (tag.equalsIgnoreCase("Mittwoch")) {
                    column = 5;
                } else if (tag.equalsIgnoreCase("Donnerstag")) {
                    column = 6;
                } else if (tag.equalsIgnoreCase("Freitag")) {
                    column = 7;
                }
                row = 0;
                for (int k = 0; k < data.Var.times.size(); k++) {
                    if (stunde.getUhrzeitvon().equals(data.Var.times.get(k).getVon())) {
                        row = k;

                    }
                }
                table.setValueAt(stunde.getFach(), row, column);
            }
        } catch (Exception e) {
            System.err.println("Laden Fehler");
        }


    }//GEN-LAST:event_on_load

    private void on_print(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_print
        try {
            table.print();
        } catch (PrinterException ex) {
            Logger.getLogger(PlanDlg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_on_print

    //
    //
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlanDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlanDlg dialog = new PlanDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Gross;
    private javax.swing.JMenuItem Klein;
    private javax.swing.JMenuItem Mittel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JList<String> list;
    private javax.swing.JMenuItem menubearbeiten;
    private javax.swing.JMenuItem menuespeichen;
    private javax.swing.JMenuItem menulehrerbea;
    private javax.swing.JMenuItem menustundenzeiten;
    private javax.swing.JMenuItem tabelleladen;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
