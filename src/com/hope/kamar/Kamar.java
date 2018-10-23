/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.kamar;

/**
 *
 * @author Lab Komputer
 */
public class Kamar {

    private int id_kamar;
    private String id_kamar_str;
    private String nama_kamar;
    private int luas_kamar;
    private String fasilitas;
    private String keterangan;
    private String tipe;
    private String status_pakai;
    private int ketersediaan;

    public Kamar() {

    }

    public int getId_kamar() {
        return id_kamar;
    }

    public void setId_kamar(int id_kamar) {
        this.id_kamar = id_kamar;
    }

    public String getId_kamar_str() {
        return id_kamar_str;
    }

    public void setId_kamar_str(String id_kamar_str) {
        this.id_kamar_str = id_kamar_str;
    }

    public String getNama_kamar() {
        return nama_kamar;
    }

    public void setNama_kamar(String nama_kamar) {
        this.nama_kamar = nama_kamar;
    }

    public int getLuas_kamar() {
        return luas_kamar;
    }

    public void setLuas_kamar(int luas_kamar) {
        this.luas_kamar = luas_kamar;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void setStatus_pakai(String status_pakai) {
        this.status_pakai = status_pakai;
    }

    public String getStatus_pakai() {
        return status_pakai;
    }

    public void setKetersediaan(int ketersediaan) {
        this.ketersediaan = ketersediaan;
    }

    public int getKetersediaan() {
        return ketersediaan;
    }

}
