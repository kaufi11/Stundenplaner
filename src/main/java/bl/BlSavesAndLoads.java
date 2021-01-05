/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import static bl.BlRefreshclassandteacher.refreshlistclass;
import static bl.BlRefreshclassandteacher.refreshlistcombpteacher;
import static bl.BlRefreshclassandteacher.refreshlistteacher;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import data.Klasse;
import data.Lehrer;
import data.Stunde;
import data.StundeBau;
import data.Var;
import data.Zeit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author timon_kaufmann
 */
public class BlSavesAndLoads {
    
    public static void createfolder(String path){
        File folder = new File(path);
        Path filepath = Paths.get(path, "/test.png");
        try {
            Files.createDirectory(filepath.getParent());
        } catch (IOException ex) {
            Logger.getLogger(BlSavesAndLoads.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void speichern(String pfad) {
        List<Stunde> hour = Var.hour;
        Gson gson = new Gson();
        String hourgson = gson.toJson(hour);
        try {
            FileWriter fw = new FileWriter(pfad + "/Stunden.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(hourgson);
            bw.close();
        } catch (Exception e) {
        }
    }

    public static void speicherntimes(String pfad) {
        List<Zeit> time = Var.times;
        Gson gson = new Gson();
        String hourgson = gson.toJson(time);
        try {
            FileWriter fw = new FileWriter(pfad + "/Zeiten.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(hourgson);
            bw.close();
        } catch (Exception e) {
        }
    }

    public static void speichernteacher(String pfad) {
        List<Lehrer> lehrer = Var.lehrer;
        Gson gson = new Gson();
        String hourgson = gson.toJson(lehrer);
        try {
            FileWriter fw = new FileWriter(pfad + "/Lehrer.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(hourgson);
            bw.close();
        } catch (Exception e) {
        }
    }

    public static void speichernclass(String pfad) {
        List<Klasse> klasse = Var.klassen;
        Gson gson = new Gson();
        String hourgson = gson.toJson(klasse);
        try {
            FileWriter fw = new FileWriter(pfad + "/Klassen.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(hourgson);
            bw.close();
        } catch (Exception e) {
        }
    }
        public static void speichernbau(String pfad) {
        List<StundeBau> bau = Var.bausteinelist;
        Gson gson = new Gson();
        String hourgson = gson.toJson(bau);
        try {
            FileWriter fw = new FileWriter(pfad + "/Bau.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(hourgson);
            bw.close();
        } catch (Exception e) {
        }
    }

    public static List<Stunde> laden(String pfad) {
        List<Stunde> stunden = null;
        File file = new File(pfad + "/Stunden.txt");
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
            Var.hour = stunden;
        } else {
            JOptionPane.showMessageDialog(null, "Es existiert noch keine Stunden-Datei", "Fehler", JOptionPane.WARNING_MESSAGE);
        }

        return stunden;
    }

    public static List<Zeit> ladentimes(String pfad) {
        List<Zeit> zeit = null;
        File file = new File(pfad + "/Zeiten.txt");
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
            Var.times = zeit;
        } else {
            JOptionPane.showMessageDialog(null, "Es existiert noch keine Zeit-Datei", "Fehler", JOptionPane.WARNING_MESSAGE);
        }

        return zeit;
    }

    public static List<Lehrer> ladenteacher(String pfad) {
        List<Lehrer> lehrer = null;
        File file = new File(pfad + "/Lehrer.txt");
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
            Var.lehrer = lehrer;
            refreshlistteacher();
            refreshlistcombpteacher();
        } else {
            JOptionPane.showMessageDialog(null, "Es existiert noch keine Lehrer-Datei", "Fehler", JOptionPane.WARNING_MESSAGE);
        }

        return lehrer;
    }

    public static List<Klasse> ladenclass(String pfad) {
        List<Klasse> klassen = null;
        File file = new File(pfad + "/Klassen.txt");
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
            Var.klassen = klassen;
            refreshlistclass();
        } else {
            JOptionPane.showMessageDialog(null, "Es existiert noch keine Klassen-Datei", "Fehler", JOptionPane.WARNING_MESSAGE);

        }

        return klassen;
    }
        public static List<StundeBau> ladenbau(String pfad) {
        List<StundeBau> bau = null;
        File file = new File(pfad + "/Bau.txt");
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
                java.lang.reflect.Type listType = new TypeToken<List<StundeBau>>() {
                }.getType();
                bau = gson.fromJson(jsonString, listType);
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
            Var.bausteinelist = bau;
            refreshlistclass();
        } else {
            JOptionPane.showMessageDialog(null, "Es existiert noch keine Klassen-Datei", "Fehler", JOptionPane.WARNING_MESSAGE);

        }

        return bau;
    }
}
