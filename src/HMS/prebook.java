package HMS;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class prebook extends javax.swing.JFrame {

    public prebook() {
        initComponents();
        this.setLocationRelativeTo(null);
        gDate();
        
        String cmd = "select * from cust_info join record join prebook where cust_info.ID = record.customer_id and prebook.rec_id = record.ID and record.in_date = '"+Dateset()+"' ";
        bookchecktable.setModel(dataret.getbookrecord(fcn(), cmd));
        
    }
    
    
    public void gDate(){
        Date cd = new Date();
        prebookdate.setDate(cd);
        
    }
    
    public String Dateset(){
        Date val = prebookdate.getDate();
        DateFormat convrt = new SimpleDateFormat("yyyy-MM-dd");
        String date = convrt.format(val);
        return date;        
    }
    
    public String[] fcn(){
        int c = bookchecktable.getColumnCount();
        System.out.println(c);
        int i=0;
        String[] colname= new String[bookchecktable.getColumnCount()];
        while(i<c){
            colname[i] = bookchecktable.getColumnName(i++); //storing column name
        }
        return colname;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookchecktable = new javax.swing.JTable();
        prebookcheckbtn = new javax.swing.JButton();
        checkintodashboardbtn = new javax.swing.JButton();
        prebookdate = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 204));
        jLabel3.setText("Booking Check");

<<<<<<< HEAD
        todashboardbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        todashboardbtn.setText("<");
        todashboardbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todashboardbtnActionPerformed(evt);
            }
        });

        bookchecktable.setModel(new javax.swing.table.DefaultTableModel(
=======
        dashrecordtable.setModel(new javax.swing.table.DefaultTableModel(
>>>>>>> 000b7fd13596c632dac794b36f30c065daa3e00f
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "NID", "Number", "Check_IN", "Check_OUT", "Service_No", "Room_No", "Payment", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bookchecktable);

        prebookcheckbtn.setBackground(new java.awt.Color(51, 0, 204));
        prebookcheckbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prebookcheckbtn.setForeground(new java.awt.Color(255, 255, 255));
        prebookcheckbtn.setText("Booking Check");
        prebookcheckbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prebookcheckbtnActionPerformed(evt);
            }
        });

        checkintodashboardbtn.setBackground(new java.awt.Color(51, 0, 204));
        checkintodashboardbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkintodashboardbtn.setForeground(new java.awt.Color(255, 255, 255));
        checkintodashboardbtn.setText("Check In");
        checkintodashboardbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkintodashboardbtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 0, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("<");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(306, 306, 306)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prebookcheckbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(prebookdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkintodashboardbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prebookdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prebookcheckbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkintodashboardbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(292, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkintodashboardbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkintodashboardbtnActionPerformed
        new dashboard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_checkintodashboardbtnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new dashboard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void prebookcheckbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prebookcheckbtnActionPerformed
        String cmd = "select * from cust_info join record join prebook where cust_info.ID = record.customer_id and prebook.rec_id = record.ID and record.in_date = '"+Dateset()+"' ";
        bookchecktable.setModel(dataret.getbookrecord(fcn(), cmd));
    }//GEN-LAST:event_prebookcheckbtnActionPerformed


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
            java.util.logging.Logger.getLogger(prebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prebook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookchecktable;
    private javax.swing.JButton checkintodashboardbtn;
<<<<<<< HEAD
=======
    private javax.swing.JTable dashrecordtable;
    private javax.swing.JLabel jLabel1;
>>>>>>> 000b7fd13596c632dac794b36f30c065daa3e00f
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton prebookcheckbtn;
    private org.jdesktop.swingx.JXDatePicker prebookdate;
    // End of variables declaration//GEN-END:variables
}
