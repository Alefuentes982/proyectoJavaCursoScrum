/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.*;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class LoginController {
      public static VentanaLogin ventana = new VentanaLogin();
      public static void mostrar(){ventana.setVisible(true); }
      public static void ocultar(){ventana.setVisible(false);}
      
      public static void eventoingresar(){
         String usuario = ventana.getjTextField1().getText();
         String clave = ventana.getjPasswordField1().getText();
        
         
           /*          
         //verificar que usuario y clave son correctos
         if(usuario.equals("admin") && clave.equals("123456")){
             ocultar();
             PrincipalController.mostrar();
         }else{
             System.out.println("Usuario o Clave inválidos");
         }
          
          System.out.println("Evento!!!");
      }
    */
          
         
         try {
           String SQL="select from usuarios where USU_USERNAME= usuario AND USU_CLAVE= clave";
         
            Statement st=con.createStatement();
         
           
         
              if (n>=0) {
               
               JOptionPane.showMessageDialog(null,"Registro ELIMINADO Exitosamente");
              }        
        
         
         }catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Error" +e.getMessage());        
        
       }
}
