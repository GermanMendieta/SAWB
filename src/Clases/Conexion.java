package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 4
 */
public class Conexion {

    private String DB;
    private String User;
    private String Pass;
    private String host;
    private ResultSet rs;
    private Statement query;
    public static Connection con;

    public Conexion(String DB, String User, String Pass, String host) {
        this.DB = DB;
        this.User = User;
        this.Pass = Pass;
        this.host = host;
    }

    public Conexion() {
        this.DB = "baseDeDatos";
        this.User = "root";
        this.Pass = "";
        this.host = "localhost";
    }

    public boolean conectar() {
        try {
            String url = "jdbc:mysql://" + host + "/" + DB;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, User, Pass);
            System.out.println("Conexion exitosa!!");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public ResultSet consulta(String consu) throws SQLException {

        try {
            query = con.createStatement();
            rs = query.executeQuery(consu);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }

    public void insertar(String sql) throws SQLException {
        try {
            query = con.createStatement();
            query.execute(sql);
            //MensajeDeAlerta(3, "Listo!!","La Inserción fue hecha");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificar(String sql) {
        try {
            query = con.createStatement();
            query.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Modificado con éxito");
        } catch (SQLException ex) {
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void desconectarse() throws SQLException {
        con.close();
        System.out.println("Desconexion exitosa!!");
    }
}
