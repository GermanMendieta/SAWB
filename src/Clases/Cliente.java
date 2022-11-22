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
    public Cliente(int id, String nombre, int pinC) {
        if (validarUsuario(nombre, id)) {
            this.id = id;
            this.nombre = nombre;
            this.pinCuenta = new PinCuenta(id);
            this.pinTrans = new PinTransaccional(id);
        }
        
    }

    private boolean validarUsuario(String nombre, int pin) {
        /* validamos el usuario*/
        try {
            return (pinCuenta.validarPin(pin) && nombre.compareTo("") == 0);
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

    boolean compruebaDatos(String nombre, String pin) {
        return validarUsuario(nombre, id);
    }

}
