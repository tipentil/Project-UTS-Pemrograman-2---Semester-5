/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjectUTS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @By Steven Fredrico
 */
public class TableMahasiswa extends javax.swing.JFrame {
    private DefaultTableModel mod;
    Object[] data = new Object[4];
    
    /**
     * Creates new form LatihanTabel
     */
    public TableMahasiswa() {
        initComponents();
        mod = (DefaultTableModel) tableMahasiswa.getModel();
        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInput = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMahasiswa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfnim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfnama = new javax.swing.JTextField();
        tfprodi = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        tfkelas = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Steven Fredrico - Mahasiswa");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Image/LogoUNPAM.png")).getImage());
        setResizable(false);

        PanelInput.setBackground(new java.awt.Color(204, 204, 255));

        tableMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Kelas", "Prodi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMahasiswa.setToolTipText("");
        tableMahasiswa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableMahasiswa.setGridColor(new java.awt.Color(51, 255, 0));
        tableMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMahasiswa);

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Kelas");

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FORM TABLE MAHASISWA");

        jLabel4.setText("Prodi");

        btnTambah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnCari.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCari.setText("CARI");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelInputLayout = new javax.swing.GroupLayout(PanelInput);
        PanelInput.setLayout(PanelInputLayout);
        PanelInputLayout.setHorizontalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(39, 39, 39)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfprodi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfnim, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInputLayout.createSequentialGroup()
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelInputLayout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        PanelInputLayout.setVerticalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah)
                            .addComponent(btnEdit))
                        .addGap(28, 28, 28)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHapus)
                            .addComponent(btnCari))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        String nim = tfnim.getText();
        String nama = tfnama.getText();
        String kelas = tfkelas.getText();
        String prodi = tfprodi.getText();
        // Validasi input
        if (nim.isEmpty() || nama.isEmpty() || kelas.isEmpty() || prodi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi.");
            return; // Keluar dari metode jika ada input yang kosong
        }
        
        String sql = "INSERT INTO mhs VALUES('"+nim+"','"+nama+"','"+kelas+"','"+prodi+"')";
        
        int rowsAffected = runSQL(sql);
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan.");
            loadTable();
            tfnim.setText("");
            tfnama.setText("");
            tfkelas.setText("");
            tfprodi.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan.");
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        String nim = tfnim.getText();
        String nama = tfnama.getText();
        String kelas = tfkelas.getText();
        String prodi = tfprodi.getText();
        int konf = JOptionPane.showConfirmDialog(this, "Yakin Merubah data " + tfnama.getText() + " ?", "Komfirmasi Edit",
          JOptionPane.YES_NO_OPTION);
        
        if (konf==0) {
            runSQL("UPDATE mhs SET nama ='"+nama+"'," + "kelas='"+kelas+"'," + "prodi='"+prodi+"' WHERE nim='"+nim+"' ");
            loadTable();
            kosong();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        // Ambil data yang dipilih dari tabel (misalnya, menggunakan baris terpilih)
        int konf = JOptionPane.showConfirmDialog(this, "Yakin Menhapus data " + tfnama.getText() + " ?", "Komfirmasi Hapus",
                JOptionPane.YES_NO_OPTION);
        
        if (konf==0) {
            String nim = tfnim.getText();
            runSQL("DELETE FROM mhs WHERE nim ='"+nim+"'");
            loadTable();
            kosong();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void kosong() {
        tfnim.setText("");
        tfnama.setText("");
        tfkelas.setText("");
        tfprodi.setText("");
}
    
    private void tableMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMahasiswaMouseClicked
        // TODO add your handling code here:
          int row = tableMahasiswa.getSelectedRow();
          tfnim.setText(tableMahasiswa.getModel().getValueAt(row, 0).toString());
          tfnama.setText(tableMahasiswa.getModel().getValueAt(row, 1).toString());
          tfkelas.setText(tableMahasiswa.getModel().getValueAt(row, 2).toString());
          tfprodi.setText(tableMahasiswa.getModel().getValueAt(row, 3).toString());
    }//GEN-LAST:event_tableMahasiswaMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        //String nama = "%"+textNAMA.getText()+"%";

        String nim = tfnim.getText();
        String nama = tfnama.getText();
        String kelas = tfkelas.getText();
        String prodi = tfprodi.getText();
//        String nama = "%"+tfnama.getText()+"%";
//        String kelas = "%"+tfkelas.getText()+"%";
        String sql = "";
        
        if (!nim.isEmpty())
            sql = "SELECT * FROM mhs WHERE nim = '"+nim+"'";  
        else if (!nama.isEmpty())
            sql = "SELECT * FROM mhs WHERE nama like '"+nama+"'" ;
        else if (!kelas.isEmpty())
            sql = "SELECT * FROM mhs WHERE kelas = '"+kelas+"'";
        else if(!prodi.isEmpty())
            sql = "SELECT * FROM mhs WHERE prodi = '"+prodi+"'";
            
        mod.setRowCount(0); // Menghapus semua baris yang ada di tabel
        
        try {
            java.sql.Connection conn = (Connection)configDB.koneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while (res.next()) {
                mod.addRow(new Object[] {res.getString(1),
                res.getString(2), res.getString(3), 
                res.getString(4) });
            }
            tableMahasiswa.setModel(mod);
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnCariActionPerformed

    private int runSQL(String sql) {
        try {
            java.sql.Connection conn = (Connection)configDB.koneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
//            pst.execute();
            int rowsAffected = pst.executeUpdate(sql);
            conn.close();
            return rowsAffected;
        } catch (Exception e) {
            System.err.println("SQL Gagal!");
            return -1;
        }
    }
    
    
    private void loadTable() {
//        mod = (DefaultTableModel) tableMahasiswa.getModel();
//        DefaultTableModel mod = new DefaultTableModel();
        mod.setRowCount(0); // Menghapus semua baris yang ada di tabel
        try {
            String sql = "SELECT * FROM mhs";
            java.sql.Connection conn = (Connection)configDB.koneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while (res.next()) {
                mod.addRow(new Object[] {res.getString(1),
                res.getString(2), res.getString(3), 
                res.getString(4) });
            }
            tableMahasiswa.setModel(mod);
        } catch (Exception e) {
        }
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelInput;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMahasiswa;
    private javax.swing.JTextField tfkelas;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tfnim;
    private javax.swing.JTextField tfprodi;
    // End of variables declaration//GEN-END:variables
}
