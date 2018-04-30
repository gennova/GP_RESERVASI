/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelvy.kamar;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author laravel
 */
public class KamarDaoImplemen implements KamarDao {
    private static final String sqlInsertKamar = "call spInsertKamar(?,?,?,??,?)";

    private Connection connection = null;

    public KamarDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void InsertKamar(Kamar kamar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void UpdateKamar(Kamar kamar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteKamar(Kamar kamar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Kamar> GetAllKamar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Kamar GetKamarByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Kamar GetKamarByType(String tipe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Kamar GetKamarByName(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
