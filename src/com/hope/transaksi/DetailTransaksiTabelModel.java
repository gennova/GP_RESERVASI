/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.transaksi;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author laravel
 */
public class DetailTransaksiTabelModel extends AbstractTableModel {

    private List<DetailTransaksi> lists;

    public DetailTransaksiTabelModel(List<DetailTransaksi> lists) {
        this.lists = lists;
    }

    @Override
    public int getRowCount() {
        return lists.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "No.";
            case 1:
                return "Layanan";
            case 2:
                return "Harga";
            case 3:
                return "Diskon";
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
                return lists.get(rowIndex).getLayanan();
            case 2:
                return lists.get(rowIndex).getHarga();
            case 3:
                return lists.get(rowIndex).getDiskon();
            default:
                return null;
        }
    }

}
