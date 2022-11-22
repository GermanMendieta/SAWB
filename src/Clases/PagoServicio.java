package Clases;

/**
 *
 * @author Giuliano
 */
public class PagoServicio extends Pagos {

    int Id;
    Servicio servicio;
    int monto;

    public PagoServicio(int Id, Servicio servicio, int monto, int id, Debito cuentaDebito, PinTransaccional pin) {
        super(id, cuentaDebito, pin);
        this.Id = Id;
        this.servicio = servicio;
        this.monto = monto;
    }
    
    public PagoServicio(Pagos Pago, int Id, Servicio servicio, int monto) {
        super(Pago.id, Pago.cuentaDebito, Pago.pin);
        this.Id = Id;
        this.servicio = servicio;
        this.monto = monto;
    }

}
