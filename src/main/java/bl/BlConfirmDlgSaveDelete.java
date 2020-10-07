/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import javax.swing.JOptionPane;

/**
 *
 * @author timon_kaufmann
 */
public class BlConfirmDlgSaveDelete {

    public static void safe() {
        bl.BlSavesAndLoads.speichern(data.Var.pfadauto);
        bl.BlSavesAndLoads.speicherntimes(data.Var.pfadauto);
        bl.BlSavesAndLoads.speichernteacher(data.Var.pfadauto);
        bl.BlSavesAndLoads.speichernclass(data.Var.pfadauto);
    }

    public static void exit() {
        int result = JOptionPane.showConfirmDialog(null,
                "Möchten Sie das Programm vor dem Schließen abspeichern?",
                "Speichern",
                JOptionPane.YES_NO_OPTION);

        switch (result) {
            case JOptionPane.YES_OPTION:
                safe();
        }
    }

    public static void delete(String selected) {
        int result = JOptionPane.showConfirmDialog(null,
                "Möchten Sie die Auswahl wirklich löschen?",
                "Löschen bestätigen",
                JOptionPane.YES_NO_OPTION);

        switch (result) {
            case JOptionPane.YES_OPTION:
                bl.BlAddDeleteEdit.delete(selected);
        }
    }
}
