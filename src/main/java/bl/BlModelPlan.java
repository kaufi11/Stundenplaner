/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import data.ModelData;
import data.Zeit;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author timon_kaufmann
 */
public class BlModelPlan extends AbstractTableModel {

    LinkedList<ModelData> list;

    public BlModelPlan() {
        list = new LinkedList<ModelData>();
        load2();
    }
    
    

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return ModelEnum.values().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModelData p = this.list.get(rowIndex);

        ModelEnum te = ModelEnum.values()[columnIndex];
        switch (te) {
            case STUNDE:
                return p.getNummer();
            case ZEITVON:
                return p.getZeitvon();
            case ZEITBIS:
                return p.getZeitbis();
            case MONTAG:
                return p.getMontag();
            case DIENSTAG:
                return p.getDienstag();
            case MITTWOCH:
                return p.getMittwoch();
            case DONNERSTAG:
                return p.getDonnerstag();
            case FREITAG:
                return p.getFreitag();
        }
        return "?";
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        this.list.set(i, (ModelData) o);
        this.fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public String getColumnName(int column) {
        return ModelEnum.values()[column].getName();
    }

    public void cleartable() {
        int i = 0;
        for (ModelData modelData : list) {
            list.set(i, new ModelData(modelData.getNummer(), modelData.getZeitvon(), modelData.getZeitbis(), "", "", "", "", ""));
            i++;
        }
        this.fireTableDataChanged();
    }

    public void sethour(String time, int row, int column) {
        ModelData md = list.get(row);
        if (column == 3) {
            list.set(row, new ModelData(md.getNummer(), md.getZeitvon(), md.getZeitbis(), time,
                    md.getDienstag(), md.getMittwoch(), md.getDonnerstag(), md.getFreitag()));
        }
        if (column == 4) {
            list.set(row, new ModelData(md.getNummer(), md.getZeitvon(), md.getZeitbis(), md.getMontag(),
                    time, md.getMittwoch(), md.getDonnerstag(), md.getFreitag()));
        }
        if (column == 5) {
            list.set(row, new ModelData(md.getNummer(), md.getZeitvon(), md.getZeitbis(), md.getMontag(),
                    md.getDienstag(), time, md.getDonnerstag(), md.getFreitag()));
        }
        if (column == 6) {
            list.set(row, new ModelData(md.getNummer(), md.getZeitvon(), md.getZeitbis(), md.getMontag(),
                    md.getDienstag(), md.getMittwoch(), time, md.getFreitag()));
        }
        if (column == 7) {
            list.set(row, new ModelData(md.getNummer(), md.getZeitvon(), md.getZeitbis(), md.getMontag(),
                    md.getDienstag(), md.getMittwoch(), md.getDonnerstag(), time));
        }
        this.fireTableDataChanged();
    }

    public void load() {
        bl.BlSavesAndLoads.laden();
        bl.BlSavesAndLoads.ladentimes();
        bl.BlSavesAndLoads.ladenteacher();
        bl.BlSavesAndLoads.ladenclass();
        List<Zeit> l2 = bl.BlSavesAndLoads.ladentimes();
        int i = 0;
        for (Zeit zeit : l2) {
            add(new ModelData(zeit.getArt(), zeit.getVon(), zeit.getBis(), "", "", "", "", ""));
            i++;
        }
        BlTableLoad.firstload();

    }

    public void load2() {
        int i = 0;
        for (Zeit zeit : data.Var.times) {
            add(new ModelData(zeit.getArt(), zeit.getVon(), zeit.getBis(), "", "", "", "", ""));
            i++;
        }
    }

    public void newtimes() {
        list.clear();

        int i = 0;
        for (Zeit zeit : data.Var.times) {
            ModelData md = list.get(i);
            add(new ModelData(zeit.getArt(), zeit.getVon(), zeit.getBis(), md.getMontag(), md.getDienstag(),
                    md.getMittwoch(), md.getDonnerstag(), md.getFreitag()));
            i++;
        }
    }

    public void add(ModelData s) {
        list.add(s);
        this.fireTableDataChanged();
    }

    public void delete(ModelData p) {
        list.remove(p);
        this.fireTableDataChanged();
    }

    public ModelData getPlayer(int index) {
        return this.list.get(index);
    }

    public ModelData getRow(int row) {
        return list.get(row);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

}
