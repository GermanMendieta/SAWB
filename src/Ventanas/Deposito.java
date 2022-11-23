/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Cliente;
import Clases.Funciones;
import Clases.Validar;
import Clases.Debito;
import Clases.encriptar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 4
 */
public class Deposito extends javax.swing.JDialog {

    /**
     * Creates new form Transferencia
     */
    Cliente User;
    JFrame Menu;
    Debito[] debitos;
    JLabel Saldo;
    public Deposito(Cliente User, JFrame menu, Debito[] debitos, JLabel SaldoLabel ){
        /*
            Configuramos la ventana  
         */
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.pack();
        this.setModal(true);

        this.User = User;
        this.Menu = menu;
        this.debitos = debitos;
        this.Saldo = SaldoLabel;
        initComponents();
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
        PinTr = new rojerusan.RSMetroTextPlaceHolder();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rSButtonMetro5 = new rojerusan.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Deposito en Cuenta");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 560, 90));

        Depositar.setText("Depositar en cuenta");
        Depositar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositarActionPerformed(evt);
            }
        });
        jPanel1.add(Depositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 310, 60));

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

        PinTr.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        PinTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinTrActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cuenta:");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Monto:");

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Pin de transaccion:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PinTr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Monto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PinTr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 560, 250));

        rSButtonMetro5.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonMetro5.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonMetro5.setText("Cancelar");
        rSButtonMetro5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rSButtonMetro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro5ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMetro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 170, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuentaActionPerformed

    private void PinTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinTrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PinTrActionPerformed

    private void MontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MontoActionPerformed

    private void DepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositarActionPerformed
        boolean DatosValidos = Validar.camposVacios(new String[]{Cuenta.getText(), Monto.getText(), PinTr.getText()});
        if (DatosValidos) {
            try {
                EfectivisarDeposito(Cuenta.getText(), Integer.parseInt( Monto.getText()) , PinTr.getText());
                Funciones.salir(this, Menu);
            } catch (UnsupportedOperationException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Atencion", JOptionPane.OK_OPTION);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, "Pin incorrecto", "Error", JOptionPane.OK_OPTION);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Hubo un error inesperado", "Atencion", JOptionPane.OK_OPTION);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos correctamente ","Atencion", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_DepositarActionPerformed

    private void rSButtonMetro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro5ActionPerformed
        /* se pregunta si desea salir*/
        Funciones.deseaSalir(this , Menu);
    }//GEN-LAST:event_rSButtonMetro5ActionPerformed

    /**
     * @param args the command line arguments
     * @param Usuario
     * @param VentanaAnterior
     */
    public static void main(String args[], Cliente Usuario, Inicio VentanaAnterior, Debito[] debitos, JLabel labelSaldo) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposito(Usuario, VentanaAnterior, debitos, labelSaldo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMetroTextPlaceHolder Cuenta;
    private rojerusan.RSButtonMetro Depositar;
    private rojerusan.RSMetroTextPlaceHolder Monto;
    private rojerusan.RSMetroTextPlaceHolder PinTr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSButtonMetro rSButtonMetro5;
    // End of variables declaration//GEN-END:variables

    

    
    // se debe efectivisar el pago
    private void EfectivisarDeposito(String cuenta, int monto, String pinTr) throws Exception {
        /*
            Aqui deberia ir la inserccion en la base de datos
        */ 
        if (User.validaPinTr(Integer.parseInt(encriptar.Encriptar(Integer.parseInt(pinTr))))) {
            if (monto > 25000000) {
                throw new UnsupportedOperationException("Saldo insuficiente");
            }
            
            for (Debito debito : this.debitos) {
                if (debito.getCuenta() == Integer.parseInt(cuenta)) {
                    debito.cargarMonto(monto);
                    Funciones.actualizarSaldo(debito.getMonto()+" gs.");
                }
            }
            JOptionPane.showMessageDialog(null, "Deposito efectivisado sin problemas ","Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE );
//            Funciones.MensajeDeAlerta(3, "Atencion", String.format("%s%s%s", cuenta, monto, ""));
            // TODO reporte
            
            
            
            
        } else {
//            Funciones.MensajeDeAlerta(2, "Error", "Pin incorrecto");
            throw new IllegalArgumentException("Pin incorrecto");
        }
        
    }

}
