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

    public int getCuenta() {
        return super.id;
    }
    
    public void cargarMonto(int monto) {
        this.monto += monto;
    }
    
    public void quitarMonto(int monto) throws Exception {
        if (this.monto - monto < 0) {
            throw new Exception("Monto insuficiente");
        }
        
        this.monto -= monto;
    }
    
    public int getMonto() {
        return this.monto;
    }
}
