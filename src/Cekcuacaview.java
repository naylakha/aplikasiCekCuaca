/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */     import javax.swing.*;
        import javax.swing.table.DefaultTableModel;
        import java.awt.*;
        import java.awt.event.*;
        import java.io.*;
        import java.net.HttpURLConnection;
        import java.net.URL;
        import java.util.ArrayList;
import java.util.HashSet;
        import java.util.Scanner;
        
        

/**
 *
 * @author acer
 */
public class Cekcuacaview extends javax.swing.JFrame {
    DefaultTableModel modelTabel;
    HashSet<String> kotaFavorit; 
    
    public Cekcuacaview() {
        initComponents();
        
        modelTabel = new DefaultTableModel(new String[]{"Kota", "Deskripsi Cuaca", "Suhu (°C)"}, 0);
    tblCuaca.setModel(modelTabel);
    kotaFavorit = new HashSet<>();
    }
        



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKota = new javax.swing.JTextField();
        cmbKota = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuaca = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CEK CUACA");

        jLabel2.setText("Nama Kota");

        txtKota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKotaActionPerformed(evt);
            }
        });

        cmbKota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kota favorit", "Banjarmasin", "Banjarbaru", "Batulicin" }));
        cmbKota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKotaActionPerformed(evt);
            }
        });

        jButton1.setText("Cek Cuaca");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buka File");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tblCuaca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCuaca);

        jButton4.setText("Keluar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKota)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel1)
                                .addGap(0, 208, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(83, 83, 83)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbKota, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Fungsi untuk memanggil API OpenWeatherMap
    public String getWeatherData(String kota) {
        String apiKey = "60a7407df44dac1e9c8453a024890c93"; // Ganti dengan API key Anda
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + kota + "&appid=" + apiKey + "&units=metric";

        try {
            // Membuat koneksi ke API
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Membaca respon API
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString(); // Mengembalikan respon JSON
        } catch (Exception e) {
            return null; // Jika ada kesalahan
        }
    }
    // Fungsi untuk mem-parsing data JSON secara manual
    public String extractValue(String json, String key) {
        try {
            // Cari posisi key
            int startIndex = json.indexOf("\"" + key + "\":");
            if (startIndex == -1) return null;

            // Tentukan posisi awal nilai
            startIndex += key.length() + 3;

            // Jika nilai berupa string
            if (json.charAt(startIndex) == '"') {
                int endIndex = json.indexOf("\"", startIndex + 1);
                return json.substring(startIndex + 1, endIndex);
            }

            // Jika nilai berupa angka atau objek
            int endIndex = json.indexOf(",", startIndex);
            if (endIndex == -1) endIndex = json.indexOf("}", startIndex);
            return json.substring(startIndex, endIndex).trim();
        } catch (Exception e) {
            return null; // Jika parsing gagal
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String kota = txtKota.getText().trim(); // Ambil input nama kota
        if (kota.isEmpty()) {
            JOptionPane.showMessageDialog(this,  "Nama kota tidak boleh kosong!");
            return;
        }

        // Panggil API untuk mendapatkan data cuaca
        String response = getWeatherData(kota);
        if (response != null) {
            try {
                // Parsing data JSON
                String deskripsi = extractValue(response, "description"); // Ambil deskripsi cuaca
                String suhu = extractValue(response, "temp"); // Ambil suhu

                // Tambahkan data ke tabel
                modelTabel.addRow(new Object[]{kota, deskripsi, suhu + "°C"});
                // Tambahkan ke daftar favorit jika belum ada
                if (kotaFavorit.add(kota)) {
                    cmbKota.addItem(kota); // Tambahkan ke JComboBox
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Terjadi kesalahan dalam memproses data.");
            }
        } else {
            JOptionPane.showMessageDialog(this,"Gagal mendapatkan data cuaca. Periksa koneksi internet atau API key Anda.");
        }
  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    // Fungsi untuk menyimpan data ke CSV
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String filePath = "cuaca_data.csv"; // Nama file CSV
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Hapus data tabel saat ini sebelum memuat data baru
            modelTabel.setRowCount(0);

            // Lewati baris pertama (header)
            String line = reader.readLine();

            // Baca setiap baris data dan tambahkan ke tabel
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // Pisahkan kolom dengan koma
                modelTabel.addRow(data); // Tambahkan ke tabel
            }

            reader.close(); // Tutup file
            JOptionPane.showMessageDialog(this, "Data berhasil dimuat dari file " + filePath);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage());
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtKotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKotaActionPerformed
                     // TODO add your handling code here:
    }//GEN-LAST:event_txtKotaActionPerformed

    private void cmbKotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKotaActionPerformed
        String kota = (String) cmbKota.getSelectedItem();
        if (kota != null && !kota.isEmpty()) {
            txtKota.setText(kota);
            jButton1ActionPerformed(evt); // Panggil fungsi cek cuaca
        }               // TODO add your handling code here:
    }//GEN-LAST:event_cmbKotaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String filePath = "cuaca_data.csv"; // Nama file CSV
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

            // Menulis header
            writer.write("Kota,Deskripsi Cuaca,Suhu (°C)");
            writer.newLine();

            // Menulis data dari tabel
            for (int i = 0; i < modelTabel.getRowCount(); i++) {
                String kota = modelTabel.getValueAt(i, 0).toString();
                String deskripsi = modelTabel.getValueAt(i, 1).toString();
                String suhu = modelTabel.getValueAt(i, 2).toString();

                writer.write(kota + "," + deskripsi + "," + suhu);
                writer.newLine();
            }

            writer.close(); // Tutup file
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke file " + filePath);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data: " + e.getMessage());
        }
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Cekcuacaview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cekcuacaview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cekcuacaview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cekcuacaview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cekcuacaview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbKota;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCuaca;
    private javax.swing.JTextField txtKota;
    // End of variables declaration//GEN-END:variables
}