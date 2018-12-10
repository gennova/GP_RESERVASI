/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.transaksi;

import com.init.tools.DaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    private final String sql_insert_transaksi = "call spInsertTransaksi(?,?,?,?,?,?,?,?,?,?,?)";
    private final String sql_update_transaksi = "call spUpdateTransaksi(?,?,?,?,?,?,?,?,?,?,?)";
    private final String sql_get_all_transaksi = "select * from transaksi";
    private final String sql_get_transaksi_by_kode = "select * from transaksi where kodetransaksi=?";
    private final String sqlInsertDetailToTemp = "INSERT INTO detailtransaksi_temp (id_temp,kodetransaksi,layanan,harga,diskon) SELECT id_temp,kodetransaksi,layanan,harga,diskon FROM detailtransaksi where kodetransaksi=?";

    public TransaksiDaoImplemen(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void InsertTransaksi(Transaksi transaksi) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
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
            ps.setString(11, transaksi.getCheck_in());
            int status = ps.executeUpdate();
            if (status == 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil tersimpan");
            }

        } catch (SQLException ex) {
            Logger.getLogger(TransaksiDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void UpdateTransaksi(Transaksi transaksi) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sql_update_transaksi);
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
            ps.setString(11, transaksi.getCheck_in());
            int status = ps.executeUpdate();
            if (status == 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil terupdate");
            }

        } catch (SQLException ex) {
            Logger.getLogger(TransaksiDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void DeleteTransaksi(Transaksi transaksi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transaksi> getAllTransaksi() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        PreparedStatement ps;
        ResultSet rs;
        List<Transaksi> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql_get_all_transaksi);
            rs = ps.executeQuery();
            while (rs.next()) {
                Transaksi t = new Transaksi();
                t.setId(rs.getInt("id"));
                t.setKodetranskasi(rs.getString("kodetransaksi"));
                t.setTanggaltransaksi(sdf.parse(rs.getString("tgltransaksi")));
                t.setTanggalmasuk(sdf.parse(rs.getString("tglmasuk")));
                t.setTanggalkeluar(sdf.parse(rs.getString("tglkeluar")));
                t.setPelanggan(DaoFactory.getPelangganDao().GetPelangganByID(rs.getInt("idpelanggan")));
                t.setKelompok(rs.getString("kelompok"));
                t.setTotalbayar(rs.getInt("totalbayar"));
                t.setTotaldiskon(rs.getInt("totaldiskon"));
                t.setTotalharga(rs.getInt("totalharga"));
                t.setDurasi(rs.getInt("durasi"));
                t.setCheck_in(rs.getString("status"));
                list.add(t);
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(TransaksiDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Transaksi getTransaksiByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Transaksi getTransaksiByKode(String kode) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        PreparedStatement ps;
        ResultSet rs;
        Transaksi t = new Transaksi();
        try {
            ps = connection.prepareStatement(sql_get_transaksi_by_kode);
            ps.setString(1, kode);
            rs = ps.executeQuery();
            while (rs.next()) {
                t.setId(rs.getInt("id"));
                t.setKodetranskasi(rs.getString("kodetransaksi"));
                t.setTanggaltransaksi(sdf.parse(rs.getString("tgltransaksi")));
                t.setTanggalmasuk(sdf.parse(rs.getString("tglmasuk")));
                t.setTanggalkeluar(sdf.parse(rs.getString("tglkeluar")));
                System.out.println("ID PELANGGAN " + rs.getInt("idpelanggan"));
                t.setPelanggan(DaoFactory.getPelangganDao().GetPelangganByID(rs.getInt("idpelanggan")));
                t.setKelompok(rs.getString("kelompok"));
                t.setTotalbayar(rs.getInt("totalbayar"));
                t.setTotaldiskon(rs.getInt("totaldiskon"));
                t.setTotalharga(rs.getInt("totalharga"));
                t.setDurasi(rs.getInt("durasi"));
                t.setCheck_in(rs.getString("status"));
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(TransaksiDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

    @Override
    public void InsertDetailTransaksiIntoTEMP(String kode) {
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement(sqlInsertDetailToTemp);
            ps.setString(1, kode);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
