
package Vista;


import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import Controlador.ConexionMysql;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class VentanaCanal extends javax.swing.JFrame {

    ConexionMysql cc=new ConexionMysql();
    Connection con=cc.conexion();
    
    public VentanaCanal() {
        initComponents();
        
         this.setLocationRelativeTo(null);
         mostrarDatos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNCanal = new javax.swing.JTextField();
        codCanal = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCanal = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        botonbuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 750));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("CANAL"));

        jLabel1.setText("Nombre Canal");

        jLabel4.setText("Código Canal");

        txtNCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNCanalActionPerformed(evt);
            }
        });
        txtNCanal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNCanalKeyTyped(evt);
            }
        });

        codCanal.setEditable(false);
        codCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codCanalActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonActualizar.setText("Actualizar");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        jLabel2.setText("Estado");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel4))
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar)
                    .addComponent(codCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(307, 307, 307))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNCanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codCanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonActualizar)
                    .addComponent(Guardar)
                    .addComponent(btnEliminar))
                .addGap(42, 42, 42)
                .addComponent(botonCancelar)
                .addGap(70, 70, 70))
        );

        tablaCanal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaCanal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCanal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCanalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCanal);

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        botonbuscar.setText("Buscar");
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });
        botonbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                botonbuscarKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("BUSQUEDA POR NOMBRE");

        limpiar.setText("LIMPIAR DATOS");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpiar)
                .addGap(155, 155, 155))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscar)
                    .addComponent(limpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Canal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNCanalActionPerformed
         
    }//GEN-LAST:event_txtNCanalActionPerformed
   
    private void txtNCanalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNCanalKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' ||  c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtNCanalKeyTyped

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
       insertarDatos();
       limpiarCajas();
       mostrarDatos();
    }//GEN-LAST:event_GuardarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed

    }//GEN-LAST:event_botonCancelarActionPerformed

    private void tablaCanalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCanalMouseClicked
       
      int filaSeleccionada=tablaCanal.rowAtPoint(evt.getPoint());
      
      codCanal.setText(tablaCanal.getValueAt(filaSeleccionada, 0).toString());
        
      
      txtNCanal.setText(tablaCanal.getValueAt(filaSeleccionada, 1).toString());
      
      comboEstado.setSelectedItem(tablaCanal.getValueAt(filaSeleccionada, 2).toString());
    }//GEN-LAST:event_tablaCanalMouseClicked

    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
       filtrarDatos(txtBuscar.getText());
     
    }//GEN-LAST:event_botonbuscarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
       
        ActualizarDatos();
        limpiarCajas();
        mostrarDatos();

    }//GEN-LAST:event_botonActualizarActionPerformed

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
                   
             
                  
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Elimina();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void codCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codCanalActionPerformed
      
    }//GEN-LAST:event_codCanalActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
       // filtrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void botonbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonbuscarKeyReleased
        filtrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_botonbuscarKeyReleased

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCajas();
        mostrarDatos();
                
    }//GEN-LAST:event_limpiarActionPerformed

    //*****  FUNCIONES *****//
    
     public void limpiarCajas(){
        txtNCanal.setText("");
        codCanal.setText("");
    }
     
     public void Elimina(){
         
         int filaSeleccionada=tablaCanal.getSelectedRow();
         
         try {
           String SQL="delete from canal where CAN_ID_CANAL="+tablaCanal.getValueAt(filaSeleccionada,0);
         
            Statement st=con.createStatement();
         
            int n=st.executeUpdate(SQL);
         
              if (n>=0) {
               
               JOptionPane.showMessageDialog(null,"Registro ELIMINADO Exitosamente");
              }        
        
         
         }catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Error" +e.getMessage());        
        
       }
         mostrarDatos();  
         limpiarCajas();
     }   
    
     public void insertarDatos(){

    try {
        
        String SQL="insert into canal (CAN_NOMBRE, CAN_ESTADO) values (?,?)";
      
        PreparedStatement pst=con.prepareStatement(SQL);
        
        pst.setString(1, txtNCanal.getText());
        
        String estado = comboEstado.getSelectedItem().toString();
        
       
        String valorestado;
     
        if (estado == "ACTIVO"){
           valorestado = "1";
        }
         else{
           valorestado = "0";        
                    }
               
       pst.setString(2, valorestado);
         
        pst.execute();
                
        JOptionPane.showMessageDialog(null,"Registro Exitoso");        
    }  
    catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Error de Registros " +e.getMessage());        
      
    }
}    
     
     public void ActualizarDatos(){

    try {
                
        String SQL="update canal set CAN_ID_CANAL=?, CAN_NOMBRE=?, CAN_ESTADO=? WHERE CAN_ID_CANAL=? ";
                 
         
        int filaSeleccionada=tablaCanal.getSelectedRow();
        String dao=(String)tablaCanal.getValueAt(filaSeleccionada, 0);
        
        PreparedStatement pst=con.prepareStatement(SQL);
        
        pst.setString(1, codCanal.getText());
        pst.setString(2, txtNCanal.getText());
              
        String estado = comboEstado.getSelectedItem().toString();
       
        String valorestado;
     
        if (estado == "ACTIVO"){
           valorestado = "1";
        }
         else{
           valorestado = "0";        
                    }
               
       pst.setString(3, valorestado);
              
       pst.setString(4, dao);
       
        pst.execute();
                
        JOptionPane.showMessageDialog(null,"Registro Editado Exitosamente ");        
       
    } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Error de Edicion " +e.getMessage());        
        
    }
}    
     
     public void mostrarDatos(){
        
        String[] titulos={"Codigo RRSS", "Nombre RRSS", "Estado"};
        String[] registros=new String[5];
        
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        
        String SQL="select * from canal";
        
        try {
            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
                    
            while (rs.next()){
                
           
            registros[0]=rs.getString("CAN_ID_CANAL");    
            registros[1]=rs.getString("CAN_NOMBRE");
          
            String estado = rs.getString("CAN_ESTADO");
          
                       
            String binestado = "";    
            if (estado.equals("1")){
              binestado = "ACTIVO";
            }else {
              binestado = "INACTIVO";
            }
            registros[2]= binestado; 
                             
            modelo.addRow(registros);
                          
            }   
            
            tablaCanal.setModel(modelo);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos "+ e.getMessage());
        
        }
    }
    
      public void filtrarDatos(String valor){
        
        String[] titulos={"ID","Codigo RRSS", "Nombre RRSS", "Estado"};
        String[] registros=new String[5];
        
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        
        String SQL="select * from canal where CAN_NOMBRE like '%"+valor+"%'";
        
        try {
            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
                    
            while (rs.next()){
                
           
            registros[0]=rs.getString("CAN_ID_CANAL");    
            registros[1]=rs.getString("CAN_NOMBRE");
          
            String estado = rs.getString("CAN_ESTADO");
                           
            String binestado = "";    
            if (estado.equals("1")){
              binestado = "ACTIVO";
            }else {
              binestado = "INACTIVO";
            }
            registros[3]= binestado; 
                             
            modelo.addRow(registros);
                          
            }   
            
            tablaCanal.setModel(modelo);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos "+ e.getMessage());
        
        }
    }
    

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
            java.util.logging.Logger.getLogger(VentanaCanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCanal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Guardar;
    private javax.swing.JButton botonActualizar;
    public javax.swing.JButton botonCancelar;
    public javax.swing.JButton botonbuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField codCanal;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    public javax.swing.JTable tablaCanal;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtNCanal;
    // End of variables declaration//GEN-END:variables



}
