/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.kategori;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author laravel
 */
public class KategoriKamarTableModel extends AbstractTableModel {

    private List<KategoriKamar> lists;

    public KategoriKamarTableModel(List<KategoriKamar> lists) {
        this.lists = lists;
    }

    @Override
    public int getRowCount() {
        return lists.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Kategori";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lists.get(rowIndex).getId();
            case 1:
                return lists.get(rowIndex).getNama_kategori();
            default:
                return null;
        }
    }

}
