
package Controlador;
import Vista.*;


public class PrincipalController {
  public static VentanaPrincipal ventana = new VentanaPrincipal();
  public static void mostrar(){ventana.setVisible(true); }
  public static void ocultar(){ventana.setVisible(false);}
  public static void botonUsuario(){
    ocultar();
    UsuarioController.mostrar();
}   
  
   public static void botonCanal(){
    ocultar();
    CanalController.mostrar();
}   
      
  
    
}
