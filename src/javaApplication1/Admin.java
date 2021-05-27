/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaApplication1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author kristofffer
 */
public class Admin extends javax.swing.JFrame {
    InfDB idb;
    inloggningValidering vemArInloggad;
    /**
     * Creates new form Admin
     * @param idb
     * @param vemArInloggad
     */
    public Admin(InfDB idb, inloggningValidering vemArInloggad) {
        initComponents();
        this.idb = idb;
        this.vemArInloggad = vemArInloggad;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAliens = new javax.swing.JButton();
        btnUtrustning = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnBytLosenord = new javax.swing.JButton();
        registreraAgenterButton = new javax.swing.JButton();
        hanteraAgenterButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Inloggad som administratör");
        jLabel3.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Hantera:");

        btnAliens.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnAliens.setText("Aliens");
        btnAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAliensActionPerformed(evt);
            }
        });

        btnUtrustning.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnUtrustning.setText("Utrustning");
        btnUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtrustningActionPerformed(evt);
            }
        });

        jButton1.setText("Logga ut");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnBytLosenord.setText("Ändra lösenord");
        btnBytLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBytLosenordActionPerformed(evt);
            }
        });

        registreraAgenterButton.setText("Registrera Agenter");
        registreraAgenterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraAgenterButtonActionPerformed(evt);
            }
        });

        hanteraAgenterButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        hanteraAgenterButton.setText("Agenter");
        hanteraAgenterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraAgenterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(381, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hanteraAgenterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registreraAgenterButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBytLosenord)))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registreraAgenterButton)
                    .addComponent(hanteraAgenterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnBytLosenord))
                .addGap(75, 75, 75))
        );

        jLabel3.getAccessibleContext().setAccessibleName("Inloggad som Administratör");
        jLabel3.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUtrustningActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        new Hantera_Utrustning(idb, vemArInloggad).setVisible(true);
        
    }//GEN-LAST:event_btnUtrustningActionPerformed

    private void btnAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAliensActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        new Hantera_Aliens(idb, vemArInloggad).setVisible(true);
        
    }//GEN-LAST:event_btnAliensActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Du loggas nu ut som: " + vemArInloggad.getNamn());
        this.dispose();
        new Start(idb).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBytLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBytLosenordActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Du ska nu byta lösenord som: " + vemArInloggad.getNamn());
        this.dispose();
        new BytaLosenord(idb, vemArInloggad).setVisible(true);
    }//GEN-LAST:event_btnBytLosenordActionPerformed

    private void registreraAgenterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraAgenterButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Registrering_Agenter(idb, vemArInloggad).setVisible(true);
        
    }//GEN-LAST:event_registreraAgenterButtonActionPerformed

    private void hanteraAgenterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanteraAgenterButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Hantera_Agenter(idb, vemArInloggad).setVisible(true);
    }//GEN-LAST:event_hanteraAgenterButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAliens;
    private javax.swing.JButton btnBytLosenord;
    private javax.swing.JButton btnUtrustning;
    private javax.swing.JToggleButton hanteraAgenterButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton registreraAgenterButton;
    // End of variables declaration//GEN-END:variables
}
