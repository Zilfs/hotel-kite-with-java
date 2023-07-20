/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.kite;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hirzi
 */
public class formBooking extends javax.swing.JFrame {

    /**
     * Creates new form formUsers
     */
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = koneksi.koneksi.Koneksi();
    
    public String status;
    public String visitor;
    
    public formBooking() {
        initComponents();
        judul();
        tampilData("");
        
        txtIdRoom.setEnabled(false);
        txtNoKamar.setEnabled(false);
        comboboxKelas.setEnabled(false);
        txtVisitor.setEnabled(false);
        comboboxStatus.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNoKamar = new javax.swing.JTextField();
        comboboxStatus = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRooms = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtIdRoom = new javax.swing.JTextField();
        comboboxKelas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtVisitor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("FORM DATA KAMAR");

        jLabel2.setText("No Kamar");

        jLabel3.setText("Kelas");

        jLabel4.setText("Status");

        comboboxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booked", "Ready" }));
        comboboxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxStatusActionPerformed(evt);
            }
        });

        btnUpdate.setText("Simpan");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setText("Cancel");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tabelRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID User", "No Kamar", "Kelas", "Status", "Nama Penghuni"
            }
        ));
        tabelRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelRoomsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelRooms);

        jLabel5.setText("ID Ruangan");

        comboboxKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Premium", "Deluxe", "Standard" }));

        jLabel6.setText("Visitors");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNoKamar)
                                        .addComponent(comboboxStatus, 0, 180, Short.MAX_VALUE)
                                        .addComponent(txtIdRoom)
                                        .addComponent(comboboxKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtVisitor))))
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtIdRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNoKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboboxKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comboboxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtVisitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnReset))
                        .addGap(60, 60, 60)
                        .addComponent(btnBack))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelRoomsMouseClicked
        // TODO add your handling code here:
        txtIdRoom.setText(tabelRooms.getValueAt(tabelRooms.getSelectedRow(), 0).toString());
        txtNoKamar.setText(tabelRooms.getValueAt(tabelRooms.getSelectedRow(), 1).toString());
        comboboxKelas.setSelectedItem(tabelRooms.getValueAt(tabelRooms.getSelectedRow(), 2).toString());
        comboboxStatus.setSelectedItem(tabelRooms.getValueAt(tabelRooms.getSelectedRow(), 3).toString());   
//        if(tabelRooms.getValueAt(tabelRooms.getSelectedRow(), 4) == ""){
//            txtVisitor.setText("");
//        }else{
//            txtVisitor.setText(tabelRooms.getValueAt(tabelRooms.getSelectedRow(), 4).toString());
//        }
status = (String) comboboxStatus.getSelectedItem();
        if(status == "Booked"){
            txtVisitor.setEnabled(true);
            comboboxStatus.setEnabled(true);
        }else if(status == "Ready"){
            txtVisitor.setText("");
            txtVisitor.setEnabled(false);
        }
        btnUpdate.setEnabled(true);
        comboboxStatus.setEnabled(true);
        
    }//GEN-LAST:event_tabelRoomsMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            visitor = txtVisitor.getText();
            if(visitor == ""){
                JOptionPane.showMessageDialog(null, "Harap isi nama penghuni kamar");
            }else{
                st = cn.createStatement();
            st.executeUpdate("UPDATE rooms SET status='" + comboboxStatus.getSelectedItem() + "', visitor='" + txtVisitor.getText() + "' WHERE id='" + txtIdRoom.getText() + "';");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Reservasi Berhasil");
            reset();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dashboardStaff ds = new dashboardStaff();
        ds.show();
         this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboboxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxStatusActionPerformed
        // TODO add your handling code here:
        status = (String) comboboxStatus.getSelectedItem();
        if(status == "Booked"){
            txtVisitor.setEnabled(true);
            comboboxStatus.setEnabled(true);
        }else if(status == "Ready"){
            txtVisitor.setText("");
            txtVisitor.setEnabled(false);
        }
    }//GEN-LAST:event_comboboxStatusActionPerformed

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
            java.util.logging.Logger.getLogger(formBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formBooking().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboboxKelas;
    private javax.swing.JComboBox<String> comboboxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelRooms;
    private javax.swing.JTextField txtIdRoom;
    private javax.swing.JTextField txtNoKamar;
    private javax.swing.JTextField txtVisitor;
    // End of variables declaration//GEN-END:variables
    public void judul() {
        Object[] judul = {"ID Ruangan", "No Kamar", "Kelas", "Status", "Nama Penghuni"};

        tabModel = new DefaultTableModel(null, judul);
        tabelRooms.setModel(tabModel);
    }
    
    public void tampilData(String where){
        try {
            st = cn.createStatement();
            tabModel.getDataVector().removeAllElements();
            tabModel.fireTableDataChanged();
            rs = st.executeQuery("SELECT * FROM rooms WHERE status='ready' OR status='booked'" + where);
            
            while (rs.next()) {
                Object [] data = {
                    rs.getString("id"),
                    rs.getString("no_kamar"),
                    rs.getString("kelas"),
                    rs.getString("status"),
                    rs.getString("visitor"),
                };
                tabModel.addRow(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void reset(){
        txtIdRoom.setText("");
        txtNoKamar.setText("");
        comboboxKelas.setSelectedItem("");
        comboboxStatus.setSelectedItem("");
        txtVisitor.setText("");
        btnUpdate.setEnabled(false);
        comboboxStatus.setEnabled(false);
        txtVisitor.setEnabled(false);
    }
}
