/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.transaksi;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author laravel
 */
public class TransaksiTabelModel extends AbstractTableModel {

    private final List<Transaksi> lists;

    public TransaksiTabelModel(List<Transaksi> lists) {
        this.lists = lists;
    }

    @Override
    public int getRowCount() {
        return lists.size();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "No";
            case 1:
                return "Kode";
            case 2:
                return "Pelanggan";
            case 3:
                return "Kelompok";
            case 4:
                return "Tanggal";
            case 5:
                return "Durasi";
            case 6:
                return "Total harga";
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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                return lists.get(rowIndex).getKodetranskasi();
            case 2:
                return lists.get(rowIndex).getPelanggan().getNama_pelanggan().toUpperCase();
            case 3:
                return lists.get(rowIndex).getKelompok().toUpperCase();
            case 4:
                return sdf.format(lists.get(rowIndex).getTanggaltransaksi());
            case 5:
                return lists.get(rowIndex).getDurasi();
            case 6:
                return lists.get(rowIndex).getTotalbayar();
            default:
                return null;
        }
    }

}
