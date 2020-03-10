/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import data.Stunde;
import data.Var;
import data.Zeit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.TransferHandler;

/**
 *
 * @author timon_kaufmann
 */
public class BlPlan {

    public static void enableTablebearbeiten(JTable table) {
        table.setAutoCreateRowSorter(true);
        table.setTransferHandler(new bl.DragAndDrop());
    }

    public static void enableLabelsbearbeiten(JLabel label) {
        label.setTransferHandler(new TransferHandler("text"));
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                JComponent c = (JComponent) e.getSource();
                c.getTransferHandler().exportAsDrag(c, e, TransferHandler.COPY);
            }
        });
    }

    public static void pausenrechner() {
        int i = 0;
        data.Var.times.clear();
        while (!data.Var.stundenende[i].isEmpty()) {
            if (data.Var.stundenanfang[i + 1].isEmpty()) {
                Zeit z = new Zeit(i + 1 + ".", data.Var.stundenanfang[i], data.Var.stundenende[i]);
                data.Var.times.add(z);
            } else if (data.Var.stundenende[i].equals(data.Var.stundenanfang[i + 1])) {
                Zeit z = new Zeit(i + 1 + ".", data.Var.stundenanfang[i], data.Var.stundenende[i]);
                data.Var.times.add(z);
            } else if (!data.Var.stundenende[i].equals(data.Var.stundenanfang[i + 1])) {
                if (!data.Var.stundenanfang[i + 1].isEmpty()) {
                    Zeit z = new Zeit(i + 1 + ".", data.Var.stundenanfang[i], data.Var.stundenende[i]);
                    Zeit zz = new Zeit("Pause", data.Var.stundenende[i], data.Var.stundenanfang[i + 1]);
                    data.Var.times.add(z);
                    data.Var.times.add(zz);
                }

            }
            i++;
        }
    }

    public static void speichern() {
        List<Stunde> hour = Var.hour;
        Gson gson = new Gson();
        String hourgson = gson.toJson(hour);
        try {
            FileWriter fw = new FileWriter("src/main/java/save/Stunden.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(hourgson);
            bw.close();
        } catch (Exception e) {
        }
    }

    public static void speicherntimes() {
        List<Zeit> time = Var.times;
        Gson gson = new Gson();
        String hourgson = gson.toJson(time);
        try {
            FileWriter fw = new FileWriter("src/main/java/save/Zeiten.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(hourgson);
            bw.close();
        } catch (Exception e) {
        }
    }

    public static List<Stunde> laden() {
        List<Stunde> stunden = null;
        File file = new File("src/main/java/save/Stunden.txt");
        if (file.exists()) {
            BufferedReader br = null;
            String jsonString = "";
            try {
                br = new BufferedReader(new FileReader(file));
                String zeile = null;
                while ((zeile = br.readLine()) != null) {
                    jsonString = zeile;
                }
                Gson gson = new Gson();
                java.lang.reflect.Type listType = new TypeToken<List<Stunde>>() {
                }.getType();
                stunden = gson.fromJson(jsonString, listType);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Es existiert noch keine Datei zum laden", "Fehler", JOptionPane.ERROR_MESSAGE);
            data.Var.found = false;
        }
        //Error bei keiner Geladenen Datei nicht gleichsetzen
        if(data.Var.found){
        Var.hour = stunden;
        }
        return stunden;
    }

    public static List<Zeit> ladentimes() {
        List<Zeit> zeit = null;
        File file = new File("src/main/java/save/Zeiten.txt");
        if (file.exists()) {
            BufferedReader br = null;
            String jsonString = "";
            try {
                br = new BufferedReader(new FileReader(file));
                String zeile = null;
                while ((zeile = br.readLine()) != null) {
                    jsonString = zeile;
                }
                Gson gson = new Gson();
                java.lang.reflect.Type listType = new TypeToken<List<Zeit>>() {
                }.getType();
                zeit = gson.fromJson(jsonString, listType);
                System.out.println(zeit.get(0));
                System.out.println(zeit.get(1));
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Es existiert noch keine Datei zum laden", "Fehler", JOptionPane.ERROR_MESSAGE);
            data.Var.found2 = false;
        }
        if(data.Var.found2){
        Var.times = zeit;
        }
        return zeit;
    }
}
