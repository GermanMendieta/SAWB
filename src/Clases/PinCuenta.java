package Clases;

import java.util.Objects;

/**
 *
 * @author Grupo 4
 */
class PinCuenta implements Pin {
    /*
        Clase pin de cuenta 
    */
    Integer Id;
    Integer Pin;
    
    public PinCuenta(int id) {
        Id = id;
        Pin = id;
    }

    @Override
    public boolean validarID(Integer id) {
        try {
            return Objects.equals(Id, id);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean validarPin(Integer pin) {
        try {
            return Objects.equals(Pin, pin);
        } catch (Exception e) {
            return false;
        }
    }
    // pin de cuenta

    int compareTo(PinCuenta pinCuenta) {
        try {
            return pinCuenta.Id.compareTo(Id);
        } catch (Exception e) {
            return -1;
        }
    }

}
