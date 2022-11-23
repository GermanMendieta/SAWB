package Clases;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Grupo 4
 */
public class Funciones {

    public static JLabel saldoMenu;

    /*
     ___________________________________________________________________________________
    |                                                                                   |
    |    Funcion que facilita la salidad de un dialogo hacia el Menu                    |
    |___________________________________________________________________________________|
     */
    public static void salir(JDialog actual, JFrame Menu) {
        Menu.setVisible(true);
        actual.dispose();
    }

    public static void setLabelMenuSaldo(JLabel saldoMenu) {
        Funciones.saldoMenu = saldoMenu;
    }

    public static void actualizarSaldo(String datos) {
        if (Funciones.saldoMenu != null) {
            Funciones.saldoMenu.setText(datos);
        }
    }

    /**
     *
     * @param Actual ventana dialogo que se abrio
     * @param Anterior ventana tipo Frame del cual se viene
     *
     */
    public static void deseaSalir(JDialog Actual, JFrame Anterior) {

        // se pregunta al usuario si quiere salir y si es asi se cierra la ventana
        int r = JOptionPane.showConfirmDialog(null, "Seguro que desea cancelar la operacion", "Atencion", JOptionPane.OK_CANCEL_OPTION);
        if ((r == JOptionPane.YES_OPTION)) {
            if (Actual != null) {
                Actual.dispose();
            }
            Anterior.setVisible(true);
        }
    }

    public static void MensajeDeAlerta(int type, String titulo, String mensaje) {

        switch (type) {
            case 1:
                JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
                break;
        }

    }

    public void vaciarCamposNormal(JTextField[] campo) {
        for (JTextField campo1 : campo) {
            campo1.setText("");
        }
    }

    public int MensajePregunta(String mensaje, String titulo) {
        int res = JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return res;
    }

    public void Ocultar(JTextField[] campos, boolean valor) {
        System.out.print("Campo invisible");
        for (JTextField campo : campos) {
            campo.setVisible(valor);
            campo.setEnabled(valor);
        }
    }

}
