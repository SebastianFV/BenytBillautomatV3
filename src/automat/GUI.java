/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;
import java.util.Date;
import javax.swing.DefaultListModel;

/**
 *
 * @author Squid
 */
public class GUI extends javax.swing.JPanel 
{
    Billetautomat automat;      // Sådan man kan kalde funktioner fra en anden klasse uden at lave et nyt objekt.
    BenytBilletautomat benyt;
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
        tilføjTilKurv();
    }
    
    void tilføjTilKurv()
    {
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < 10; i++) {
            listModel.addElement("Halløj");
        }
        Indkøbskurv.setModel(listModel);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dato))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Balance)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IndbetalLabel)
                                    .addComponent(IndbetalingsVindue, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(161, 161, 161)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titel)
                .addGap(21, 21, 21)
                .addComponent(Balance)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(IndbetalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IndbetalingsVindue, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(dato)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", jPanel1);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Balance;
    private javax.swing.JLabel IndbetalLabel;
    private javax.swing.JTextField IndbetalingsVindue;
    private javax.swing.JList<String> Indkøbskurv;
    private javax.swing.JLabel dato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel titel;
    // End of variables declaration//GEN-END:variables

}
