/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.init.tools;

import com.hope.kamar.KamarDao;
import com.hope.kamar.KamarDaoImplemen;
import com.hope.kategori.KategoriKamarDao;
import com.hope.kategori.KategoriKamarDaoImplemen;
import com.hope.pelanggan.PelangganDao;
import com.hope.pelanggan.PelangganDaoImplemen;
import com.hope.transaksi.DetailTransaksiDao;
import com.hope.transaksi.DetailTransaksiDaoImplemen;
import com.hope.transaksi.TransaksiDao;
import com.hope.transaksi.TransaksiDaoImplemen;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.regexp.joni.Config;

/**
 *
 * @author Tendy Developer
 */
public class DaoFactory {

    private static Connection connection = null;
    private static final String url = "jdbc:mysql://";
    static String user = "";
    static String password = "";
    private static Statement st = null;
    private static PelangganDao pelangganDao;
    private static KategoriKamarDao kategori_kamarDao;
    private static KamarDao kamarDao;
    private static TransaksiDao transaksiDao;
    private static DetailTransaksiDao detailTransaksiDao;

    public static KamarDao getKamarDao() {
        if (kamarDao == null) {
            kamarDao = new KamarDaoImplemen(getConnectionFix());
        }
        return kamarDao;
    }

    public static TransaksiDao getTransaksiDao() {
        if (transaksiDao == null) {
            transaksiDao = new TransaksiDaoImplemen(getConnectionFix());
        }
        return transaksiDao;
    }

    public static DetailTransaksiDao getDetailTransaksiDao() {
        if (detailTransaksiDao == null) {
            detailTransaksiDao = new DetailTransaksiDaoImplemen(getConnectionFix());
        }
        return detailTransaksiDao;
    }

    public static KategoriKamarDao getKategoriKamarDao() {
        if (kategori_kamarDao == null) {
            kategori_kamarDao = new KategoriKamarDaoImplemen(getConnectionFix());
        }
        return kategori_kamarDao;
    }

    public static PelangganDao getPelangganDao() {
        if (pelangganDao == null) {
            pelangganDao = new PelangganDaoImplemen(getConnectionFix());
        }
        return pelangganDao;
    }

    public static Connection getConnectionFix() {
        if (connection == null) {
            Koneksi k = new Koneksi();
            connection = k.getKoneksi();
        }
        return connection;
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Terdapat Kesalahan Kesalahan : \n" + ex.getMessage());
            }
            FileInputStream in = null;
            try {
                String urlFile = "";
                String urlCOmplete = "";
                in = new FileInputStream("resource.xml");
                Properties p = new Properties();
                p.loadFromXML(in);
                urlFile = p.getProperty("host") + ":" + p.getProperty("PORT") + "/" + p.getProperty("DBNAME");
                urlCOmplete = url + urlFile;
                System.out.println(urlCOmplete);
                user = p.getProperty("USERNAME");
                password = p.getProperty("PASSWORD");
                connection = DriverManager.getConnection(urlCOmplete, user, password);
//                System.out.println("Koneksi OK");
                st = connection.createStatement();
//                System.out.println(urlCOmplete);
            } catch (IOException ex) {
                Logger.getLogger(DaoFactory.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Terdapat Kesalahan Kesalahan : \n" + ex.getMessage() + "\n" + ex.getSQLState());
            } finally {
                try {
                    in.close();
                } catch (IOException ex) {
                    Logger.getLogger(DaoFactory.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Terdapat Kesalahan Kesalahan : \n" + ex.getMessage());
                }
            }
        }
        return connection;
    }

    public static String FormatTanggalIndonesia(String formatsql) {
        String tanggal = formatsql;
        String removestrip = tanggal.replace("-", "");
        String tahun = removestrip.substring(0, 4);
        String bulan = removestrip.substring(4, 6);
        String bulanindo = "";
        String hari = removestrip.substring(6, 8);
        if (bulan.equalsIgnoreCase("01")) {
            bulanindo = "Januari";
        } else if (bulan.equalsIgnoreCase("02")) {
            bulanindo = "Februari";
        } else if (bulan.equalsIgnoreCase("03")) {
            bulanindo = "Maret";
        } else if (bulan.equalsIgnoreCase("04")) {
            bulanindo = "April";
        } else if (bulan.equalsIgnoreCase("05")) {
            bulanindo = "Mei";
        } else if (bulan.equalsIgnoreCase("06")) {
            bulanindo = "Juni";
        } else if (bulan.equalsIgnoreCase("07")) {
            bulanindo = "Juli";
        } else if (bulan.equalsIgnoreCase("08")) {
            bulanindo = "Agustus";
        } else if (bulan.equalsIgnoreCase("09")) {
            bulanindo = "September";
        } else if (bulan.equalsIgnoreCase("10")) {
            bulanindo = "Oktober";
        } else if (bulan.equalsIgnoreCase("11")) {
            bulanindo = "November";
        } else if (bulan.equalsIgnoreCase("12")) {
            bulanindo = "Desember";
        }
        String formatindofix = hari + " " + bulanindo + " " + tahun;
        return formatindofix;
    }

    public static String getFormatRupiahIndonesiaInt(int harga) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        kursIndonesia.applyPattern("#,#00");
        return kursIndonesia.format(harga);
    }

    public static String getFormatRupiahIndonesiaDouble(double harga) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        return kursIndonesia.format(harga);
    }

    public static int ConvertDoubleToInt(Double value) {
        double a = value;
        int data = (int) a;
        return data;
    }

    public static String[] getUlangTahunByDateMonth(String date) {
        String data[] = new String[3];
        String tanggal = date.substring(8);
        String bulan = date.substring(5, 7);
        String tahun = date.substring(0, 4);
        data[0] = tanggal;
        data[1] = bulan;
        data[2] = tahun;
        return data;
    }

    public static boolean statusUlangTahunByDate(String tanggallahir, String tanggalsekarang) {
        boolean status = false;
        String tgl_lahir[] = DaoFactory.getUlangTahunByDateMonth(tanggallahir);
        String tgl_sekarang[] = DaoFactory.getUlangTahunByDateMonth(tanggalsekarang);
        if (tgl_lahir[0].equalsIgnoreCase(tgl_sekarang[0]) && tgl_lahir[1].equalsIgnoreCase(tgl_sekarang[1])) {
            status = true;
        }
        return status;
    }

    public static String getIDUrutPelanggan() {
        String kode = "";
        String formatlalu = "";
        String formatlalutanggal = null;
        String formatsekarang = null;
        PreparedStatement prep = null;
        ResultSet rs = null;
        PreparedStatement prep2 = null;
        Calendar c = Calendar.getInstance();
        Format formatter = new SimpleDateFormat("ddMMyy");
        String stringdate = formatter.format(c.getTime());
        try {
            prep2 = getConnectionFix().prepareStatement(("SELECT nourutpelanggan as kode FROM urutpelanggan ORDER BY id DESC LIMIT 1"));
            rs = prep2.executeQuery();
            while (rs.next()) {
                formatlalu = rs.getString("kode");
            }
            formatsekarang = "GP" + stringdate;
            if ("".equals(formatlalu)) {
                formatlalu = "GP" + stringdate + "0001";
                kode = formatlalu;
            }
            formatlalutanggal = formatlalu.substring(0, 8);
            System.out.println("Lalu " + formatlalu);
            System.out.println("Lalu Ringkas " + formatlalutanggal);
            System.out.println("Skrng " + formatsekarang);
            //JOptionPane.showMessageDialog(null, formatlalu);
            prep = getConnectionFix().prepareStatement(("SELECT RIGHT(nourutpelanggan,4) AS kode FROM urutpelanggan ORDER BY id DESC LIMIT 1"));
            rs = prep.executeQuery();
            while (rs.next()) {
                if (rs.first() == false) {
                    kode = "GP" + stringdate + "0001";
                } else {
                    rs.last();
                    if (formatlalutanggal.equalsIgnoreCase(formatsekarang)) {
                        int autoid = rs.getInt(1) + 1;
                        String nomor = String.valueOf(autoid);
                        int nolong = nomor.length();
                        for (int i = 0; i < 4 - nolong; i++) {
                            nomor = "0" + nomor;
                        }
                        kode = "GP" + stringdate + nomor;
                    } else {
                        kode = "GP" + stringdate + "0001";
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kode;
    }

    public static String getIDUrutTransaksi() {
        String kode = "";
        String formatlalu = "";
        String formatlalutanggal = null;
        String formatsekarang = null;
        PreparedStatement prep = null;
        ResultSet rs = null;
        PreparedStatement prep2 = null;
        Calendar c = Calendar.getInstance();
        Format formatter = new SimpleDateFormat("ddMMyy");
        String stringdate = formatter.format(c.getTime());
        try {
            prep2 = getConnectionFix().prepareStatement(("SELECT kodetransaksi as kode FROM uruttransaksi ORDER BY id DESC LIMIT 1"));
            rs = prep2.executeQuery();
            while (rs.next()) {
                formatlalu = rs.getString("kode");
            }
            formatsekarang = "PO" + stringdate;
            if ("".equals(formatlalu)) {
                formatlalu = "PO" + stringdate + "0001";
                kode = formatlalu;
            }
            formatlalutanggal = formatlalu.substring(0, 8);
            System.out.println("Lalu " + formatlalu);
            System.out.println("Lalu Ringkas " + formatlalutanggal);
            System.out.println("Skrng " + formatsekarang);
            //JOptionPane.showMessageDialog(null, formatlalu);
            prep = getConnectionFix().prepareStatement(("SELECT RIGHT(kodetransaksi,4) AS kode FROM uruttransaksi ORDER BY id DESC LIMIT 1"));
            rs = prep.executeQuery();
            while (rs.next()) {
                if (rs.first() == false) {
                    kode = "PO" + stringdate + "0001";
                } else {
                    rs.last();
                    if (formatlalutanggal.equalsIgnoreCase(formatsekarang)) {
                        int autoid = rs.getInt(1) + 1;
                        String nomor = String.valueOf(autoid);
                        int nolong = nomor.length();
                        for (int i = 0; i < 4 - nolong; i++) {
                            nomor = "0" + nomor;
                        }
                        kode = "PO" + stringdate + nomor;
                    } else {
                        kode = "PO" + stringdate + "0001";
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kode;
    }

    public static void insertUrutTransaksi(String kodetrans) throws SQLException {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("insert into uruttransaksi(kodetransaksi) values(?)");
            statement.setString(1, kodetrans);
            statement.executeUpdate();
        } catch (Exception e) {
            e.getMessage();
        }

    }
}
