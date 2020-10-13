/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bl.BlRefreshclassandteacher;
import data.Klasse;
import data.Lehrer;
import data.Stunde;
import javax.swing.DefaultComboBoxModel;

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
    
    public static DefaultComboBoxModel modelalllehrer = new DefaultComboBoxModel();
    
    public KlasseDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        BlRefreshclassandteacher.refreshlistcombpteacher2();
                tflehrer.setModel(modelalllehrer);
    }
    public KlasseDlg(java.awt.Frame parent, boolean modal, Klasse k) {
        super(parent, modal);
        initComponents();
        tfname.setText(k.getName());
        tfschueleranz.setText(k.getAnzahlschueler()+"");
        tfwochenstunden.setText(k.getWochenstunden()+"");
        cbjahrgang.setSelectedIndex(k.getJahrgang()-1);
        jButton2.setVisible(false);

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
        jLabel4 = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbjahrgang = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tflehrer = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tfschueleranz = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfwochenstunden = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout(6, 2));

        jLabel4.setText("Name");
        jPanel1.add(jLabel4);

        tfname.setText("Lukas");
        jPanel1.add(tfname);

        jLabel2.setText("Jahrgang");
        jPanel1.add(jLabel2);

        cbjahrgang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel1.add(cbjahrgang);

        jLabel5.setText("Klassenvorstand");
        jPanel1.add(jLabel5);
        jPanel1.add(tflehrer);

        jLabel3.setText("Schüleranzahl");
        jPanel1.add(jLabel3);

        tfschueleranz.setText("22");
        jPanel1.add(tfschueleranz);

        jLabel1.setText("Wochenstunden:");
        jPanel1.add(jLabel1);

        tfwochenstunden.setText("40");
        jPanel1.add(tfwochenstunden);

        jButton1.setIcon(data.Var.imageIconok);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_fertig(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setIcon(data.Var.imageIconnotok);
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
        String kuerzel = null;
        boolean anwesend = false;
        for (Lehrer lehrer : data.Var.lehrer) {
            String comp = (String) tflehrer.getSelectedItem();
            if (comp.equalsIgnoreCase(lehrer.getName())) {
                kuerzel = lehrer.getKuerzel();
                anwesend = lehrer.isAnwesend();
            }
        }
        
        ok = true;
        Klasse k = new Klasse(tfname.getText(), Integer.parseInt(tfschueleranz.getText()), Integer.parseInt(tfwochenstunden.getText()), Integer.parseInt((String) cbjahrgang.getSelectedItem()), new Lehrer((String) tflehrer.getSelectedItem(), kuerzel, anwesend));
        data.Var.klassen.add(k);
        bl.BlRefreshclassandteacher.refreshlistclass();
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
    private javax.swing.JComboBox<String> cbjahrgang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> tflehrer;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfschueleranz;
    private javax.swing.JTextField tfwochenstunden;
    // End of variables declaration//GEN-END:variables
}
