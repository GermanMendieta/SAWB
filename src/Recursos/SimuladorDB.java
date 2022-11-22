package Recursos;

import Clases.*;
import java.util.ArrayList;

/**
 *
 * @author Grupo 4
 */
public class SimuladorDB {

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

    public SimuladorDB() {
        this.Clientes = new Cliente[]{
            new Cliente(1, "admin", Integer.parseInt(encriptar.Encriptar(12345)), Integer.parseInt(encriptar.Encriptar(12345)) ),
            new Cliente(2, "UserB", Integer.parseInt(encriptar.Encriptar(56789)), Integer.parseInt(encriptar.Encriptar(12345)) )
        };
        this.Cuentas = new Cuenta[]{
            new Cuenta(100, Clientes[0]),
            new Cuenta(101, Clientes[0]),
            new Cuenta(103, Clientes[1])
        };
        this.Creditos = new Credito[]{
            new Credito(Cuentas[0], 1000000),
            new Credito(Cuentas[1], 0),
            new Credito(Cuentas[2], 3000000)
        };
        this.Debitos = new Debito[]{
            new Debito(Cuentas[0], 0),
            new Debito(Cuentas[1], 0),
            new Debito(Cuentas[2], 0)
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
    public boolean ValidarUser(String nombre, String pin) {
        
        for (Cuenta Cuenta : Cuentas) {
            if (Cuenta.comparaCliente(nombre, pin)) {
                return true;
            }
        }
        return false;
    }

}
