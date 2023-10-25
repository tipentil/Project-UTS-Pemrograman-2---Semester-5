/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjectUTS;

import javax.swing.JOptionPane;

/**
 *
 * @Steven Fredrico
 */

public class MenuUtama extends javax.swing.JFrame {
    
    /**
     * Creates new form MenuMahasiswa
     */
    public MenuUtama() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        menuLogin = new javax.swing.JMenuItem();
        menuInput = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        Report = new javax.swing.JMenu();
        menuCetak = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Steven Fredrico - Menu Utama");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Image/LogoUNPAM.png")).getImage());
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/739393.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        File.setText("File");

        menuLogin.setText("Login");
        menuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoginActionPerformed(evt);
            }
        });
        File.add(menuLogin);

        menuInput.setText("Input Mahasiswa");
        menuInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInputActionPerformed(evt);
            }
        });
        File.add(menuInput);

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        File.add(menuExit);

        jMenuBar1.add(File);

        Report.setText("Report");

        menuCetak.setText("Cetak Report");
        menuCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCetakActionPerformed(evt);
            }
        });
        Report.add(menuCetak);

        jMenuBar1.add(Report);

        Help.setText("Help");

        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        Help.add(menuAbout);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        
    private void menuInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInputActionPerformed
        if(configDB.isLogin) {
            TableMahasiswa inputTable = new TableMahasiswa();
            inputTable.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Mohon Untuk Login Terlebih Dahulu!",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_menuInputActionPerformed

    private void menuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoginActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuLoginActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        int tanya = JOptionPane.showConfirmDialog(this, "Yakin lu mau keluar? chuaks", "Konfirmasi Keluar", 
                JOptionPane.YES_NO_OPTION);
        if (tanya == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        About about = new About();
        about.setVisible(true);
    }//GEN-LAST:event_menuAboutActionPerformed

    private void menuCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCetakActionPerformed
        CetakLaporan cetak = new CetakLaporan();
        cetak.setVisible(true);
    }//GEN-LAST:event_menuCetakActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu File;
    private javax.swing.JMenu Help;
    private javax.swing.JMenu Report;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuItem menuCetak;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuInput;
    private javax.swing.JMenuItem menuLogin;
    // End of variables declaration//GEN-END:variables
}
