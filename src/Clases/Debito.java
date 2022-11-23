package Clases;

import javax.naming.OperationNotSupportedException;

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
        if (monto > 0) {
            this.monto += monto;
        } else {
            throw new UnsupportedOperationException("Monto incorrecto");
        }
    }
    
    public void quitarMonto(int monto) throws Exception {
        if (this.monto - monto < 0 && monto > 0) {
            throw new UnsupportedOperationException("Monto insuficiente");
        }
        
        this.monto -= monto;
    }
    
    public int getMonto() {
        return this.monto;
    }
}
