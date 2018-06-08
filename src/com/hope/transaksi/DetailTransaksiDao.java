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
public interface DetailTransaksiDao {

    public void InsertDetailTransaksi();

    public void UpdateDetailTransaksi();

    public void DeleteDetailTransaksiByID();

    public List<DetailTransaksi> getAllDetailTransaksi();

    public List<DetailTransaksi> getAllDetailTransaksiByIDTransaksi(int id);

    public List<DetailTransaksi> getAllDetailTransaksiByKodeTransaksi(String kode);

    public DetailTransaksi getDetailTransaksiByID(int id);

    public DetailTransaksi getDetailTransaksiByKode(String kode);
}
