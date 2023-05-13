/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_firstpage;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class petrol_update extends javax.swing.JFrame {

    Connection conn;
    private String prevval,newval,stockup,rateup,densityup,updatetype,density;
    public petrol_update(String updatetype) {
        this.updatetype = updatetype;
        conn = db.dbconnect();
        initComponents();
        SimpleDateFormat ft
            = new SimpleDateFormat("dd-MM-yyyy");
        String date = ft.format(new Date());
        this.date.setText(date);
        jLabel1.setText(updatetype);
        
        try{
            PreparedStatement p = conn.prepareStatement("select density_up from product_update where `type`='"+updatetype+"'");
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                 
                 density = rs.getString("density_up"); 
            } 
        }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,"Order unsucessfull try again");
            System.out.println(e);
            
        }
            density1.setText((density));
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stock1 = new javax.swing.JTextField();
        density1 = new javax.swing.JTextField();
        updatebt = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rate1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        closebt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(253, 213, 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setText("PETROL");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("DATE :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("STOCK ADDED IN LITERS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 170, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("NEW RATE");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("DENSITY");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, 20));

        stock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock1ActionPerformed(evt);
            }
        });
        jPanel2.add(stock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 210, 30));

        density1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                density1ActionPerformed(evt);
            }
        });
        jPanel2.add(density1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 210, 30));

        updatebt.setText("UPDATE");
        updatebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebtMouseClicked(evt);
            }
        });
        jPanel2.add(updatebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, 30));

        jButton2.setText("BACK");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, 30));

        rate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate1ActionPerformed(evt);
            }
        });
        jPanel2.add(rate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 292, 210, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_firstpage/pump image2.jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 250, 500, 360));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_firstpage/pump image2_1.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date.setText("jLabel8");
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 90, -1));

        closebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_firstpage/close (1).png"))); // NOI18N
        closebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtMouseClicked(evt);
            }
        });
        jPanel2.add(closebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 620, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stock1ActionPerformed

    private void rate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rate1ActionPerformed

    private void density1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_density1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_density1ActionPerformed

    private void updatebtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtMouseClicked
         String uptype = this.updatetype;
         stockup = stock1.getText();
         rateup = rate1.getText();
         densityup = density1.getText();
         
         prevval = null;
        try{
            PreparedStatement p = conn.prepareStatement("select stock_up,density_up from product_update where `type`='"+uptype+"'");
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                 prevval = rs.getString("stock_up");
            } 
        }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,"Order unsucessfull try again");
            System.out.println(e);
            
        }
        newval=String.valueOf((Double.parseDouble(prevval))+(Double.parseDouble(stockup)));
            try{
            PreparedStatement pst = conn.prepareStatement("update product_update set stock_up = ?, rate_up = ?, density_up = ? where `type`='"+uptype+"'");
            pst.setString(1,newval);
            pst.setString(2,rateup);
            pst.setString(3,densityup);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Order successfully added ");
            setVisible(false);
            new first_page().setVisible(true); 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Order unsucessfull try again");
            System.out.println(e);
        }
            
    }//GEN-LAST:event_updatebtMouseClicked

    private void closebtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtMouseClicked
        this.dispose();
        new admin_firstpage().setVisible(true);
    }//GEN-LAST:event_closebtMouseClicked

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
            java.util.logging.Logger.getLogger(petrol_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(petrol_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(petrol_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(petrol_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String myval="default";
                new petrol_update(myval).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebt;
    private javax.swing.JLabel date;
    private javax.swing.JTextField density1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField rate1;
    private javax.swing.JTextField stock1;
    private javax.swing.JButton updatebt;
    // End of variables declaration//GEN-END:variables
}
