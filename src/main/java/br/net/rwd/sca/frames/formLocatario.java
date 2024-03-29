/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * formUsuario.java
 *
 * Created on 10/01/2012, 17:10:10
 */
package br.net.rwd.sca.frames;

import br.net.rwd.sca.dao.LocatarioDAO;
import br.net.rwd.sca.entidades.Locatario;
import br.net.rwd.sca.util.TableModelEspecial;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Erivando
 */
public class formLocatario extends javax.swing.JDialog {

    private final LocatarioDAO dao = new LocatarioDAO();
    private List<Locatario> locatarios;

    public formLocatario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        carregaDadosIniciais();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLocatarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locatários");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar.png"))); // NOI18N
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.setPreferredSize(new java.awt.Dimension(150, 50));
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setPreferredSize(new java.awt.Dimension(150, 50));
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jButtonRemover.setText("Remover");
        jButtonRemover.setPreferredSize(new java.awt.Dimension(150, 50));
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setPreferredSize(new java.awt.Dimension(150, 50));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jTableLocatarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        jScrollPane1.setViewportView(jTableLocatarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-640)/2, (screenSize.height-333)/2, 640, 333);
    }// </editor-fold>//GEN-END:initComponents

private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
    setVisible(false);
}//GEN-LAST:event_jButtonVoltarActionPerformed

private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
    formAdicionaLocatario dialog = new formAdicionaLocatario(new javax.swing.JFrame(), true, dao, this);
    dialog.setVisible(true);
}//GEN-LAST:event_jButtonAdicionarActionPerformed

private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
    if (jTableLocatarios.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this, "Selecione um registro para edição!");
        return;
    }

    formAtualizaLocatario dialog = new formAtualizaLocatario(new javax.swing.JFrame(), true, dao, locatarios.get(jTableLocatarios.getSelectedRow()), this);
    dialog.setVisible(true);
}//GEN-LAST:event_jButtonAlterarActionPerformed

private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
    if (jTableLocatarios.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this, "Selecione um registro para exclusão!");
        return;
    }

    int resultado = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir?\nTodas as outras informações dependentes deste cadastro também serão excluídas!", "Exclui", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (resultado == 0) {
        int codLocatario = locatarios.get(jTableLocatarios.getSelectedRow()).getCodigo();
        dao.remove(codLocatario);
    }
    carregaDadosIniciais();
}//GEN-LAST:event_jButtonRemoverActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLocatarios;
    // End of variables declaration//GEN-END:variables

    public final void carregaDadosIniciais() {
        try {
            locatarios = dao.seleciona();
            jTableLocatarios.setModel(new TableModelEspecial(Locatario.class, locatarios, jTableLocatarios));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(formLocatario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
