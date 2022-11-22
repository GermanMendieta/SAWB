package Recursos;

import Clases.*;
import java.util.ArrayList;

/**
 *
 * @author Grupo 4
 */
public class SimuladorDB {

    private static Cliente[] Clientes;
    private static Cuenta[] Cuentas;
    private static Credito[] Creditos;
    private static Debito[] Debitos;
    private static Servicio[] Servicios;
    private static ArrayList<Transferencias> Transferencias;
    private static ArrayList<Movimientos> MovimientosRegistrados;
    private static ArrayList<Pagos> Pago;
    private static ArrayList<TarjetaDeCredito> PagoTargetas;
    private static ArrayList<PagoServicio> PagoServicio;

    public SimuladorDB() {
        SimuladorDB.Clientes = new Cliente[]{
            new Cliente(1, "admin", Integer.parseInt(encriptar.Encriptar(12345))),
            new Cliente(2, "UserB", Integer.parseInt(encriptar.Encriptar(56789)))
        };
        SimuladorDB.Cuentas = new Cuenta[]{
            new Cuenta(100, Clientes[0]),
            new Cuenta(101, Clientes[0]),
            new Cuenta(103, Clientes[1])
        };
        SimuladorDB.Creditos = new Credito[]{
            new Credito(Cuentas[0], 1000000),
            new Credito(Cuentas[1], 0),
            new Credito(Cuentas[2], 3000000)
        };
        SimuladorDB.Debitos = new Debito[]{
            new Debito(Cuentas[0], 0),
            new Debito(Cuentas[1], 0),
            new Debito(Cuentas[2], 0)
        };
        SimuladorDB.Servicios = new Servicio[]{
            new Servicio(1, "ANDE"),
            new Servicio(2, "Atencion Medica SA"),
            new Servicio(3, "Cooperativa"),
            new Servicio(4, "Essap"),
            new Servicio(5, "Personal"),
            new Servicio(5, "Servicio de telefornia local"),
            new Servicio(6, "Seguros De Vida SILS"),
            new Servicio(7, "Tigo")
        };

        SimuladorDB.Transferencias = new ArrayList<>();

        SimuladorDB.MovimientosRegistrados = new ArrayList<>();

        SimuladorDB.Pago = new ArrayList<>();

        SimuladorDB.PagoTargetas = new ArrayList<>();

        SimuladorDB.PagoServicio = new ArrayList<>();

    }

    /*
        ________________________________________________________________________________________
       |                                                                                        |
       |    Llamamos a la funcion que se enecarga de validar al usuario en la base de datos     |
       |________________________________________________________________________________________|
     */
    public boolean ValidarUser(String nombre, String pin) {
        System.out.println("Name:"+nombre +"\nPin:"+pin);
        for (Cuenta Cuenta : Cuentas) {
            if (Cuenta.comparaCliente(nombre, pin)) {
                return true;
            }
        }
        return false;
    }

}
