/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaApplication1;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author marcu
 */
public class Agent extends javax.swing.JFrame {
    

InfDB idb;
private int agent_ID;
private String namn;
private String Telefon;
private String losenord;
private boolean administrator;
private Date anstallningsdatum;
inloggningValidering vemArInloggad;

    
public Agent(InfDB idb, inloggningValidering vemArInloggad) {
    initComponents();
    this.idb = idb;
    this.vemArInloggad = vemArInloggad;
    minaUtrustning();
}

    public void minaUtrustning() {
        try {
            String fraga
                    = "SELECT benamning\n"
                    + "FROM utrustning\n"
                    + "JOIN innehar_utrustning USING (utrustnings_id)\n"
                    + "JOIN agent USING (agent_id)\n"
                    + "WHERE agent_id = " + "'" + vemArInloggad.getId() + "'";

            ArrayList<String> result = idb.fetchColumn(fraga);
            
            for (String objekt : result) {
                UtrustningRS.append(" - " + objekt + "\n");
            }
        } 
        
        catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
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
        btnAliens = new javax.swing.JButton();
        btnUtrustning = new javax.swing.JButton();
        btnOmrade = new javax.swing.JButton();
        btnBytLosenord = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UtrustningRS = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        brnLoggaUt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Inloggad som Agent");

        btnAliens.setText("Kolla upp aliens");

        btnUtrustning.setText("Registrera utrustning");
        btnUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtrustningActionPerformed(evt);
            }
        });

        btnOmrade.setText("Undersök område");

        btnBytLosenord.setText("Ändra lösenord");
        btnBytLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBytLosenordActionPerformed(evt);
            }
        });

        UtrustningRS.setColumns(20);
        UtrustningRS.setRows(5);
        jScrollPane1.setViewportView(UtrustningRS);

        jLabel2.setText("Din utrustning:");

        brnLoggaUt.setText("Logga ut");
        brnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnLoggaUtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(brnLoggaUt)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUtrustning)
                            .addComponent(btnAliens, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOmrade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBytLosenord, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnAliens)
                .addGap(18, 18, 18)
                .addComponent(btnUtrustning)
                .addGap(18, 18, 18)
                .addComponent(btnOmrade)
                .addGap(18, 18, 18)
                .addComponent(btnBytLosenord)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(brnLoggaUt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBytLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBytLosenordActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Du transporteras nu till att byta lösenord.");
        this.dispose();
        new BytaLosenord(idb, vemArInloggad).setVisible(true);
        
    }//GEN-LAST:event_btnBytLosenordActionPerformed

    private void btnUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUtrustningActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Registrera_Utrustning(idb, vemArInloggad).setVisible(true);
    }//GEN-LAST:event_btnUtrustningActionPerformed

    private void brnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnLoggaUtActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Du loggas nu ut som: " + vemArInloggad.getNamn());
        this.dispose();
        new Start(idb).setVisible(true);
    }//GEN-LAST:event_brnLoggaUtActionPerformed

    /**
     * @param args the command line arguments
     *//* Set the Nimbus look and feel */
        ////<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>*/
       


       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea UtrustningRS;
    private javax.swing.JButton brnLoggaUt;
    private javax.swing.JButton btnAliens;
    private javax.swing.JButton btnBytLosenord;
    private javax.swing.JButton btnOmrade;
    private javax.swing.JButton btnUtrustning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
 }
