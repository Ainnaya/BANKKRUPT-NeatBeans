package frame;

public class mypin extends javax.swing.JFrame {
    String password ="";
    String PASSWORD = "1234";
    int kesempatan = 3;

    public mypin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nol = new javax.swing.JButton();
        pin = new javax.swing.JPasswordField();
        batal = new javax.swing.JButton();
        satu = new javax.swing.JButton();
        dua = new javax.swing.JButton();
        tiga = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        lima = new javax.swing.JButton();
        enam = new javax.swing.JButton();
        tujuh = new javax.swing.JButton();
        delapan = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        correct = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Masukkan Pin Anda:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        nol.setBackground(new java.awt.Color(255, 255, 153));
        nol.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        nol.setForeground(new java.awt.Color(255, 153, 0));
        nol.setText("0");
        nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolActionPerformed(evt);
            }
        });
        jPanel1.add(nol, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 70, 60));

        pin.setBackground(new java.awt.Color(255, 255, 153));
        pin.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 48)); // NOI18N
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        jPanel1.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 270, 60));

        batal.setBackground(new java.awt.Color(255, 255, 153));
        batal.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        batal.setForeground(new java.awt.Color(255, 153, 0));
        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        jPanel1.add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 120, 70));

        satu.setBackground(new java.awt.Color(255, 255, 153));
        satu.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        satu.setForeground(new java.awt.Color(255, 153, 0));
        satu.setText("1");
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });
        jPanel1.add(satu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 70, 60));

        dua.setBackground(new java.awt.Color(255, 255, 153));
        dua.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        dua.setForeground(new java.awt.Color(255, 153, 0));
        dua.setText("2");
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });
        jPanel1.add(dua, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 70, 60));

        tiga.setBackground(new java.awt.Color(255, 255, 153));
        tiga.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        tiga.setForeground(new java.awt.Color(255, 153, 0));
        tiga.setText("3");
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });
        jPanel1.add(tiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 70, 60));

        empat.setBackground(new java.awt.Color(255, 255, 153));
        empat.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        empat.setForeground(new java.awt.Color(255, 153, 0));
        empat.setText("4");
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });
        jPanel1.add(empat, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 70, 60));

        lima.setBackground(new java.awt.Color(255, 255, 153));
        lima.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        lima.setForeground(new java.awt.Color(255, 153, 0));
        lima.setText("5");
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });
        jPanel1.add(lima, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 70, 60));

        enam.setBackground(new java.awt.Color(255, 255, 153));
        enam.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        enam.setForeground(new java.awt.Color(255, 153, 0));
        enam.setText("6");
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });
        jPanel1.add(enam, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 70, 60));

        tujuh.setBackground(new java.awt.Color(255, 255, 153));
        tujuh.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        tujuh.setForeground(new java.awt.Color(255, 153, 0));
        tujuh.setText("7");
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });
        jPanel1.add(tujuh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 70, 60));

        delapan.setBackground(new java.awt.Color(255, 255, 153));
        delapan.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        delapan.setForeground(new java.awt.Color(255, 153, 0));
        delapan.setText("8");
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });
        jPanel1.add(delapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 70, 60));

        sembilan.setBackground(new java.awt.Color(255, 255, 153));
        sembilan.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        sembilan.setForeground(new java.awt.Color(255, 153, 0));
        sembilan.setText("9");
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });
        jPanel1.add(sembilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 70, 60));

        confirm.setBackground(new java.awt.Color(255, 255, 153));
        confirm.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 153, 0));
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel1.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 180, -1, 140));

        correct.setBackground(new java.awt.Color(255, 255, 153));
        correct.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 24)); // NOI18N
        correct.setForeground(new java.awt.Color(255, 153, 0));
        correct.setText("Correct");
        correct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctActionPerformed(evt);
            }
        });
        jPanel1.add(correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 120, 70));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 840, 360));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bank krupt.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatActionPerformed
        password += "4";
        pin.setText(password);
    }//GEN-LAST:event_empatActionPerformed

    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanActionPerformed
        password += "8";
        pin.setText(password);
    }//GEN-LAST:event_delapanActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        if(pin.getText().trim().equals("1234")){   
            javax.swing.JOptionPane.showMessageDialog(null, 
                    "Selamat datang, silahkan menggunakan layanan BANK KRUPT.");
            new mylayanan().setVisible(true);
            dispose(); 
        }
        else {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Maaf PIN yang anda masukan salah, Silahkan Coba Lagi");
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        new mybank().setVisible(true);
        dispose(); 
    }//GEN-LAST:event_batalActionPerformed

    private void correctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctActionPerformed
        password = "";
        pin.setText("");
    }//GEN-LAST:event_correctActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
        password += "1";
        pin.setText(password);
    }//GEN-LAST:event_satuActionPerformed

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaActionPerformed
        password += "2";
        pin.setText(password);
    }//GEN-LAST:event_duaActionPerformed

    private void tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaActionPerformed
        password += "3";
        pin.setText(password);
    }//GEN-LAST:event_tigaActionPerformed

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaActionPerformed
        password += "5";
        pin.setText(password);
    }//GEN-LAST:event_limaActionPerformed

    private void enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamActionPerformed
        password += "6";
        pin.setText(password);
    }//GEN-LAST:event_enamActionPerformed

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
        password += "7";
        pin.setText(password);
    }//GEN-LAST:event_tujuhActionPerformed

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanActionPerformed
           password += "9";
        pin.setText(password);
    }//GEN-LAST:event_sembilanActionPerformed

    private void nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolActionPerformed
            password += "0";
        pin.setText(password);
    }//GEN-LAST:event_nolActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

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
            java.util.logging.Logger.getLogger(mypin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mypin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mypin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mypin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mypin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton confirm;
    private javax.swing.JButton correct;
    private javax.swing.JButton delapan;
    private javax.swing.JButton dua;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton lima;
    private javax.swing.JButton nol;
    private javax.swing.JPasswordField pin;
    private javax.swing.JButton satu;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton tiga;
    private javax.swing.JButton tujuh;
    // End of variables declaration//GEN-END:variables
}
