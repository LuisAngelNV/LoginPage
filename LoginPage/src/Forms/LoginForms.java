/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author M0KUM4
 */
public class LoginForms extends javax.swing.JFrame {

    /**
     * Creates new form LoginForms
     */
    public LoginForms() {
        initComponents();
        //Centramos nuestra ventana
        this.setLocationRelativeTo(null);

        //Obtener iconos en los labels que se dejaron / tabien se puede hacer mediante las propiedades
        // Label_Icon_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/x.png")));
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
        jLabel1 = new javax.swing.JLabel();
        Label_Icon_Close = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JtextFiel_NameUser = new javax.swing.JTextField();
        JPasswordField_Password = new javax.swing.JPasswordField();
        jCheckBox1_ShowPassword = new javax.swing.JCheckBox();
        btn_Login = new javax.swing.JButton();
        Label_Icon_User = new javax.swing.JLabel();
        Label_Icon_Lock = new javax.swing.JLabel();
        jPanel_Message = new javax.swing.JPanel();
        Label_Icon_User1 = new javax.swing.JLabel();
        jLabel_Message_text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 196, 113));

        jPanel2.setBackground(new java.awt.Color(133, 193, 233));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 2, 36)); // NOI18N
        jLabel1.setText("Acces Point");

        Label_Icon_Close.setBackground(new java.awt.Color(255, 255, 255));
        Label_Icon_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/x.png"))); // NOI18N
        Label_Icon_Close.setText("jLabel5");
        Label_Icon_Close.setMaximumSize(new java.awt.Dimension(24, 24));
        Label_Icon_Close.setMinimumSize(new java.awt.Dimension(24, 24));
        Label_Icon_Close.setPreferredSize(new java.awt.Dimension(24, 24));
        Label_Icon_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_Icon_CloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label_Icon_Close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Label_Icon_Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/administrator-2-128.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 2, 18)); // NOI18N
        jLabel3.setText("User: ");

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 2, 18)); // NOI18N
        jLabel4.setText("Password: ");

        jCheckBox1_ShowPassword.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1_ShowPassword.setFont(new java.awt.Font("Lucida Calligraphy", 2, 14)); // NOI18N
        jCheckBox1_ShowPassword.setText(" Show Password");
        jCheckBox1_ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1_ShowPasswordActionPerformed(evt);
            }
        });

        btn_Login.setFont(new java.awt.Font("Lucida Calligraphy", 2, 12)); // NOI18N
        btn_Login.setText("Login");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        Label_Icon_User.setBackground(new java.awt.Color(255, 255, 255));
        Label_Icon_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        Label_Icon_User.setText("jLabel5");
        Label_Icon_User.setMaximumSize(new java.awt.Dimension(24, 24));
        Label_Icon_User.setMinimumSize(new java.awt.Dimension(24, 24));
        Label_Icon_User.setPreferredSize(new java.awt.Dimension(24, 24));

        Label_Icon_Lock.setBackground(new java.awt.Color(255, 255, 255));
        Label_Icon_Lock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock.png"))); // NOI18N
        Label_Icon_Lock.setText("jLabel5");
        Label_Icon_Lock.setMaximumSize(new java.awt.Dimension(24, 24));
        Label_Icon_Lock.setMinimumSize(new java.awt.Dimension(24, 24));
        Label_Icon_Lock.setPreferredSize(new java.awt.Dimension(24, 24));

        jPanel_Message.setBackground(new java.awt.Color(255, 51, 51));
        jPanel_Message.setPreferredSize(new java.awt.Dimension(84, 86));

        Label_Icon_User1.setBackground(new java.awt.Color(255, 255, 255));
        Label_Icon_User1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/error-4-24.png"))); // NOI18N
        Label_Icon_User1.setText("jLabel5");
        Label_Icon_User1.setMaximumSize(new java.awt.Dimension(24, 24));
        Label_Icon_User1.setMinimumSize(new java.awt.Dimension(24, 24));
        Label_Icon_User1.setPreferredSize(new java.awt.Dimension(24, 24));
        Label_Icon_User1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_Icon_User1MouseClicked(evt);
            }
        });

        jLabel_Message_text.setText("Mensale: ");

        javax.swing.GroupLayout jPanel_MessageLayout = new javax.swing.GroupLayout(jPanel_Message);
        jPanel_Message.setLayout(jPanel_MessageLayout);
        jPanel_MessageLayout.setHorizontalGroup(
            jPanel_MessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MessageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Message_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Icon_User1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_MessageLayout.setVerticalGroup(
            jPanel_MessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MessageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_MessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MessageLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel_Message_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel_MessageLayout.createSequentialGroup()
                        .addComponent(Label_Icon_User1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(51, 51, 51))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Message, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JPasswordField_Password)
                    .addComponent(JtextFiel_NameUser)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_Login, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1_ShowPassword))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Label_Icon_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Label_Icon_Lock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_Icon_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(JtextFiel_NameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Label_Icon_Lock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1_ShowPassword)
                    .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );

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

    //TimerUp para message panel
    Timer timerup = new Timer(20, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {

            if (jPanel_Message.getHeight() != 0) {
                jPanel_Message.setBounds(jPanel_Message.getX(), jPanel_Message.getY(), jPanel_Message.getWidth(), jPanel_Message.getHeight() - 5);
            } else {
                timerup.stop();
            }
        }
    });

    //TimerUp para message panel mostrar
    Timer timerDown = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {

            if (jPanel_Message.getHeight() != 60) {
                jPanel_Message.setBounds(jPanel_Message.getX(), jPanel_Message.getY(), jPanel_Message.getWidth(), jPanel_Message.getHeight() + 5);
            } else {
                timerup.stop();
            }
        }
    });

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        // TODO add your handling code here:
        timerDown.start();
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void jCheckBox1_ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1_ShowPasswordActionPerformed
        // Mostrar la contrase??a que se tiene en el showPassword
        if (jCheckBox1_ShowPassword.isSelected()) {
            JPasswordField_Password.setEchoChar((char) 0);
        } else {
            JPasswordField_Password.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1_ShowPasswordActionPerformed

    private void Label_Icon_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_Icon_CloseMouseClicked
        // Cerrar ventana:
        this.dispose();
    }//GEN-LAST:event_Label_Icon_CloseMouseClicked

    private void Label_Icon_User1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_Icon_User1MouseClicked
        // TODO add your handling code here:
        timerup.start();

    }//GEN-LAST:event_Label_Icon_User1MouseClicked

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
            java.util.logging.Logger.getLogger(LoginForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPasswordField_Password;
    private javax.swing.JTextField JtextFiel_NameUser;
    private javax.swing.JLabel Label_Icon_Close;
    private javax.swing.JLabel Label_Icon_Lock;
    private javax.swing.JLabel Label_Icon_User;
    private javax.swing.JLabel Label_Icon_User1;
    private javax.swing.JButton btn_Login;
    private javax.swing.JCheckBox jCheckBox1_ShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Message_text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_Message;
    // End of variables declaration//GEN-END:variables
}
