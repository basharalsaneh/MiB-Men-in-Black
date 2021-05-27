/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaApplication1;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author Marcu
 */
public class Registrera_Utrustning extends javax.swing.JFrame {

    private static InfDB idb;
    static inloggningValidering vemArInloggad;
    /**
     * Creates new form Registrera_Utrustning
     */
    public Registrera_Utrustning(InfDB idb, inloggningValidering vemArInloggad) {
        initComponents();
        this.idb = idb;
        this.vemArInloggad = vemArInloggad;
        jKaliber.setVisible(false);
    }
    
       private String hamtaNyUtrustningID() {
        int sistaNummer = 0;
        String nyID = "";
        
        try {            
            String query = "SELECT utrustnings_id FROM utrustning";
            ArrayList<String> result = idb.fetchColumn(query);
            int[] integerResultat = new int[result.size()];
            
            for (int i = 0; i < result.size(); i++) {
                integerResultat[i] = Integer.parseInt(result.get(i));
            }
            for (int element : integerResultat) {
                if (element >= sistaNummer) {
                    sistaNummer = element;
                }
            }
            int newIdInt = sistaNummer + 1;
            nyID = String.valueOf(newIdInt);
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
        return nyID;
    }
    
    private String hamtaUtrustningNamn() {
        String utrustningNamn = txtBenamning.getText();
        return utrustningNamn;
    }
    
        private void LaTillVapen() {
        String nyID = hamtaNyUtrustningID();
        try {
            String fraga1 = "INSERT INTO utrustning(utrustnings_id, benamning)"
                    + " VALUES ('" + nyID + "','" + hamtaUtrustningNamn() + "')";
            idb.insert(fraga1);
            
            String fraga2 = "INSERT INTO vapen(utrustnings_id, kaliber) "
                    + "VALUES ('" + nyID + "','" + jKaliber.getText() + "')";
            idb.insert(fraga2);
            
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
        
    }

    private void laTillTeknik() {
        String nyID = hamtaNyUtrustningID();
        try {
            String fraga1 = "INSERT INTO utrustning(utrustnings_id, benamning) "
                    + "VALUES ('" + nyID + "','" + hamtaUtrustningNamn() + "')";
            idb.insert(fraga1);
            
            String fraga2 = "INSERT INTO teknik (utrustnings_id, kraftkalla) "
                    + "VALUES ('" + nyID + "','" + jKaliber.getText() + "')";
            idb.insert(fraga2);
            
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
        
    }

    private void laTillKommunikation() {
        String nyID = hamtaNyUtrustningID();
        try {
            String fraga1 = "INSERT INTO utrustning(utrustnings_id, benamning) "
                    + "VALUES ('" + nyID + "','" + hamtaUtrustningNamn() + "')";
            idb.insert(fraga1);
            
            String fraga2 = "INSERT INTO kommunikation (utrustnings_id, overforingsteknik)"
                    + " VALUES ('" + nyID + "','" + jKaliber.getText() + "')";
            idb.insert(fraga2);
            
        } catch (InfException ex) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBenamning = new javax.swing.JTextField();
        btnRegistrera = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTyp = new javax.swing.JComboBox<>();
        lblMessage = new javax.swing.JLabel();
        lblKaliber = new javax.swing.JLabel();
        jKaliber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrera utrustning som agent");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ny utrustning:");

        jLabel3.setText("Benämning:");

        btnRegistrera.setText("Registrera");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        jLabel4.setText("Typ av utrustning:");

        jTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välja", "Vapen", "Teknik", "Kommunikation" }));
        jTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTypActionPerformed(evt);
            }
        });

        jKaliber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKaliberActionPerformed(evt);
            }
        });

        jButton1.setText("Gå tillbaka");
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
                .addGap(69, 69, 69)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblKaliber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBenamning, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(btnRegistrera, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jKaliber))))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKaliber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jKaliber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrera)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jKaliberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKaliberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jKaliberActionPerformed

    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
        // TODO add your handling code here:
           if (Validering.txtKontroll(txtBenamning)
                && Validering.kontrollForComboBox(jTyp)
                && Validering.txtKontroll(jKaliber)){
            try {
                Boolean UtrustningFinns = false;
                Boolean LadeUtrustning = false;
                String nyUtrustning = txtBenamning.getText();
                
                String fraga = "SELECT benamning FROM utrustning";
                ArrayList<String> resultat = idb.fetchColumn(fraga);
                
                for (String element : resultat) {
                    if (nyUtrustning.toLowerCase().equals(element.toLowerCase())) {
                        UtrustningFinns = true;
                    }
                }
                
                if (UtrustningFinns) {
                    JOptionPane.showMessageDialog(null,"Utrustningen finns redan i listan!");
                } else {
                    if (jTyp.getSelectedItem().equals("Vapen")) {
                        LaTillVapen();
                        LadeUtrustning = true;
                    } else if (jTyp.getSelectedItem().equals("Kommunikation")) {
                        laTillKommunikation();
                        LadeUtrustning = true;
                    }else if (jTyp.getSelectedItem().equals("Teknik")) {
                        laTillTeknik();
                        LadeUtrustning = true;
                    } 
                       
                }
                if (LadeUtrustning) {
                    JOptionPane.showMessageDialog(null,"Utrustningen har lagts till!");
                    txtBenamning.setText("");
                    jTyp.setSelectedIndex(0);
                    jKaliber.setText("");
                    lblKaliber.setText(" ");
                }
                
            } catch (InfException ex) {
                System.out.println("Databasfel" + ex.getMessage());
            } catch (Exception ex) {
                System.out.println("Random fel" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnRegistreraActionPerformed

    private void jTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTypActionPerformed
        // TODO add your handling code here:
         if (jTyp.getSelectedItem().equals("Vapen")) {
            jKaliber.setVisible(true);
            lblKaliber.setText("Kaliber:");
        } 
         
         else if (jTyp.getSelectedItem().equals("Teknik")) {
            jKaliber.setVisible(true);
            lblKaliber.setText("Kraftkälla::");
        } 
         
         else if (jTyp.getSelectedItem().equals("Kommunikation")) {
            jKaliber.setVisible(true);
            lblKaliber.setText("Överföringsteknik:");
        } 
         
         else {
            jKaliber.setVisible(false);
            lblKaliber.setText(" ");
        }
    }//GEN-LAST:event_jTypActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Agent(idb, vemArInloggad).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jKaliber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> jTyp;
    private javax.swing.JLabel lblKaliber;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTextField txtBenamning;
    // End of variables declaration//GEN-END:variables
}
