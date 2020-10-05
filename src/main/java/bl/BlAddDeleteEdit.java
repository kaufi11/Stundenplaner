/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import data.Klasse;
import data.Lehrer;
import data.Var;
import gui.KlasseDlg;
import gui.LehrerDlg;
import gui.PlanGUI;
import static gui.PlanGUI.listenModellClasse;
import static gui.PlanGUI.listenModellTeacher;

/**
 *
 * @author timon_kaufmann
 */
public class BlAddDeleteEdit {

    public static void delete(String selected) {
        if (Var.anslehrer) {
            Lehrer lremove = null;
            for (Lehrer lehrer : Var.lehrer) {
                if (lehrer.getName().equals(selected)) {
                    lremove = lehrer;
                }
            }
            if (lremove != null) {
                Var.lehrer.remove(lremove);
            }
            PlanGUI.listenModellTeacher.clear();
            BlRefreshclassandteacher.refreshlistteacher();
        }
        if (Var.ansklasse) {
            Klasse lremove = null;
            for (Klasse klasse : Var.klassen) {
                if (klasse.getName().equals(selected)) {
                    lremove = klasse;
                }
            }
            if (lremove != null) {
                Var.klassen.remove(lremove);
            }
            PlanGUI.listenModellClasse.clear();
            BlRefreshclassandteacher.refreshlistclass();
        }
    }
    //TODO Stunden die Lehrer/Klasse hatte auch  s

    public static void add() {
        if (Var.ansklasse) {
            try {
                data.Var.klassedlg = new KlasseDlg(null, true);
                if (data.Var.klassedlg.isOk()) {
                    data.Var.klassedlg.setVisible(true);

                }
            } catch (Exception e) {
                e.getMessage();
            }
        } else if (Var.anslehrer) {
            try {
                data.Var.lehrerdlg = new LehrerDlg(null, true);
                if (data.Var.lehrerdlg.isOk()) {
                    data.Var.lehrerdlg.setVisible(true);
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public static void edit(String selected) {
        int i=0;
        if (Var.anslehrer) {
            Lehrer lremove = null;
            for (Lehrer lehrer : Var.lehrer) {
                if (lehrer.getName().equals(selected)) {
                    lremove = lehrer;
                }
            }
            if (lremove != null) {
                Var.lehrer.remove(lremove);

                PlanGUI.listenModellTeacher.clear();
                BlRefreshclassandteacher.refreshlistteacher();

                try {
                    data.Var.lehrerdlg = new LehrerDlg(null, true, lremove);
                    if (data.Var.lehrerdlg.isOk()) {
                        data.Var.lehrerdlg.setVisible(true);
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        }
        if (Var.ansklasse) {
            Klasse kremove = null;
            for (Klasse klasse : Var.klassen) {
                if (klasse.getName().equals(selected)) {
                    kremove = klasse;
                }
            }
            if (kremove != null) {
                Var.klassen.remove(kremove);

                PlanGUI.listenModellClasse.clear();
                BlRefreshclassandteacher.refreshlistclass();

                try {
                    data.Var.klassedlg = new KlasseDlg(null, true, kremove);
                    if (data.Var.klassedlg.isOk()) {
                        data.Var.klassedlg.setVisible(true);

                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        }
    }
}
