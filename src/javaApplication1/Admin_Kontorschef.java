/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaApplication1;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author kristofffer
 */
public class Admin_Kontorschef extends javax.swing.JFrame {
    
    private InfDB idb;
    
    /**
     * Creates new form Admin_Kontorschef
     */
    public Admin_Kontorschef(InfDB idb) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb = idb;
        FyllComboboxar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void FyllComboboxar(){
        
        agentCombo.removeAllItems();
        valjKontor.removeAllItems();
        
        String kontorFraga = "SELECT Kontorsbeteckning FROM Kontorschef";
        String agentFraga = "SELECT Agent_ID, namn FROM Agent";
        
        ArrayList<String> allaKontorsnamn;
        ArrayList<HashMap<String, String>> allaAgentnamn;
        
        try{
            
        allaKontorsnamn = idb.fetchColumn(kontorFraga);
        allaAgentnamn = idb.fetchRows(agentFraga);

            for (String namn : allaKontorsnamn) {
                valjKontor.addItem(namn);
            }  
            
            for (HashMap<String, String> agent : allaAgentnamn){
                String agenter = "ID: " + agent.get("Agent_ID") + ", " + agent.get("namn");
                agentCombo.addItem(agenter);
            }
            
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }    
        
        
    }
    
    
    
     
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaKontor = new javax.swing.JTextArea();
        valjKontor = new javax.swing.JComboBox<>();
        agentCombo = new javax.swing.JComboBox<>();
        andraKontorschefKnapp = new javax.swing.JToggleButton();
        gaTillbaka = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nyKontorschefAgentID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaKontor.setColumns(20);
        txtAreaKontor.setRows(5);
        jScrollPane1.setViewportView(txtAreaKontor);

        valjKontor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjKontorActionPerformed(evt);
            }
        });

        andraKontorschefKnapp.setText("Ändra Kontorschef");
        andraKontorschefKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKontorschefKnappActionPerformed(evt);
            }
        });

        gaTillbaka.setText("Gå tillbaka");
        gaTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaTillbakaActionPerformed(evt);
            }
        });

        jLabel1.setText("Välj Kontor");

        jLabel2.setText("Välj ny kontorschef");

        jLabel3.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nyKontorschefAgentID))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valjKontor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(agentCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(andraKontorschefKnapp))
                    .addComponent(gaTillbaka))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gaTillbaka)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valjKontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nyKontorschefAgentID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(andraKontorschefKnapp)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void gaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaTillbakaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Admin_HanteraAgenterMeny(idb).setVisible(true);
    }//GEN-LAST:event_gaTillbakaActionPerformed

    private void valjKontorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjKontorActionPerformed
        // TODO add your handling code here:
        
        
        txtAreaKontor.setText("");
        txtAreaKontor.append("AGENT_ID" + "\t");
        txtAreaKontor.append("NAMN" + "\t");
        txtAreaKontor.append("TELEFON" + "\n");
        
        ArrayList<HashMap<String, String>> allaKontorschefer;
        
        
        try{
            
            String valdKontor = valjKontor.getSelectedItem().toString();
       
            String fraga = "SELECT Agent_ID, namn, telefon FROM agent WHERE Agent_ID = (Select Agent_ID from Kontorschef where Kontorsbeteckning = '" + valdKontor + "')";
            allaKontorschefer = idb.fetchRows(fraga);
            
            for (HashMap<String, String> agent : allaKontorschefer){
                txtAreaKontor.append(agent.get("Agent_ID") + "\t");
                txtAreaKontor.append(agent.get("namn") + "\t");
                txtAreaKontor.append(agent.get("telefon") + "\n");
            }
            
            
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } 
        catch (Exception ettUndantag) { //lägger även till nullpointer exception
            JOptionPane.showMessageDialog(null, "Ett fel uppstod!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } 
        
    
    
    }//GEN-LAST:event_valjKontorActionPerformed

    private void andraKontorschefKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKontorschefKnappActionPerformed
        // TODO add your handling code here:
        txtAreaKontor.setText("");
        String valtKontor = valjKontor.getSelectedItem().toString();
        String agent = agentCombo.getSelectedItem().toString();
        
        String baraID = agent.replaceAll("\\D+","");
       
        int nyKontorsChefID = Integer.parseInt(baraID);
        
        String uppdateraChef = "update kontorschef set agent_id = " + nyKontorsChefID + " where kontorsbeteckning = '" + valtKontor + "'";
        
        try{
            idb.update(uppdateraChef);
            JOptionPane.showMessageDialog(null, "Kontorets chef är nu uppdaterad!");
            
            
        }catch (InfException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()); 
        }
        
        
        
        //String uppdateraKontorschef = "UPDATE Kontorschef set Agent_ID = 
        
               
        
        
        
        
    }//GEN-LAST:event_andraKontorschefKnappActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agentCombo;
    private javax.swing.JToggleButton andraKontorschefKnapp;
    private javax.swing.JToggleButton gaTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nyKontorschefAgentID;
    private javax.swing.JTextArea txtAreaKontor;
    private javax.swing.JComboBox<String> valjKontor;
    // End of variables declaration//GEN-END:variables
}