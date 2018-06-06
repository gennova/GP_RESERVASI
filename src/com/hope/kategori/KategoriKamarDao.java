/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.kategori;

import java.util.List;

/**
 *
 * @author laravel
 */
public interface KategoriKamarDao {

    public void InsertKategori(KategoriKamar kamar);

    public void UpdateKategori(KategoriKamar kamar);

    public void DeleteKategoriBYID(int id);

    public List<KategoriKamar> getAllKategori();

    public KategoriKamar getKategoriKamarByID(int id);
}
