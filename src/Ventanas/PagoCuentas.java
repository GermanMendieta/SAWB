/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Cliente;
import Clases.Cuenta;
import Clases.Debito;
import Clases.Funciones;
import Clases.PagoServicio;
import Clases.Pagos;
import Clases.PinTransaccional;
import Clases.Servicio;
import Clases.Transferencias;
import Clases.Validar;
import Clases.encriptar;
import Recursos.BaseDeDatos;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 4
 */
public class PagoCuentas extends javax.swing.JDialog {

    /**
     * Creates new form PagoCuentas
     */
    Cliente User;
    JFrame Menu;
    BaseDeDatos Com;
    Debito[] Debitos;
    Servicio[] ServicioAPagar;
    Servicio ServicioSelected;

    public PagoCuentas(Cliente User, JFrame menu, BaseDeDatos Con, Debito[] Debitos) {
    /*
            ________________________________________________________________
           |                                                                |
           |    Configuramos la ventana                                     |
           |________________________________________________________________|
             */
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.pack();
        this.setModal(true);

        this.User = User;
        this.Menu = menu;
        this.Com = Con;
        this.Debitos = Debitos;

        initComponents();

        cargarServicios();
        
        PinTr.setEchoChar('\u2022');
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Depositar = new rojerusan.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        Cuenta = new rojerusan.RSMetroTextPlaceHolder();
        Monto = new rojerusan.RSMetroTextPlaceHolder();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DeudaCombo = new rojerusan.RSComboMetro();
        jLabel6 = new javax.swing.JLabel();
        aPagar = new javax.swing.JLabel();
        ConsultarDeuda = new rojerusan.RSButtonMetro();
        PinTr = new rojerusan.RSPasswordTextPlaceHolder();
        ver3 = new rojerusan.RSButtonMetro();
        rSButtonMetro5 = new rojerusan.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pago de Servicios");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 560, 90));

        Depositar.setText("Aceptar");
        Depositar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositarActionPerformed(evt);
            }
        });
        jPanel1.add(Depositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, 310, 60));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        Cuenta.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuentaActionPerformed(evt);
            }
        });

        Monto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MontoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nro de Cuenta");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Monto a Pagar");

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Pin de transaccion");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Pin de transaccion");

        DeudaCombo.setForeground(new java.awt.Color(0, 0, 0));
        DeudaCombo.setMaximumRowCount(5);
        DeudaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar", "Ande", "Atencion Medica", "Cooperativa", "Essap", "IPS", "Personal", "Servicio Vario", "Tigo", "Seguro de Vida" }));
        DeudaCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeudaCombo.setName(""); // NOI18N
        DeudaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeudaComboActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Saldo de Deuda");

        aPagar.setBackground(new java.awt.Color(51, 51, 51));
        aPagar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        aPagar.setForeground(new java.awt.Color(0, 0, 0));
        aPagar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        ConsultarDeuda.setText("Consultar Deuda");
        ConsultarDeuda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ConsultarDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarDeudaActionPerformed(evt);
            }
        });

        PinTr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ver3.setText("...");
        ver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ConsultarDeuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                        .addComponent(DeudaCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Monto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aPagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PinTr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ver3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeudaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsultarDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ver3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PinTr, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 740, 430));

        rSButtonMetro5.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonMetro5.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonMetro5.setText("Cancelar");
        rSButtonMetro5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rSButtonMetro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro5ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMetro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 170, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuentaActionPerformed

    private void DepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositarActionPerformed
        boolean DatosValidos = Validar.camposVacios(new String[]{Cuenta.getText(), Monto.getText(), PinTr.getText()}) && DeudaCombo.getSelectedIndex() > 0;
        if (DatosValidos) {
            try {
                EfectivisarDeposito(Cuenta.getText(), Integer.parseInt(Monto.getText()), PinTr.getText());
                Funciones.salir(this, Menu);
            } catch (UnsupportedOperationException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Atencion", JOptionPane.OK_OPTION);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Hubo un error inesperado", "Atencion", JOptionPane.OK_OPTION);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos correctamente ", "Atencion", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_DepositarActionPerformed

    private void rSButtonMetro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro5ActionPerformed
        Funciones.deseaSalir(this, Menu);
    }//GEN-LAST:event_rSButtonMetro5ActionPerformed

    private void MontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MontoActionPerformed

    private void DeudaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeudaComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeudaComboActionPerformed

    private void ConsultarDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarDeudaActionPerformed
        /*
            Se genera el saldo de la deuda
        */
        if (DeudaCombo.getSelectedIndex() > 0) {
            aPagar.setText(((DeudaCombo.getSelectedIndex() * 3 + 10) * 23000) + "  gs.");
            ServicioSelected = ServicioAPagar[DeudaCombo.getSelectedIndex() - 1];
        } else {
            ServicioSelected = null;
            aPagar.setText("");
        }
    }//GEN-LAST:event_ConsultarDeudaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Funciones.deseaSalir(this, Menu);
    }//GEN-LAST:event_formWindowClosing

    /* metodo que oculta y muestra el pin de transaccion */
    private void ver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver3ActionPerformed
        if (PinTr.echoCharIsSet() == true) {
            PinTr.setEchoChar((char) 0);
        } else {
            PinTr.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_ver3ActionPerformed

    /**
     * @param args the command line arguments
     * @param Usuario
     * @param ventanaAnterior
     * @param debitos
     */
    public static void main(String args[], Cliente Usuario, JFrame ventanaAnterior, BaseDeDatos con, Debito[] debitos) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagoCuentas(Usuario, ventanaAnterior, con, debitos).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonMetro ConsultarDeuda;
    private rojerusan.RSMetroTextPlaceHolder Cuenta;
    private rojerusan.RSButtonMetro Depositar;
    private rojerusan.RSComboMetro DeudaCombo;
    private rojerusan.RSMetroTextPlaceHolder Monto;
    private rojerusan.RSPasswordTextPlaceHolder PinTr;
    private javax.swing.JLabel aPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSButtonMetro rSButtonMetro5;
    private rojerusan.RSButtonMetro ver3;
    // End of variables declaration//GEN-END:variables

    // se debe efectivisar el pago
    private void EfectivisarDeposito(String cuenta, int monto, String pinTr) throws Exception {
        /*
            Aqui deberia ir la inserccion en la base de datos
         */

        if (User.validaPinTr(Integer.parseInt(encriptar.Encriptar(Integer.parseInt(pinTr))))) {

            // TODO reporte
            Boolean existeCuenta = false;
            // buscamos la cuenta de donde saldran los fondos
            for (Debito debito : this.Debitos) {
                if (debito.getCuenta() == Integer.parseInt(Cuenta.getText())) {
                    existeCuenta = true;
                    /* descontamos el pago de la cuenta de origen */
                    debito.quitarMonto(Integer.parseInt(aPagar.getText().split(" ")[0]));
                    /* registramos el pago */
                    Pagos pagoRealizado = new Pagos(debito, new PinTransaccional(Integer.parseInt(encriptar.Encriptar(Integer.parseInt(pinTr)))));
                    PagoServicio pagoServicio = new PagoServicio(pagoRealizado, ServicioSelected, monto);
                    Com.agregarPagoCredito(pagoRealizado, pagoServicio);
                    // actualizamos el menu
                    Funciones.actualizarSaldo(debito.getMonto() + " gs.");
                    
                    /* generamos el ticket */
                    Funciones.generarPdf(new String[]{
                            "Ticket de pago de servicio:",
                            "Cuenta:", cuenta,
                            "Servicio a pagar:", ServicioSelected.getNombre(),
                            "Monto: ", Funciones.setMoneyFormat(monto + "") + " gs.",
                            "Saldo de cuenta:" , Funciones.setMoneyFormat(debito.getMonto() + "") + " gs."                    
                    });
                    
                }
            }

            /* se lanzan exepciones segun cada error posible */
            if (!existeCuenta) {
                throw new IllegalArgumentException("No existe la cuenta de usuario insertada");
            }

            JOptionPane.showMessageDialog(null, "Deposito efectivisado sin problemas ", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);

        } else {
//            Funciones.MensajeDeAlerta(2, "Error", "Pin incorrecto");
            throw new IllegalArgumentException("Pin incorrecto");
        }

        JOptionPane.showMessageDialog(null, "Pago efectivisado sin problemas ", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
    }

    /* Metodo que se encarga de cargar los servicios */
    private void cargarServicios() {
        DeudaCombo.removeAllItems();
        DeudaCombo.addItem("Seleccionar");
        ServicioAPagar = Com.getServicios();
        for (Servicio servicio : ServicioAPagar) {
            DeudaCombo.addItem(servicio.getNombre());
        }
    }

}
