package frame;

import javax.swing.JOptionPane;

public class mylayanan extends javax.swing.JFrame {
    

    public mylayanan() {
        initComponents();
    }

    mylayanan(int tmp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        textsaldo = new javax.swing.JLabel();
        jumlahsaldo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        buttonsaldo = new javax.swing.JButton();
        buttonpenarikan = new javax.swing.JButton();
        buttontransfer = new javax.swing.JButton();
        isisetor = new javax.swing.JTextField();
        isipenarikan = new javax.swing.JTextField();
        setor = new javax.swing.JButton();
        isitransfer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Freehand521 BT", 0, 24)); // NOI18N
        jLabel2.setText("Selamat Datang");

        jLabel5.setFont(new java.awt.Font("Microsoft Himalaya", 1, 36)); // NOI18N
        jLabel5.setText("ANJUNGAN TUNAI MANDIRI");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textsaldo.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        textsaldo.setForeground(new java.awt.Color(255, 153, 0));
        jPanel4.add(textsaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jumlahsaldo.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        jumlahsaldo.setText("klik button saldo");
        jPanel4.add(jumlahsaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 110));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 490, 150));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bank krupt.png"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 120));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 430, 160));

        logout.setBackground(new java.awt.Color(255, 255, 153));
        logout.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 153, 0));
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel3.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 130, 40));

        buttonsaldo.setBackground(new java.awt.Color(255, 255, 153));
        buttonsaldo.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        buttonsaldo.setForeground(new java.awt.Color(255, 153, 0));
        buttonsaldo.setText("SALDO");
        buttonsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsaldoActionPerformed(evt);
            }
        });
        jPanel3.add(buttonsaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, 40));

        buttonpenarikan.setBackground(new java.awt.Color(255, 255, 153));
        buttonpenarikan.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        buttonpenarikan.setForeground(new java.awt.Color(255, 153, 0));
        buttonpenarikan.setText("PENARIKAN");
        buttonpenarikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonpenarikanActionPerformed(evt);
            }
        });
        jPanel3.add(buttonpenarikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 170, 40));

        buttontransfer.setBackground(new java.awt.Color(255, 255, 153));
        buttontransfer.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        buttontransfer.setForeground(new java.awt.Color(255, 153, 0));
        buttontransfer.setText("TRANSFER");
        buttontransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttontransferActionPerformed(evt);
            }
        });
        jPanel3.add(buttontransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 150, 40));

        isisetor.setBackground(new java.awt.Color(255, 255, 153));
        isisetor.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        jPanel3.add(isisetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 100, 40));

        isipenarikan.setBackground(new java.awt.Color(255, 255, 153));
        isipenarikan.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        isipenarikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isipenarikanActionPerformed(evt);
            }
        });
        jPanel3.add(isipenarikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 150, 40));

        setor.setBackground(new java.awt.Color(255, 255, 153));
        setor.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        setor.setForeground(new java.awt.Color(255, 153, 0));
        setor.setText("SETOR");
        setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorActionPerformed(evt);
            }
        });
        jPanel3.add(setor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 120, 40));

        isitransfer.setBackground(new java.awt.Color(255, 255, 153));
        isitransfer.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        isitransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isitransferActionPerformed(evt);
            }
        });
        jPanel3.add(isitransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 130, 40));

        jLabel3.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 14)); // NOI18N
        jLabel3.setText("Rp");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 14)); // NOI18N
        jLabel4.setText("Rp");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 14)); // NOI18N
        jLabel6.setText("Rp");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 360));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null,
                "Terimkasih Sudah Bertransaksi di ATM BANK KRUPT");
        new mybank().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_logoutActionPerformed

    private void buttonsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsaldoActionPerformed
       int saldo = 15000000;
       textsaldo.setText("     SISA SALDO YANG ANDA MILIKI:");
       jumlahsaldo.setText(""+saldo);
    }//GEN-LAST:event_buttonsaldoActionPerformed

    private void buttonpenarikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonpenarikanActionPerformed
        String tarikan = isipenarikan.getText();
        int saldo = 15000000;
        int jmltarik = Integer.parseInt(tarikan);
        int total = saldo-jmltarik;
        jumlahsaldo.setText(""+total);
    }//GEN-LAST:event_buttonpenarikanActionPerformed

    private void buttontransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttontransferActionPerformed
        String transfer = isitransfer.getText();
        String saldolast = jumlahsaldo.getText();
        jumlahsaldo.setText(""+saldolast);
        int jmltransfer = Integer.parseInt(transfer);
        int lastsaldo = Integer.parseInt(saldolast);
        int total = lastsaldo-jmltransfer;
        jumlahsaldo.setText(""+total);
    }//GEN-LAST:event_buttontransferActionPerformed

    private void setorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorActionPerformed
        String setor = isisetor.getText();
        String saldolast = jumlahsaldo.getText();
        jumlahsaldo.setText(""+saldolast);
        int jmlsetor = Integer.parseInt(setor);
        int lastsaldo = Integer.parseInt(saldolast);
        int total = lastsaldo+jmlsetor;
        jumlahsaldo.setText(""+total);
    }//GEN-LAST:event_setorActionPerformed

    private void isipenarikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isipenarikanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isipenarikanActionPerformed

    private void isitransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isitransferActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isitransferActionPerformed

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
            java.util.logging.Logger.getLogger(mylayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mylayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mylayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mylayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mylayanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonpenarikan;
    private javax.swing.JButton buttonsaldo;
    private javax.swing.JButton buttontransfer;
    private javax.swing.JTextField isipenarikan;
    private javax.swing.JTextField isisetor;
    private javax.swing.JTextField isitransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jumlahsaldo;
    private javax.swing.JButton logout;
    private javax.swing.JButton setor;
    private javax.swing.JLabel textsaldo;
    // End of variables declaration//GEN-END:variables
}
