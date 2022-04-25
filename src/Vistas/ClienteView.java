package Vistas;

import java.util.Observable;
import java.util.Observer;

import Models.Cliente;
import Vistas.ClienteView;

public class ClienteView extends javax.swing.JFrame implements Observer  {
	
	 private String nombre;
	    private Cliente cliente;
	    private String mensaje;

	    public ClienteView() {
	        initComponents();

	        txtMensaje.setEnabled(false);
	        btnEnviar.setEnabled(false);
	        btnSalir.setEnabled(false);
	        txtNombre.setEnabled(true);
	        btnEmpezar.setEnabled(true);
	    }
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	    private void initComponents() {

	        jLabel1 = new javax.swing.JLabel();
	        txtNombre = new javax.swing.JTextField();
	        btnEmpezar = new javax.swing.JButton();
	        txtMensaje = new javax.swing.JTextField();
	        btnEnviar = new javax.swing.JButton();
	        btnSalir = new javax.swing.JButton();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        txtConversacion = new javax.swing.JTextArea();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel1.setText("Nombre de usuario");

	        btnEmpezar.setText("Empezar");
	        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnEmpezarActionPerformed(evt);
	            }
	        });

	        btnEnviar.setText("Enviar");
	        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnEnviarActionPerformed(evt);
	            }
	        });

	        btnSalir.setText("Salir");
	        btnSalir.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnSalirActionPerformed(evt);
	            }
	        });

	        txtConversacion.setColumns(20);
	        txtConversacion.setRows(5);
	        jScrollPane1.setViewportView(txtConversacion);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(jLabel1)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addComponent(txtMensaje))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(btnEmpezar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(159, 159, 159)
	                        .addComponent(btnSalir))
	                    .addGroup(layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(8, 8, 8)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel1)
	                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(btnEmpezar))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(btnEnviar))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(btnSalir)
	                .addGap(7, 7, 7))
	        );

	        pack();
	    }// </editor-fold>//GEN-END:initComponents

	    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed

	        if (txtNombre.getText().equalsIgnoreCase("")) {

	        } else {

	            nombre = txtNombre.getText();

	            cliente = new Cliente(6000);
//	            cliente.iniciar();

	            txtMensaje.setEnabled(true);
	            btnEnviar.setEnabled(true);
	            btnSalir.setEnabled(true);
	            txtNombre.setEnabled(false);
	            btnEmpezar.setEnabled(false);
	        }
	    }//GEN-LAST:event_btnEmpezarActionPerformed

	    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

	        mensaje = txtMensaje.getText();
	        cliente.enviarMensaje(nombre + " --> " + mensaje + "\n");
	        txtMensaje.setText("");

	    }//GEN-LAST:event_btnEnviarActionPerformed

	    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

	        cliente.enviarMensaje("cerrar");
	        this.setVisible(false);
	        this.dispose();

	    }//GEN-LAST:event_btnSalirActionPerformed

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
	            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new ClienteView().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    private javax.swing.JButton btnEmpezar;
	    private javax.swing.JButton btnEnviar;
	    private javax.swing.JButton btnSalir;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JTextArea txtConversacion;
	    private javax.swing.JTextField txtMensaje;
	    private javax.swing.JTextField txtNombre;
	    // End of variables declaration//GEN-END:variables

	    @Override
	    public void update(Observable o, Object arg) {
	        txtConversacion.append((String) arg);
	    }
}
