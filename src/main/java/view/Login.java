/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.LoginController;
import javax.swing.JOptionPane;

/**
 *
 * @author Frederico
 */
public class Login extends javax.swing.JFrame {
    private final LoginController controller;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        controller = new LoginController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPassword_Senha = new javax.swing.JPasswordField();
        Txt_Usuario = new javax.swing.JTextField();
        Lbl_Login = new javax.swing.JLabel();
        Lbl_Usuario = new javax.swing.JLabel();
        Lbl_Senha = new javax.swing.JLabel();
        jButton_Entrar = new javax.swing.JButton();
        Lbl_PainelLogin = new javax.swing.JLabel();
        Lbl_Logo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPassword_Senha.setBackground(new java.awt.Color(255, 255, 255));
        jPassword_Senha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jPassword_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 270, 40));

        Txt_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        Txt_Usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(Txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 270, 40));

        Lbl_Login.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Lbl_Login.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Login.setText("Login");
        getContentPane().add(Lbl_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        Lbl_Usuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Lbl_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Usuario.setText("Usuario");
        getContentPane().add(Lbl_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        Lbl_Senha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Lbl_Senha.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Senha.setText("Senha");
        getContentPane().add(Lbl_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));

        jButton_Entrar.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Entrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton_Entrar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_Entrar.setText("Entrar");
        jButton_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 670, 260, -1));

        Lbl_PainelLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Frederico\\Documents\\projetos privados\\BarbeariaComentariosNetBeansYouTube\\refazendoBarbeariaAula\\src\\main\\java\\com\\mycompany\\refazendobarbeariaaula\\view\\img\\painel-login.png")); // NOI18N
        getContentPane().add(Lbl_PainelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        Lbl_Logo1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Frederico\\Documents\\projetos privados\\BarbeariaComentariosNetBeansYouTube\\refazendoBarbeariaAula\\src\\main\\java\\com\\mycompany\\refazendobarbeariaaula\\view\\img\\Logo.jpg")); // NOI18N
        getContentPane().add(Lbl_Logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EntrarActionPerformed
        controller.usuarioLogin();
    }//GEN-LAST:event_jButton_EntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Login;
    private javax.swing.JLabel Lbl_Logo1;
    private javax.swing.JLabel Lbl_PainelLogin;
    private javax.swing.JLabel Lbl_Senha;
    private javax.swing.JLabel Lbl_Usuario;
    private javax.swing.JTextField Txt_Usuario;
    private javax.swing.JButton jButton_Entrar;
    private javax.swing.JPasswordField jPassword_Senha;
    // End of variables declaration//GEN-END:variables

    public void mensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public javax.swing.JTextField getTxt_Usuario() {
        return Txt_Usuario;
    }

    public void setTxt_Usuario(javax.swing.JTextField Txt_Usuario) {
        this.Txt_Usuario = Txt_Usuario;
    }

    public javax.swing.JPasswordField getjPassword_Senha() {
        return jPassword_Senha;
    }

    public void setjPassword_Senha(javax.swing.JPasswordField jPassword_Senha) {
        this.jPassword_Senha = jPassword_Senha;
    }
    
}
