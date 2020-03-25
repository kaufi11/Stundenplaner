/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bl.BlRefresh;
import data.Klasse;
import data.Lehrer;
import data.Stunde;

/**
 *
 * @author timon_kaufmann
 */
public class KlasseDlg extends javax.swing.JDialog {

    /**
     * Creates new form EntryDlg
     * @param parent
     * @param modal
     */ 
    
    
    public KlasseDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }
    public static boolean ok = true;
    public static boolean open = true;


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tffach = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfschueleranz = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfwochenstunden = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        tffach.setText("Name");
        jPanel1.add(tffach);

        tfname.setText("Lukas");
        jPanel1.add(tfname);

        jLabel3.setText("Schüleranzahl");
        jPanel1.add(jLabel3);

        tfschueleranz.setText("22");
        jPanel1.add(tfschueleranz);

        jLabel1.setText("Wochenstunden:");
        jPanel1.add(jLabel1);

        tfwochenstunden.setText("40");
        jPanel1.add(tfwochenstunden);

        jButton1.setText("Fertig");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_fertig(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setText("Abbrechen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_abbruch(evt);
            }
        });
        jPanel1.add(jButton2);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void on_abbruch(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_abbruch
        ok = false;
        open = false;
        this.dispose();
    }//GEN-LAST:event_on_abbruch

    private void on_fertig(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_fertig
        ok = true;
        Klasse k = new Klasse(tfname.getText(), Integer.parseInt(tfschueleranz.getText()), Integer.parseInt(tfwochenstunden.getText()));
        data.Var.klassen.add(k);
        bl.BlRefresh.refreshlistclass();
        open = false;
        this.dispose();
    }//GEN-LAST:event_on_fertig

     
    /**
     * @param args the command line arguments
     */

    public static boolean isOk() {
        return ok;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tffach;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfschueleranz;
    private javax.swing.JTextField tfwochenstunden;
    // End of variables declaration//GEN-END:variables
}
