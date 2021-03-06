
import java.sql.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RoomCharges.java
 *
 * Created on Jan 25, 2011, 10:33:52 PM
 */

/**
 *
 * @author Administrator
 */
public class RoomCharges extends javax.swing.JFrame {

    /** Creates new form RoomCharges */
    public RoomCharges() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EnterNewChargesPanel = new javax.swing.JPanel();
        ChangeB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TCode2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        curCharges = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ChargesTF = new javax.swing.JTextField();
        error1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EnterNewChargesPanel.setMaximumSize(new java.awt.Dimension(367, 367));
        EnterNewChargesPanel.setPreferredSize(new java.awt.Dimension(87, 104));

        ChangeB.setText("Change");
        ChangeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeBActionPerformed(evt);
            }
        });

        jLabel4.setText("Type Code");

        TCode2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SN", "DB", "DL", "SD" }));
        TCode2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TCode2ItemStateChanged(evt);
            }
        });
        TCode2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCode2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Current Charges:");

        curCharges.setText("                        ");
        curCharges.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setText("New Charges:    ");

        error1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error1.setText("           ");
        error1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        error1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Modify Room Charges");

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("RAJ Guest House");

        javax.swing.GroupLayout EnterNewChargesPanelLayout = new javax.swing.GroupLayout(EnterNewChargesPanel);
        EnterNewChargesPanel.setLayout(EnterNewChargesPanelLayout);
        EnterNewChargesPanelLayout.setHorizontalGroup(
            EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterNewChargesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(error1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(EnterNewChargesPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnterNewChargesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(EnterNewChargesPanelLayout.createSequentialGroup()
                        .addGroup(EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EnterNewChargesPanelLayout.createSequentialGroup()
                                .addGroup(EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(38, 38, 38)
                                .addGroup(EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChargesTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TCode2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(curCharges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(EnterNewChargesPanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(ChangeB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(61, 61, 61))))
            .addGroup(EnterNewChargesPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EnterNewChargesPanelLayout.setVerticalGroup(
            EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterNewChargesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EnterNewChargesPanelLayout.createSequentialGroup()
                        .addGroup(EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TCode2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(curCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChargesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addComponent(ChangeB))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(error1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EnterNewChargesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EnterNewChargesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChangeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeBActionPerformed
        // TODO add your handling code here:
        String code = TCode2.getSelectedItem().toString();
        int charges =Integer.parseInt( ChargesTF.getText());
        try {
            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/Hotal";
            Connection conn = DriverManager.getConnection(database, "root", "pace");
            Statement stmt = conn.createStatement();
            String sql = "update Type set Charges = " + charges + " where TypeCode = '" + code + "'" ;
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            error1.setText("Information added");
        } catch (Exception e) { error1.setText("Invalid Data");}
}//GEN-LAST:event_ChangeBActionPerformed

    private void TCode2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TCode2ItemStateChanged
        // TODO add your handling code here:
        String code = TCode2.getSelectedItem().toString();
        try {

            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/Hotal";
            Connection conn = DriverManager.getConnection(database, "root", "pace");
            Statement stmt = conn.createStatement();
            String sql = "select Charges from Type where TypeCode = '" + code + "'";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            int str = rs.getInt("Charges");
            rs.close();
            stmt.close();
            conn.close();
            curCharges.setText("Rs " + str);
        } catch (Exception e) { }
}//GEN-LAST:event_TCode2ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TCode2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCode2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCode2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomCharges().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeB;
    private javax.swing.JTextField ChargesTF;
    private javax.swing.JPanel EnterNewChargesPanel;
    private javax.swing.JComboBox TCode2;
    private javax.swing.JLabel curCharges;
    private javax.swing.JLabel error1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

}
