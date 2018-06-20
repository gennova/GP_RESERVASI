/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.transaksi;

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
public class DetailTransaksiDaoImplemen implements DetailTransaksiDao {

    private Connection connection;
    private static final String sql_insert_detil_temp = "call spInsertDetilTemp(?,?,?,?)";
    private static final String sql_total_order_temp = "select sum(harga) as totalharga from detailtransaksi_temp";
    private static final String sql_total_diskon_temp = "select sum(diskon) as totaldiskon from detailtransaksi_temp";
    private static final String sql_get_all_detail_temp = "select * from detailtransaksi_temp";

    public DetailTransaksiDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void InsertDetailTransaksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InsertDetailTransaksiTemp(DetailTransaksi dt) {
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql_insert_detil_temp);
            ps.setString(1, dt.getKodetransaksi());
            ps.setString(2, dt.getLayanan());
            ps.setInt(3, dt.getHarga());
            ps.setInt(4, dt.getDiskon());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DetailTransaksiDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void DeleteDetailTransaksiTemp() {
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement("truncate detailtransaksi_temp");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DetailTransaksiDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getTotalOrder() {
        PreparedStatement ps;
        ResultSet rs;
        int total = 0;
        try {
            ps = connection.prepareStatement(sql_total_order_temp);
            rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getInt("totalharga");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetailTransaksiDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    @Override
    public int getTotalDiskon() {
        PreparedStatement ps;
        ResultSet rs;
        int total = 0;
        try {
            ps = connection.prepareStatement(sql_total_diskon_temp);
            rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getInt("totaldiskon");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetailTransaksiDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    @Override
    public int getTotalBayar() {
        return getTotalOrder() - getTotalDiskon();
    }

    @Override
    public void UpdateDetailTransaksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteDetailTransaksiByID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetailTransaksi> getAllDetailTransaksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetailTransaksi> getAllDetailTransaksiByIDTransaksi(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetailTransaksi> getAllDetailTransaksiByKodeTransaksi(String kode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetailTransaksi getDetailTransaksiByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetailTransaksi getDetailTransaksiByKode(String kode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetailTransaksi> getAllDetailTransaksiTemp() {
        PreparedStatement ps;
        ResultSet rs;
        List<DetailTransaksi> dts = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql_get_all_detail_temp);
            rs = ps.executeQuery();
            while (rs.next()) {
                DetailTransaksi dt = new DetailTransaksi();
                dt.setId(rs.getInt("id_temp"));
                dt.setLayanan(rs.getString("layanan"));
                dt.setHarga(rs.getInt("harga"));
                dt.setDiskon(rs.getInt("diskon"));
                dts.add(dt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetailTransaksiDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dts;
    }

    @Override
    public void InsertNoUrutTransaksi(String kode) {
        try {
            PreparedStatement ps = connection.prepareStatement("insert into urut transaksi(kodetransaksi) values(?)");
            ps.setString(1, kode);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DetailTransaksiDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
