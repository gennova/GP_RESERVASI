/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.pelanggan;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author laravel
 */
public class PelangganTableModel extends AbstractTableModel {

    private List<Pelanggan> list = new ArrayList<>();

    public PelangganTableModel(List<Pelanggan> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "No";
            case 1:
                return "Kode";
            case 2:
                return "Nama Pelanggan";
            case 3:
                return "Kantor";
            case 4:
                return "Telpon";
            case 5:
                return "HP";
            case 6:
                return "Tahun";
            default:
                return null;
        }
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getKode_pelanggan();
            case 2:
                return list.get(rowIndex).getNama_lembaga();
            case 3:
                return list.get(rowIndex).getNama_lembaga();
            case 4:
                return list.get(rowIndex).getTelpon_pelanggan();
            case 5:
                return list.get(rowIndex).getNomer_hp();
            case 6:
                return list.get(rowIndex).getTahun_register();
            default:
                return null;
        }
    }
}
