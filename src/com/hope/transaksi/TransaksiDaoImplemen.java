/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.transaksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author laravel
 */
public class TransaksiDaoImplemen implements TransaksiDao {

    private final Connection connection;
    private final String sql_insert_transaksi= "call spInsertTransaksi(?,?,?,?,?,?,?,?,?,?)";

    public TransaksiDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void InsertTransaksi(Transaksi transaksi) {
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd");
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql_insert_transaksi);
            ps.setString(1, transaksi.getKodetranskasi());
            ps.setString(2, sdf.format(transaksi.getTanggaltransaksi()));
            ps.setString(3, sdf.format(transaksi.getTanggalmasuk()));
            ps.setString(4, sdf.format(transaksi.getTanggalkeluar()));
            ps.setInt(5, transaksi.getPelanggan().getId());
            ps.setString(6, transaksi.getKelompok());
            ps.setInt(7, transaksi.getTotalharga());
            ps.setInt(8, transaksi.getTotaldiskon());
            ps.setInt(9, transaksi.getTotalbayar());
            ps.setInt(10, transaksi.getDurasi());
            int status = ps.executeUpdate();
            if (status==0) {
                JOptionPane.showMessageDialog(null, "Data berhasil tersimpan");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void UpdateTransaksi(Transaksi transaksi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteTransaksi(Transaksi transaksi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transaksi> getAllTransaksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Transaksi getTransaksiByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Transaksi getTransaksiByKode(String kode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
