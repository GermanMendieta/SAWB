package Clases;

/**
 *
 * @author Giuliano
 */
public class TarjetaDeCredito extends Pagos {
    int Id;
    int monto;
    Credito cuentaCredito;

    public TarjetaDeCredito(int Id, int monto, Credito cuentaCredito, int id, Debito cuentaDebito, PinTransaccional pin) {
        super(id, cuentaDebito, pin);
        this.Id = Id;
        this.monto = monto;
        this.cuentaCredito = cuentaCredito;
    }
    
    public TarjetaDeCredito(Pagos Pago, int Id, int monto, Credito cuentaCredito) {
        super(Pago.id, Pago.cuentaDebito, Pago.pin);
        this.Id = Id;
        this.monto = monto;
        this.cuentaCredito = cuentaCredito;
    }
    
}
