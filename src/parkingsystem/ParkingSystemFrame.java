/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingsystem;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author abcd
 */
public class ParkingSystemFrame extends javax.swing.JFrame {

    /**
     * Creates new form ParkingFrame
     */
    public ParkingSystemFrame() {
        initComponents();
        try {
            ParkingSystem.createSlots();
            String msg = ParkingSystem.notification();
            if (!msg.equals("")) {
                JOptionPane.showMessageDialog(this, msg);
            }
        } catch (Exception ex) {
            Logger.getLogger(ParkingSystemFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        logOutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        parkBtn = new javax.swing.JButton();
        unparkBtn = new javax.swing.JButton();
        infoBtn = new javax.swing.JButton();
        adminBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        logOutBtn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        logOutBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\abcd\\All In One\\All In One\\Work\\Me\\Class shit\\2nd Year\\1st Semester\\Object-Oriented Programming\\Netbeans Projects\\Parking System\\files\\otherImages\\logOut.png")); // NOI18N
        logOutBtn.setToolTipText("Log Out");
        logOutBtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        logOutBtn.setPreferredSize(new java.awt.Dimension(32, 32));
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PARKING SYSTEM");

        parkBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        parkBtn.setForeground(new java.awt.Color(0, 204, 204));
        parkBtn.setText("PARK");
        parkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parkBtnActionPerformed(evt);
            }
        });

        unparkBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        unparkBtn.setForeground(new java.awt.Color(0, 204, 204));
        unparkBtn.setText("UNPARK");
        unparkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unparkBtnActionPerformed(evt);
            }
        });

        infoBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        infoBtn.setForeground(new java.awt.Color(0, 204, 204));
        infoBtn.setText("INFO");
        infoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoBtnActionPerformed(evt);
            }
        });

        adminBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adminBtn.setForeground(new java.awt.Color(0, 204, 204));
        adminBtn.setText("ADMIN");
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unparkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(parkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unparkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        ParkingSystem.switchFrame(this, new LoginFrame());
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void parkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parkBtnActionPerformed
        ParkingSystem.switchFrame(this, new ParkFrame());
    }//GEN-LAST:event_parkBtnActionPerformed

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        ParkingSystem.switchFrame(this, new AdminFrame());
    }//GEN-LAST:event_adminBtnActionPerformed

    private void unparkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unparkBtnActionPerformed
        ParkingSystem.switchFrame(this, new UnparkFrame());
    }//GEN-LAST:event_unparkBtnActionPerformed

    private void infoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoBtnActionPerformed
        ParkingSystem.switchFrame(this, new InfoFrame());
    }//GEN-LAST:event_infoBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBtn;
    private javax.swing.JButton infoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton parkBtn;
    private javax.swing.JButton unparkBtn;
    // End of variables declaration//GEN-END:variables
}
