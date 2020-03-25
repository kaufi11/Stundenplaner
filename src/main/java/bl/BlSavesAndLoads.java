/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import static bl.BlRefresh.refreshlistclass;
import static bl.BlRefresh.refreshlistcombpteacher;
import static bl.BlRefresh.refreshlistteacher;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import data.Klasse;
import data.Lehrer;
import data.Stunde;
import data.Var;
import data.Zeit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author timon_kaufmann
 */
public class BlSavesAndLoads {
    
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
        }

            Var.hour = stunden;
        
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
        }
            Var.times = zeit;
        
        return zeit;
    }

    public static void speichernteacher() {
        List<Lehrer> lehrer = Var.lehrer;
        Gson gson = new Gson();
        String hourgson = gson.toJson(lehrer);
        try {
            FileWriter fw = new FileWriter("src/main/java/save/Lehrer.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(hourgson);
            bw.close();
        } catch (Exception e) {
        }
    }

    public static List<Lehrer> ladenteacher() {
        List<Lehrer> lehrer = null;
        File file = new File("src/main/java/save/Lehrer.txt");
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
                java.lang.reflect.Type listType = new TypeToken<List<Lehrer>>() {
                }.getType();
                lehrer = gson.fromJson(jsonString, listType);
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
        }
            Var.lehrer = lehrer;
            refreshlistteacher();
            refreshlistcombpteacher();
        
        return lehrer;
    }

    public static void speichernclass() {
        List<Klasse> klasse = Var.klassen;
        Gson gson = new Gson();
        String hourgson = gson.toJson(klasse);
        try {
            FileWriter fw = new FileWriter("src/main/java/save/Klassen.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(hourgson);
            bw.close();
        } catch (Exception e) {
        }
    }

    public static List<Klasse> ladenclass() {
        List<Klasse> klassen = null;
        File file = new File("src/main/java/save/Klassen.txt");
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
                java.lang.reflect.Type listType = new TypeToken<List<Klasse>>() {
                }.getType();
                klassen = gson.fromJson(jsonString, listType);
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
            
        }
            Var.klassen = klassen;
            refreshlistclass();
        
        return klassen;
    }
}
