/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import data.Stunde;
import data.StundeAnsicht;
import data.Zeit;
import java.util.List;

/**
 *
 * @author timon_kaufmann
 */
public class BlTableLoad {

    public static void clearall() {
        data.Var.hour.clear();
        data.Var.klassen.clear();
        data.Var.lehrer.clear();
        data.Var.shelp.clear();
        data.Var.times.clear();
    }

    public static void firstload() {

        try {
            //List<Stunde> l1 = bl.BlSavesAndLoads.laden();
            int j = 0;
            for (Stunde stunde : data.Var.hour) {
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
                //table.setValueAt(stunde.getFach(), row, column);
                StundeAnsicht sa = new StundeAnsicht(stunde, row, column, false);
                data.Var.shelp.add(sa);
            }
        } catch (Exception e) {
            System.err.println("Laden Fehler");
        }

    }

    public static void akttable(String klasselehrer) {
        data.Var.m.cleartable();

        if (data.Var.ansklasse) {
            for (StundeAnsicht stundeAnsicht : data.Var.shelp) {
                if (stundeAnsicht.getHour().getKlasse().equalsIgnoreCase(klasselehrer)) {
                    if (!stundeAnsicht.getHour().getLehrer().isAnwesend()) {
                        data.Var.m.sethour("Abwesend \n" + stundeAnsicht.getHour().getFach() +" "+stundeAnsicht.getHour().getFach2()+ "\n" + stundeAnsicht.getHour().getLehrer().getKuerzel() + " " + stundeAnsicht.getHour().getLehrer2().getKuerzel() + "\n" + stundeAnsicht.getHour().getKlasse(), stundeAnsicht.getRow(), stundeAnsicht.getColumn());
                    } else {
                        data.Var.m.sethour(stundeAnsicht.getHour().getFach()+" "+stundeAnsicht.getHour().getFach2() + "\n" + stundeAnsicht.getHour().getLehrer().getKuerzel() + " " + stundeAnsicht.getHour().getLehrer2().getKuerzel() + "\n" + stundeAnsicht.getHour().getKlasse(), stundeAnsicht.getRow(), stundeAnsicht.getColumn());

                    }
                    stundeAnsicht.setIsenabled(true);
                } else {
                    stundeAnsicht.setIsenabled(false);
                }

            }
        }
        if (data.Var.anslehrer) {
            for (StundeAnsicht stundeAnsicht : data.Var.shelp) {
                if (stundeAnsicht.getHour().getLehrer().getName().equalsIgnoreCase(klasselehrer)||stundeAnsicht.getHour().getLehrer2().getName().equalsIgnoreCase(klasselehrer)) {
                    if (!stundeAnsicht.getHour().getLehrer().isAnwesend()) {
                        data.Var.m.sethour("Abwesend \n" + stundeAnsicht.getHour().getFach() +" "+stundeAnsicht.getHour().getFach2()+ "\n" + stundeAnsicht.getHour().getLehrer().getKuerzel() + " " + stundeAnsicht.getHour().getLehrer2().getKuerzel()+"\n" + stundeAnsicht.getHour().getKlasse(), stundeAnsicht.getRow(), stundeAnsicht.getColumn());
                    } else {
                        data.Var.m.sethour(stundeAnsicht.getHour().getFach() +" "+stundeAnsicht.getHour().getFach2()+ "\n" + stundeAnsicht.getHour().getLehrer().getKuerzel()+ " " + stundeAnsicht.getHour().getLehrer2().getKuerzel()+"\n" + stundeAnsicht.getHour().getKlasse(), stundeAnsicht.getRow(), stundeAnsicht.getColumn());
                    }
                    stundeAnsicht.setIsenabled(true);
                } else {
                    stundeAnsicht.setIsenabled(false);
                }
            }
        }
        data.Var.m.fireTableDataChanged();
    }

}
