package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/** @author Hiro **/

public class Register extends javax.swing.JFrame {
    private Connection conn;

    /**
     * Creates new form Login
     */
    public Register() {
        initComponents();
        conn = Koneksi.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterPanel = new javax.swing.JPanel();
        registerTxt = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        nmLabel = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        pwdLabel = new javax.swing.JLabel();
        tfPwd = new javax.swing.JPasswordField();
        signupBtn = new javax.swing.JLabel();
        txtBottom = new javax.swing.JLabel();
        bgRegister = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arcadia Game Store");
        setSize(new java.awt.Dimension(1200, 675));

        RegisterPanel.setPreferredSize(new java.awt.Dimension(1200, 675));
        RegisterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ui/Register txt.png"))); // NOI18N
        registerTxt.setFocusable(false);
        RegisterPanel.add(registerTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 160, 153, 41));

        emailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ui/Email.png"))); // NOI18N
        emailLabel.setText("jLabel1");
        emailLabel.setPreferredSize(new java.awt.Dimension(253, 63));
        RegisterPanel.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 227, 254, 64));

        tfEmail.setBackground(new java.awt.Color(0, 0, 0, 0));
        tfEmail.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(255, 255, 255));
        tfEmail.setBorder(null);
        RegisterPanel.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 248, 242, 43));

        nmLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ui/Userrname.png"))); // NOI18N
        nmLabel.setText("jLabel1");
        nmLabel.setPreferredSize(new java.awt.Dimension(253, 63));
        RegisterPanel.add(nmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 312, 254, 64));

        tfName.setBackground(new java.awt.Color(0, 0, 0, 0));
        tfName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        tfName.setForeground(new java.awt.Color(255, 255, 255));
        tfName.setBorder(null);
        RegisterPanel.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 333, 242, 43));

        pwdLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ui/Password.png"))); // NOI18N
        pwdLabel.setText("jLabel1");
        pwdLabel.setPreferredSize(new java.awt.Dimension(253, 64));
        RegisterPanel.add(pwdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 397, 254, 65));

        tfPwd.setBackground(new java.awt.Color(0, 0, 0, 0));
        tfPwd.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        tfPwd.setForeground(new java.awt.Color(255, 255, 255));
        tfPwd.setBorder(null);
        RegisterPanel.add(tfPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 418, 242, 43));

        signupBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button/Sign Up.png"))); // NOI18N
        signupBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupBtnMouseExited(evt);
            }
        });
        RegisterPanel.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 488, 256, 47));

        txtBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ui/Already Have.png"))); // NOI18N
        txtBottom.setText("jLabel1");
        txtBottom.setPreferredSize(new java.awt.Dimension(235, 14));
        txtBottom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBottomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBottomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBottomMouseExited(evt);
            }
        });
        RegisterPanel.add(txtBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 560, 236, 15));

        bgRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ui/Background Panel.png"))); // NOI18N
        RegisterPanel.add(bgRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 83, 354, 527));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ui/Register.png"))); // NOI18N
        RegisterPanel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBtnMouseClicked
        signupBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button/Sign Up.png")));
        // Mendapatkan input dari JTextField
        String email = tfEmail.getText();
        String username = tfName.getText();
        String password = tfPwd.getText();
        double saldo = 0.0;
        
        // Mengeksekusi query register
        String query = "INSERT INTO user (email, username, password, saldo) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.setDouble(4, saldo);
            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                // Registrasi berhasil, lakukan aksi sesuai kebutuhan
                // JOptionPane.showMessageDialog(null, "Registerr berhasil", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                Login login = new Login();
                login.setVisible(true);
                this.dispose();
            } else {
                // Registrasi gagal, tampilkan pesan kesalahan atau lakukan aksi lain
                JOptionPane.showMessageDialog(null, "Email, Username atau Password anda tidak sesuai" + "\nSilahkan isi kembali", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_signupBtnMouseClicked

    private void signupBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBtnMouseEntered
        signupBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button/Sign Up Hover.png")));
    }//GEN-LAST:event_signupBtnMouseEntered

    private void signupBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBtnMouseExited
        signupBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button/Sign Up.png")));
    }//GEN-LAST:event_signupBtnMouseExited

    private void txtBottomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBottomMouseClicked
        txtBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ui/Already Have.png")));
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtBottomMouseClicked

    private void txtBottomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBottomMouseEntered
        txtBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ui/Already Have Hover.png")));
    }//GEN-LAST:event_txtBottomMouseEntered

    private void txtBottomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBottomMouseExited
        txtBottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ui/Already Have.png")));
    }//GEN-LAST:event_txtBottomMouseExited

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JLabel bgRegister;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel nmLabel;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JLabel registerTxt;
    private javax.swing.JLabel signupBtn;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPwd;
    private javax.swing.JLabel txtBottom;
    // End of variables declaration//GEN-END:variables
}
