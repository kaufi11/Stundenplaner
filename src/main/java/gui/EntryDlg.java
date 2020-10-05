/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bl.BlPlan;
import bl.BlRefreshclassandteacher;
import bl.BlTableLoad;
import data.Klasse;
import data.Lehrer;
import data.Stunde;
import data.Var;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author timon_kaufmann
 */
public class EntryDlg extends javax.swing.JDialog {

    /**
     * Creates new form EntryDlg
     */
    private int row, column;
    private String[] wochentag = new String[5];
    public static DefaultComboBoxModel modelcoml = new DefaultComboBoxModel();
    private boolean aufsicht = false;

    public EntryDlg(java.awt.Frame parent, boolean modal, int row, int column, String fach) {

        super(parent, modal);
        initComponents();
        BlRefreshclassandteacher.refreshlistteacher();
        if (fach.equals("Aufsicht")) {
            aufsicht = true;
        }
        this.row = row;
        this.column = column;
        wochentag[0] = "Montag";
        wochentag[1] = "Dienstag";
        wochentag[2] = "Mittwoch";
        wochentag[3] = "Donnerstag";
        wochentag[4] = "Freitag";
        tftag.setText(Tag());
        tfklasse.setText(data.Var.klasseakt);
        tfuhr.setText(data.Var.times.get(row).getVon());
        tfuhr1.setText(data.Var.times.get(row).getBis());
        tffach.setText(fach);
        tflehrer.setModel(modelcoml);
        refresh();
    }
    public static boolean ok = false;
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
        jLabel1 = new javax.swing.JLabel();
        tffach = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfklasse = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tflehrer = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tfuhr = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfuhr1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tftag = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout(7, 2));

        jLabel1.setText("Fach");
        jPanel1.add(jLabel1);

        tffach.setText("Fach");
        jPanel1.add(tffach);

        jLabel2.setText("Klasse");
        jPanel1.add(jLabel2);

        tfklasse.setText("1AHIF");
        jPanel1.add(tfklasse);

        jLabel3.setText("Lehrer");
        jPanel1.add(jLabel3);

        jPanel1.add(tflehrer);

        jLabel7.setText("Uhrzeit von");
        jPanel1.add(jLabel7);

        tfuhr.setText("14:00");
        jPanel1.add(tfuhr);

        jLabel8.setText("Uhrzeit bis");
        jPanel1.add(jLabel8);

        tfuhr1.setText("14:45");
        jPanel1.add(tfuhr1);

        jLabel5.setText("Tag");
        jPanel1.add(jLabel5);

        tftag.setText("Montag");
        jPanel1.add(tftag);

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

    private String Tag() {
        for (int i = 0; i < wochentag.length; i++) {
            if (i == column - 3) {
                return wochentag[i];
            }
        }
        return "Error";
    }


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
                    Stunde sremove = null;
            for (Stunde stunde : data.Var.hour) {
                if (stunde.getKlasse().equals(tfklasse.getText()) && stunde.getTag().equals(tftag.getText()) && stunde.getUhrzeitvon().equals(tfuhr.getText()) && stunde.getUhrzeitbis().equals(tfuhr1.getText())) {
                    sremove = stunde;
                }
            }
        if (tffach.getText().equals("Aufsicht")) {
            for (Klasse klasse : data.Var.klassen) {
                Stunde s = new Stunde(new Lehrer((String) tflehrer.getSelectedItem(), kuerzel, anwesend), klasse.getName(), tffach.getText(), tfuhr.getText(), tfuhr1.getText(), tftag.getText());
                data.Var.hour.add(s);
            }
        }

            if (sremove != null && !sremove.getLehrer().isAnwesend()) {
                data.Var.hour.remove(sremove);
            }
            if (sremove != null && sremove.getLehrer().isAnwesend() && !sremove.getFach().equals(tffach.getText())) {
                data.Var.hour.remove(sremove);
            }
            if (sremove != null && sremove.getFach().equals(tffach.getText()) && sremove.getLehrer().isAnwesend()) {
                data.Var.hour.remove(sremove);
                
                if (tffach.getText().equals("Aufsicht")){
                    for (Klasse klasse : data.Var.klassen) {
                Stunde s = new Stunde(new Lehrer((String) tflehrer.getSelectedItem(), kuerzel, anwesend),new Lehrer(sremove.getLehrer().getName(), sremove.getLehrer().getKuerzel(), sremove.getLehrer().isAnwesend()), klasse.getName(), tffach.getText(), tfuhr.getText(), tfuhr1.getText(), tftag.getText());
                data.Var.hour.add(s);
                }
                }else{
                 Stunde s = new Stunde(new Lehrer((String) tflehrer.getSelectedItem(), kuerzel, anwesend), new Lehrer(sremove.getLehrer().getName(), sremove.getLehrer().getKuerzel(), sremove.getLehrer().isAnwesend()), (String) tfklasse.getText(), tffach.getText(), tfuhr.getText(), tfuhr1.getText(), tftag.getText());
                data.Var.hour.add(s);
                } 
                
            } else {
                Stunde s = new Stunde(new Lehrer((String) tflehrer.getSelectedItem(), kuerzel, anwesend), (String) tfklasse.getText(), tffach.getText(), tfuhr.getText(), tfuhr1.getText(), tftag.getText());
                data.Var.hour.add(s);
            }

        
        BlTableLoad.firstload();
        BlTableLoad.akttable(tfklasse.getText());
        open = false;
        bl.BlRefreshclassandteacher.refreshlistteacher();
        bl.BlRefreshclassandteacher.refreshlistcombpteacher();
        this.dispose();
    }//GEN-LAST:event_on_fertig

    private void on_abbruch(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_abbruch
        ok = false;
        open = false;
        bl.BlRefreshclassandteacher.refreshlistteacher();
        bl.BlRefreshclassandteacher.refreshlistcombpteacher();
        this.dispose();
    }//GEN-LAST:event_on_abbruch

    public void refresh() {
        String uhrvon, uhrbis, tag;
        uhrvon = tfuhr.getText();
        uhrbis = tfuhr1.getText();
        tag = tftag.getText();
        System.out.println(tag + " " + uhrvon + " " + uhrbis);
        for (Stunde s : Var.hour) {
            for (int i = 0; i < Var.hour.size(); i++) {
                if ((s.getTag().equals(tag)) && (s.getUhrzeitvon().equals(uhrvon)) && (s.getUhrzeitbis().equals(uhrbis))) {
                    modelcoml.removeElement(s.getLehrer().getName());
                }
            }
        }

        /*for (Stunde s : Var.hour) {
            int wochenstunde = 0;
            for (int i = 0; i < Var.hour.size(); i++) {
                if (s.getLehrer().equals(Var.hour.get(i))) {
                    wochenstunde++;
                }
                for (Lehrer lehrer : Var.lehrer) {
                    if (lehrer.getWochenstunden() == wochenstunde && s.getLehrer().equals(lehrer)) {
                    //Lehrer bei Dropdown rot einblenden oder gleich ausblenden

                    }
                }

            }
        }*/
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tffach;
    private javax.swing.JLabel tfklasse;
    private javax.swing.JComboBox<String> tflehrer;
    private javax.swing.JLabel tftag;
    private javax.swing.JLabel tfuhr;
    private javax.swing.JLabel tfuhr1;
    // End of variables declaration//GEN-END:variables
}
