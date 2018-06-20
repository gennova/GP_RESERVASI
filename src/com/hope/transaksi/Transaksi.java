/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.transaksi;

import com.hope.pelanggan.Pelanggan;
import java.util.Date;

/**
 *
 * @author laravel
 */
public class Transaksi {

    private int id;
    private String kodetranskasi;
    private Date tanggaltransaksi;
    private Date tanggalmasuk;
    private Date tanggalkeluar;
    private Pelanggan pelanggan;
    private int totalharga;
    private int totaldiskon;
    private int totalbayar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodetranskasi() {
        return kodetranskasi;
    }

    public void setKodetranskasi(String kodetranskasi) {
        this.kodetranskasi = kodetranskasi;
    }

    public Date getTanggaltransaksi() {
        return tanggaltransaksi;
    }

    public void setTanggaltransaksi(Date tanggaltransaksi) {
        this.tanggaltransaksi = tanggaltransaksi;
    }

    public Date getTanggalmasuk() {
        return tanggalmasuk;
    }

    public void setTanggalmasuk(Date tanggalmasuk) {
        this.tanggalmasuk = tanggalmasuk;
    }

    public Date getTanggalkeluar() {
        return tanggalkeluar;
    }

    public void setTanggalkeluar(Date tanggalkeluar) {
        this.tanggalkeluar = tanggalkeluar;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public int getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(int totalharga) {
        this.totalharga = totalharga;
    }

    public int getTotaldiskon() {
        return totaldiskon;
    }

    public void setTotaldiskon(int totaldiskon) {
        this.totaldiskon = totaldiskon;
    }

    public int getTotalbayar() {
        return totalbayar;
    }

    public void setTotalbayar(int totalbayar) {
        this.totalbayar = totalbayar;
    }

}
