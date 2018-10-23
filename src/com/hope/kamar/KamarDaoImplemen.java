/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.kamar;

import com.init.tools.DaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laravel
 */
public class KamarDaoImplemen implements KamarDao {

    private static final String sqlInsertKamar = "call spInsertKamar(?,?,?,??,?)";
    private static final String sql_get_all_kamar = "select * from kamar";
    private static final String sql_update_status_kamar = "UPDATE kamar SET status_pakai=? WHERE kode=?";
    private static final String sql_kamar_kosong = "SELECT *, COUNT(kamar.id) AS tersedia FROM kamar join kategori_kamar on kamar.tipe=kategori_kamar.id WHERE kamar.status_pakai='tersedia' GROUP BY kamar.tipe";

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
        PreparedStatement ps;
        ResultSet rs;
        List<Kamar> lists = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql_get_all_kamar);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Kamar k = new Kamar();
                k.setId_kamar(rs.getInt("id"));
                k.setId_kamar_str(rs.getString("kode"));
                k.setNama_kamar(rs.getString("nama_kamar"));
                k.setLuas_kamar(rs.getInt("luas"));
                k.setFasilitas(rs.getString("fasilitas"));
                k.setKeterangan(rs.getString("keterangan"));
                k.setTipe(DaoFactory.getKategoriKamarDao().getKategoriKamarByID(rs.getInt("tipe")).getNama_kategori());
                k.setStatus_pakai(rs.getString("status_pakai"));
                lists.add(k);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KamarDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lists;
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

    @Override
    public void Update_status_kamar(String status, String kode) {
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql_update_status_kamar);
            ps.setString(1, status);
            ps.setString(2, kode);
            int statuss = ps.executeUpdate();
            System.out.println("It executed " + statuss);
        } catch (SQLException ex) {
            Logger.getLogger(KamarDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Kamar> getKetersediaanKamarKosong() {
        PreparedStatement ps;
        ResultSet rs;
        List<Kamar> lists = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql_kamar_kosong);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Kamar k = new Kamar();
                k.setId_kamar(rs.getInt("id"));
                k.setId_kamar_str(rs.getString("kode"));
                k.setNama_kamar(rs.getString("nama_kamar"));
                k.setLuas_kamar(rs.getInt("luas"));
                k.setFasilitas(rs.getString("fasilitas"));
                k.setKeterangan(rs.getString("keterangan"));
                k.setTipe(rs.getString("nama_kategori"));
                k.setStatus_pakai(rs.getString("status_pakai"));
                k.setKetersediaan(rs.getInt("tersedia"));
                lists.add(k);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KamarDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lists;
    }

}
