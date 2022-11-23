
package Clases;

/**
 *
 * @author Grupo 4
 */
public class Cuenta {
    int id;
    Cliente cliente;

    public Cuenta(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public boolean comparaCliente(String nombre, String pin) {
        return cliente.validarUsuario(nombre, Integer.parseInt(pin));
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public int getID() {
        return this.id;
    }
    
}
