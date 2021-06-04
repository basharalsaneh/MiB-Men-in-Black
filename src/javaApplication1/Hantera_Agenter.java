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
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author mac
 */
public class Hantera_Agenter extends javax.swing.JFrame {
    
    Validering InloggadSom;
    InfDB idb;
    

    /**
     * Creates new form Registrering_Agenter
     */
    public Hantera_Agenter(InfDB idb, Validering InloggadSom) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.InloggadSom = InloggadSom;
        this.idb = idb;
        FyllComboboxar();
        VisaAllaAgenter(); // anropar en metod som ska visa alla Agenter
    }
    
    
    private void FyllComboboxar(){
        
        agentCombobox.removeAllItems();
        områdeCombobox.removeAllItems();
        
        String omradeFraga = "SELECT Benamning FROM Omrade";
        String agentFraga = "SELECT Agent_ID, namn FROM Agent";
        
        ArrayList<String> allaOmradesnamn;
        ArrayList<HashMap<String, String>> allaAgentnamn;
        
        try{
            
        allaOmradesnamn = idb.fetchColumn(omradeFraga);
        allaAgentnamn = idb.fetchRows(agentFraga);

            for (String omrade : allaOmradesnamn){
                områdeCombobox.addItem(omrade);
            }  
            
            for (HashMap<String, String> agent : allaAgentnamn){
                String agenter = "ID: " + agent.get("Agent_ID") + ", " + agent.get("namn");
                agentCombobox.addItem(agenter);
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
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        txtAgentLosenord = new javax.swing.JTextField();
        buttonRensaData = new javax.swing.JButton();
        ändraAgentButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAgent = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buttonDelete = new javax.swing.JButton();
        laggTillAgent = new javax.swing.JToggleButton();
        adminBox = new javax.swing.JComboBox<>();
        områdeCombobox = new javax.swing.JComboBox<>();
        labelAgent_ID = new javax.swing.JLabel();
        visaAllaAgenter = new javax.swing.JToggleButton();
        goBackButton = new javax.swing.JToggleButton();
        agentCombobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        ändraAgentButton.setText("Ändra");
        ändraAgentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraAgentButtonActionPerformed(evt);
            }
        });

        txtAreaAgent.setColumns(20);
        txtAreaAgent.setRows(5);
        jScrollPane1.setViewportView(txtAreaAgent);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel1.setText("(max 6 tecken)");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel9.setText("(YYYY-MM-DD)");

        buttonDelete.setText("Ta bort Agent");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        laggTillAgent.setText("Lägg till");
        laggTillAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laggTillAgentActionPerformed(evt);
            }
        });

        adminBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ja", "Nej" }));

        labelAgent_ID.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(29, 29, 29))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(14, 14, 14))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(29, 29, 29))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonRensaData, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ändraAgentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(laggTillAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAgentNamn)
                                    .addComponent(txtAgentLosenord, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAgentDatum)
                                    .addComponent(txtAgentTelefon, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelAgent_ID)
                                            .addComponent(adminBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(områdeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(labelAgent_ID))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAgentTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAgentDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(adminBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAgentLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(områdeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonRensaData, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(ändraAgentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laggTillAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addComponent(buttonDelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        visaAllaAgenter.setText("Visa Alla Agenter");
        visaAllaAgenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaAllaAgenterActionPerformed(evt);
            }
        });

        goBackButton.setText("Gå tillbaka");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        agentCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentComboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(agentCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(visaAllaAgenter)
                        .addGap(94, 94, 94)
                        .addComponent(goBackButton)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visaAllaAgenter)
                    .addComponent(goBackButton)
                    .addComponent(agentCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    private void VisaAllaAgenter(){
        
        txtAreaAgent.setText(""); // Nollställer txtArean.
        
        ArrayList<HashMap<String, String>> allaAgenter;
        // Det är en ArrayList av Hashmaps som kommer att hämtas från Databasen.
        
        try {
            String fraga = "SELECT * FROM agent"; // Vill ha med all info från alla agenter.
            allaAgenter = idb.fetchRows(fraga); // idb.fetchrows - en redan befintlig metod i InfDBklassen, som returnerar ett värden med ArrayList av hashmaps.
                
            
            
            // Första raden i rutan txtAreaAgent ska visa fältnamnen.
            txtAreaAgent.append("Agent ID"+"\t");
            txtAreaAgent.append("Namn"+"\t");
            txtAreaAgent.append("Telefon"+"\t");
            txtAreaAgent.append("Anställningsdatum"+ "\t");
            txtAreaAgent.append("Admin" + "\t");
            txtAreaAgent.append("Lösenord" + "\t");
            txtAreaAgent.append("Område" + "\t");
            txtAreaAgent.append("Ansvarig för Område"+ "\n");
            
            
            
            // en For loop som strukturerar varje hasmap för sig, under respektive fält.
            for (HashMap<String, String> Agent : allaAgenter) {
                txtAreaAgent.append(Agent.get("Agent_ID") + "\t");
                txtAreaAgent.append(" " + Agent.get("Namn") + "\t");
                txtAreaAgent.append(" " + Agent.get("Telefon") + "\t");
                txtAreaAgent.append(" " + Agent.get("Anstallningsdatum") + "              "+ "\t"); // Behövde skapa ett extra stort mellanrum här för att få värdena att komma under rätt fältnamn.
                txtAreaAgent.append(" " + Agent.get("Administrator") + "\t");
                txtAreaAgent.append(" " + Agent.get("Losenord") + "\t");
                
                String omradeFraga = "Select Benamning from Omrade where Omrades_ID ="+Agent.get("Omrade");
                String omrade = idb.fetchSingle(omradeFraga);
                txtAreaAgent.append(" " + omrade + "\t");
                
                String ansvarigForOmrade = "Select Benamning from Omrade where Omrades_ID =(Select Omrade from omradeschef where Agent_ID = "+Agent.get("Agent_ID")+ ")";
                String omradeAnsvar = idb.fetchSingle(ansvarigForOmrade);
                txtAreaAgent.append(" " + omradeAnsvar + "\n");
                
            }
        }
        catch (InfException ettUndantag) { 
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            // Vi får ett felmeddelande som ska visa vart felet uppstod någonstans. Den hjälpte mig hitta när det var t.ex fel i SQL frågan.
            
        }
        catch (Exception ettUndantag) { //lägger även till nullpointer exception
            JOptionPane.showMessageDialog(null, "Ett fel uppstod!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }  
        
    }
    
    private void rensaFalt(){
     // Denna kod tar bort all data som i textfältena. T.ex om man råkade skriva fel.
        labelAgent_ID.setText("");
        txtAgentNamn.setText("");
        txtAgentTelefon.setText("");
        txtAgentDatum.setText("");
        txtAgentLosenord.setText("");
    }
    
    private void buttonRensaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRensaDataActionPerformed
        // TODO add your handling code here:
        
       rensaFalt();

    }//GEN-LAST:event_buttonRensaDataActionPerformed

    private void ändraAgentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraAgentButtonActionPerformed
        // TODO add your handling code here:
        
        // En metod som ska uppdatera datan hos en agent med all data som finns skriven i textfälten. Agenten som ska uppdateras skrivs 
        
        String Agent = agentCombobox.getSelectedItem().toString();
        String baraID = Agent.replaceAll("\\D+","");
        int agentID = Integer.parseInt(baraID);
        
        
        
        try {
            
            String namn = txtAgentNamn.getText(); // FÃ¥r ej vara null
            String telefon = txtAgentTelefon.getText();
            String datum = txtAgentDatum.getText();    // FÃ¥r ej vara null
            String losenord = txtAgentLosenord.getText();
            String plats = områdeCombobox.getSelectedItem().toString();
            
            String omradeFraga = "Select Omrades_ID from Omrade where Benamning = '"+plats+"'";
            String OmradeID = idb.fetchSingle(omradeFraga);
            int omrade = Integer.parseInt(OmradeID);
            
            String admin = "Ja";
            String kollaAdmin = adminBox.getSelectedItem().toString();
            if (kollaAdmin.equals(admin)){
                admin = "J";
            }
            else admin = "N";
            
            
            // SQL frågan är utformad så att den uppdaterar alla fälten hos Agenten. Om ett fält har samma värde som innan, så blir det ingen skillnad.
            // Och alla värden som är annorlunda kommer att bli uppdaterade.
            String uppdateraAgent = "UPDATE agent SET Namn = \""+namn+"\", Telefon = \""+telefon+"\", Anstallningsdatum = \""+datum+"\", Administrator = \""+admin+"\", Losenord = \""+losenord+"\", Omrade = "+omrade+" WHERE Agent_ID = "+agentID+";";

            idb.update(uppdateraAgent);
            
            
            
            JOptionPane.showMessageDialog(this, "Agent ändrad");
            txtAreaAgent.setText("");
            agentCombobox.setSelectedIndex(-1);
            FyllComboboxar();
            rensaFalt();
            

        }  catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } 
        
    }//GEN-LAST:event_ändraAgentButtonActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        
        // hämtar Agent_ID som man skrev in i fältet txtHämtaAgent.
        String StringID = labelAgent_ID.getText();// FÃ¥r ej vara null
        int id = Integer.parseInt(StringID); // Omvandlar String till INT. För Agent_ID är av typen INT.
        
        Boolean hittatKontorschef = false;
        Boolean hittatOmradeschef = false;
        Boolean hittatAlienAnsvar = false;
        
        
        ArrayList<String> allaKontorschefer;
        ArrayList<String> allaOmradeschefer;
        ArrayList<String> alienAnsvarig;
        
        String kollaKontorschef = "Select Agent_ID from Kontorschef";
        String kollaOmradeschef = "Select Agent_ID from Omradeschef";
        String kollaAnsvarigForAlien = "Select Ansvarig_Agent from Alien";
        
        // SQL fråga som tar bort en Agent från Databasen där Agent_ID = det som man skrev in i txtHämtaAgent.
        String fragaTaBortAgent = "DELETE FROM Agent WHERE Agent_ID ="+ id;
        
        
        
        // En dialogruta ska poppa ut så att man inte tar bort en agent av misstag. Den här dialogrutan ska uppdateras och förbättras. T.ex Ta med mer information om vilken agent som håller på att tas bort.
        int svar = JOptionPane.showConfirmDialog(this, "Vill du verkligen ta bort den här Agenten: Agent_ID "+ id, "Fortsätta?", JOptionPane.YES_NO_OPTION);
        
        // Om man trycker på "Yes" så ska agenten tas bort från systemet.
        if(svar==JOptionPane.YES_OPTION){
        try{
            
            
            
            allaKontorschefer = idb.fetchColumn(kollaKontorschef);
            allaOmradeschefer = idb.fetchColumn(kollaOmradeschef);
            alienAnsvarig = idb.fetchColumn(kollaAnsvarigForAlien);
            
            for(String agent : allaKontorschefer){
                if (agent.equals(StringID)){
                    hittatKontorschef = true;
                    
                }
                
            }
            if (hittatKontorschef == true){
                JOptionPane.showMessageDialog(null, "Denna Agent är kontorschef! vänligen ändra Kontorschef först!");
                
            }
            
            
            for(String agent : allaOmradeschefer){
                if (agent.equals(StringID)){
                    hittatOmradeschef = true;
                    
                }
                
            }
            if (hittatOmradeschef == true){
                JOptionPane.showMessageDialog(null, "Denna Agent är Områdeschef! vänligen ändra Områdeschef först!");
                
            }
            
            for(String agent : alienAnsvarig){
                if (agent.equals(StringID)){
                    hittatAlienAnsvar = true;
                    
                }
            }
            if (hittatAlienAnsvar == true){
            JOptionPane.showMessageDialog(null, "Denna Agent är ansvarig för en Alien! Vänligen byt ansvaret till en annan Agent!");
            
        }
        
            
            if(hittatKontorschef == false && hittatOmradeschef == false && hittatAlienAnsvar == false){
        idb.delete(fragaTaBortAgent);
        JOptionPane.showMessageDialog(this, "Agent borttagen");
            
        FyllComboboxar();
            // Uppdaterar listan med alla Agenter
            
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
        else {
            // Visar för användaren att agenten inte blev borttagen
            JOptionPane.showMessageDialog(this, "Agent ej borttagen");
        }
        
        
        
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void visaAllaAgenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaAllaAgenterActionPerformed
        // TODO add your handling code here:
        
        VisaAllaAgenter();
        rensaFalt();
        
        // Anropar metoden VisaAllaAgenter som ja.. Visar alla agenter i txtArean! :D
        
    }//GEN-LAST:event_visaAllaAgenterActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Admin(idb, InloggadSom).setVisible(true);
        
        // Så att man kan gå tillbaka till föregående ruta som Admin. 
        
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void laggTillAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laggTillAgentActionPerformed
        // TODO add your handling code here:
        
        
        try {
            
            String fraga = "SELECT IFNULL(max(agent_ID),0) FROM agent";
            String stringAgent = idb.fetchSingle(fraga);
            int nyttId = Integer.parseInt(stringAgent) + 1;
             
            String namn = txtAgentNamn.getText(); // FÃ¥r ej vara null
            String telefon = txtAgentTelefon.getText();
            String datum = txtAgentDatum.getText();    // FÃ¥r ej vara null
            String losenord = txtAgentLosenord.getText();
            
            String plats = områdeCombobox.getSelectedItem().toString();
            String omradeFraga = "Select Omrades_ID from Omrade where Benamning ='"+plats+"'";
            String OmradeID = idb.fetchSingle(omradeFraga);
            int omrade = Integer.parseInt(OmradeID);
            
            String admin = "Ja";
            String kollaAdmin = adminBox.getSelectedItem().toString();
            if (kollaAdmin.equals(admin)){
                admin = "J";
            }
            else admin = "N";   
            
            
            String nyAgent = "INSERT INTO agent (Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Losenord, Omrade) VALUES ("+nyttId+", \""+namn+"\", \""+telefon+"\", \""+datum+"\", \""+admin+"\", \""+losenord+"\","+omrade+");";
            

            

            idb.insert(nyAgent);
            
            //txtAreaAgent.setText(nyregistreradAgent);
            
            
            JOptionPane.showMessageDialog(this, "Agent registrerad med ID: " + nyttId);
            
            txtAreaAgent.setText("");
            
            FyllComboboxar();
            rensaFalt();
            

        }  catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } 
        
    }//GEN-LAST:event_laggTillAgentActionPerformed

    private void agentComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentComboboxActionPerformed
        // TODO add your handling code here:
        
        
        // Ska kolla upp en Agent.
        ArrayList<HashMap<String, String>> kollaAgent;
        
        // Agenten som ska kollas upp skriver man in i txtHämtaAgent.
        
        
        
        
        try {
            int i = -1;
           
            if(agentCombobox.getSelectedIndex() != i){
                
            String enAgent = agentCombobox.getSelectedItem().toString();
            String baraID = enAgent.replaceAll("\\D+","");
            int id = Integer.parseInt(baraID);
        
        
            String admin = "J";
            
            
            String fraga = "SELECT * FROM agent where Agent_ID =" + id; // SQL fråga som ska hämta all information om Agenten.
            kollaAgent = idb.fetchRows(fraga);
            
            // Sätter ut "Titlarna" på respektive kolumn.
            txtAreaAgent.setText("");
            txtAreaAgent.append("Agent ID"+"\t");
            txtAreaAgent.append("Namn"+"\t");
            txtAreaAgent.append("Telefon"+"\t");
            txtAreaAgent.append("Anställningsdatum"+ "\t");
            txtAreaAgent.append("Admin" + "\t");
            txtAreaAgent.append("Lösenord" + "\t");
            txtAreaAgent.append("Område" + "\n");
            
   
                // Sätter ut all info på txtArean om agenten. 
                for (HashMap<String, String> Agent : kollaAgent) {
                txtAreaAgent.append(Agent.get("Agent_ID") + "\t");
                txtAreaAgent.append(" " + Agent.get("Namn") + "\t");
                txtAreaAgent.append(" " + Agent.get("Telefon") + "\t");
                txtAreaAgent.append(" " + Agent.get("Anstallningsdatum") + "              "+ "\t");
                txtAreaAgent.append(" " + Agent.get("Administrator") + "\t");
                txtAreaAgent.append(" " + Agent.get("Losenord") + "\t");
                
                String omradeFraga = "Select Benamning from Omrade where Omrades_ID ="+Agent.get("Omrade");
                String omrade = idb.fetchSingle(omradeFraga);
                txtAreaAgent.append(" " + omrade + "\n");
                
                
                // Vill att all info som hämtas om agenten ska också komma in på respektive täxtfält bredvid txtArean.
                labelAgent_ID.setText(Agent.get("Agent_ID"));
                txtAgentNamn.setText(Agent.get("Namn"));
                txtAgentTelefon.setText(Agent.get("Telefon"));
                txtAgentDatum.setText(Agent.get("Anstallningsdatum"));
                
                // Den här koden ska kolla om Admin är ett "J" hos agenten. Isåfall ska adminBox vara(true), och selected. 
                // Om agenten inte är Admin, alltså att Agent.get("Administrator") = "N", då ska Admin.box returnera false och inte vara selected.
                if (Agent.get("Administrator").equals(admin)){
                    adminBox.setSelectedItem("Ja");
                }
                else {
                    adminBox.setSelectedItem("Nej");
                }
                
                
                txtAgentLosenord.setText(Agent.get("Losenord"));
                
                
                String omradeFraga2 = "Select Benamning from Omrade where Omrades_ID = (Select Omrade from Agent where Agent_ID = " + id + ")";
                String plats = idb.fetchSingle(omradeFraga2);
                områdeCombobox.setSelectedItem(plats);
                
            }
                
            }
            
            
            
            
            
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        
        
    }//GEN-LAST:event_agentComboboxActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> adminBox;
    private javax.swing.JComboBox<String> agentCombobox;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonRensaData;
    private javax.swing.JToggleButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAgent_ID;
    private javax.swing.JToggleButton laggTillAgent;
    private javax.swing.JComboBox<String> områdeCombobox;
    private javax.swing.JTextField txtAgentDatum;
    private javax.swing.JTextField txtAgentLosenord;
    private javax.swing.JTextField txtAgentNamn;
    private javax.swing.JTextField txtAgentTelefon;
    private javax.swing.JTextArea txtAreaAgent;
    private javax.swing.JToggleButton visaAllaAgenter;
    private javax.swing.JButton ändraAgentButton;
    // End of variables declaration//GEN-END:variables
}
