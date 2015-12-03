/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game2dms;

/**
 *
 * @author alex
 */
public class Console extends javax.swing.JFrame {

    /**
     * Creates new form Console
     */
    public Console() {
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

        jPCenario = new javax.swing.JPanel();
        jlEstado = new javax.swing.JLabel();
        jPComando = new javax.swing.JPanel();
        jBAndar = new javax.swing.JButton();
        jBPular = new javax.swing.JButton();
        JBMorrer = new javax.swing.JButton();
        jBParar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlEstado.setText("Estado");

        javax.swing.GroupLayout jPCenarioLayout = new javax.swing.GroupLayout(jPCenario);
        jPCenario.setLayout(jPCenarioLayout);
        jPCenarioLayout.setHorizontalGroup(
            jPCenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCenarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlEstado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPCenarioLayout.setVerticalGroup(
            jPCenarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCenarioLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jlEstado)
                .addContainerGap(321, Short.MAX_VALUE))
        );

        jBAndar.setText("Andar");
        jBAndar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAndarActionPerformed(evt);
            }
        });

        jBPular.setText("Pular");
        jBPular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPularActionPerformed(evt);
            }
        });

        JBMorrer.setText("Morrer");
        JBMorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMorrerActionPerformed(evt);
            }
        });

        jBParar.setText("Parar");
        jBParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPComandoLayout = new javax.swing.GroupLayout(jPComando);
        jPComando.setLayout(jPComandoLayout);
        jPComandoLayout.setHorizontalGroup(
            jPComandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPComandoLayout.createSequentialGroup()
                .addComponent(jBAndar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBMorrer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBParar)
                .addGap(0, 340, Short.MAX_VALUE))
        );
        jPComandoLayout.setVerticalGroup(
            jPComandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPComandoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPComandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAndar)
                    .addComponent(jBPular)
                    .addComponent(JBMorrer)
                    .addComponent(jBParar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCenario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPComando, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPCenario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPComando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAndarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAndarActionPerformed
        jlEstado.setText("Andando");
    }//GEN-LAST:event_jBAndarActionPerformed

    private void jBPularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPularActionPerformed
        jlEstado.setText("Pulando");
    }//GEN-LAST:event_jBPularActionPerformed

    private void JBMorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMorrerActionPerformed
        jlEstado.setText("Morri");
    }//GEN-LAST:event_JBMorrerActionPerformed

    private void jBPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPararActionPerformed
        jlEstado.setText("Parei");
    }//GEN-LAST:event_jBPararActionPerformed

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
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Console.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Console().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBMorrer;
    private javax.swing.JButton jBAndar;
    private javax.swing.JButton jBParar;
    private javax.swing.JButton jBPular;
    private javax.swing.JPanel jPCenario;
    private javax.swing.JPanel jPComando;
    private javax.swing.JLabel jlEstado;
    // End of variables declaration//GEN-END:variables
}
