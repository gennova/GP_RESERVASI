/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.kamar;

import java.util.List;

/**
 *
 * @author laravel
 */
public interface KamarDao {

    public void InsertKamar(Kamar kamar);

    public void UpdateKamar(Kamar kamar);

    public void DeleteKamar(Kamar kamar);

    public List<Kamar> GetAllKamar();

    public Kamar GetKamarByID(int id);

    public Kamar GetKamarByType(String tipe);

    public Kamar GetKamarByName(String nama);
}
