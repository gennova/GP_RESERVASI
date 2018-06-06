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

    public void DeletePelangganByID(int id);
}
