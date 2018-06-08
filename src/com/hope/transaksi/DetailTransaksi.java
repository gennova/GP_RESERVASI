/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.transaksi;

/**
 *
 * @author laravel
 */
public class DetailTransaksi {

    private int id;
    private String kodetransaksi;
    private String layanan;
    private int harga;
    private int diskon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodetransaksi() {
        return kodetransaksi;
    }

    public void setKodetransaksi(String kodetransaksi) {
        this.kodetransaksi = kodetransaksi;
    }

    public String getLayanan() {
        return layanan;
    }

    public void setLayanan(String layanan) {
        this.layanan = layanan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getDiskon() {
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

}
