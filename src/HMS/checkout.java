package HMS;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;

public class checkout extends javax.swing.JFrame {

    public checkout() {
        initComponents();
        this.setLocationRelativeTo(null);
        dateSet();
        
        String cmd = "select * from cust_info join record where cust_info.id = record.customer_id and record.in_date = '"+dateGet()+"'";
        outrecordtable.setModel(dataret.getinforecord(fcn(), cmd));
        
    }
    
    public void dateSet(){
        Date ndate = new Date();
        System.out.println(ndate);
        outdatecheck.setDate(ndate);
    }
    
    public String dateGet(){
        Date val = outdatecheck.getDate();
        DateFormat convrt = new SimpleDateFormat("yyyy-MM-dd");
        String date = convrt.format(val);
        System.out.println(date);
        return date;
    }
    public String[] fcn(){
        int c = outrecordtable.getColumnCount();
        System.out.println(c);
        int i=0;
        String[] colname= new String[outrecordtable.getColumnCount()];
        while(i<c){
            colname[i] = outrecordtable.getColumnName(i++); //storing column name
        }
        return colname;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tooperatorbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outrecordtable = new javax.swing.JTable();
        checkoutbtn = new javax.swing.JButton();
        outextendbtn = new javax.swing.JButton();
        refreshbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        outdatecheck = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tooperatorbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tooperatorbtn.setText("<");
        tooperatorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tooperatorbtnActionPerformed(evt);
            }
        });

        outrecordtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "NID", "Number", "Check_IN", "Check_OUT", "Service_No", "Room_No", "Payment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(outrecordtable);

        checkoutbtn.setText("Check Out");
        checkoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutbtnActionPerformed(evt);
            }
        });

        outextendbtn.setText("Extend ");
        outextendbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outextendbtnActionPerformed(evt);
            }
        });

        refreshbtn.setText("Refresh");
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Check Out");

        outdatecheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outdatecheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tooperatorbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 348, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outextendbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outdatecheck, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tooperatorbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(outdatecheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(checkoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(outextendbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 147, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tooperatorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tooperatorbtnActionPerformed
        new operator().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tooperatorbtnActionPerformed

    private void outextendbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outextendbtnActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_outextendbtnActionPerformed

    private void currentrecorddatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_currentrecorddatePropertyChange
       
    }//GEN-LAST:event_currentrecorddatePropertyChange
/***
 * Date oDate = jXDatePicker1.getDate();        
DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
String szDate = oDateFormat.format(oDate);
 * @param evt 
 */
    private void currentrecorddateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentrecorddateActionPerformed
        //coverting date to simpleformat for database from datechooser
        /*Date val = currentrecorddate.getDate();
        DateFormat convrt = new SimpleDateFormat("yyyy-MM-dd");
        String date = convrt.format(val);
        System.out.println(date);*/
        
    }//GEN-LAST:event_currentrecorddateActionPerformed

    private void checkoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkoutbtnActionPerformed

    private void outdatecheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outdatecheckActionPerformed
        Date val = outdatecheck.getDate();
        DateFormat convrt = new SimpleDateFormat("yyyy-MM-dd");
        String date = convrt.format(val);
//        System.out.println(date);
    }//GEN-LAST:event_outdatecheckActionPerformed

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        String cmd = "select * from cust_info join record where cust_info.id = record.customer_id and record.in_date = '"+dateGet()+"'";
        outrecordtable.setModel(dataret.getinforecord(fcn(), cmd));
    }//GEN-LAST:event_refreshbtnActionPerformed

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
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkoutbtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker outdatecheck;
    private javax.swing.JButton outextendbtn;
    private javax.swing.JTable outrecordtable;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JButton tooperatorbtn;
    // End of variables declaration//GEN-END:variables
}
