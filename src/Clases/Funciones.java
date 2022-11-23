package Clases;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

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

    /*
     ___________________________________________________________________________________
    |                                                                                   |
    |    Funcion que facilita la actualizacion del menu                                 |
    |___________________________________________________________________________________|
     */
    public static void setLabelMenuSaldo(JLabel saldoMenu) {
        Funciones.saldoMenu = saldoMenu;
    }

    public static void actualizarSaldo(String datos) {
        if (Funciones.saldoMenu != null) {
            Funciones.saldoMenu.setText(Funciones.setMoneyFormat(datos.split(" ")[0]) + "gs.");
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

    /*
     ___________________________________________________________________________________
    |                                                                                   |
    |    Funcion que facilita la comunicacion con el ususario                           |
    |___________________________________________________________________________________|
     */
    public static void MensajeDeAlerta(int type, String titulo, String mensaje) {

        switch (type) {
            case 1:
                // 1- mensaje de alerta 
                JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                // 2- mensaje de error
                JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                // 3- mensaje de informacion
                JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                // 4- mensaje tipo pregunta
                JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
                break;
        }

    }

    /*
     ___________________________________________________________________________________
    |                                                                                   |
    |    Funcion que convierte devuelve una cadena en formato separado de dinero        |
    |___________________________________________________________________________________|
     */
    public static String setMoneyFormat(String Monto) {
        String MontoFormat = "";
        for (int i = Monto.length() - 1; i > -1; i--) {
            MontoFormat += Monto.charAt(Monto.length() - 1 - i);
            if (i % 3 == 0) {
                MontoFormat += ".";
            }
        }
        return MontoFormat;
    }

    /*
     ___________________________________________________________________________________
    |                                                                                   |
    |    metodo que vacia los campos de una lista de campos de entrada                  |
    |___________________________________________________________________________________|
     */
    public void vaciarCamposNormal(JTextField[] campo) {
        for (JTextField campo1 : campo) {
            campo1.setText("");
        }
    }

    /*
     ___________________________________________________________________________________
    |                                                                                   |
    |    metodo que realiza una pregunta al usuario mediante un dialogo                 |
    |___________________________________________________________________________________|
     */
    public int MensajePregunta(String mensaje, String titulo) {
        int res = JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return res;
    }

    /*
     ___________________________________________________________________
    |                                                                   |
    |    metodo que oculta una lista de campos                          |
    |___________________________________________________________________|
     */
    public void Ocultar(JTextField[] campos, boolean valor) {
        System.out.print("Campo invisible");
        for (JTextField campo : campos) {
            campo.setVisible(valor);
            campo.setEnabled(valor);
        }
    }

    public static void generarPdf(String[] args) {
        String atrozTabs = "..........................................................................";
        Document documento = new Document();
        try {
            // Se crea el OutputStream para el fichero donde queremos dejar el pdf.
            String ruta = new File("").getAbsolutePath() + "\\src\\tickets\\";
            String nombreArchivo = "ticket.pdf";
            FileOutputStream ficheroPdf = new FileOutputStream(ruta + nombreArchivo);
//
//            // Se asocia el documento al OutputStream y se indica que el espaciado entre
            PdfWriter.getInstance(documento, ficheroPdf).setInitialLeading(15);
//            // lineas sera de 15. Esta llamada debe hacerse antes de abrir el documento
            documento.open();
            Font titulo = new Font();
            titulo.setSize(26);
            titulo.setColor(4, 2, 14);
            Font Texto = new Font();
            Texto.setSize(16);
            Texto.setColor( 0, 0, 0);
            
            documento.add(new Chunk().setBackground(BaseColor.BLUE));
            documento.add( new Paragraph( "\t\t\t" +args[0], titulo));
            documento.add( new Paragraph( "\t\t\t" +args[1], titulo));
            documento.add( new Paragraph( "\n"));
            
            for (int i = 2; i < args.length ; i++) {
                if ( (i+1) % 2 == 0) {
                    documento.add( new Paragraph( "\t\t\t\t\t" + args[i], titulo));
                } else {
                    documento.add(new Paragraph( atrozTabs + args[i], Texto));
                }
                
            }
            
//
            documento.close();
            File path = new File(ruta + nombreArchivo).getAbsoluteFile();
            Desktop.getDesktop().open(path);
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }

    }

}
