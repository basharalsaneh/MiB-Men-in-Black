/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaApplication1;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaApplication1.BytaLosenordAlien.vemArInloggad;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author Marcu
 */
public class BytaLosenordAdmin extends javax.swing.JFrame {
    private static InfDB idb;
    String hamtatIDString;
    int hamtatID;
    static Validering vemArInloggad;
    /**
     * Creates new form BytaLosenord
     * @param idb
     * @param vemArInloggad
     */
    public BytaLosenordAdmin(InfDB idb, Validering vemArInloggad) {
        // Vid byte av lösenord för admins så har konstruktorn med sig databasuppkopplingen samt information om den som är inloggad.
        initComponents();
        BytaLosenordAdmin.idb = idb;
        //this.hamtatID = Integer.parseInt(hamtatIDString);
        JOptionPane.showMessageDialog(this, "Du ska nu byta lösenord som: " +vemArInloggad.getNamn());
        BytaLosenordAdmin.vemArInloggad = vemArInloggad;
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
        jButton2 = new javax.swing.JButton();

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

        jButton2.setText("Gå tillbaka");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
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
                    .addComponent(jButton2))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            if(Validering.personFinns(passNuvarande) 
                && Validering.personFinns(passNytt)
                ){
  // Dubbelkollar så textfälten ej är tomma med koden ovanför som hänvisar till Valideringsklassen.
            try{
                char[] losenordArray = passNuvarande.getPassword();
                String gammalLosenord = new String(losenordArray);

                char[] nyttLosenordArray = passNytt.getPassword();
                String nyttLosenord = new String(nyttLosenordArray);

                String fraga = "SELECT losenord FROM agent WHERE agent_id =" + "'" + vemArInloggad.getId() + "'";
                String resultat = idb.fetchSingle(fraga);

                if(gammalLosenord.equals(resultat)){ 
 // Om det gamla ifyllda lösenordet är lika med lösenordet som existerar i databasen så körs koden nedan.
                    if(nyttLosenord.length() <=6){
                    String qSetPassword = "UPDATE agent SET losenord =" + "'" + nyttLosenord + "'" + "WHERE agent_id = " + "'" + vemArInloggad.getId() + "'";
                    idb.update(qSetPassword); // idb.update, uppdaterar gentemot databasen.
                    vemArInloggad.setNyttLosenord(nyttLosenord);
 // Anropar metoden setNyttLosenord() från inloggningValideringsklassen och ändrar personens lösenord via den klassen.
                     JOptionPane.showMessageDialog(this, "Lösenord har ändrat!");
                     }
                    else{ 
                        passNytt.requestFocus(); 
                        JOptionPane.showMessageDialog(this, "Tyvärr för långt lösenord, max 6 tecken");
                    }
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Admin(idb, vemArInloggad).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passNuvarande;
    private javax.swing.JPasswordField passNytt;
    // End of variables declaration//GEN-END:variables
}
