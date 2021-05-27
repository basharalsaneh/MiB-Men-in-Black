/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaApplication1;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author Marcu
 */
public class BytaLosenordAlien extends javax.swing.JFrame {
    private static InfDB idb;
    String hamtatIDString;
    int hamtatID;
    static inloggningValidering vemArInloggad;
    /**
     * Creates new form BytaLosenord
     * @param idb
     * @param vemArInloggad
     */
    public BytaLosenordAlien(InfDB idb, inloggningValidering vemArInloggad) {
        initComponents();
        BytaLosenordAlien.idb = idb;
        //this.hamtatID = Integer.parseInt(hamtatIDString);
        JOptionPane.showMessageDialog(this, "Du ska nu byta lösenord som: " +vemArInloggad.getNamn());
        BytaLosenordAlien.vemArInloggad = vemArInloggad;
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
        jLabel3 = new javax.swing.JLabel();
        passNytt = new javax.swing.JPasswordField();
        passNuvarande = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnGaTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Byta lösenord");

        jLabel3.setText("Nuvarande lösenord");

        jLabel4.setText("Nytt lösenord");

        jButton1.setText("Spara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnGaTillbaka.setText("Gå tillbaka till AlienMenyn");
        btnGaTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnGaTillbaka)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(39, 39, 39)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passNytt, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(passNuvarande)))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(passNuvarande, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passNytt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnGaTillbaka))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            if(Validering.finnsLosenord(passNuvarande) 
                && Validering.finnsLosenord(passNytt)
                ){
            try{
                char[] losenordArray = passNuvarande.getPassword();
                String gammalLosenord = new String(losenordArray);

                char[] nyttLosenordArray = passNytt.getPassword();
                String nyttLosenord = new String(nyttLosenordArray);

                String fraga = "SELECT losenord FROM Alien WHERE alien_id =" + "'" + vemArInloggad.getId() + "'";
                String resultat = idb.fetchSingle(fraga);

                if(gammalLosenord.equals(resultat)){
//                    if(nyttLosenord.length() < 9){ // La till detta pga att lösenordet får ej vara för långt.
                    String qSetPassword = "UPDATE alien SET losenord =" + "'" + nyttLosenord + "'" + "WHERE alien_id = " + "'" + vemArInloggad.getId() + "'";
                    idb.update(qSetPassword);
                     JOptionPane.showMessageDialog(this, "Lösenord har ändrat!");
//                }
//                    else{ // AVMARKERA DE TOTALT 6 RADER KOMMENTERARIFALL NI  FÅR FELMEDDELANDE OM "DATA TOO LONG"
//                        passNytt.requestFocus();  // VET INTE VART GRÄNSEN GÅR VID nyttLosenord.length()....
//                        JOptionPane.showMessageDialog(this, "Tyvärr för långt lösenord, prova med ett kortare");
//                    }
                }
                else{
                    passNuvarande.requestFocus();
                    JOptionPane.showMessageDialog(this, "Ditt nuvarande lösenord är felaktigt!");
                }
    
            }
            catch (InfException ex){
                System.out.println("Databasfel" + ex.getMessage());
            }
            catch (Exception ex){
                System.out.println("Random fel" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaTillbakaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Ditt lösenord är nu: " + vemArInloggad.getLosenord()); // Bara för att förtydliga att det nya lösenordet följer med. Kan ju tas bort.
        this.dispose();
        new Alien(idb, vemArInloggad).setVisible(true);
    }//GEN-LAST:event_btnGaTillbakaActionPerformed

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
            java.util.logging.Logger.getLogger(BytaLosenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BytaLosenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BytaLosenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BytaLosenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BytaLosenordAlien(idb, vemArInloggad).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passNuvarande;
    private javax.swing.JPasswordField passNytt;
    // End of variables declaration//GEN-END:variables
}
