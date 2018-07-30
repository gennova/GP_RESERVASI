/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.pelanggan;

/**
 *
 * @author laravel
 */
public class Pelanggan {

    private int id; //1
    private String kode_pelanggan; //2
    private String nama_pelanggan; //3
    private String nama_lembaga; //4
    private String alamat_pelanggan; //5
    private String email_pelanggan;//6
    private String telpon_pelanggan; //7
    private String nomer_hp;//8
    private String nomer_hp2;//9
    private String nomer_wa;//10
    private String line;//11
    private String instagram;//12
    private String tahun_register; //13

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

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public void setTahun_register(String tahun_register) {
        this.tahun_register = tahun_register;
    }

    public String getTahun_register() {
        return tahun_register;
    }

}
