
package Clases;

import java.util.Objects;

/**
 *
 * @author Grupo 4
 */
class PinTransaccional implements Pin{
    // Clase pin transaccional
    static int cantidad;
    Integer Id;
    Integer Pin;

    PinTransaccional(int pin) {
        Id = ++cantidad;
        this.Pin = pin;
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

    int compareTo(PinTransaccional pinTrans) {
        try {
            return pinTrans.Id.compareTo(Id);
        } catch (Exception e) {
            return -1;
        }
    }
}
