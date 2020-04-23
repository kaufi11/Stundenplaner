/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import bl.BlModelPlan;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author timon_kaufmann
 */
public class Var {
    public static String klasseakt;
    public static List<Stunde> hour = new LinkedList<Stunde>();
    public static List<Zeit> times = new LinkedList<Zeit>();
    public static List<Lehrer> lehrer = new LinkedList<Lehrer>();
    public static List<Klasse> klassen = new LinkedList<Klasse>();
    public static List<StundeAnsicht> shelp = new LinkedList<StundeAnsicht>();
    
    public static String[] stundenanfang = new String[10];
    public static String[] stundenende = new String[10];
    
    public static boolean anslehrer = false;
    public static boolean ansklasse = true;
    
    public static BlModelPlan m = new BlModelPlan();
    
    
}
