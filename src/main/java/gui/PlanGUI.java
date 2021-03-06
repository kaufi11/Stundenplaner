/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import veralteteklassen.PlanDlg;
import bl.BlAddDeleteEdit;
import bl.BlConfirmDlgSaveDelete;
import bl.BlPlan;
import bl.BlRefreshclassandteacher;
import bl.BlTableLoad;
import bl.JTCellRenderer;
import data.Klasse;
import data.Lehrer;
import data.Stunde;
import data.StundeAnsicht;
import data.StundeBau;
import data.Var;
import gui.LehrerDllMain;
import gui.TimesDlg;
import static veralteteklassen.PlanDlg.listenModellClasse;
import static veralteteklassen.PlanDlg.listenModellTeacher;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static javax.swing.ListSelectionModel.SINGLE_SELECTION;
import javax.swing.filechooser.FileNameExtensionFilter;
import veralteteklassen.PlanDlg;

/**
 *
 * @author timon_kaufmann
 */
public class PlanGUI extends javax.swing.JFrame {

    /**
     * Creates new form PlanGUI
     */
    public static DefaultListModel listenModellClasse = new DefaultListModel();
    public static DefaultListModel listenModellTeacher = new DefaultListModel();
    JTCellRenderer render = new JTCellRenderer();

    JFileChooser fc = new JFileChooser();

    public PlanGUI() {
        initComponents();
        jPanel3.setVisible(false);
        table.getTableHeader().setReorderingAllowed(false);
        list.setSelectionMode(SINGLE_SELECTION);
        list.setModel(listenModellClasse);
        table.setDefaultRenderer(Object.class, render);
        table.setRowHeight(70);
        table.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btclass = new javax.swing.JButton();
        btteacher = new javax.swing.JButton();
        btedit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btsave = new javax.swing.JButton();
        btprint = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stundenplaner");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                on_close(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                on_load(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fächer"));
        jPanel3.setLayout(new java.awt.GridLayout(2, 0));
        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Aktionen"));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btclass.setIcon(data.Var.imageIconclassenable);
        btclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_classes(evt);
            }
        });
        jPanel1.add(btclass);

        btteacher.setIcon(data.Var.imageIconteacher);
        btteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_teacher(evt);
            }
        });
        jPanel1.add(btteacher);

        btedit.setIcon(data.Var.imageIconedit);
        btedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_edit2(evt);
            }
        });
        jPanel1.add(btedit);
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel3);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel5);
        jPanel1.add(jLabel6);

        btsave.setIcon(data.Var.imageIconsave);
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_save(evt);
            }
        });
        jPanel1.add(btsave);

        btprint.setIcon(data.Var.imageIconprint);
        btprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_print(evt);
            }
        });
        jPanel1.add(btprint);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Klassen"));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel7.setToolTipText("");
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        list.setBorder(null);
        list.setModel(listenModellClasse);
        list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                on_listmouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        jPanel7.add(jScrollPane1);

        jPanel4.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setIcon(data.Var.imageIconadd);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_add(evt);
            }
        });
        jPanel6.add(jButton1);

        jButton2.setIcon(data.Var.imageIconedit2);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_edit(evt);
            }
        });
        jPanel6.add(jButton2);

        jButton3.setIcon(data.Var.imageIcondelete);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_delete(evt);
            }
        });
        jPanel6.add(jButton3);

        jPanel4.add(jPanel6, java.awt.BorderLayout.SOUTH);

        jPanel2.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Stundenplaner"));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        table.setModel(data.Var.m);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel5.add(jScrollPane2);

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Anpassen");

        jMenuItem1.setText("Stundenzeiten");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_stundenzeiten(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Anwesenheit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_lehreranwesenheit(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem7.setText("Stunden löschen");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_deletehour(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("StundenBausätze");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_build(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Speichern/Laden");

        jMenuItem3.setText("Speichern-manuell");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_speichernmanu(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Laden-manuell");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_ladenmanu(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Laden-automatisch");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_loadauto(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void on_classes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_classes
        list.setModel(listenModellClasse);
        Var.ansklasse = true;
        Var.anslehrer = false;
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Klassen"));
        btclass.setIcon(data.Var.imageIconclassenable);
        btteacher.setIcon(data.Var.imageIconteacher);
    }//GEN-LAST:event_on_classes

    private void on_teacher(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_teacher
        list.setModel(listenModellTeacher);
        Var.ansklasse = false;
        Var.anslehrer = true;
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Lehrer"));
        jPanel3.setVisible(false);
        btclass.setIcon(data.Var.imageIconclass);
        btteacher.setIcon(data.Var.imageIconteacherenable);
        btedit.setIcon(data.Var.imageIconedit);
    }//GEN-LAST:event_on_teacher

    private void on_edit2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_edit2
        if (!Var.anslehrer) {
            jPanel3.setVisible(false);
            jPanel3.removeAll();
            for (StundeBau stundeBau : data.Var.bausteinelist) {
                if (stundeBau.getK().equals(data.Var.klasseakt)) {
                    JLabel lbbau = new javax.swing.JLabel();
                    lbbau.setVisible(true);
                    lbbau.setText(stundeBau.getStundenname());
                    jPanel3.add(lbbau);
                    BlPlan.enableLabelsbearbeiten(lbbau);
                }
            }
            jPanel3.setVisible(true);
            btedit.setIcon(data.Var.imageIconeditenabel);
            bl.BlPlan.enableTablebearbeiten(table);
        }
    }//GEN-LAST:event_on_edit2

    private void on_save(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_save
        BlConfirmDlgSaveDelete.safe();
    }//GEN-LAST:event_on_save

    private void on_print(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_print
        try {
            if (data.Var.ansklasse) {
                String selectedklass = list.getSelectedValue();
                Klasse selected = null;
                for (data.Klasse klasse : data.Var.klassen) {
                    if (klasse.getName().equals(selectedklass)) {
                        selected = klasse;
                    }
                }
                MessageFormat header = new MessageFormat(selected.getName() + "/" + selected.getKlassenvorstand().getName());
                MessageFormat footer = new MessageFormat("");
                table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            } else if (data.Var.anslehrer) {
                MessageFormat header = new MessageFormat(list.getSelectedValue());
                MessageFormat footer = new MessageFormat("");
                table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            }
        } catch (PrinterException ex) {
            Logger.getLogger(PlanDlg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_on_print

    private void on_load(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_on_load
        data.Var.m.load();
    }//GEN-LAST:event_on_load

    private void on_listmouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_on_listmouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (Var.ansklasse) {
                data.Var.klasseakt = list.getSelectedValue();
                BlTableLoad.akttable(data.Var.klasseakt);

            }
            if (Var.anslehrer) {
                data.Var.lehrerakt = list.getSelectedValue();
                BlTableLoad.akttable(data.Var.lehrerakt);
            }

        }

    }//GEN-LAST:event_on_listmouseClicked

    private void on_stundenzeiten(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_stundenzeiten
        TimesDlg dialog = new TimesDlg(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

        if (TimesDlg.open == false) {
            data.Var.m.newtimes();
        }
    }//GEN-LAST:event_on_stundenzeiten

    private void on_lehreranwesenheit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_lehreranwesenheit
        LehrerDllMain gui = new LehrerDllMain(null, true);
        gui.setVisible(true);
        gui.toFront();
    }//GEN-LAST:event_on_lehreranwesenheit

    private void on_add(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_add
        bl.BlAddDeleteEdit.add();
    }//GEN-LAST:event_on_add

    private void on_delete(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_delete
        String selected = list.getSelectedValue();
        BlConfirmDlgSaveDelete.delete(selected);
    }//GEN-LAST:event_on_delete

    private void on_edit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_edit
        String selected = list.getSelectedValue();
        bl.BlAddDeleteEdit.edit(selected);
    }//GEN-LAST:event_on_edit

    private void on_speichernmanu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_speichernmanu
        String path = null;
        if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = null;
            f = fc.getSelectedFile();
            path = f.getPath();
        }

        bl.BlSavesAndLoads.createfolder(path);
        bl.BlSavesAndLoads.speichern(path);
        bl.BlSavesAndLoads.speichernclass(path);
        bl.BlSavesAndLoads.speichernteacher(path);
        bl.BlSavesAndLoads.speicherntimes(path);
        bl.BlSavesAndLoads.speichernbau(path);
    }//GEN-LAST:event_on_speichernmanu

    private void on_ladenmanu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_ladenmanu
        String path = null;
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = null;
            f = fc.getSelectedFile();
            path = f.getParent();
        }
        bl.BlTableLoad.clearall();
        bl.BlSavesAndLoads.laden(path);
        bl.BlSavesAndLoads.ladenclass(path);
        bl.BlSavesAndLoads.ladenteacher(path);
        bl.BlSavesAndLoads.ladentimes(path);
        bl.BlSavesAndLoads.ladenbau(path);
        bl.BlTableLoad.firstload();
    }//GEN-LAST:event_on_ladenmanu

    private void on_loadauto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_loadauto
        data.Var.m.load();
    }//GEN-LAST:event_on_loadauto

    private void on_close(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_on_close
        BlConfirmDlgSaveDelete.exit();
    }//GEN-LAST:event_on_close

    private void on_deletehour(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_deletehour
        int n = JOptionPane.showConfirmDialog(
                null,
                "Möchte Sie wirklich ALLE Stunde löschen?",
                "Abfrage-Löschvorgang",
                JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            data.Var.hour.clear();
        } else if (n == 1) {
            JOptionPane.showMessageDialog(null, "Nicht gelöscht");
        }

    }//GEN-LAST:event_on_deletehour

    private void on_build(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_build
        StundeBauErstellenDlg dialog = new StundeBauErstellenDlg(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_on_build

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) {
            int n = JOptionPane.showConfirmDialog(
                    null,
                    "Möchte Sie wirklich diese Stunde löschen?",
                    "Abfrage-Löschvorgang",
                    JOptionPane.YES_NO_OPTION);
            if (n == 0) {
                JOptionPane.showMessageDialog(null, "Gelöscht");
                int row = table.rowAtPoint(evt.getPoint());
                int col = table.columnAtPoint(evt.getPoint());
                String text = table.getValueAt(row, col).toString();
                String[] splitten = text.split("\n");
                String tag = table.getColumnName(col);
                String von = table.getValueAt(row, 1).toString();
                String bis = table.getValueAt(row, 2).toString();
                Stunde gesuchteStunde = null;
                for (Stunde stunde1 : data.Var.hour) {
                    if (stunde1.getKlasse().equals(splitten[2].trim()) && stunde1.getFach().equals(splitten[0].trim()) && stunde1.getLehrer().getKuerzel().equals(splitten[1].trim())
                            && stunde1.getUhrzeitvon().equals(von) && stunde1.getUhrzeitbis().equals(bis) && stunde1.getTag().equals(tag)) {
                        gesuchteStunde = stunde1;
                    }
                }
                StundeAnsicht stuans = new StundeAnsicht(gesuchteStunde, row, col, true);
                StundeAnsicht gesucht = null;
                for (StundeAnsicht stundeAnsicht : data.Var.shelp) {
                    if (stundeAnsicht.getHour().equals(stuans.getHour()) && stundeAnsicht.getRow() == stuans.getRow() && stundeAnsicht.getColumn() == stuans.getColumn() && stundeAnsicht.isIsenabled() == stuans.isIsenabled()) {
                        gesucht = stundeAnsicht;
                    }
                }
                data.Var.shelp.remove(gesucht);
                data.Var.hour.remove(gesucht.getHour());
                if (Var.ansklasse) {
                    data.Var.klasseakt = list.getSelectedValue();
                    BlTableLoad.akttable(data.Var.klasseakt);
                }
                if (Var.anslehrer) {
                    data.Var.lehrerakt = list.getSelectedValue();
                    BlTableLoad.akttable(data.Var.lehrerakt);
                }
            } else if (n == 1) {
                JOptionPane.showMessageDialog(null, "Nicht gelöscht");
            }

        }
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(PlanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btclass;
    private javax.swing.JButton btedit;
    private javax.swing.JButton btprint;
    private javax.swing.JButton btsave;
    private javax.swing.JButton btteacher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> list;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
