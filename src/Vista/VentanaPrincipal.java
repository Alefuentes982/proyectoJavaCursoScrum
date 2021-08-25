/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.PrincipalController;
import java.awt.Component;


/**
 *
 * @author the_e
 */
public class VentanaPrincipal extends javax.swing.JFrame {



    /**
     * Creates new form Principal
     */
    public VentanaPrincipal() {
        initComponents();
     
  
        this.setTitle("DreamGifts");
        this.setLocation(400,200);
        
               
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        panelprincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mventa = new javax.swing.JMenuItem();
        mconfirmacion = new javax.swing.JMenuItem();
        mlista = new javax.swing.JMenuItem();
        mactualizacion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        btnCanal = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        btnusuarios = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        btnsalir = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem12.setText("jMenuItem12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelprincipal.setBackground(new java.awt.Color(0, 153, 153));
        panelprincipal.setPreferredSize(new java.awt.Dimension(1000, 750));

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 153));

        jMenu1.setText("Ventas");

        mventa.setText("Venta");
        jMenu1.add(mventa);

        mconfirmacion.setText("Confirmación");
        jMenu1.add(mconfirmacion);

        mlista.setText("Lista Destinos");
        jMenu1.add(mlista);

        mactualizacion.setText("Actualización Despacho");
        jMenu1.add(mactualizacion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Compras");

        jMenuItem17.setText("Órdenes de Compra");
        jMenu2.add(jMenuItem17);

        jMenuItem18.setText("Registro Compra");
        jMenu2.add(jMenuItem18);

        jMenuItem19.setText("Revisión Factura");
        jMenu2.add(jMenuItem19);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Informes");

        jMenuItem20.setText("Informe Ventas");
        jMenu3.add(jMenuItem20);

        jMenuItem21.setText("Informe Inventario");
        jMenu3.add(jMenuItem21);

        jMenuItem22.setText("Informe Clientes");
        jMenu3.add(jMenuItem22);

        jMenuItem23.setText("Informe Devolución y Cambios");
        jMenu3.add(jMenuItem23);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Maestros");

        jMenuItem6.setText("Clientes");
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Proveedores");
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Artículos");
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Packs");
        jMenu4.add(jMenuItem9);

        btnCanal.setText("Canal");
        btnCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanalActionPerformed(evt);
            }
        });
        jMenu4.add(btnCanal);

        jMenuItem11.setText("Categoria Artículos");
        jMenu4.add(jMenuItem11);

        jMenuItem13.setText("Comunas");
        jMenu4.add(jMenuItem13);

        jMenuItem14.setText("Bancos");
        jMenu4.add(jMenuItem14);

        jMenuItem15.setText("Estado Ventas");
        jMenu4.add(jMenuItem15);

        btnusuarios.setText("Usuarios");
        btnusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnusuariosMouseClicked(evt);
            }
        });
        btnusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusuariosActionPerformed(evt);
            }
        });
        jMenu4.add(btnusuarios);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jMenu5.add(btnsalir);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanalActionPerformed
        PrincipalController.botonCanal();
    }//GEN-LAST:event_btnCanalActionPerformed

     private void btnCanalMouseClicked(java.awt.event.MouseEvent evt) {                                         
       
                
    }     
    
    
    private void btnusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnusuariosActionPerformed
         PrincipalController.botonUsuario();
               
    }//GEN-LAST:event_btnusuariosActionPerformed

    private void btnusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariosMouseClicked
       
                
    }//GEN-LAST:event_btnusuariosMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCanal;
    private javax.swing.JMenuItem btnsalir;
    private javax.swing.JMenuItem btnusuarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem mactualizacion;
    private javax.swing.JMenuItem mconfirmacion;
    private javax.swing.JMenuItem mlista;
    private javax.swing.JMenuItem mventa;
    private javax.swing.JDesktopPane panelprincipal;
    // End of variables declaration//GEN-END:variables

    
}


