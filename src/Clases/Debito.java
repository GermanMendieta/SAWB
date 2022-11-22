package Clases;

/**
 *
 * @author Giuliano
 */
public class Debito extends Cuenta {
    int monto;

    public Debito(int id, Cliente cliente, int monto) {
        super(id, cliente);
        this.monto = monto;
    }
    public Debito(Cuenta cuenta,int monto){
        super( cuenta.id, cuenta.cliente);
        this.monto = monto;
    }
}
