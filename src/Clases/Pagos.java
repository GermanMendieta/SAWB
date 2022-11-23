package Clases;

/**
 *
 * @author Giuliano
 */
public class Pagos {
    static int cantidad;
    int id;
    Debito cuentaDebito;
    PinTransaccional pin;

    public Pagos(int id, Debito cuentaDebito, PinTransaccional pin) {
        this.id = id;
        this.cuentaDebito = cuentaDebito;
        this.pin = pin;
    }
    
    public Pagos(Debito cuentaDebito, PinTransaccional pin) {
        this.id = ++cantidad;
        this.cuentaDebito = cuentaDebito;
        this.pin = pin;
    }
    
}
