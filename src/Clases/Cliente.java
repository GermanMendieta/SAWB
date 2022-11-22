package Clases;

/**
 *
 * @author Grupo 4
 */
public class Cliente {

    int id;
    String nombre;
    PinCuenta pinCuenta;
    PinTransaccional pinTrans;

    /* Constructor de la clase Cliente*/
    public Cliente(int id, String nombre, int pinC, int pinTr) {
        if (validarUserNotEmpty(nombre, id)) {
            this.id = id;
            this.nombre = nombre;
            this.pinCuenta = new PinCuenta(pinC);
            this.pinTrans = new PinTransaccional(pinTr);
        } 
    }

    private boolean validarUserNotEmpty(String nombre, int pin) {
        /* validamos el usuario*/
        try {
            return (pinCuenta.validarPin(pin) && this.nombre.compareTo(nombre) == 0);
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean validarUsuario(String nombre, int pin) {
        /* validamos el usuario*/
        try {
            System.out.println("Pin:"+pinCuenta);
            System.out.println("nombre:"+this.nombre);
            return (pinCuenta.validarPin(pin) && this.nombre.compareTo(nombre) == 0);
        } catch (Exception e) {
            return false;
        }
    }

    boolean validaPinC(PinCuenta pinC) {
        return pinCuenta.validarPin(pinC.Pin);
    }

    boolean validaPinTr(PinTransaccional pinTr) {
        return pinTrans.validarPin(pinTr.Pin);
    }

}
