package Clases;

/**
 *
 * @author Giuliano
 */
public class Movimientos {
    int id;
    int monto;
    Debito cuenta;
    PinTransaccional pin;

    public Movimientos(int id, int monto, Debito cuenta, PinTransaccional pin) {
        this.id = id;
        this.monto = monto;
        this.cuenta = cuenta;
        this.pin = pin;
    }
    
    
}
