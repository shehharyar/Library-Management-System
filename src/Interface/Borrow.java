/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Royal
 */
public class Borrow extends javax.swing.JInternalFrame {

    /**
     * Creates new form Borrow
     */
    public Borrow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Record = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        mem_id = new javax.swing.JTextField();
        m_name = new javax.swing.JTextField();
        m_Type = new javax.swing.JTextField();
        Book_ID = new javax.swing.JTextField();
        B_name = new javax.swing.JTextField();
        B_type = new javax.swing.JTextField();
        issue = new javax.swing.JTextField();
        r_d = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Record NO:", "ID#", "Member Name", "Mem_type", "Book ID #", "Book Name", "Book Type", "Issue Date", "Return Date"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 930, 150));
        jPanel1.add(Record, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 170, 30));

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("Issue");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 170, 40));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 170, 40));
        jPanel1.add(mem_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 170, 30));
        jPanel1.add(m_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 170, 30));

        m_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_TypeActionPerformed(evt);
            }
        });
        jPanel1.add(m_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 170, 30));
        jPanel1.add(Book_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 160, 30));
        jPanel1.add(B_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 160, 30));
        jPanel1.add(B_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 160, 30));

        issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueActionPerformed(evt);
            }
        });
        jPanel1.add(issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 200, 30));
        jPanel1.add(r_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 230, 210, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel14.setText("Book ID");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel15.setText("Return Date");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setText("Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setText("Type");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 50, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("Issue Date ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setText("Member Type");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setText("Name");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setText("Member ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 720, 50));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 340, 200));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 950, 170));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 220, 260));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 460));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issueActionPerformed

    private void m_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_TypeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                
        if(Record.getText().equals("")||mem_id.getText().equals("")||m_name.getText().equals("") || m_Type.getText().equals("") ||Book_ID.getText().equals("")|| B_name.getText().equals("") ||  B_type.getText().equals("") || issue.getText().equals("")||r_d.getText().equals(""))
        {
               JOptionPane.showMessageDialog(this, "Please enter all fields!");
        }
        else
        {
         //     String data[]={Mem_ID.getText(),mem_Name.getText(),jnic.getText(),jdate.getSelectedItem().toString(),jgender.getSelectedItem().toString(),jcontact.getText(),jaddress.getText(),jmem_type.getSelectedItem().toString()};
                  String data[]={Record.getText(),mem_id.getText(),m_name.getText(),m_Type.getText(), Book_ID.getText(),B_name.getText(),B_type.getText(), issue.getText(),r_d.getText()};
   
            DefaultTableModel  tblModel = (DefaultTableModel) jTable3.getModel();
                tblModel.addRow(data);
                
                JOptionPane.showMessageDialog(this, "Add data Succcessfully");
               Record.setText("");
                mem_id.setText("");
                m_name.setText("");
                m_Type.setText("");
                Book_ID.setText("");
                B_name.setText("");
                B_type.setText("");
                issue.setText("");
                r_d.setText("");
                 
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
               int selectedRow=jTable3.getSelectedRow();
                DefaultTableModel model= ( DefaultTableModel) jTable3.getModel();
               
                 Record.setText(model.getValueAt(selectedRow, 0).toString());
                mem_id.setText(model.getValueAt(selectedRow, 1).toString());
                m_name.setText(model.getValueAt(selectedRow, 2).toString());
                m_Type.setText(model.getValueAt(selectedRow, 3).toString());
             //      jdate.setSelectedItem(model.getValueAt(selectedRow, 3).toString())+"/"jmonth.setSelectedItem(model.getValueAt(selectedRow, 3).toString())+"/"jmonth.setSelectedItem(model.getValueAt(selectedRow, 3).toString());
                Book_ID.setText(model.getValueAt(selectedRow, 4).toString());
                B_name.setText(model.getValueAt(selectedRow, 5).toString());
                B_type.setText(model.getValueAt(selectedRow, 6).toString());
                issue.setText(model.getValueAt(selectedRow, 7).toString());
                r_d.setText(model.getValueAt(selectedRow, 8).toString());
                  
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel) jTable3.getModel();
        int selectedRowIndex = jTable3.getSelectedRow();
        model.removeRow(selectedRowIndex);
        
                JOptionPane.showMessageDialog(this, " Data is deleted Succcessfully");
               Record.setText("");
                mem_id.setText("");
                m_name.setText("");
                m_Type.setText("");
                Book_ID.setText("");
                B_name.setText("");
                B_type.setText("");
                issue.setText("");
                r_d.setText("");
  
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField B_name;
    private javax.swing.JTextField B_type;
    private javax.swing.JTextField Book_ID;
    private javax.swing.JTextField Record;
    private javax.swing.JTextField issue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField m_Type;
    private javax.swing.JTextField m_name;
    private javax.swing.JTextField mem_id;
    private javax.swing.JTextField r_d;
    // End of variables declaration//GEN-END:variables
}
