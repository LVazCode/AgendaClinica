/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.alfaclinica;

/**
 *
 * @author letic
 */
public class TelaInicialAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicialAdmin
     */
    public TelaInicialAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BotaoPerfil = new javax.swing.JButton();
        ConsultaDispo = new javax.swing.JButton();
        BotaoConsultaAgendada = new javax.swing.JButton();
        ExamesDisp = new javax.swing.JButton();
        ExamesAgen = new javax.swing.JButton();
        AdminCad = new javax.swing.JButton();
        UsuariosCad = new javax.swing.JButton();
        AdicionarCons = new javax.swing.JButton();
        AdicionarExa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Bem vindo!");

        BotaoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/do-utilizador.png"))); // NOI18N
        BotaoPerfil.setText("Cadastro");
        BotaoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPerfilActionPerformed(evt);
            }
        });

        ConsultaDispo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ConsultaDispo.setText("Consultas disponiveis");
        ConsultaDispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaDispoActionPerformed(evt);
            }
        });

        BotaoConsultaAgendada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoConsultaAgendada.setText("Consultas agendadas");
        BotaoConsultaAgendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConsultaAgendadaActionPerformed(evt);
            }
        });

        ExamesDisp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExamesDisp.setText("Exames disponiveis");
        ExamesDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamesDispActionPerformed(evt);
            }
        });

        ExamesAgen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExamesAgen.setText("Exames agendados");
        ExamesAgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamesAgenActionPerformed(evt);
            }
        });

        AdminCad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AdminCad.setText("Administradores cadastrados");
        AdminCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminCadActionPerformed(evt);
            }
        });

        UsuariosCad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UsuariosCad.setText("Usuarios cadastrados");
        UsuariosCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosCadActionPerformed(evt);
            }
        });

        AdicionarCons.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AdicionarCons.setText("Adicionar consulta");
        AdicionarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarConsActionPerformed(evt);
            }
        });

        AdicionarExa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AdicionarExa.setText("Adicionar exame");
        AdicionarExa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarExaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ConsultaDispo, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(BotaoConsultaAgendada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AdicionarCons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UsuariosCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdminCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AdicionarExa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExamesAgen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExamesDisp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(BotaoPerfil))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addComponent(jLabel1)))
                        .addGap(0, 214, Short.MAX_VALUE)))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BotaoPerfil)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(ConsultaDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExamesAgen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(BotaoConsultaAgendada, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ExamesDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdicionarCons, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(AdicionarExa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuariosCad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminCad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPerfilActionPerformed
        // TODO add your handling code here:
        Perfil usuario = new Perfil();
        this.dispose();
    }//GEN-LAST:event_BotaoPerfilActionPerformed

    private void ConsultaDispoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaDispoActionPerformed
        // TODO add your handling code here:
        AdminConsultasDisponiveis adminConsultas = new AdminConsultasDisponiveis();
        this.dispose();
    }//GEN-LAST:event_ConsultaDispoActionPerformed

    private void ExamesDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamesDispActionPerformed
        // TODO add your handling code here:
        AdminExamesDisponiveis examesDisponiveis = new AdminExamesDisponiveis();
        this.dispose();
    }//GEN-LAST:event_ExamesDispActionPerformed

    private void BotaoConsultaAgendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConsultaAgendadaActionPerformed
        // TODO add your handling code here:
        AdminConsultasAgendadas consultasAgendadas = new AdminConsultasAgendadas();
        this.dispose();
    }//GEN-LAST:event_BotaoConsultaAgendadaActionPerformed

    private void ExamesAgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamesAgenActionPerformed
        // TODO add your handling code here:
        AdminExamesAgendados examesAgendados = new AdminExamesAgendados();
        this.dispose();
    }//GEN-LAST:event_ExamesAgenActionPerformed

    private void AdicionarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarConsActionPerformed
        // TODO add your handling code here:
        AdminAdicionarConsulta adicionarConsulta = new AdminAdicionarConsulta();
        this.dispose();
    }//GEN-LAST:event_AdicionarConsActionPerformed

    private void AdicionarExaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarExaActionPerformed
        // TODO add your handling code here:
        AdminAdicionarExame adicionarExame = new AdminAdicionarExame();
        this.dispose();
    }//GEN-LAST:event_AdicionarExaActionPerformed

    private void UsuariosCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosCadActionPerformed
        // TODO add your handling code here:
        AdminUsuariosCadastrados usuariosCadastrados = new AdminUsuariosCadastrados();
        this.dispose();
    }//GEN-LAST:event_UsuariosCadActionPerformed

    private void AdminCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminCadActionPerformed
        // TODO add your handling code here:
        AdminCadastrados adminCadastrados = new AdminCadastrados();
        this.dispose();
    }//GEN-LAST:event_AdminCadActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicialAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarCons;
    private javax.swing.JButton AdicionarExa;
    private javax.swing.JButton AdminCad;
    private javax.swing.JButton BotaoConsultaAgendada;
    private javax.swing.JButton BotaoPerfil;
    private javax.swing.JButton ConsultaDispo;
    private javax.swing.JButton ExamesAgen;
    private javax.swing.JButton ExamesDisp;
    private javax.swing.JButton UsuariosCad;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
