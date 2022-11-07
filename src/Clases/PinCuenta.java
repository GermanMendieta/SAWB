package Clases;

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
    // pin de cuenta

    int compareTo(PinCuenta pinCuenta) {
        try {
            return pinCuenta.Id.compareTo(Id);
        } catch (Exception e) {
            return -1;
        }
    }

}
