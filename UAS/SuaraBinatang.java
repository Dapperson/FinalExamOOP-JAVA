/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UAS;

/**
 *
 * @author USER
 */
public class SuaraBinatang extends javax.swing.JFrame {

    String voice;
    String ket;
    
    public SuaraBinatang() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rb_kucing = new javax.swing.JRadioButton();
        rb_anjing1 = new javax.swing.JRadioButton();
        rb_anjing2 = new javax.swing.JRadioButton();
        rb_ayam1 = new javax.swing.JRadioButton();
        rb_ayam2 = new javax.swing.JRadioButton();
        lbl_suara = new javax.swing.JLabel();
        txt_suara = new javax.swing.JTextField();
        lbl_keterangan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_keterangan = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Suara Binatang");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Silakan pilih suara binatang berikut :");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        buttonGroup1.add(rb_kucing);
        rb_kucing.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb_kucing.setText("Kucing");
        rb_kucing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_kucingActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_anjing1);
        rb_anjing1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb_anjing1.setText("Anjing 1");
        rb_anjing1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_anjing1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_anjing2);
        rb_anjing2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb_anjing2.setText("Anjing 2");
        rb_anjing2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_anjing2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_ayam1);
        rb_ayam1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb_ayam1.setText("Ayam 1");
        rb_ayam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_ayam1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_ayam2);
        rb_ayam2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb_ayam2.setText("Ayam 2");
        rb_ayam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_ayam2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_kucing, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_anjing1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_anjing2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_ayam1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_ayam2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(rb_kucing)
                .addGap(17, 17, 17)
                .addComponent(rb_anjing1)
                .addGap(17, 17, 17)
                .addComponent(rb_anjing2)
                .addGap(17, 17, 17)
                .addComponent(rb_ayam1)
                .addGap(17, 17, 17)
                .addComponent(rb_ayam2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        lbl_suara.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_suara.setText("Suara");

        txt_suara.setEditable(false);

        lbl_keterangan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_keterangan.setText("Keterangan");

        jScrollPane1.setViewportView(txt_keterangan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_suara, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_keterangan)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_suara, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_suara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_suara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_keterangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_kucingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_kucingActionPerformed
        Kucing kucing = new Kucing("Kucing");
       
        voice = kucing.suara();
        txt_suara.setText(voice);
        
        ket = kucing.toString();
        txt_keterangan.setText(ket);
    }//GEN-LAST:event_rb_kucingActionPerformed

    private void rb_anjing1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_anjing1ActionPerformed
        Anjing anjing = new Anjing("Anjing 1");
       
        voice = anjing.suara1();
        txt_suara.setText(voice);
        
        ket = anjing.toString();
        txt_keterangan.setText(ket);
    }//GEN-LAST:event_rb_anjing1ActionPerformed

    private void rb_anjing2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_anjing2ActionPerformed
        Anjing anjing = new Anjing("Anjing 2");
       
        voice = anjing.suara2();
        txt_suara.setText(voice);
        
        ket = anjing.toString();
        txt_keterangan.setText(ket);
    }//GEN-LAST:event_rb_anjing2ActionPerformed

    private void rb_ayam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_ayam1ActionPerformed
        Ayam ayam = new Ayam("Ayam 1");
        
        voice = ayam.suara1();
        txt_suara.setText(voice);
        
        ket = ayam.toString();
        txt_keterangan.setText(ket);
    }//GEN-LAST:event_rb_ayam1ActionPerformed

    private void rb_ayam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_ayam2ActionPerformed
        Ayam ayam = new Ayam("Ayam 2");
        
        voice = ayam.suara2();
        txt_suara.setText(voice);
        
        ket = ayam.toString();
        txt_keterangan.setText(ket);
    }//GEN-LAST:event_rb_ayam2ActionPerformed

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
            java.util.logging.Logger.getLogger(SuaraBinatang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaraBinatang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaraBinatang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaraBinatang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaraBinatang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_keterangan;
    private javax.swing.JLabel lbl_suara;
    private javax.swing.JRadioButton rb_anjing1;
    private javax.swing.JRadioButton rb_anjing2;
    private javax.swing.JRadioButton rb_ayam1;
    private javax.swing.JRadioButton rb_ayam2;
    private javax.swing.JRadioButton rb_kucing;
    private javax.swing.JTextPane txt_keterangan;
    private javax.swing.JTextField txt_suara;
    // End of variables declaration//GEN-END:variables
}
