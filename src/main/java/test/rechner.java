/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import data.Zeit;

/**
 *
 * @author timon_kaufmann
 */
public class rechner {

    public static void main(String[] args) {
        int i = 0;
        String[] stundenanfang = new String[20];
        stundenanfang[0] = "8:00";
        stundenanfang[1] = "8:50";
        stundenanfang[2] = "9:40";
        stundenanfang[3] = "10:45";
        String[] stundenende = new String[20];
        stundenende[0] = "8:50";
        stundenende[1] = "9:40";
        stundenende[2] = "10:30";
        stundenende[3] = "11:35";
        for (int j = 4; j < stundenanfang.length - 1; j++) {
            stundenanfang[j] = "";
        }
        for (int j = 4; j < stundenende.length - 1; j++) {
            stundenende[j] = "";
        }

        while (!stundenende[i].isEmpty()) {
            if (!stundenanfang[i + 1].isEmpty()) {
                if (stundenende[i].equals(stundenanfang[i + 1])) {
                    Zeit z = new Zeit(i + ".", stundenanfang[i], stundenende[i]);
                    System.out.println(z.toString());
                } else if (!stundenende[i].equals(stundenanfang[i + 1])) {
                    Zeit z = new Zeit(i + ".", stundenanfang[i], stundenende[i]);
                    Zeit zz = new Zeit("Pause", stundenende[i], stundenanfang[i + 1]);
                    System.out.println(z.toString());
                    System.out.println(zz.toString());
                }
                i++;
            }

        }
    }

}
