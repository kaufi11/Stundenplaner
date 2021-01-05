/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import data.StundeBau;

/**
 *
 * @author timon_kaufmann
 */
public class BlBuildData {

    public static void input() {
        data.Var.bausteinelist.clear();
        
        data.Var.bausteinelist.add(new StundeBau("AM", "1a"));
        data.Var.bausteinelist.add(new StundeBau("AM", "1a"));
        data.Var.bausteinelist.add(new StundeBau("AM", "1a"));
        data.Var.bausteinelist.add(new StundeBau("D", "1a"));
        data.Var.bausteinelist.add(new StundeBau("D", "1a"));
        data.Var.bausteinelist.add(new StundeBau("BE", "1a"));
        data.Var.bausteinelist.add(new StundeBau("BE", "1a"));
        //etc (Daten abwarten)
    }
}
