package Recursos;

import Clases.*;
import java.util.ArrayList;

/**
 *
 * @author Grupo 4
 */
public class BaseDeDatos {

    private Cliente[] Clientes;
    private Cuenta[] Cuentas;
    private Credito[] Creditos;
    private Debito[] Debitos;
    private Servicio[] Servicios;
    private ArrayList<Transferencias> Transferencias;
    private ArrayList<Movimientos> MovimientosRegistrados;
    private ArrayList<Pagos> Pago;
    private ArrayList<TarjetaDeCredito> PagoTargetas;
    private ArrayList<PagoServicio> PagoServicio;

    public BaseDeDatos() {
        this.Clientes = new Cliente[]{
            new Cliente(1, "admin", Integer.parseInt(encriptar.Encriptar(12345)), Integer.parseInt(encriptar.Encriptar(12345)) ),
            new Cliente(2, "UserB", Integer.parseInt(encriptar.Encriptar(56789)), Integer.parseInt(encriptar.Encriptar(12345)) )
        };
        this.Cuentas = new Cuenta[]{
            new Cuenta(100, Clientes[0]),
            new Cuenta(103, Clientes[1])
        };
        
        this.Debitos = new Debito[]{
            new Debito(Cuentas[0], 1000000),
            new Debito(Cuentas[1], 3000000)
        };
        this.Creditos = new Credito[]{
            new Credito(Cuentas[0], 1000000),
            new Credito(Cuentas[1], 3000000)
        };
        this.Servicios = new Servicio[]{
            new Servicio(1, "ANDE"),
            new Servicio(2, "Atencion Medica SA"),
            new Servicio(3, "Cooperativa"),
            new Servicio(4, "Essap"),
            new Servicio(5, "Personal"),
            new Servicio(5, "Servicio de telefornia local"),
            new Servicio(6, "Seguros De Vida SILS"),
            new Servicio(7, "Tigo")
        };

        this.Transferencias = new ArrayList<>();

        this.MovimientosRegistrados = new ArrayList<>();

        this.Pago = new ArrayList<>();

        this.PagoTargetas = new ArrayList<>();

        this.PagoServicio = new ArrayList<>();

    }

    /*
        ________________________________________________________________________________________
       |                                                                                        |
       |    Llamamos a la funcion que se enecarga de validar al usuario en la base de datos     |
       |________________________________________________________________________________________|
     */
    public Cliente ValidarUser(String nombre, String pin) {
        
        for (Cuenta Cuenta : Cuentas) {
            if (Cuenta.comparaCliente(nombre, pin)) {
                return Cuenta.getCliente();
            }
        }
        
        return null;
    }

    public Cuenta[] getCuentas(Cliente cliente) {
        ArrayList<Cuenta> respuesta = new ArrayList<>();
        for (Cuenta cuenta : Cuentas) {
            if (cuenta.getCliente().equals(cliente)) {
                respuesta.add(cuenta);
            }
        }
        
        Cuenta[] cuentas = new Cuenta[respuesta.size()];
        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = respuesta.get(i);
        }
        
        return cuentas;
    }
    
    public Debito[] getCuentasDebitos(Cuenta[] cuentas) {
        Debito[] respuesta = new Debito[cuentas.length];
           
        int i = 0;
        for (Cuenta cuenta : cuentas) {
            for (Debito debito : Debitos) {
                if (debito.getCuenta() == cuenta.getID()) {
                    respuesta[i++] = debito;
                    break;
                }
            }
        }
        
        return respuesta;
    }
    
    public Debito getCuentaDebitoPorIDCuenta(int id) {
        for (Debito debito : Debitos) {
            if (debito.getCuenta() == id) {
                return debito;
            }
        }
        
        return null;
    }
    
    public void agregarTransferencia(Transferencias transferencias) {
        Transferencias.add(transferencias);
    }
    
    public ArrayList getTransferencias() {
        return Transferencias;
    }

    public Servicio[] getServicios() {
        return Servicios;
    }
    
    public void agregarPagoCredito(Pagos pago, PagoServicio pagoServicio) {
        Pago.add(pago);
        PagoServicio.add(pagoServicio);
    }
}
