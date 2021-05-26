/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaApplication1;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Vector;
import static javaApplication1.Hantera_Aliens.vemArInloggad;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;
/**
 *
 * @author marcu
 */
public class Hantera_Agenter extends javax.swing.JFrame {
        
        private InfDB idb;
        Connection connection1;
        PreparedStatement statement;
        Statement createStatement;
        static inloggningValidering vemArInloggad;
        
       
        
    /**
     * Creates new form Hantera_Agenter
     */
    public Hantera_Agenter(InfDB idb, inloggningValidering vemArInloggad){
        initComponents();
        table_update();
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtAgentID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAgentNamn = new javax.swing.JTextField();
        txtAgentTelefon = new javax.swing.JTextField();
        txtAgentDatum = new javax.swing.JTextField();
        txtAgentAdmin = new javax.swing.JTextField();
        txtAgentLosenord = new javax.swing.JTextField();
        txtAgentOmrade = new javax.swing.JTextField();
        buttonRensaData = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hantera agenter som administratör");

        jPanel1.setName(""); // NOI18N

        jLabel2.setText("Agent_ID");

        jLabel3.setText("Namn");

        jLabel4.setText("Telefon");

        jLabel5.setText("Anst.datum");

        jLabel6.setText("Administratör");

        jLabel7.setText("Losenord");

        jLabel8.setText("Omrade");

        buttonRensaData.setText("Rensa fälten");
        buttonRensaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRensaDataActionPerformed(evt);
            }
        });

        buttonAdd.setText("Lägg till");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonEdit.setText("Ändra");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setText("Ta bort");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        jButton5.setText("Lista an agent");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAgentNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(txtAgentID))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAgentTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(txtAgentAdmin)
                            .addComponent(txtAgentLosenord)
                            .addComponent(txtAgentOmrade)
                            .addComponent(txtAgentDatum))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonRensaData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtAgentTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAgentDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtAgentAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtAgentLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtAgentOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(buttonRensaData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd)
                    .addComponent(buttonEdit)
                    .addComponent(buttonDelete))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Agent_ID", "Namn", "Telefon", "Anst.datum", "Administrator", "Losenord", "Omrade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(203, 203, 203))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Hantering");

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void table_update(){
        int kolumn;
        try{
        statement = connection1.prepareStatement("SELECT * FROM agent");
        ResultSet rs = statement.executeQuery();
        ResultSetMetaData rss = (ResultSetMetaData) rs.getMetaData();
        kolumn = rss.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        df.setRowCount(0);
        while(rs.next()) // Listar alla aliens
        {
        Vector v1 = new Vector(); // Vektor med varje alien-individs vÃ¤rden.
        
        for(int i=1 ; i<=kolumn ; i++){ 
        v1.add(rs.getString("Agent_ID")); 
        v1.add(rs.getString("Namn"));
        v1.add(rs.getString("Telefon"));
        v1.add(rs.getString("Anst.datum"));
        v1.add(rs.getString("Administratör"));
        v1.add(rs.getString("Losenord"));
        v1.add(rs.getString("Område"));
        }
        
        df.addRow(v1); // Adderar/Listar varje agent-individs vÃ¤rde i tabellen
        
        }
        
        }
       
             catch (SQLException ex) {
                Logger.getLogger(Hantera_Agenter.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
     
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        try {
            String StringID = txtAgentID.getText();// FÃ¥r ej vara null
            int id = Integer.parseInt(StringID);
            String namn = txtAgentNamn.getText(); // FÃ¥r ej vara null
            String telefon = txtAgentTelefon.getText(); 
            String datum = txtAgentDatum.getText();    // FÃ¥r ej vara null
            String admin = txtAgentAdmin.getText();
            String losenord = txtAgentLosenord.getText();
            String plats = txtAgentOmrade.getText();
            String fraga = "INSERT INTO agent (Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Losenord, Omrade) VALUES (?,?,?,?,?,?,?,)";
            
            
            statement = connection1.prepareStatement(fraga);
            statement.setInt(1, id);
            statement.setString(2, namn);
            statement.setString(3, telefon);
            statement.setString(4, datum);
            statement.setString(5, admin);
            statement.setString(6, losenord);
            statement.setString(7, plats);
            statement.execute();
            JOptionPane.showMessageDialog(this, "Agent registrerad");
            table_update();
           
          
         
             } catch (SQLException ex) {
                Logger.getLogger(Hantera_Aliens.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
         try {
             int id = Integer.parseInt(df.getValueAt(selectedIndex, 0).toString());
             int villDuDelete = JOptionPane.showConfirmDialog(null, "Vill du ta bort vald agent?", 
                     "Warning", JOptionPane.YES_NO_OPTION);
             if(villDuDelete == JOptionPane.YES_OPTION){
             String taBortAlien = "delete from agent where Agent_ID = ?";
             statement = connection1.prepareStatement(taBortAlien);
             statement.setInt(1, id);
             statement.executeUpdate();
             JOptionPane.showMessageDialog(this, "Agent ändrad");
             table_update(); // Uppdaterar flÃ¶det. Kolla vad metoden gÃ¶r.
             txtAgentID.setText("");
             txtAgentNamn.setText("");
             txtAgentTelefon.setText("");
             txtAgentDatum.setText("");
             txtAgentAdmin.setText("");
             txtAgentLosenord.setText("");
             txtAgentOmrade.setText("");
             txtAgentID.requestFocus(); // Fokus pÃ¥ vald textruta.
             } 
             if(villDuDelete == JOptionPane.NO_OPTION){
             JOptionPane.showMessageDialog(this, "Alien INTE ändrad");
             }
              
           
         } catch (SQLException ex) {
             Logger.getLogger(Hantera_Agenter.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        String agentID = df.getValueAt(selectedIndex, 0).toString();
        if(txtAgentID.getText().equals(agentID)){ 
        JOptionPane.showMessageDialog(this, "Du får ej ändra på ID:t, det ändras nu tillbaka.");
        txtAgentID.setText(agentID); // 
        }
        else
        {
         try {
             
            int id = Integer.parseInt(df.getValueAt(selectedIndex, 0).toString());
            String namn = txtAgentNamn.getText(); 
            String telefon = txtAgentTelefon.getText(); 
            String datum = txtAgentDatum.getText();   
            String admin = txtAgentAdmin.getText();
            String losenord = txtAgentLosenord.getText();
            String plats = txtAgentOmrade.getText();
            String fraga = "UPDATE alien SET Namn = ?, Telefon = ?, "
                    + "Datum = ?, Administrator = ?, Losenord = ?, Plats = ? WHERE Alien_ID = ? ";
            statement = connection1.prepareStatement(fraga);
           //  
            statement.setString(1, namn);
            statement.setString(2, telefon);
            statement.setString(3, datum);
            statement.setString(4, admin);
            statement.setString(5, losenord);
            statement.setString(6, plats);
            statement.setInt(7, id);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Agent ändrad");
            table_update();
           
            txtAgentID.setText("");
            txtAgentNamn.setText("");
            txtAgentTelefon.setText("");
            txtAgentDatum.setText("");
            txtAgentAdmin.setText("");
            txtAgentLosenord.setText("");
            txtAgentOmrade.setText("");
            txtAgentID.requestFocus();
            
         
             } catch (SQLException ex) {
                Logger.getLogger(Hantera_Aliens.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonRensaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRensaDataActionPerformed
        // TODO add your handling code here:
             txtAgentID.setText("");
             txtAgentNamn.setText("");
             txtAgentTelefon.setText("");
             txtAgentDatum.setText("");
             txtAgentAdmin.setText("");
             txtAgentLosenord.setText("");
             txtAgentOmrade.setText("");
             txtAgentID.requestFocus();
             
    }//GEN-LAST:event_buttonRensaDataActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        
        txtAgentID.setText(df.getValueAt(selectedIndex, 0).toString());
        txtAgentNamn.setText(df.getValueAt(selectedIndex, 1).toString());
        txtAgentTelefon.setText(df.getValueAt(selectedIndex, 2).toString());
        txtAgentDatum.setText(df.getValueAt(selectedIndex, 3).toString());
        txtAgentAdmin.setText(df.getValueAt(selectedIndex, 4).toString());
        txtAgentLosenord.setText(df.getValueAt(selectedIndex, 5).toString());
        txtAgentOmrade.setText(df.getValueAt(selectedIndex, 6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    
    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonRensaData;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAgentAdmin;
    private javax.swing.JTextField txtAgentDatum;
    private javax.swing.JTextField txtAgentID;
    private javax.swing.JTextField txtAgentLosenord;
    private javax.swing.JTextField txtAgentNamn;
    private javax.swing.JTextField txtAgentOmrade;
    private javax.swing.JTextField txtAgentTelefon;
    // End of variables declaration//GEN-END:variables
}
