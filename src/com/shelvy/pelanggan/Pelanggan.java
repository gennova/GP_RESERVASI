/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelvy.pelanggan;

/**
 *
 * @author laravel
 */
public class Pelanggan {

    private int id;
    private String kode_pelanggan;
    private String nama_pelanggan;
    private String nama_lembaga;
    private String alamat_pelanggan;
    private String email_pelanggan;
    private String telpon_pelanggan;
    private String nomer_hp;
    private String nomer_hp2;
    private String nomer_wa;
    private String line;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getAlamat_pelanggan() {
        return alamat_pelanggan;
    }

    public void setAlamat_pelanggan(String alamat_pelanggan) {
        this.alamat_pelanggan = alamat_pelanggan;
    }

    public String getEmail_pelanggan() {
        return email_pelanggan;
    }

    public void setEmail_pelanggan(String email_pelanggan) {
        this.email_pelanggan = email_pelanggan;
    }

    public String getTelpon_pelanggan() {
        return telpon_pelanggan;
    }

    public void setTelpon_pelanggan(String telpon_pelanggan) {
        this.telpon_pelanggan = telpon_pelanggan;
    }

    public String getNomer_hp() {
        return nomer_hp;
    }

    public void setNomer_hp(String nomer_hp) {
        this.nomer_hp = nomer_hp;
    }

    public String getNomer_hp2() {
        return nomer_hp2;
    }

    public void setNomer_hp2(String nomer_hp2) {
        this.nomer_hp2 = nomer_hp2;
    }

    public String getNomer_wa() {
        return nomer_wa;
    }

    public void setNomer_wa(String nomer_wa) {
        this.nomer_wa = nomer_wa;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getKode_pelanggan() {
        return kode_pelanggan;
    }

    public void setKode_pelanggan(String kode_pelanggan) {
        this.kode_pelanggan = kode_pelanggan;
    }

    public String getNama_lembaga() {
        return nama_lembaga;
    }

    public void setNama_lembaga(String nama_lembaga) {
        this.nama_lembaga = nama_lembaga;
    }

}
