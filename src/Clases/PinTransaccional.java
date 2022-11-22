
package Clases;

import java.util.Objects;

/**
 *
 * @author Grupo 4
 */
class PinTransaccional implements Pin{
    // Clase pin transaccional
    Integer Id;
    Integer Pin;

    PinTransaccional(int id) {
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

    int compareTo(PinTransaccional pinTrans) {
        try {
            return pinTrans.Id.compareTo(Id);
        } catch (Exception e) {
            return -1;
        }
    }
}
