
package Clases;

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
    public boolean validarID() {
        try {
            return Id != 0;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean validarPin() {
        try {
            return Pin != 0;
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
