/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.kamar;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author laravel
 */
public class KamarKosongTabelModel extends AbstractTableModel {

    private final List<Kamar> lists;

    public KamarKosongTabelModel(List<Kamar> lists) {
        this.lists = lists;
    }

    @Override
    public int getRowCount() {
        return lists.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case (0):
                return "No";
            case (1):
                return "Kategori";
            case (2):
                return "Kosong";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case (0):
                return rowIndex + 1;
            case (1):
                return lists.get(rowIndex).getTipe();
            case (2):
                return lists.get(rowIndex).getKetersediaan();
            default:
                return null;
        }
    }

}
