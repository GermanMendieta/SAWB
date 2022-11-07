
package Clases;

/**
 *
 * @author Grupo 4
 */
public class Validar {
    
    // metodo que retorna false en caso de que alguno de los campos ingresados este vacio
    public static boolean camposVacios(String[] Entradas){
        for (String campo : Entradas) {
            if (campo.length() < 1) {
                return false;
            }
        }
        return true;
    }
}
