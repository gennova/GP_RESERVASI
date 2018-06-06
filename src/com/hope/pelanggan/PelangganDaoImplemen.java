/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.pelanggan;

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
public class PelangganDaoImplemen implements PelangganDao {

    private final Connection connection;
    private final String sql_insert_pelanggan = "call spInsertPelanggan(?,?,?,?,?,?,?,?,?,?,?)";
    private final String sql_update_pelanggan = "call spUpdatePelanggan(?,?,?,?,?,?,?,?,?,?,?,?)";
    private final String sql_get_all_pelanggan = "select * from pelanggan";
    private final String sql_get_all_pelanggan_ID = "select * from pelanggan where id=?";

    public PelangganDaoImplemen(Connection c) {
        this.connection = c;
    }

    @Override
    public void InsertPelanggan(Pelanggan pelanggan) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql_insert_pelanggan);
            //statement.setInt(1, pelanggan.getId());
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
            statement.setString(11, pelanggan.getInstagram());
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
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql_update_pelanggan);
            statement.setInt(1, pelanggan.getId());
            statement.setString(2, pelanggan.getKode_pelanggan());
            statement.setString(3, pelanggan.getNama_pelanggan());
            statement.setString(4, pelanggan.getNama_lembaga());
            statement.setString(5, pelanggan.getAlamat_pelanggan());
            statement.setString(6, pelanggan.getEmail_pelanggan());
            statement.setString(7, pelanggan.getTelpon_pelanggan());
            statement.setString(8, pelanggan.getNomer_hp());
            statement.setString(9, pelanggan.getNomer_hp2());
            statement.setString(10, pelanggan.getNomer_wa());
            statement.setString(11, pelanggan.getLine());
            statement.setString(12, pelanggan.getInstagram());
            int status = statement.executeUpdate();
            if (status == 0) {
                JOptionPane.showMessageDialog(null, "Data Pelanggan Berhasil Diupdate");
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
    public List<Pelanggan> GetAllPelanggan() {
        PreparedStatement ps;
        ResultSet rs;
        List<Pelanggan> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql_get_all_pelanggan);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pelanggan pelanggan = new Pelanggan();
                pelanggan.setId(rs.getInt("id"));
                pelanggan.setKode_pelanggan(rs.getString("kode"));
                pelanggan.setNama_pelanggan(rs.getString("nama"));
                pelanggan.setNama_lembaga(rs.getString("kantor"));
                pelanggan.setAlamat_pelanggan(rs.getString("alamat"));
                pelanggan.setEmail_pelanggan(rs.getString("email"));
                pelanggan.setTelpon_pelanggan(rs.getString("telpon"));
                pelanggan.setNomer_hp(rs.getString("hp"));
                pelanggan.setNomer_hp2(rs.getString("hp2"));
                pelanggan.setNomer_wa(rs.getString("wa"));
                pelanggan.setLine(rs.getString("line"));
                pelanggan.setInstagram(rs.getString("instagram"));
                list.add(pelanggan);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PelangganDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Pelanggan GetPelangganByID(int id) {
        PreparedStatement ps;
        ResultSet rs;
        Pelanggan pelanggan = null;
        try {
            ps = connection.prepareStatement(sql_get_all_pelanggan_ID);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                pelanggan = new Pelanggan();
                pelanggan.setId(rs.getInt("id"));
                pelanggan.setKode_pelanggan(rs.getString("kode"));
                pelanggan.setNama_pelanggan(rs.getString("nama"));
                pelanggan.setNama_lembaga(rs.getString("kantor"));
                pelanggan.setAlamat_pelanggan(rs.getString("alamat"));
                pelanggan.setEmail_pelanggan(rs.getString("email"));
                pelanggan.setTelpon_pelanggan(rs.getString("telpon"));
                pelanggan.setNomer_hp(rs.getString("hp"));
                pelanggan.setNomer_hp2(rs.getString("hp2"));
                pelanggan.setNomer_wa(rs.getString("wa"));
                pelanggan.setLine(rs.getString("line"));
                pelanggan.setInstagram(rs.getString("instagram"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PelangganDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pelanggan;
    }

    @Override
    public Pelanggan GetPelangganByKode(String kode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeletePelangganByID(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement("delete from pelanggan where id=?");
            ps.setInt(1, id);
            int status = ps.executeUpdate();
            if (status==0) {
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PelangganDaoImplemen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
