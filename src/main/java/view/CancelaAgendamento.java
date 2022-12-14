/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CancelaAgendamentoController;

/**
 *
 * @author Frederico
 */
public class CancelaAgendamento extends javax.swing.JFrame {
    private final CancelaAgendamentoController controller;
    /**
     * Creates new form Cancela
     */
    public CancelaAgendamento() {
        initComponents();
        controller = new CancelaAgendamentoController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_Id = new javax.swing.JLabel();
        jTextField1_Id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1_Desmarcar1 = new javax.swing.JButton();
        jButton1_Cancelar = new javax.swing.JButton();
        Lbl_AgendaPainelFundo1 = new javax.swing.JLabel();
        Lbl_Agenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1_Id.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1_Id.setText("Id:");
        getContentPane().add(jLabel1_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        jTextField1_Id.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(jTextField1_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 119, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setText("Digitar o id do agendamento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        jButton1_Desmarcar1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton1_Desmarcar1.setText("Desmarcar");
        jButton1_Desmarcar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_Desmarcar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_Desmarcar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        jButton1_Cancelar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton1_Cancelar.setText("Cancelar");
        jButton1_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, -1, -1));

        Lbl_AgendaPainelFundo1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Frederico\\Documents\\projetos p??blicos\\Barbearia NetBeans - Definitivo\\Barbearia2\\src\\main\\java\\view\\img\\Agenda-PainelFundo.png")); // NOI18N
        Lbl_AgendaPainelFundo1.setText("jLabel2");
        getContentPane().add(Lbl_AgendaPainelFundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 1260, 429));

        Lbl_Agenda.setIcon(new javax.swing.ImageIcon("C:\\Users\\Frederico\\Documents\\projetos p??blicos\\Barbearia NetBeans - Definitivo\\Barbearia2\\src\\main\\java\\view\\img\\AgendaFundo.png")); // NOI18N
        Lbl_Agenda.setText("jLabel1");
        getContentPane().add(Lbl_Agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1273, 636));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_Desmarcar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_Desmarcar1ActionPerformed
        controller.cancelarAgendamento();
    }//GEN-LAST:event_jButton1_Desmarcar1ActionPerformed

    private void jButton1_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_CancelarActionPerformed
        controller.voltar();
    }//GEN-LAST:event_jButton1_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CancelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelaAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelaAgendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Agenda;
    private javax.swing.JLabel Lbl_AgendaPainelFundo1;
    private javax.swing.JButton jButton1_Cancelar;
    private javax.swing.JButton jButton1_Desmarcar;
    private javax.swing.JButton jButton1_Desmarcar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_Id;
    private javax.swing.JTextField jTextField1_Id;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextField getjTextField1_Id() {
        return jTextField1_Id;
    }

    public void setjTextField1_Id(javax.swing.JTextField jTextField1_Id) {
        this.jTextField1_Id = jTextField1_Id;
    }

    
}

