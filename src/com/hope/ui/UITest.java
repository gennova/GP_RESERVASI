/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hope.ui;

import com.hope.kamar.Kamar;
import com.init.tools.DaoFactory;
import java.awt.Color;
import java.util.List;
import javax.swing.UIManager;

/**
 *
 * @author laravel
 */
public class UITest extends javax.swing.JFrame {

    private final String[] kamar_A = {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11", "A12", "A13", "A14", "A15", "A16", "AP", "A17", "A18", "A19", "A20", "A21"};
    private final String[] kamar_T = {"T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "T12", "T13", "T14", "T15", "TP", "T16", "T17", "T18", "T19"};
    private final String[] kamar_B = {"B1", "B2", "B3", "B4", "B5", "BP", "B6", "B7", "B8", "B9", "B10"};

    /**
     * Creates new form UITest
     */
    public UITest() {
        initComponents();
        setLocationRelativeTo(null);
        initAppColor();
    }

    private void initAppColor() {
        List<Kamar> lists = DaoFactory.getKamarDao().GetAllKamar();
        for (int i = 0; i < lists.size(); i++) {
            if ("A1".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A1.setBackground(Color.red);
            } else if ("A1".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A1.setBackground(Color.green);
            } else if ("A2".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A2.setBackground(Color.red);
            } else if ("A2".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A2.setBackground(Color.green);
            } else if ("A3".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A3.setBackground(Color.red);
            } else if ("A3".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A3.setBackground(Color.green);
            } else if ("A".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A4.setBackground(Color.red);
            } else if ("A4".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A4.setBackground(Color.green);
            } else if ("A5".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A5.setBackground(Color.red);
            } else if ("A5".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A5.setBackground(Color.green);
            } else if ("A6".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A6.setBackground(Color.red);
            } else if ("A6".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A6.setBackground(Color.green);
            } else if ("A7".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A7.setBackground(Color.red);
            } else if ("A7".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A7.setBackground(Color.green);
            } else if ("A8".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A8.setBackground(Color.red);
            } else if ("A8".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A8.setBackground(Color.green);
            } else if ("A9".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A9.setBackground(Color.red);
            } else if ("A9".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A9.setBackground(Color.green);
            } else if ("A10".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A10.setBackground(Color.red);
            } else if ("A10".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A10.setBackground(Color.green);
            } else if ("A11".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A11.setBackground(Color.red);
            } else if ("A11".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A11.setBackground(Color.green);
            } else if ("A12".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A12.setBackground(Color.red);
            } else if ("A12".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A12.setBackground(Color.green);
            } else if ("A13".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A13.setBackground(Color.red);
            } else if ("A13".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A13.setBackground(Color.green);
            } else if ("A14".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A14.setBackground(Color.red);
            } else if ("A14".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A14.setBackground(Color.green);
            } else if ("A15".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A15.setBackground(Color.red);
            } else if ("A15".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A15.setBackground(Color.green);
            } else if ("A16".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A16.setBackground(Color.red);
            } else if ("A16".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A16.setBackground(Color.green);
            } else if ("AP".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                AP.setBackground(Color.red);
            } else if ("AP".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                AP.setBackground(Color.green);
            } else if ("A17".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A17.setBackground(Color.red);
            } else if ("A17".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A17.setBackground(Color.green);
            } else if ("A18".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A18.setBackground(Color.red);
            } else if ("A18".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A18.setBackground(Color.green);
            } else if ("A19".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A19.setBackground(Color.red);
            } else if ("A19".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A19.setBackground(Color.green);
            } else if ("A20".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A20.setBackground(Color.red);
            } else if ("A20".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A20.setBackground(Color.green);
            } else if ("A21".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                A21.setBackground(Color.red);
            } else if ("A21".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                A21.setBackground(Color.green);
            } else if ("T1".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T1.setBackground(Color.red);
            } else if ("T1".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T1.setBackground(Color.green);
            } else if ("T2".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T2.setBackground(Color.red);
            } else if ("T2".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T2.setBackground(Color.green);
            } else if ("T3".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T3.setBackground(Color.red);
            } else if ("T3".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T3.setBackground(Color.green);
            } else if ("T4".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T4.setBackground(Color.red);
            } else if ("T4".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T4.setBackground(Color.green);
            } else if ("T5".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T5.setBackground(Color.red);
            } else if ("T5".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T5.setBackground(Color.green);
            } else if ("T6".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T6.setBackground(Color.red);
            } else if ("T6".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T6.setBackground(Color.green);
            } else if ("T7".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T7.setBackground(Color.red);
            } else if ("T7".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T7.setBackground(Color.green);
            } else if ("T8".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T8.setBackground(Color.red);
            } else if ("T8".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T8.setBackground(Color.green);
            } else if ("T9".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T9.setBackground(Color.red);
            } else if ("T9".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T9.setBackground(Color.green);
            } else if ("T10".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T10.setBackground(Color.red);
            } else if ("T10".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T10.setBackground(Color.green);
            } else if ("T11".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T11.setBackground(Color.red);
            } else if ("T11".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T11.setBackground(Color.green);
            } else if ("T12".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T12.setBackground(Color.red);
            } else if ("T12".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T12.setBackground(Color.green);
            } else if ("T13".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T13.setBackground(Color.red);
            } else if ("T13".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T13.setBackground(Color.green);
            } else if ("T14".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T14.setBackground(Color.red);
            } else if ("T14".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T14.setBackground(Color.green);
            } else if ("T15".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T15.setBackground(Color.red);
            } else if ("T15".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T15.setBackground(Color.green);
            } else if ("TP".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                TP.setBackground(Color.red);
            } else if ("TP".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                TP.setBackground(Color.green);
            } else if ("T16".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T16.setBackground(Color.red);
            } else if ("T16".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T16.setBackground(Color.green);
            } else if ("T17".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T17.setBackground(Color.red);
            } else if ("T17".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T17.setBackground(Color.green);
            } else if ("T18".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T18.setBackground(Color.red);
            } else if ("T18".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T18.setBackground(Color.green);
            } else if ("T19".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                T19.setBackground(Color.red);
            } else if ("T19".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                T19.setBackground(Color.green);
            } else if ("B1".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                B1.setBackground(Color.red);
            } else if ("B1".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                B1.setBackground(Color.green);
            } else if ("B2".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                B2.setBackground(Color.red);
            } else if ("B2".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                B2.setBackground(Color.green);
            } else if ("B3".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                B3.setBackground(Color.red);
            } else if ("B3".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                B3.setBackground(Color.green);
            } else if ("B4".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                B4.setBackground(Color.red);
            } else if ("B4".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                B4.setBackground(Color.green);
            } else if ("B5".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                B5.setBackground(Color.red);
            } else if ("B5".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                B5.setBackground(Color.green);
            } else if ("BP".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                BP.setBackground(Color.red);
            } else if ("BP".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                BP.setBackground(Color.green);
            } else if ("B6".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                B6.setBackground(Color.red);
            } else if ("B6".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                B6.setBackground(Color.green);
            } else if ("B7".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                B7.setBackground(Color.red);
            } else if ("B7".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                B7.setBackground(Color.green);
            } else if ("B8".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                B8.setBackground(Color.red);
            } else if ("B8".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                B8.setBackground(Color.green);
            } else if ("B9".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                B9.setBackground(Color.red);
            } else if ("B9".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                B9.setBackground(Color.green);
            } else if ("B10".equals(lists.get(i).getId_kamar_str()) && "TERPAKAI".equals(lists.get(i).getStatus_pakai())) {
                B10.setBackground(Color.red);
            } else if ("B10".equals(lists.get(i).getId_kamar_str()) && "TERSEDIA".equals(lists.get(i).getStatus_pakai())) {
                B10.setBackground(Color.green);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        A1 = new javax.swing.JToggleButton();
        A2 = new javax.swing.JToggleButton();
        A3 = new javax.swing.JToggleButton();
        A4 = new javax.swing.JToggleButton();
        A5 = new javax.swing.JToggleButton();
        A6 = new javax.swing.JToggleButton();
        T1 = new javax.swing.JToggleButton();
        T2 = new javax.swing.JToggleButton();
        T3 = new javax.swing.JToggleButton();
        T4 = new javax.swing.JToggleButton();
        T5 = new javax.swing.JToggleButton();
        A7 = new javax.swing.JToggleButton();
        A8 = new javax.swing.JToggleButton();
        A9 = new javax.swing.JToggleButton();
        A10 = new javax.swing.JToggleButton();
        A11 = new javax.swing.JToggleButton();
        T6 = new javax.swing.JToggleButton();
        T7 = new javax.swing.JToggleButton();
        T8 = new javax.swing.JToggleButton();
        T9 = new javax.swing.JToggleButton();
        T10 = new javax.swing.JToggleButton();
        A12 = new javax.swing.JToggleButton();
        A13 = new javax.swing.JToggleButton();
        A14 = new javax.swing.JToggleButton();
        A15 = new javax.swing.JToggleButton();
        A16 = new javax.swing.JToggleButton();
        T15 = new javax.swing.JToggleButton();
        T14 = new javax.swing.JToggleButton();
        T13 = new javax.swing.JToggleButton();
        T12 = new javax.swing.JToggleButton();
        T11 = new javax.swing.JToggleButton();
        B1 = new javax.swing.JToggleButton();
        B2 = new javax.swing.JToggleButton();
        B3 = new javax.swing.JToggleButton();
        B4 = new javax.swing.JToggleButton();
        B5 = new javax.swing.JToggleButton();
        BP = new javax.swing.JToggleButton();
        TP = new javax.swing.JToggleButton();
        AP = new javax.swing.JToggleButton();
        B10 = new javax.swing.JToggleButton();
        T19 = new javax.swing.JToggleButton();
        A21 = new javax.swing.JToggleButton();
        A20 = new javax.swing.JToggleButton();
        T18 = new javax.swing.JToggleButton();
        B9 = new javax.swing.JToggleButton();
        B8 = new javax.swing.JToggleButton();
        T17 = new javax.swing.JToggleButton();
        A19 = new javax.swing.JToggleButton();
        A18 = new javax.swing.JToggleButton();
        T16 = new javax.swing.JToggleButton();
        B7 = new javax.swing.JToggleButton();
        B6 = new javax.swing.JToggleButton();
        A17 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 153, 0));
        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KETERSEDIAAN KAMAR");
        jLabel1.setOpaque(true);

        A1.setBackground(new java.awt.Color(0, 255, 51));
        A1.setText("A 1");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A2.setBackground(new java.awt.Color(0, 255, 51));
        A2.setText("A 2");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        A3.setBackground(new java.awt.Color(0, 255, 51));
        A3.setText("A 3");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        A4.setBackground(new java.awt.Color(0, 255, 51));
        A4.setText("A 4");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        A5.setBackground(new java.awt.Color(0, 255, 51));
        A5.setText("A 5");
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        A6.setBackground(new java.awt.Color(0, 255, 51));
        A6.setText("A 6");
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        T1.setBackground(new java.awt.Color(0, 255, 51));
        T1.setText("T 1");
        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });

        T2.setBackground(new java.awt.Color(0, 255, 51));
        T2.setText("T 2");
        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });

        T3.setBackground(new java.awt.Color(0, 255, 51));
        T3.setText("T 3");
        T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T3ActionPerformed(evt);
            }
        });

        T4.setBackground(new java.awt.Color(0, 255, 51));
        T4.setText("T 4");
        T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T4ActionPerformed(evt);
            }
        });

        T5.setBackground(new java.awt.Color(0, 255, 51));
        T5.setText("T 5");
        T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T5ActionPerformed(evt);
            }
        });

        A7.setBackground(new java.awt.Color(0, 255, 51));
        A7.setText("A 7");
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });

        A8.setBackground(new java.awt.Color(0, 255, 51));
        A8.setText("A 8");
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });

        A9.setBackground(new java.awt.Color(0, 255, 51));
        A9.setText("A 9");
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });

        A10.setBackground(new java.awt.Color(0, 255, 51));
        A10.setText("A 10");
        A10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A10ActionPerformed(evt);
            }
        });

        A11.setBackground(new java.awt.Color(0, 255, 51));
        A11.setText("A 11");
        A11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A11ActionPerformed(evt);
            }
        });

        T6.setBackground(new java.awt.Color(0, 255, 51));
        T6.setText("T 6");
        T6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T6ActionPerformed(evt);
            }
        });

        T7.setBackground(new java.awt.Color(0, 255, 51));
        T7.setText("T 7");
        T7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T7ActionPerformed(evt);
            }
        });

        T8.setBackground(new java.awt.Color(0, 255, 51));
        T8.setText("T 8");
        T8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T8ActionPerformed(evt);
            }
        });

        T9.setBackground(new java.awt.Color(0, 255, 51));
        T9.setText("T 9");
        T9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T9ActionPerformed(evt);
            }
        });

        T10.setBackground(new java.awt.Color(0, 255, 51));
        T10.setText("T 10");
        T10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T10ActionPerformed(evt);
            }
        });

        A12.setBackground(new java.awt.Color(0, 255, 51));
        A12.setText("A 12");
        A12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A12ActionPerformed(evt);
            }
        });

        A13.setBackground(new java.awt.Color(0, 255, 51));
        A13.setText("A 13");
        A13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A13ActionPerformed(evt);
            }
        });

        A14.setBackground(new java.awt.Color(0, 255, 51));
        A14.setText("A 14");
        A14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A14ActionPerformed(evt);
            }
        });

        A15.setBackground(new java.awt.Color(0, 255, 51));
        A15.setText("A 15");
        A15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A15ActionPerformed(evt);
            }
        });

        A16.setBackground(new java.awt.Color(0, 255, 51));
        A16.setText("A 16");
        A16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A16ActionPerformed(evt);
            }
        });

        T15.setBackground(new java.awt.Color(0, 255, 51));
        T15.setText("T 15");
        T15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T15ActionPerformed(evt);
            }
        });

        T14.setBackground(new java.awt.Color(0, 255, 51));
        T14.setText("T 14");
        T14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T14ActionPerformed(evt);
            }
        });

        T13.setBackground(new java.awt.Color(0, 255, 51));
        T13.setText("T 13");
        T13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T13ActionPerformed(evt);
            }
        });

        T12.setBackground(new java.awt.Color(0, 255, 51));
        T12.setText("T 12");
        T12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T12ActionPerformed(evt);
            }
        });

        T11.setBackground(new java.awt.Color(0, 255, 51));
        T11.setText("T 11");
        T11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T11ActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(0, 255, 51));
        B1.setText("B 1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(0, 255, 51));
        B2.setText("B 2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(0, 255, 51));
        B3.setText("B 3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(0, 255, 51));
        B4.setText("B 4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(0, 255, 51));
        B5.setText("B 5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        BP.setBackground(new java.awt.Color(0, 255, 51));
        BP.setText("B P");
        BP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPActionPerformed(evt);
            }
        });

        TP.setBackground(new java.awt.Color(0, 255, 51));
        TP.setText("T P");
        TP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPActionPerformed(evt);
            }
        });

        AP.setBackground(new java.awt.Color(0, 255, 51));
        AP.setText("A P");
        AP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APActionPerformed(evt);
            }
        });

        B10.setBackground(new java.awt.Color(0, 255, 51));
        B10.setText("B 10");
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });

        T19.setBackground(new java.awt.Color(0, 255, 51));
        T19.setText("T 19");
        T19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T19ActionPerformed(evt);
            }
        });

        A21.setBackground(new java.awt.Color(0, 255, 51));
        A21.setText("A 21");
        A21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A21ActionPerformed(evt);
            }
        });

        A20.setBackground(new java.awt.Color(0, 255, 51));
        A20.setText("A 20");
        A20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A20ActionPerformed(evt);
            }
        });

        T18.setBackground(new java.awt.Color(0, 255, 51));
        T18.setText("T 18");
        T18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T18ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(0, 255, 51));
        B9.setText("B 9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(0, 255, 51));
        B8.setText("B 8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        T17.setBackground(new java.awt.Color(0, 255, 51));
        T17.setText("T 17");
        T17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T17ActionPerformed(evt);
            }
        });

        A19.setBackground(new java.awt.Color(0, 255, 51));
        A19.setText("A 19");
        A19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A19ActionPerformed(evt);
            }
        });

        A18.setBackground(new java.awt.Color(0, 255, 51));
        A18.setText("A 18");
        A18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A18ActionPerformed(evt);
            }
        });

        T16.setBackground(new java.awt.Color(0, 255, 51));
        T16.setText("T 16");
        T16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T16ActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(0, 255, 51));
        B7.setText("B 7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(0, 255, 51));
        B6.setText("B 6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        A17.setBackground(new java.awt.Color(0, 255, 51));
        A17.setText("A 17");
        A17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A17ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 51));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TERSEDIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TERISI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BOOKING");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(A12)
                            .addComponent(A13)
                            .addComponent(A14)
                            .addComponent(A15)
                            .addComponent(A16)
                            .addComponent(AP, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(T14)
                                    .addComponent(T13)
                                    .addComponent(T12)
                                    .addComponent(T11)
                                    .addComponent(TP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B1)
                                    .addComponent(B2)
                                    .addComponent(B3)
                                    .addComponent(B4)
                                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(T10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(T9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(T8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(T7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(T6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A7))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(A21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A20)
                                    .addComponent(A19)
                                    .addComponent(A18)
                                    .addComponent(A17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(T19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(T17)
                                        .addComponent(T16))
                                    .addComponent(T18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B8)
                                    .addComponent(B7)
                                    .addComponent(B6))))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(T1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(T3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(T4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(T5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A6)
                            .addComponent(A5)
                            .addComponent(A4)
                            .addComponent(A3)
                            .addComponent(A2)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {A1, A10, A11, A2, A3, A4, A5, A6, A7, A8, A9, T1, T10, T2, T3, T4, T5, T6, T7, T8, T9});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {A12, A13, A14, A15, A16, T11, T12, T13, T14, T15});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {B1, B2, B3, B4, B5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {A17, A18, A19, A20, A21, B10, B6, B7, B8, B9, T16, T17, T18, T19});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T11)
                            .addComponent(A12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T12)
                            .addComponent(A13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T13)
                            .addComponent(A14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T14)
                            .addComponent(A15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A16)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A5)
                            .addComponent(T5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A4)
                            .addComponent(T4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A3)
                            .addComponent(T3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A2)
                            .addComponent(T2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(A7)
                                    .addComponent(A8)
                                    .addComponent(A9)
                                    .addComponent(A10)
                                    .addComponent(A11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(T6)
                                    .addComponent(T7)
                                    .addComponent(T8)
                                    .addComponent(T9)
                                    .addComponent(T10))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TP, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AP, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(T16)
                                    .addComponent(A18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(T17)
                                    .addComponent(A19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(T18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(T19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(A21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {A1, A10, A11, A2, A3, A4, A5, A6, A7, A8, A9, T1, T10, T2, T3, T4, T5, T6, T7, T8, T9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {A12, A13, A14, A15, A16, T11, T12, T13, T14, T15});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {B1, B2, B3, B4, B5});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {A17, A18, A19, A20, A21, B10, B6, B7, B8, B9, T16, T17, T18, T19});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T12ActionPerformed
        // TODO add your handling code here:
        if (T12.isSelected()) {
            T12.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T12");
        } else {
            T12.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T12");
        }
    }//GEN-LAST:event_T12ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
        if (A1.isSelected()) {
            A1.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A1");
        } else {
            A1.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A1");
        }
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
        if (A2.isSelected()) {
            A2.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A2");
        } else {
            A2.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A2");
        }
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
        if (A3.isSelected()) {
            A3.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A3");
        } else {
            A3.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A3");
        }
    }//GEN-LAST:event_A3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        // TODO add your handling code here:
        if (A4.isSelected()) {
            A4.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A4");
        } else {
            A4.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A4");
        }
    }//GEN-LAST:event_A4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        // TODO add your handling code here:
        if (A5.isSelected()) {
            A5.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A5");
        } else {
            A5.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A5");
        }
    }//GEN-LAST:event_A5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        // TODO add your handling code here:
        if (A6.isSelected()) {
            A6.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A6");
        } else {
            A6.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A6");
        }
    }//GEN-LAST:event_A6ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        // TODO add your handling code here:
        if (A7.isSelected()) {
            A7.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A7");
        } else {
            A7.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A7");
        }
    }//GEN-LAST:event_A7ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        // TODO add your handling code here:
        if (A8.isSelected()) {
            A8.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A8");
        } else {
            A8.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A8");
        }
    }//GEN-LAST:event_A8ActionPerformed

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
        // TODO add your handling code here:
        if (A9.isSelected()) {
            A9.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A9");
        } else {
            A9.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A9");
        }
    }//GEN-LAST:event_A9ActionPerformed

    private void A10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A10ActionPerformed
        // TODO add your handling code here:
        if (A10.isSelected()) {
            A10.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A10");
        } else {
            A10.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A10");
        }
    }//GEN-LAST:event_A10ActionPerformed

    private void A11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A11ActionPerformed
        // TODO add your handling code here:
        if (A11.isSelected()) {
            A11.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A11");
        } else {
            A11.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A11");
        }
    }//GEN-LAST:event_A11ActionPerformed

    private void A12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A12ActionPerformed
        // TODO add your handling code here:
        if (A12.isSelected()) {
            A12.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A12");
        } else {
            A12.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A12");
        }
    }//GEN-LAST:event_A12ActionPerformed

    private void A13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A13ActionPerformed
        // TODO add your handling code here:
        if (A13.isSelected()) {
            A13.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A13");
        } else {
            A13.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A13");
        }
    }//GEN-LAST:event_A13ActionPerformed

    private void A14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A14ActionPerformed
        // TODO add your handling code here:
        if (A14.isSelected()) {
            A14.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A14");
        } else {
            A14.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A14");
        }
    }//GEN-LAST:event_A14ActionPerformed

    private void A15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A15ActionPerformed
        // TODO add your handling code here:
        if (A15.isSelected()) {
            A15.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A15");
        } else {
            A15.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A15");
        }
    }//GEN-LAST:event_A15ActionPerformed

    private void A16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A16ActionPerformed
        // TODO add your handling code here:
        if (A16.isSelected()) {
            A16.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A16");
        } else {
            A16.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A16");
        }
    }//GEN-LAST:event_A16ActionPerformed

    private void APActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APActionPerformed
        // TODO add your handling code here:
        if (AP.isSelected()) {
            AP.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "AP");
        } else {
            AP.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "AP");
        }
    }//GEN-LAST:event_APActionPerformed

    private void A17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A17ActionPerformed
        // TODO add your handling code here:
        if (A17.isSelected()) {
            A17.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A17");
        } else {
            A17.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A17");
        }
    }//GEN-LAST:event_A17ActionPerformed

    private void A18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A18ActionPerformed
        // TODO add your handling code here:
        if (A18.isSelected()) {
            A18.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A18");
        } else {
            A18.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A18");
        }
    }//GEN-LAST:event_A18ActionPerformed

    private void A19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A19ActionPerformed
        // TODO add your handling code here:
        if (A19.isSelected()) {
            A19.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A19");
        } else {
            A19.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A19");
        }
    }//GEN-LAST:event_A19ActionPerformed

    private void A20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A20ActionPerformed
        // TODO add your handling code here:
        if (A20.isSelected()) {
            A20.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A20");
        } else {
            A20.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A20");
        }
    }//GEN-LAST:event_A20ActionPerformed

    private void A21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A21ActionPerformed
        // TODO add your handling code here:
        if (A21.isSelected()) {
            A21.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "A21");
        } else {
            A21.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "A21");
        }
    }//GEN-LAST:event_A21ActionPerformed

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        // TODO add your handling code here:
        if (T1.isSelected()) {
            T1.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T1");
        } else {
            T1.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T1");
        }
    }//GEN-LAST:event_T1ActionPerformed

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        // TODO add your handling code here:
        if (T2.isSelected()) {
            T2.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T2");
        } else {
            T2.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T2");
        }
    }//GEN-LAST:event_T2ActionPerformed

    private void T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T3ActionPerformed
        // TODO add your handling code here:
        if (T3.isSelected()) {
            T3.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T3");
        } else {
            T3.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T2");
        }
    }//GEN-LAST:event_T3ActionPerformed

    private void T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T4ActionPerformed
        // TODO add your handling code here:
        if (T4.isSelected()) {
            T4.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T4");
        } else {
            T4.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T4");
        }
    }//GEN-LAST:event_T4ActionPerformed

    private void T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T5ActionPerformed
        // TODO add your handling code here:
        if (T5.isSelected()) {
            T5.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T5");
        } else {
            T5.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T5");
        }
    }//GEN-LAST:event_T5ActionPerformed

    private void T6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T6ActionPerformed
        // TODO add your handling code here:
        if (T6.isSelected()) {
            T6.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T6");
        } else {
            T6.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T6");
        }
    }//GEN-LAST:event_T6ActionPerformed

    private void T7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T7ActionPerformed
        // TODO add your handling code here:
        if (T7.isSelected()) {
            T7.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T7");
        } else {
            T7.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T7");
        }
    }//GEN-LAST:event_T7ActionPerformed

    private void T8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T8ActionPerformed
        // TODO add your handling code here:
        if (T8.isSelected()) {
            T8.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T8");
        } else {
            T8.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T8");
        }
    }//GEN-LAST:event_T8ActionPerformed

    private void T9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T9ActionPerformed
        // TODO add your handling code here:
        if (T9.isSelected()) {
            T9.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T9");
        } else {
            T9.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T9");
        }
    }//GEN-LAST:event_T9ActionPerformed

    private void T10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T10ActionPerformed
        // TODO add your handling code here:
        if (T10.isSelected()) {
            T10.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T10");
        } else {
            T10.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T10");
        }
    }//GEN-LAST:event_T10ActionPerformed

    private void T11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T11ActionPerformed
        // TODO add your handling code here:
        if (T11.isSelected()) {
            T11.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T11");
        } else {
            T11.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T11");
        }
    }//GEN-LAST:event_T11ActionPerformed

    private void T13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T13ActionPerformed
        // TODO add your handling code here:
        if (T13.isSelected()) {
            T13.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T13");
        } else {
            T13.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T13");
        }
    }//GEN-LAST:event_T13ActionPerformed

    private void T14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T14ActionPerformed
        // TODO add your handling code here:
        if (T14.isSelected()) {
            T14.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T14");
        } else {
            T14.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T14");
        }
    }//GEN-LAST:event_T14ActionPerformed

    private void T15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T15ActionPerformed
        // TODO add your handling code here:
        if (T15.isSelected()) {
            T15.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T15");
        } else {
            T15.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T15");
        }
    }//GEN-LAST:event_T15ActionPerformed

    private void TPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPActionPerformed
        // TODO add your handling code here:
        if (TP.isSelected()) {
            TP.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "TP");
        } else {
            TP.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "TP");
        }
    }//GEN-LAST:event_TPActionPerformed

    private void T16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T16ActionPerformed
        // TODO add your handling code here:
        if (T16.isSelected()) {
            T16.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T16");
        } else {
            T16.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T16");
        }
    }//GEN-LAST:event_T16ActionPerformed

    private void T17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T17ActionPerformed
        // TODO add your handling code here:
        if (T17.isSelected()) {
            T17.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T17");
        } else {
            T17.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T17");
        }
    }//GEN-LAST:event_T17ActionPerformed

    private void T18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T18ActionPerformed
        // TODO add your handling code here:
        if (T18.isSelected()) {
            T18.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T18");
        } else {
            T18.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T18");
        }
    }//GEN-LAST:event_T18ActionPerformed

    private void T19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T19ActionPerformed
        // TODO add your handling code here:
        if (T19.isSelected()) {
            T19.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "T19");
        } else {
            T19.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "T19");
        }
    }//GEN-LAST:event_T19ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        if (B1.isSelected()) {
            B1.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "B1");
        } else {
            B1.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "B1");
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        if (B2.isSelected()) {
            B2.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "B2");
        } else {
            B2.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "B2");
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        if (B3.isSelected()) {
            B3.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "B3");
        } else {
            B3.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "B3");
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
        if (B4.isSelected()) {
            B4.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "B4");
        } else {
            B4.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "B4");
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
        if (B5.isSelected()) {
            B5.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "B5");
        } else {
            B5.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "B5");
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void BPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPActionPerformed
        // TODO add your handling code here:
        if (BP.isSelected()) {
            BP.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "BP");
        } else {
            BP.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "BP");
        }
    }//GEN-LAST:event_BPActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
        if (B6.isSelected()) {
            B6.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "B6");
        } else {
            B6.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "B6");
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
        if (B7.isSelected()) {
            B7.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "B7");
        } else {
            B7.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "B7");
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
        if (B8.isSelected()) {
            B8.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "B8");
        } else {
            B8.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "B8");
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
        if (B9.isSelected()) {
            B9.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "B9");
        } else {
            B9.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "B9");
        }
    }//GEN-LAST:event_B9ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
        // TODO add your handling code here:
        if (B10.isSelected()) {
            B10.setBackground(Color.red);
            DaoFactory.getKamarDao().Update_status_kamar("TERPAKAI", "B10");
        } else {
            B10.setBackground(Color.GREEN);
            DaoFactory.getKamarDao().Update_status_kamar("TERSEDIA", "B10");
        }
    }//GEN-LAST:event_B10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        initAppColor();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UITest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UITest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UITest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UITest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UITest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton A1;
    private javax.swing.JToggleButton A10;
    private javax.swing.JToggleButton A11;
    private javax.swing.JToggleButton A12;
    private javax.swing.JToggleButton A13;
    private javax.swing.JToggleButton A14;
    private javax.swing.JToggleButton A15;
    private javax.swing.JToggleButton A16;
    private javax.swing.JToggleButton A17;
    private javax.swing.JToggleButton A18;
    private javax.swing.JToggleButton A19;
    private javax.swing.JToggleButton A2;
    private javax.swing.JToggleButton A20;
    private javax.swing.JToggleButton A21;
    private javax.swing.JToggleButton A3;
    private javax.swing.JToggleButton A4;
    private javax.swing.JToggleButton A5;
    private javax.swing.JToggleButton A6;
    private javax.swing.JToggleButton A7;
    private javax.swing.JToggleButton A8;
    private javax.swing.JToggleButton A9;
    private javax.swing.JToggleButton AP;
    private javax.swing.JToggleButton B1;
    private javax.swing.JToggleButton B10;
    private javax.swing.JToggleButton B2;
    private javax.swing.JToggleButton B3;
    private javax.swing.JToggleButton B4;
    private javax.swing.JToggleButton B5;
    private javax.swing.JToggleButton B6;
    private javax.swing.JToggleButton B7;
    private javax.swing.JToggleButton B8;
    private javax.swing.JToggleButton B9;
    private javax.swing.JToggleButton BP;
    private javax.swing.JToggleButton T1;
    private javax.swing.JToggleButton T10;
    private javax.swing.JToggleButton T11;
    private javax.swing.JToggleButton T12;
    private javax.swing.JToggleButton T13;
    private javax.swing.JToggleButton T14;
    private javax.swing.JToggleButton T15;
    private javax.swing.JToggleButton T16;
    private javax.swing.JToggleButton T17;
    private javax.swing.JToggleButton T18;
    private javax.swing.JToggleButton T19;
    private javax.swing.JToggleButton T2;
    private javax.swing.JToggleButton T3;
    private javax.swing.JToggleButton T4;
    private javax.swing.JToggleButton T5;
    private javax.swing.JToggleButton T6;
    private javax.swing.JToggleButton T7;
    private javax.swing.JToggleButton T8;
    private javax.swing.JToggleButton T9;
    private javax.swing.JToggleButton TP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
