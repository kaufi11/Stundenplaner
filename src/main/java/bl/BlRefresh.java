/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import data.Klasse;
import data.Lehrer;
import data.Var;
import gui.EntryDlg;
import gui.PlanDlg;

/**
 *
 * @author timon_kaufmann
 */
public class BlRefresh {
    
    public static void refreshlistclass() {
        PlanDlg.listenModellClasse.clear();
        for (Klasse k : Var.klassen) {

            PlanDlg.listenModellClasse.addElement(k.getName());
        }
    }

    public static void refreshlistteacher() {
        PlanDlg.listenModellTeacher.clear();
        for (Lehrer k : Var.lehrer) {

            PlanDlg.listenModellTeacher.addElement(k.getName());
        }
    }

    public static void refreshlistcombpteacher() {
        EntryDlg.modelcoml.removeAllElements();
        for (Lehrer l : Var.lehrer) {

            EntryDlg.modelcoml.addElement(l.getName());
        }
    }
}
