/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import data.Klasse;
import data.Lehrer;
import data.Stunde;
import data.Var;
import gui.EntryDlg;
import gui.KlasseDlg;
import veralteteklassen.PlanDlg;
import gui.PlanGUI;
import gui.StundeBauErstellenDlg;
import java.util.Comparator;

/**
 *
 * @author timon_kaufmann
 */
public class BlRefreshclassandteacher {

    public static void refreshlistclass() {
        PlanGUI.listenModellClasse.clear();
        Var.klassen.sort(data.Var.compclass);
        for (Klasse k : Var.klassen) {
            PlanGUI.listenModellClasse.addElement(k.getName());
        }

    }

    public static void refreshlistteacher() {
        PlanGUI.listenModellTeacher.clear();
        Var.lehrer.sort(data.Var.compteacher);
        for (Lehrer k : Var.lehrer) {
            PlanGUI.listenModellTeacher.addElement(k.getName());
        }

    }

    public static void refreshlistcombpteacher() {
        EntryDlg.modelcoml.removeAllElements();
        Var.lehrer.sort(data.Var.compteacher);
        for (Lehrer l : Var.lehrer) {
            EntryDlg.modelcoml.addElement(l.getName());
        }
    }

    public static void refreshlistcombpclass() {
        StundeBauErstellenDlg.modelcomk.removeAllElements();
        Var.klassen.sort(data.Var.compclass);
        for (Klasse l : Var.klassen) {
            StundeBauErstellenDlg.modelcomk.addElement(l.getName());
        }
    }

    public static void refreshlistcombpteacher2() {
        KlasseDlg.modelalllehrer.removeAllElements();
        Var.lehrer.sort(data.Var.compteacher);
        for (Lehrer l : Var.lehrer) {
            KlasseDlg.modelalllehrer.addElement(l.getName());
        }
    }
}
