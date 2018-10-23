/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.kategori;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author laravel
 */
public class KategoriKamarDaoImplemen implements KategoriKamarDao{
    private final Connection connection;
    private static final String sql_insert_kategori = "insert into kategori_kamar(nama_kategori) values (?)";
    private static final String sql_update_kategori = "update kategori_kamar set nama_kategori=? where id=?";
    private static final String sql_get_all_kategori = "select * from kategori_kamar";
    private static final String sql_get_kategori_by_id ="select * from kategori_kamar where id=?";

    public KategoriKamarDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void InsertKategori(KategoriKamar kamar) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql_insert_kategori);
            ps.setString(1, kamar.getNama_kategori());
            int status = ps.executeUpdate();
            if (status == 0) {
                JOptionPane.showMessageDialog(null, "Data kamar berhasil ditambahkan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KategoriKamarDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void UpdateKategori(KategoriKamar kamar) {
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql_update_kategori);
            ps.setString(1, kamar.getNama_kategori());
            ps.setInt(2, kamar.getId());
            int status = ps.executeUpdate();
            if (status == 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil diperbaharui");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KategoriKamarDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void DeleteKategoriBYID(int id) {
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement("delete from kategori where id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(KategoriKamarDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<KategoriKamar> getAllKategori() {
        PreparedStatement ps;
        ResultSet rs;
        List<KategoriKamar> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql_get_all_kategori);
            rs = ps.executeQuery();
            while (rs.next()) {
                KategoriKamar k = new KategoriKamar();
                k.setId(rs.getInt("id"));
                k.setNama_kategori(rs.getString("nama_kategori"));
                list.add(k);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KategoriKamarDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public KategoriKamar getKategoriKamarByID(int id) {
        PreparedStatement ps;
        ResultSet rs;
        KategoriKamar kamar = null;
        try {
            ps = connection.prepareStatement(sql_get_kategori_by_id);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {                
                kamar = new KategoriKamar();
                kamar.setId(rs.getInt("id"));
                kamar.setNama_kategori(rs.getString("nama_kategori"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KategoriKamarDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kamar;
    }
}
