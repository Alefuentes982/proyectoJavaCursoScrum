package Controlador;



import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexionMysql {
    
    
    Connection conectar=null;
    
    public Connection conexion(){
    
      try{  
         //Class.forName("com.mysql.jdbc.Driver");
         //conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost3306/dreamgifts", "root", "");
         //conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/dreamgifts", "root", "");
         Class.forName("com.mysql.jdbc.Driver");
         conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dreamgifts", "root", "");
         
         //JOptionPane.showMessageDialog(null,"Conexion Establecida");
         
          
          
          
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Sin Conexión " + e.getMessage());
    } 
    
      return conectar;
   }
 }
