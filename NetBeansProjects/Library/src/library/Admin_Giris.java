/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Admin_Giris.java
 *
 * Created on 14.Ara.2013, 12:23:10
 */
package library;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author alp
 */
public class Admin_Giris extends javax.swing.JFrame {

    /** Creates new form Admin_Giris */
    public Admin_Giris() {
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

        uyeDuzenle = new javax.swing.JButton();
        personelDuzenle = new javax.swing.JButton();
        yayinDuzenle = new javax.swing.JButton();
        Cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        uyeDuzenle.setText("Üye Düzenle");
        uyeDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeDuzenleActionPerformed(evt);
            }
        });

        personelDuzenle.setText("Personel Düzenle");
        personelDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personelDuzenleActionPerformed(evt);
            }
        });

        yayinDuzenle.setText("Yayın Düzenle");
        yayinDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yayinDuzenleActionPerformed(evt);
            }
        });

        Cikis.setText("Çıkış");
        Cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(personelDuzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uyeDuzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yayinDuzenle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(Cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uyeDuzenle)
                .addGap(18, 18, 18)
                .addComponent(personelDuzenle)
                .addGap(18, 18, 18)
                .addComponent(yayinDuzenle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(Cikis)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void uyeDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeDuzenleActionPerformed
    Uye_Duzenle ekle1 = new Uye_Duzenle();
    ekle1.setVisible(true);
    close();
}//GEN-LAST:event_uyeDuzenleActionPerformed

private void personelDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personelDuzenleActionPerformed
    Personel_Duzenle ekle1 = new Personel_Duzenle();
    ekle1.setVisible(true);
    close();
}//GEN-LAST:event_personelDuzenleActionPerformed

private void yayinDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yayinDuzenleActionPerformed
    Yayin_Duzenle ekle1 = new Yayin_Duzenle();
    ekle1.setVisible(true);
    close();
}//GEN-LAST:event_yayinDuzenleActionPerformed

private void CikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CikisActionPerformed
    Anasayfa anasayfa1 = new Anasayfa();
    anasayfa1.setVisible(true);
    close();
}//GEN-LAST:event_CikisActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Admin_Giris().setVisible(true);
            }
        });
    }
    
    
    public void close(){
    
        WindowEvent pencereKapat=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(pencereKapat);
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cikis;
    private javax.swing.JButton personelDuzenle;
    private javax.swing.JButton uyeDuzenle;
    private javax.swing.JButton yayinDuzenle;
    // End of variables declaration//GEN-END:variables
}
