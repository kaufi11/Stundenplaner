/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import bl.BlModelPlan;
import gui.KlasseDlg;
import gui.LehrerDlg;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author timon_kaufmann
 */
public class Var {
    public static String pfadauto = "src/main/java/save";
    
    public static String klasseakt;
    public static String lehrerakt;
    public static List<Stunde> hour = new LinkedList<Stunde>();
    public static List<Zeit> times = new LinkedList<Zeit>();
    public static List<Lehrer> lehrer = new LinkedList<Lehrer>();
    public static List<Klasse> klassen = new LinkedList<Klasse>();
    public static List<StundeAnsicht> shelp = new LinkedList<StundeAnsicht>();
    
    public static String[] stundenanfang = new String[11];
    public static String[] stundenende = new String[11];
    
    public static boolean anslehrer = false;
    public static boolean ansklasse = true;
    
    public static BlModelPlan m = new BlModelPlan();
    
    public static KlasseDlg klassedlg;
    public static LehrerDlg lehrerdlg;
    
    public static Comparator<Klasse> compclass = (Klasse k1, Klasse k2) -> {return k1.getName().compareTo(k2.getName());};
    public static Comparator<Lehrer> compteacher = (Lehrer l1, Lehrer l2) -> {return l1.getName().compareTo(l2.getName());};
    
    public static String fileseperator = "/";
    
    public static ImageIcon imageIconclass = new ImageIcon("src" + data.Var.fileseperator + "main" + data.Var.fileseperator + "java" + data.Var.fileseperator + "resource" + data.Var.fileseperator + "klassen.png");
    public static ImageIcon imageIconteacher = new ImageIcon("src" + data.Var.fileseperator + "main" + data.Var.fileseperator + "java" + data.Var.fileseperator + "resource" + data.Var.fileseperator + "lehrer.png");
    public static ImageIcon imageIconedit = new ImageIcon("src" + data.Var.fileseperator + "main" + data.Var.fileseperator + "java" + data.Var.fileseperator + "resource" + data.Var.fileseperator + "bearbeiten.png");
    public static ImageIcon imageIconsave = new ImageIcon("src" + data.Var.fileseperator + "main" + data.Var.fileseperator + "java" + data.Var.fileseperator + "resource" + data.Var.fileseperator + "speichern.png");
    public static ImageIcon imageIconprint = new ImageIcon("src" + data.Var.fileseperator + "main" + data.Var.fileseperator + "java" + data.Var.fileseperator + "resource" + data.Var.fileseperator + "drucken.png");
    
    public static ImageIcon imageIconadd = new ImageIcon("src" + data.Var.fileseperator + "main" + data.Var.fileseperator + "java" + data.Var.fileseperator + "resource" + data.Var.fileseperator + "icon_add.png");
    public static ImageIcon imageIcondelete = new ImageIcon("src" + data.Var.fileseperator + "main" + data.Var.fileseperator + "java" + data.Var.fileseperator + "resource" + data.Var.fileseperator + "icon_delete.png");
        public static ImageIcon imageIconedit2 = new ImageIcon("src" + data.Var.fileseperator + "main" + data.Var.fileseperator + "java" + data.Var.fileseperator + "resource" + data.Var.fileseperator + "bearbeiten2.png");

    
    public static ImageIcon imageIconok = new ImageIcon("src" + data.Var.fileseperator + "main" + data.Var.fileseperator + "java" + data.Var.fileseperator + "resource" + data.Var.fileseperator + "icon_haken.png");
    public static ImageIcon imageIconnotok = new ImageIcon("src" + data.Var.fileseperator + "main" + data.Var.fileseperator + "java" + data.Var.fileseperator + "resource" + data.Var.fileseperator + "icon_abbruch.png");

    
    public static ImageIcon imageIconclassenable = new ImageIcon("src" + data.Var.fileseperator + "main" + data.Var.fileseperator + "java" + data.Var.fileseperator + "resource" + data.Var.fileseperator + "klassen_auswahl.png");
    public static ImageIcon imageIconteacherenable = new ImageIcon("src" + data.Var.fileseperator + "main" + data.Var.fileseperator + "java" + data.Var.fileseperator + "resource" + data.Var.fileseperator + "lehrer_auswahl.png");
    public static ImageIcon imageIconeditenabel = new ImageIcon("src" + data.Var.fileseperator + "main" + data.Var.fileseperator + "java" + data.Var.fileseperator + "resource" + data.Var.fileseperator + "bearbeiten_auswahl.png");
    

}
