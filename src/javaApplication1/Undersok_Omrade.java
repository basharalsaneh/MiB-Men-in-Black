/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaApplication1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Marcu
 */
public class Undersok_Omrade extends javax.swing.JFrame {

    InfDB idb;
    Validering vemArInloggad;

    /**
     * Creates new form Undersok_Omrade
     */
    public Undersok_Omrade(InfDB idb, Validering vemArInloggad) {
        initComponents();
        this.idb = idb;
        this.vemArInloggad = vemArInloggad;
        fyllcbValjaOmradesNamn(); // Vid start av framen fylls comboboxen med alla de existerande områden.
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
        txtOmradesChef1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaVisaInfo = new javax.swing.JTextArea();
        cbValjaOmradesNamn = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Undersök ett område");

        jLabel2.setText("Områdeschefen är:");

        jLabel3.setText("Topp 3 agenter som ansvarar för flest aliens inom område:");

        txtOmradesChef1.setEditable(false);
        txtOmradesChef1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOmradesChef1ActionPerformed(evt);
            }
        });

        txtAreaVisaInfo.setColumns(20);
        txtAreaVisaInfo.setRows(5);
        jScrollPane1.setViewportView(txtAreaVisaInfo);

        cbValjaOmradesNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjaOmradesNamnActionPerformed(evt);
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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbValjaOmradesNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel1)))
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOmradesChef1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbValjaOmradesNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOmradesChef1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fyllcbValjaOmradesNamn() {
        String fraga = "SELECT Benamning from omrade";

        ArrayList<String> allaOmradesNamn;

        try {

            allaOmradesNamn = idb.fetchColumn(fraga);

            for (String namn : allaOmradesNamn) {
                cbValjaOmradesNamn.addItem(namn);
            }

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }

    }

    private void visaTopp3Lista() {
        txtAreaVisaInfo.setText("");

        ArrayList<HashMap<String, String>> soktaAgenter;

        try {
            String valdSektion = cbValjaOmradesNamn.getSelectedItem().toString();
            String fraga = "SELECT Agent_ID, Agent.Namn, count(Agent_ID) as Antal FROM Agent\n"
                    + "join Alien on Agent.Agent_ID= Alien.Ansvarig_Agent\n"
                    + "join omrade on Alien.plats = Omrade.Omrades_ID\n"
                    + "where Omrade =(SELECT Omrades_ID FROM Omrade WHERE Benamning = '" + valdSektion + "')\n"
                    + "group by Agent_ID\n"
                    + "order by count(Ansvarig_Agent) DESC limit 3";
            soktaAgenter = idb.fetchRows(fraga);

            // Första raden i rutan txtAreaVisaInfo ska visa fältnamnen.
                 txtAreaVisaInfo.append("ID \t Namn \t Ansvar för\n"
                                      + "---\t-------\t-----------\n");

                for (HashMap<String, String> alien : soktaAgenter) {
                txtAreaVisaInfo.append(" " + alien.get("Agent_ID") + "\t");
                txtAreaVisaInfo.append(alien.get("Namn") + "\t");
                txtAreaVisaInfo.append(" " + alien.get("Antal") + " st" + "\n");

        }
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Ett fel uppstod!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }

    private void cbValjaOmradesNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjaOmradesNamnActionPerformed
        // TODO add your handling code here:
        // Vid val av område, t.ex. Svealand så körs metoderna nedan, som visar områdeschef samt 
        // topp3Listan på de 3 (om de finns dvs) agenter som ansvarar för flest aliens.
        visaOmradesChef();
        visaTopp3Lista();

    }//GEN-LAST:event_cbValjaOmradesNamnActionPerformed

    private void visaOmradesChef() {
        txtOmradesChef1.setText("");

        try {
            String valdSektion = cbValjaOmradesNamn.getSelectedItem().toString();
            // Frågan nedanför hämtar namnet på den Områdeschef inom valt område (valdSektion).
            String fraga2 = "SELECT namn, telefon FROM Agent \n"
                    + "JOIN omradeschef USING (Agent_ID) \n"
                    + "JOIN Omrade ON omradeschef.Omrade = Omrade.Omrades_ID \n"
                    + "WHERE Omrade.Benamning = " + "'" + valdSektion + "'";

            HashMap<String, String> OmradesChef = idb.fetchRow(fraga2);
            String namn = OmradesChef.get("namn");
            String telefon = OmradesChef.get("telefon");

            txtOmradesChef1.setText(namn + " med telefon: " + telefon);

        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }

    }

    private void txtOmradesChef1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOmradesChef1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtOmradesChef1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Agent(idb, vemArInloggad).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbValjaOmradesNamn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaVisaInfo;
    private javax.swing.JTextField txtOmradesChef1;
    // End of variables declaration//GEN-END:variables
}
