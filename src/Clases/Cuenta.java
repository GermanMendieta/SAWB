
package Clases;

/**
 *
 * @author Grupo 4
 */
public class Cuenta {
    int id;
    Cliente cliente;
    /* Constructores */
    public Cuenta(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }
    /* metodo que compara 2 clientes para validar un usuario */
    public boolean comparaCliente(String nombre, String pin) {
        return cliente.validarUsuario(nombre, Integer.parseInt(pin));
    }
    /* Getters de la clase */
    public Cliente getCliente() {
        return this.cliente;
    }

    public int getID() {
        return this.id;
    }
    
}
