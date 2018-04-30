/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shelvy.pelanggan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author laravel
 */
public class PelangganDaoImplemen implements PelangganDao {

    private final Connection connection;
    private final String sql_insert_pelanggan = "call spInsertPelanggan(?,?,?,?,?,?,?,?,?,?,?)";

    public PelangganDaoImplemen(Connection c) {
        this.connection = c;
    }

    @Override
    public void InsertPelanggan(Pelanggan pelanggan) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql_insert_pelanggan);
            statement.setInt(1, pelanggan.getId());
            statement.setString(1, pelanggan.getKode_pelanggan());
            statement.setString(2, pelanggan.getNama_pelanggan());
            statement.setString(3, pelanggan.getNama_lembaga());
            statement.setString(4, pelanggan.getAlamat_pelanggan());
            statement.setString(5, pelanggan.getEmail_pelanggan());
            statement.setString(6, pelanggan.getTelpon_pelanggan());
            statement.setString(7, pelanggan.getNomer_hp());
            statement.setString(8, pelanggan.getNomer_hp2());
            statement.setString(9, pelanggan.getNomer_wa());
            statement.setString(10, pelanggan.getLine());
            int status = statement.executeUpdate();
            if (status == 0) {
                JOptionPane.showMessageDialog(null, "Data Pelanggan Berhasil Ditambahkan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PelangganDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(PelangganDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void UpdatePelanggan(Pelanggan pelanggan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pelanggan> GetAllPelanggan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pelanggan GetPelangganByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pelanggan GetPelangganByKode(String kode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeletePelangganByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
