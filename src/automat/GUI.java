/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;
//import java.util.Date;
import javax.swing.DefaultListModel;

/**
 *
 * @author Squid
 */
public class GUI extends javax.swing.JPanel 
{
    Billetautomat automat;      // Sådan man kan kalde funktioner fra en anden klasse uden at lave et nyt objekt.
    Transaktionslog log;
    BenytBilletautomat benyt;
    
    public boolean vButtonChecked = false;
    public boolean bButtonChecked = false;
    
    /**
     * Creates new form GUI
     */
    public GUI() 
    {
        initComponents();
    }
    
    void updateAutomat() 
    {
        dato.setText("Dato: " + automat.getTidspunkt());
        int balance = automat.getBalance();
        Balance.setText("Balance: " + balance);
//        tilføjTilKurv();
    }
    // Meningen med denne funktion er at den skal printe en liste med alle de billetter kunden har valgt. Lige nu printer den bare halløj 5 gange hvor dette skal stå.
    void tilføjTilKurv()
    {
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < log.billet.size(); i++) {
            listModel.addElement(automat.getAntalBBillet());
        }
        Indkøbskurv.setModel(listModel);
    }
    
    void reset()
    {
        automat.setAntalBBillet(0);
        automat.setAntalVBillet(0);
        DefaultListModel listModel = new DefaultListModel();
        Indkøbskurv.setModel(listModel);
        dato.setText("Dato: " + automat.getTidspunkt());
        int balance = automat.getBalance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        titel = new javax.swing.JLabel();
        dato = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        IndbetalLabel = new javax.swing.JLabel();
        IndbetalingsVindue = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Indkøbskurv = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        voksenbillet = new javax.swing.JCheckBox();
        børnebillet = new javax.swing.JCheckBox();
        antalVBilletter = new javax.swing.JTextField();
        antalBBilletter = new javax.swing.JTextField();
        køb = new javax.swing.JButton();

        setBorder(new javax.swing.border.MatteBorder(null));

        titel.setText("Billetautomat");

        dato.setText("Dato: ");

        Balance.setText("Balance: ");

        IndbetalLabel.setText("Indbetal Penge: ");

        IndbetalingsVindue.setText("0");
        IndbetalingsVindue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndbetalingsVindueActionPerformed(evt);
            }
        });

        Indkøbskurv.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(Indkøbskurv);

        jLabel1.setText("Indkøbskurv");

        voksenbillet.setText("Voksenbillet");
        voksenbillet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voksenbilletActionPerformed(evt);
            }
        });

        børnebillet.setText("Børnebillet");
        børnebillet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                børnebilletActionPerformed(evt);
            }
        });

        antalVBilletter.setText("0");
        antalVBilletter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antalVBilletterActionPerformed(evt);
            }
        });

        antalBBilletter.setText("0");
        antalBBilletter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antalBBilletterActionPerformed(evt);
            }
        });

        køb.setText("Køb");
        køb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                købActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(køb))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IndbetalingsVindue, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Balance))
                                        .addGap(164, 164, 164)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IndbetalLabel)
                                            .addComponent(voksenbillet)
                                            .addComponent(børnebillet))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(antalBBilletter, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                            .addComponent(antalVBilletter))))))
                        .addGap(0, 115, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(køb))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titel)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(voksenbillet)
                                    .addComponent(antalVBilletter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(børnebillet)
                                    .addComponent(antalBBilletter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addComponent(IndbetalLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IndbetalingsVindue, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Balance))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                        .addComponent(dato)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IndbetalingsVindueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndbetalingsVindueActionPerformed
        try {
            int indbetalt = Integer.parseInt(IndbetalingsVindue.getText());
            automat.indsætPenge(indbetalt);
            System.out.println("Du har indbetalt " + indbetalt + "kr");
        } catch (Exception e) {
            String str = javax.swing.JOptionPane.showInputDialog("Kun tal tilladt!");
        }
        updateAutomat();
    }//GEN-LAST:event_IndbetalingsVindueActionPerformed

    private void voksenbilletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voksenbilletActionPerformed
         if(vButtonChecked == true)
             vButtonChecked = false;
         else vButtonChecked = true;
    }//GEN-LAST:event_voksenbilletActionPerformed

    private void antalVBilletterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antalVBilletterActionPerformed
        if(vButtonChecked == true)
        {
            try {
            int antalBilletterKøbt = Integer.parseInt(antalVBilletter.getText());
            automat.setAntalVBillet(antalBilletterKøbt);
            System.out.println("Du har købt " + antalBilletterKøbt + " voksenbilletter");
//            log.tilføjTilKurv(antalBilletterKøbt, "Voksenbillet", automat.getVBilletpris());
            } catch (Exception e) {
                String str = javax.swing.JOptionPane.showInputDialog("Kun tal tilladt!");
            }
            updateAutomat();
        }
        else System.err.println("Checkmark was not pressed");
        
    }//GEN-LAST:event_antalVBilletterActionPerformed

    private void børnebilletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_børnebilletActionPerformed
        if(bButtonChecked == true)
            bButtonChecked = false;
        else bButtonChecked = true;
    }//GEN-LAST:event_børnebilletActionPerformed

    private void antalBBilletterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antalBBilletterActionPerformed
        if(bButtonChecked == true)
        {
            try {
            int antalBilletterKøbt = Integer.parseInt(antalBBilletter.getText());
            automat.setAntalBBillet(antalBilletterKøbt);
            System.out.println("Du har købt " + antalBilletterKøbt + " børnebilletter");
//            log.tilføjTilKurv(antalBilletterKøbt, "Børnebillet", automat.getBBilletpris());
            } catch (Exception e) {
                String str = javax.swing.JOptionPane.showInputDialog("Kun tal tilladt!");
            }
            updateAutomat();
        }
        else System.err.println("Checkmark was not pressed");
    }//GEN-LAST:event_antalBBilletterActionPerformed

    private void købActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_købActionPerformed
        reset();
    }//GEN-LAST:event_købActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Balance;
    private javax.swing.JLabel IndbetalLabel;
    private javax.swing.JTextField IndbetalingsVindue;
    private javax.swing.JList<String> Indkøbskurv;
    private javax.swing.JTextField antalBBilletter;
    private javax.swing.JTextField antalVBilletter;
    private javax.swing.JCheckBox børnebillet;
    private javax.swing.JLabel dato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton køb;
    private javax.swing.JLabel titel;
    private javax.swing.JCheckBox voksenbillet;
    // End of variables declaration//GEN-END:variables

}
