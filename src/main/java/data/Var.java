/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.LinkedList;

/**
 *
 * @author timon_kaufmann
 */
public class Var {
    public static LinkedList<Stunde> hour = new LinkedList<Stunde>();
    public static LinkedList<Zeit> times = new LinkedList<Zeit>();
    
    public static String[] stundenanfang = new String[10];
    public static String[] stundenende = new String[10];

    public static LinkedList<Stunde> getHour() {
        return hour;
    }
    
    
}
