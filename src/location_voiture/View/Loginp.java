/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package location_voiture.View;

import java.sql.Connection;
import Controller.Ioperation;
import Model.*;
import com.sun.glass.events.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author SIM-Info
 */
public class Loginp extends javax.swing.JDialog {
Ioperation reg ;
    /**
     * Creates new form Loginp
     * @param parent
     * @param modal
     */
    public Loginp(java.awt.Frame parent , boolean modal) {
        super(parent,modal);
        initComponents();
         setLocationRelativeTo(this);
         reg = new Ioperation();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mp = new javax.swing.JTextField();
        login = new javax.swing.JButton();

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Connecté");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/getin.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 210, 230));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 720));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/ddd.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 160, 190));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_voiture/image/icons8_Delete_48px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 50, 40));

        cin.setBackground(new java.awt.Color(0, 102, 204));
        cin.setForeground(new java.awt.Color(255, 255, 255));
        cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinActionPerformed(evt);
            }
        });
        cin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cinKeyTyped(evt);
            }
        });
        jPanel3.add(cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 300, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cin : ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 80, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mot de passe : ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 150, 40));

        mp.setBackground(new java.awt.Color(0, 102, 204));
        mp.setForeground(new java.awt.Color(255, 255, 255));
        mp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpActionPerformed(evt);
            }
        });
        jPanel3.add(mp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 300, 50));

        login.setBackground(new java.awt.Color(51, 51, 51));
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("connexion");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel3.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 260, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 720, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel3MousePressed
int xx ,xy ;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        setOpacity((float)0.8);
        xx= evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
          int x = evt.getXOnScreen();
        int y  = evt.getYOnScreen();
        this.setLocation(x - xx ,y - xy );
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased
    setOpacity((float)1);
    }//GEN-LAST:event_jPanel2MouseReleased

    private void cinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinActionPerformed

    private void mpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mpActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       /* String sql = "select admin_cin , Mot_pass from agence where admin_cin =? and Mot_pass =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(cin.getText()));
            ps.setString(2, mp.getText());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                this.dispose();
                Inscrip mm = new Inscrip();
                mm.show();
                
            }else {
                JOptionPane.showMessageDialog(null , "wrong detail");
            }
        }
            catch (Exception e){
                
            }   */
     // int cins =Integer.parseInt(cin.getText());
        Long cins = Long.parseLong(cin.getText());
       String mps = mp.getText();
        reg.check(cins ,mps);
    }//GEN-LAST:event_loginActionPerformed

    private void cinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cinKeyTyped
     char vchar = evt.getKeyChar();
           
                    
           if((!(Character.isDigit(vchar))||(vchar == KeyEvent.VK_BACKSPACE)||
                   (vchar == KeyEvent.VK_DELETE))){
           
               evt.consume();
           }
    }//GEN-LAST:event_cinKeyTyped

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
            java.util.logging.Logger.getLogger(Loginp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
         Loginp dialog = new Loginp(new javax.swing.JFrame() , true);
         dialog.addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
            public void windowClosing(java.awt.event.WindowEvent e){
             System.exit(0);
         }
         });
         dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login;
    private javax.swing.JTextField mp;
    // End of variables declaration//GEN-END:variables
}
