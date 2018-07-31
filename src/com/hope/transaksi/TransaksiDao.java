/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.transaksi;

import java.util.List;

/**
 *
 * @author laravel
 */
public interface TransaksiDao {

    public void InsertTransaksi(Transaksi transaksi);

    public void UpdateTransaksi(Transaksi transaksi);

    public void DeleteTransaksi(Transaksi transaksi);

    public List<Transaksi> getAllTransaksi();

    public Transaksi getTransaksiByID(int id);

    public Transaksi getTransaksiByKode(String kode);
    
    public void InsertDetailTransaksiIntoTEMP(String kode);
}
