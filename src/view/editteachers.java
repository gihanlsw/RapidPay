/*
 * editteachers.java
 *
 * Created on June 3, 2011, 9:35 PM
 */
package view;

import control.OccationalLogics;
import control.editpesonDetails;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author  gihan
 */
public final class editteachers extends javax.swing.JPanel {

   JComponent comp[] = new JComponent[12];
    public editteachers() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        tmname = new javax.swing.JTextField();
        tlname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        taddno = new javax.swing.JTextField();
        tstreet = new javax.swing.JTextField();
        tcity = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tcontact = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        tworkaddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tworkcontact = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtexperience = new javax.swing.JTextArea();
        bsave2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Nic = new javax.swing.JTextField();
        bviewclass1 = new javax.swing.JButton();
        bviewclass2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 180, 209));

        jPanel1.setBackground(new java.awt.Color(191, 205, 219));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Main Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12));
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12));
        jLabel3.setText("Middle Name");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12));
        jLabel4.setText("Last Name");

        tfname.setFont(new java.awt.Font("Times New Roman", 1, 14));

        tmname.setFont(new java.awt.Font("Times New Roman", 1, 14));

        tlname.setFont(new java.awt.Font("Times New Roman", 1, 14));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12));
        jLabel5.setText("Address No");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12));
        jLabel6.setText("Street");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12));
        jLabel7.setText("City");

        taddno.setFont(new java.awt.Font("Times New Roman", 1, 14));

        tstreet.setFont(new java.awt.Font("Times New Roman", 1, 14));

        tcity.setFont(new java.awt.Font("Times New Roman", 1, 14));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12));
        jLabel12.setText("Contact No");

        tcontact.setFont(new java.awt.Font("Times New Roman", 1, 14));

        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tlname, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(tmname, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tcity, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taddno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tstreet, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(92, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(26, 26, 26)
                        .addComponent(tcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(148, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tmname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tlname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(taddno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tstreet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tcity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(191, 205, 219));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Work Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 12));
        jLabel21.setText("Work Address");

        tworkaddress.setFont(new java.awt.Font("Times New Roman", 1, 14));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12));
        jLabel14.setText("Contact No");

        tworkcontact.setFont(new java.awt.Font("Times New Roman", 1, 14));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12));
        jLabel15.setText("Work Experience");

        txtexperience.setColumns(20);
        txtexperience.setFont(new java.awt.Font("Times New Roman", 1, 14));
        txtexperience.setRows(5);
        jScrollPane1.setViewportView(txtexperience);

        bsave2.setFont(new java.awt.Font("Dialog", 1, 12));
        bsave2.setText("Edit");
        bsave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsave2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 12));
        jLabel16.setText("NIc");

        Nic.setFont(new java.awt.Font("Times New Roman", 1, 14));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(308, 308, 308)
                                .addComponent(bsave2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tworkcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel16))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Nic, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(tworkaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                .addGap(20, 20, 20))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tworkaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tworkcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel15)))
                .addGap(26, 26, 26)
                .addComponent(bsave2)
                .addGap(55, 55, 55))
        );

        bviewclass1.setFont(new java.awt.Font("Dialog", 1, 12));
        bviewclass1.setText("Get Full Report");
        bviewclass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bviewclass1MouseEntered(evt);
            }
        });
        bviewclass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bviewclass1ActionPerformed(evt);
            }
        });

        bviewclass2.setFont(new java.awt.Font("Dialog", 1, 12));
        bviewclass2.setText("Full Report - PDF");
        bviewclass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bviewclass2MouseEntered(evt);
            }
        });
        bviewclass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bviewclass2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bviewclass2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bviewclass1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bviewclass1)
                    .addComponent(bviewclass2))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void bsave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsave2ActionPerformed
    if (OccationalLogics.showOption("Yes", "No") == 0) {

       
        comp[0] = tfname;
        comp[1] = id;
        comp[2] = tmname;
        comp[3] = tlname;
        comp[4] = taddno;
        comp[5] = tstreet;
        comp[6] = tcity;
        comp[7] = tcontact;
        comp[8] = Nic;
        comp[9] = tworkaddress;
        comp[10] = tworkcontact;
        comp[11] = txtexperience;

        if (aThis.editTeachdr(comp)) {
            JOptionPane.showMessageDialog(null, "Data Editing success", "Edit", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, Unexpected error occured", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }




}//GEN-LAST:event_bsave2ActionPerformed

private void bviewclass1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bviewclass1MouseEntered
// TODO add your handling code here:
}//GEN-LAST:event_bviewclass1MouseEntered

private void bviewclass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bviewclass1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_bviewclass1ActionPerformed

private void bviewclass2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bviewclass2MouseEntered
// TODO add your handling code here:
}//GEN-LAST:event_bviewclass2MouseEntered

private void bviewclass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bviewclass2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_bviewclass2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nic;
    private javax.swing.JButton bsave2;
    private javax.swing.JButton bviewclass1;
    private javax.swing.JButton bviewclass2;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField taddno;
    private javax.swing.JTextField tcity;
    private javax.swing.JTextField tcontact;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tlname;
    private javax.swing.JTextField tmname;
    private javax.swing.JTextField tstreet;
    private javax.swing.JTextField tworkaddress;
    private javax.swing.JTextField tworkcontact;
    private javax.swing.JTextArea txtexperience;
    // End of variables declaration//GEN-END:variables
    private editpesonDetails aThis;

    public void setData(String[] UserDetails, editpesonDetails aThis) {
        this.aThis = aThis;
        id.setText(UserDetails[1]);
        tfname.setText(UserDetails[0]);
        tmname.setText(UserDetails[2]);
        tlname.setText(UserDetails[3]);
        taddno.setText(UserDetails[4]);
        tstreet.setText(UserDetails[5]);
        tcity.setText(UserDetails[6]);
        tcontact.setText(UserDetails[7]);
        Nic.setText(UserDetails[8]);
        tworkaddress.setText(UserDetails[9]);
        tworkcontact.setText(UserDetails[10]);
        txtexperience.setText(UserDetails[11]);


    }
}
