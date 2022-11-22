package Clases;

/**
 *
 * @author Giuliano
 */
public class Pagos {
    int id;
    Debito cuentaDebito;
    PinTransaccional pin;

    public Pagos(int id, Debito cuentaDebito, PinTransaccional pin) {
        this.id = id;
        this.cuentaDebito = cuentaDebito;
        this.pin = pin;
    }
    
    
}
