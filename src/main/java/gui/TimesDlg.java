/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author timon_kaufmann
 */
public class TimesDlg extends javax.swing.JDialog {

    /**
     * Creates new form TimesDlg
     */
    public TimesDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf1von = new javax.swing.JTextField();
        tf1bis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf2von = new javax.swing.JTextField();
        tf2bis = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf3von = new javax.swing.JTextField();
        tf3bis = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf4von = new javax.swing.JTextField();
        tf4bis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf5von = new javax.swing.JTextField();
        tf5bis = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf6von = new javax.swing.JTextField();
        tf6bis = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf7von = new javax.swing.JTextField();
        tf7bis = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf8von = new javax.swing.JTextField();
        tf8bis = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf9von = new javax.swing.JTextField();
        tf9bis = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf10von = new javax.swing.JTextField();
        tf10bis = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel1.setLayout(new java.awt.GridLayout(12, 3));

        jLabel1.setText("Stunde");
        jPanel1.add(jLabel1);

        jLabel2.setText("Von");
        jPanel1.add(jLabel2);

        jLabel3.setText("Bis");
        jPanel1.add(jLabel3);

        jLabel4.setText("1.");
        jPanel1.add(jLabel4);

        tf1von.setText("8:00");
        jPanel1.add(tf1von);

        tf1bis.setText("8:50");
        jPanel1.add(tf1bis);

        jLabel5.setText("2.");
        jPanel1.add(jLabel5);

        tf2von.setText("8:50");
        jPanel1.add(tf2von);

        tf2bis.setText("9:40");
        jPanel1.add(tf2bis);

        jLabel6.setText("3.");
        jPanel1.add(jLabel6);

        tf3von.setText("9:40");
        jPanel1.add(tf3von);

        tf3bis.setText("10:30");
        jPanel1.add(tf3bis);

        jLabel7.setText("4.");
        jPanel1.add(jLabel7);

        tf4von.setText("10:45");
        jPanel1.add(tf4von);

        tf4bis.setText("11:35");
        jPanel1.add(tf4bis);

        jLabel8.setText("5.");
        jPanel1.add(jLabel8);
        jPanel1.add(tf5von);
        jPanel1.add(tf5bis);

        jLabel9.setText("6.");
        jPanel1.add(jLabel9);
        jPanel1.add(tf6von);
        jPanel1.add(tf6bis);

        jLabel10.setText("7.");
        jPanel1.add(jLabel10);
        jPanel1.add(tf7von);
        jPanel1.add(tf7bis);

        jLabel11.setText("8.");
        jPanel1.add(jLabel11);
        jPanel1.add(tf8von);
        jPanel1.add(tf8bis);

        jLabel12.setText("9.");
        jPanel1.add(jLabel12);
        jPanel1.add(tf9von);
        jPanel1.add(tf9bis);

        jLabel13.setText("10.");
        jPanel1.add(jLabel13);
        jPanel1.add(tf10von);
        jPanel1.add(tf10bis);

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_ok(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setText("Clear");
        jPanel1.add(jButton2);

        jButton3.setText("Abbrechen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_abbruch(evt);
            }
        });
        jPanel1.add(jButton3);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void on_ok(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_ok
        ok = true;
        
        data.Var.stundenanfang[0] = tf1von.getText();
        data.Var.stundenanfang[1] = tf2von.getText();
        data.Var.stundenanfang[2] = tf3von.getText();
        data.Var.stundenanfang[3] = tf4von.getText();
        data.Var.stundenanfang[4] = tf5von.getText();
        data.Var.stundenanfang[5] = tf6von.getText();
        data.Var.stundenanfang[6] = tf7von.getText();
        data.Var.stundenanfang[7] = tf8von.getText();
        data.Var.stundenanfang[8] = tf9von.getText();
        data.Var.stundenanfang[9] = tf10von.getText();
        
        data.Var.stundenende[0] = tf1bis.getText();
        data.Var.stundenende[1] = tf2bis.getText();
        data.Var.stundenende[2] = tf3bis.getText();
        data.Var.stundenende[3] = tf4bis.getText();
        data.Var.stundenende[4] = tf5bis.getText();
        data.Var.stundenende[5] = tf6bis.getText();
        data.Var.stundenende[6] = tf7bis.getText();
        data.Var.stundenende[7] = tf8bis.getText();
        data.Var.stundenende[8] = tf9bis.getText();
        data.Var.stundenende[9] = tf10bis.getText();
        
        bl.BlGui.pausenrechner();
        
        
        open = false;
        this.dispose();
    }//GEN-LAST:event_on_ok

    private void on_abbruch(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_abbruch
        ok = false;
        open = false;
        this.dispose();
    }//GEN-LAST:event_on_abbruch

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf10bis;
    private javax.swing.JTextField tf10von;
    private javax.swing.JTextField tf1bis;
    private javax.swing.JTextField tf1von;
    private javax.swing.JTextField tf2bis;
    private javax.swing.JTextField tf2von;
    private javax.swing.JTextField tf3bis;
    private javax.swing.JTextField tf3von;
    private javax.swing.JTextField tf4bis;
    private javax.swing.JTextField tf4von;
    private javax.swing.JTextField tf5bis;
    private javax.swing.JTextField tf5von;
    private javax.swing.JTextField tf6bis;
    private javax.swing.JTextField tf6von;
    private javax.swing.JTextField tf7bis;
    private javax.swing.JTextField tf7von;
    private javax.swing.JTextField tf8bis;
    private javax.swing.JTextField tf8von;
    private javax.swing.JTextField tf9bis;
    private javax.swing.JTextField tf9von;
    // End of variables declaration//GEN-END:variables
}