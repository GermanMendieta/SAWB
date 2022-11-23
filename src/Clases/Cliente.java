package Clases;

import Recursos.SimuladorDB;

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
            return !(nombre.length() < 1 || pin == 0);
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean validarUsuario(String nombre, int pin) {
        /* validamos el usuario*/
        try {
            return (pinCuenta.validarPin(pin) && this.nombre.compareTo(nombre) == 0);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean validaPinC(PinCuenta pinC) {
        return pinCuenta.validarPin(pinC.Pin);
    }

    public boolean validaPinTr(PinTransaccional pinTr) {
        return pinTrans.validarPin(pinTr.Pin);
    }
    
    public boolean validaPinTr(int pinTr) {
        return pinTrans.validarPin(pinTr);
    }
    
}
