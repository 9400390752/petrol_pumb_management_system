/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_firstpage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author SANJAI
 */
public class monthlyreport extends javax.swing.JFrame {

    private String trans_id,c_name,v_no,v_type,Date,volume,totalamt,f_type,total_volume="0",total_sales="0";
    Connection conn;
    public monthlyreport() {
        initComponents();
        conn= db.dbconnect();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        monthreport = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        closebt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(253, 213, 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        monthreport.setColumns(20);
        monthreport.setRows(5);
        jScrollPane1.setViewportView(monthreport);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 810, 520));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel1.setText("MONTHLY SALES REPORT ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 460, 60));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, 30));
        jPanel2.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 140, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PETROL", "DEISEL" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 130, 30));

        jButton1.setText("SUBMIT");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 120, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setText("END DATE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setText("STARTING DATE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setText("PRODUCT");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        jButton2.setText("REFRESH");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 120, -1));

        closebt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_firstpage/close (1).png"))); // NOI18N
        closebt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtMouseClicked(evt);
            }
        });
        jPanel2.add(closebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 830, 730));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String vtype =(String)jComboBox1.getSelectedItem();
        Date crdate1=(jDateChooser1.getCalendar().getTime());
       
       Calendar calendar1 = Calendar.getInstance();
       calendar1.setTime(crdate1);

    int day = calendar1.get(Calendar.DAY_OF_MONTH);
    int month = calendar1.get(Calendar.MONTH) + 1; // Months are zero-based
    int year = calendar1.get(Calendar.YEAR);
    
    Date crdate2=(jDateChooser2.getCalendar().getTime());
       
       Calendar calendar2 = Calendar.getInstance();
       calendar2.setTime(crdate2);

    int day2 = calendar2.get(Calendar.DAY_OF_MONTH);
    int month2 = calendar2.get(Calendar.MONTH) + 1; // Months are zero-based
    int year2 = calendar2.get(Calendar.YEAR);
    
    
    String extractedDate1 = String.format("%d-%02d-%02d", year, month, day);
    String extractedDate2 = String.format("%d-%02d-%02d", year2, month2, day2);
    try{
        PreparedStatement prst = conn.prepareStatement("SELECT *, DATE(date) AS Date FROM purchase WHERE DATE(date) >= DATE('" + extractedDate1 + "') AND DATE(date) <= DATE('" + extractedDate2 + "') AND fuel_type = '"+vtype+"' LIMIT 0, 1000");            
        ResultSet rs = prst.executeQuery();
        monthreport.setText(monthreport.getText()+" "+"====================================RELIENCE PETROLIUM PVT LIMITED=============================================\n");
        monthreport.setText(monthreport.getText()+" "+"\n");
        monthreport.setText(monthreport.getText()+" "+"=========================================MONTHLY SALES REPORT===============================================\n");
        monthreport.setText(monthreport.getText()+" "+"\n");
        monthreport.setText(monthreport.getText()+" "+"=============================================================================================================\n");
        monthreport.setText(monthreport.getText()+" "+"Date"+"\t"+"TRANX_ID"+"\t"+"NAME"+"\t"+"FUEL"+"\t"+"VEHICLE"+"\t"+"V_TYPE"+"\t"+"                  VOLUME     "+"\t"+"AMOUNT"+"\n");
        monthreport.setText(monthreport.getText()+" "+"=============================================================================================================\n");
        
        
         while(rs.next()){
            trans_id=rs.getString("purchase_id");
            c_name=rs.getString("cust_name");
            f_type=rs.getString("fuel_type");
            v_no=rs.getString("vehicle_no");
            v_type=rs.getString("vehicle_type");
            volume=rs.getString("fuel_liters");
            totalamt=rs.getString("total_rate");
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        
            Date tdate = rs.getTimestamp("Date");
            
            String formattedDate = dateFormat.format(tdate);
          
          monthreport.setText(monthreport.getText()+" "+formattedDate+"\t"+trans_id+"\t"+c_name+"\t"+f_type+"\t"+v_no+" \t "+v_type+" \t "+volume+"\t"+totalamt+"\n");
          monthreport.setText(monthreport.getText()+" "+"=============================================================================================================\n");
          
          total_volume=String.valueOf((Double.parseDouble(total_volume))+(Double.parseDouble(volume)));
          total_sales=String.valueOf((Double.parseDouble(total_sales))+(Double.parseDouble(totalamt)));
        }
         monthreport.setText(monthreport.getText()+" "+"\n");
         monthreport.setText(monthreport.getText()+"\t\t\t\t\t\tTOTAL FUEL SALED (Ltrs) :  "+total_volume+"\n");
         monthreport.setText(monthreport.getText()+" "+"\n");
         monthreport.setText(monthreport.getText()+"\t\t\t\t\t\tTOTAL AMOUNT (Rs)           :  "+total_sales+"\n");
         monthreport.setText(monthreport.getText()+" "+"\n");
         monthreport.setText(monthreport.getText()+" "+"==========================================REPORT END=========================================================\n");
         
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e); 
        }
    
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jButton2.setVisible(false);
        new monthlyreport().setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(monthlyreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(monthlyreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(monthlyreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(monthlyreport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new monthlyreport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea monthreport;
    // End of variables declaration//GEN-END:variables
}
