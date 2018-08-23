/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.pelanggan;

import java.util.List;

/**
 *
 * @author laravel
 */
public interface PelangganDao {

    public void InsertPelanggan(Pelanggan pelanggan);

    public void UpdatePelanggan(Pelanggan pelanggan);

    public List<Pelanggan> GetAllPelanggan();

    public Pelanggan GetPelangganByID(int id);

    public Pelanggan GetPelangganByKode(String kode);
    
    public Pelanggan GetPelangganByNama(String nama);

    public void DeletePelangganByID(int id);
    
    public void InsertUrutPelanggan(String kode);
    
    public List<Pelanggan> GetAllPelangganTahun(String tahun);
    
    public List<Pelanggan> GetAllPelangganTahunUnik(String tahun);
    
    public List<Pelanggan> GetAllPelangganTahunUnikPergi(String tahun);
    
    public List<Pelanggan> GetAllPelangganTahunUnikKantor(String tahun);
    
    public List<Pelanggan> GetAllPelangganTahunUnikKantorPergi(String tahun);
    
    public List<Pelanggan> GetAllPelangganTahunUnikPergiLast(String tahun);
    
    public List<Pelanggan> GetAllPelangganTahunUnikKantorPergiLast(String tahun);
}
