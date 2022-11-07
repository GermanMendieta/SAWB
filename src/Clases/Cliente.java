
package Clases;

/**
 *
 * @author Grupo 4
 */
public class Cliente {
    int id;
    String nombre;
    PinCuenta   pinCuenta;
    PinTransaccional pinTrans;
    
    /* Constructor de la clase Cliente*/
    public Cliente(int id, String nombre, int pinC){
        if( validarUsuario(nombre, id))
            this.id = id;
            this.nombre = nombre;
            this.pinCuenta = new PinCuenta(id);
            this.pinTrans = new PinTransaccional(id);
        }

    private boolean validarUsuario(String nombre, int id) {
        /* validamos el usuario*/
        try {
            return !(id != 0 || nombre.compareTo("") == 0);
        } catch (Exception e) {
            return false;
        }
        
    }
    
    boolean validaPinC(PinCuenta pinC){
        return pinC.validarPin() && pinC.compareTo(pinCuenta) == 0;
    }
    
    boolean validaPinTr(PinTransaccional pinTr){
        return pinTr.validarPin() && pinTr.compareTo(pinTrans) == 0;
    }
    
}
