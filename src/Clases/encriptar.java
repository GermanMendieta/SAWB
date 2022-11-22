/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Grupo 4
 */
public class encriptar {

    /*       ___________________________________
        |                                   |
        |       Encriptar mensaje           |
        |    se retorna el string del campo |
        |    de entrada encriptado          |
        |___________________________________|
     */
    public static String Encriptar(Integer original) {
        ArrayList<Integer> digitos = new ArrayList<>();
        // separamos cada digito
        for (int i = 1; i < original; i = i * 10) {
            digitos.add((original % (i * 10)) / i);
            /*   ___________________________________
                |                                   |
                |       Encriptar mensaje           |
                |    se retorna el string del campo |
                |    de entrada encriptado          |
                |___________________________________|
             */
        }
        // encriptamos
        for (int i = 0; i < digitos.size(); i++) {
            digitos.set(i, (digitos.get(i) + 7) % 10);
        }
        // reordenamos
        for (int i = 0; i < digitos.size()-1; i += 2) {
            swap(digitos, i, i+1);
        }
        // cargamos el resultado
        String resultado = "";
        for (int i = 1; i < original; i = i * 10) {
            resultado = digitos.get(0) + resultado;
            digitos.remove(0);

        }
        // retornamos la solucion 
        return String.format("%s", resultado);
    }

    /*   ___________________________________
        |                                   |
        |       DesEncriptar mensaje        |
        |    se retorna el string del campo |
        |     de entrada desencriptado      |
        |___________________________________|
     */
    public static String DesEncriptar(String msgEncrip) {
        ArrayList<Integer> digitos = new ArrayList<>();
        // separamos cada digito
        for (int i = 0; i < msgEncrip.length(); i++) {
            digitos.add(Integer.parseInt(msgEncrip.charAt(i) + ""));
        }
        // ubicamos cada digito en su posicion
        for (int i = digitos.size()-1; i > 0; i -= 2) {
            swap(digitos, i, i-1);
        }
        // Desencriptamos
        for (int i = 0; i < digitos.size(); i++) {
            digitos.set(i, (digitos.get(i) + 3) % 10);
        }
        // preparamos el resultado
        String resultado = "";
        for (int i = 0; i < msgEncrip.length(); i++) {
            resultado += digitos.get(0);
            digitos.remove(0);
        }
        // retornamos el resultado
        return resultado;
    }

    /*
        metodo que intercambia 2 elementos de un arrayList
     */
    private static void swap(ArrayList<Integer> digitos, int i, int j) {
        int tmp = digitos.get(i);
        digitos.set(i, digitos.get(j));
        digitos.set(j, tmp);
    }

    /* Metodos uxiliares para impresion de arraylist*/
    private static void imprArray(ArrayList arreglo) {
        arreglo.forEach((object) -> {
            System.out.println(object);
        });
    }
    
    public static void main(String[] args) {
        System.out.println(DesEncriptar(Encriptar(1234)));
    }

}
