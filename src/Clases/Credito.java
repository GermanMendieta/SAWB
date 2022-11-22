package Clases;

/**
 *
 * @author Giuliano
 */
public class Credito extends Cuenta {
    int linea; 

    public Credito(int id, Cliente cliente, int linea) {
        super(id, cliente);
        this.linea = linea;
    }
    public Credito(Cuenta cuenta, int linea){
        super(cuenta.id, cuenta.cliente);
    }
}
