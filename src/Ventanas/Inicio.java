/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import Clases.*;

/**
 *
 * @author Grupo 4
 */
public class Inicio extends javax.swing.JFrame {

    /* Variables Globales */
    boolean visible;
    Cliente Usuario;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        /* Llamamos a la funcion que se enecarga de configurar la ventana*/
        configurarVentana();
        /* login del usuario*/
        logger();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Loging = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom = new rojerusan.RSMetroTextPlaceHolder();
        id = new rojerusan.RSPasswordTextPlaceHolder();
        rSButtonMetro4 = new rojerusan.RSButtonMetro();
        ver = new rojerusan.RSButtonMetro();
        LoginError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombre4 = new javax.swing.JLabel();
        Nombre5 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JLabel();
        Nombre3 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rSButtonMetro2 = new rojerusan.RSButtonMetro();
        rSButtonMetro1 = new rojerusan.RSButtonMetro();
        rSButtonMetro3 = new rojerusan.RSButtonMetro();
        rSButtonMetro5 = new rojerusan.RSButtonMetro();
        rSButtonMetro6 = new rojerusan.RSButtonMetro();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        Loging.setBackground(new java.awt.Color(255, 255, 255));
        Loging.setForeground(new java.awt.Color(255, 255, 255));
        Loging.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                LogingWindowClosing(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                LogingWindowDeactivated(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese su usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("SansSerif", 1, 18), new java.awt.Color(0, 112, 192))); // NOI18N
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        Nombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        Nombre1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        nom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 112, 192)));
        nom.setText("admin");
        nom.setPlaceholder("Ingrese el usuario...");
        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomKeyReleased(evt);
            }
        });

        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 112, 192), 2));
        id.setText("123");
        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id.setPlaceholder("Ingrese la contraseña...");
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });

        rSButtonMetro4.setText("Acceder");
        rSButtonMetro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro4ActionPerformed(evt);
            }
        });

        ver.setText("...");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });

        LoginError.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        LoginError.setForeground(new java.awt.Color(255, 0, 51));
        LoginError.setText("Usuario o contraseña incorrecta");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lbl-user.png"))); // NOI18N

        Nombre4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Nombre4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lbl-user1.png"))); // NOI18N

        Nombre5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Nombre5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lbl-pass.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre1)
                            .addComponent(Nombre))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nombre4)
                                    .addComponent(Nombre5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LoginError, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(rSButtonMetro4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addComponent(Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(Nombre)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Nombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Nombre5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LoginError)
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonMetro4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Nombre2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Nombre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lbl-user1.png"))); // NOI18N

        Nombre3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Nombre3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lbl-pass.png"))); // NOI18N

        javax.swing.GroupLayout LogingLayout = new javax.swing.GroupLayout(Loging.getContentPane());
        Loging.getContentPane().setLayout(LogingLayout);
        LogingLayout.setHorizontalGroup(
            LogingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogingLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(LogingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LogingLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Nombre2)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(LogingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LogingLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Nombre3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        LogingLayout.setVerticalGroup(
            LogingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LogingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LogingLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Nombre2)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(LogingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LogingLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Nombre3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 51));

        rSButtonMetro2.setText("Transferencia");
        rSButtonMetro2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        rSButtonMetro2.setGrosorLinea(10);
        rSButtonMetro2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        rSButtonMetro2.setIconTextGap(10);

        rSButtonMetro1.setText("Deposito De Cuenta");
        rSButtonMetro1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        rSButtonMetro1.setGrosorLinea(10);
        rSButtonMetro1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        rSButtonMetro1.setIconTextGap(10);
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });

        rSButtonMetro3.setText("Consultar Saldo");
        rSButtonMetro3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        rSButtonMetro3.setGrosorLinea(10);
        rSButtonMetro3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        rSButtonMetro3.setIconTextGap(10);

        rSButtonMetro5.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonMetro5.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonMetro5.setText("Salir");
        rSButtonMetro5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rSButtonMetro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro5ActionPerformed(evt);
            }
        });

        rSButtonMetro6.setText("Pago de Servicios");
        rSButtonMetro6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        rSButtonMetro6.setGrosorLinea(10);
        rSButtonMetro6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        rSButtonMetro6.setIconTextGap(10);
        rSButtonMetro6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro6ActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/send-money-icon.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/wallet-money-icon.png"))); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calculator-money-icon.png"))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/deposit-icon.png"))); // NOI18N

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/exit-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonMetro3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButtonMetro2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButtonMetro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButtonMetro6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rSButtonMetro5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSButtonMetro3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(rSButtonMetro6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(rSButtonMetro5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 370, 450));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Web Banking Smart Assistant");
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 840, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/computer.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1040, 450));

        jMenu2.setText("Ventana");

        jMenuItem2.setText("Ayuda");
        jMenu2.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Menu");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Opcion A");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Opcion B");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Opcion C");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Opcion D");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        deseaSalir();
    }//GEN-LAST:event_formWindowClosing

    private void rSButtonMetro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro5ActionPerformed
        deseaSalir();
    }//GEN-LAST:event_rSButtonMetro5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        deseaSalir();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void LogingWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_LogingWindowDeactivated

    }//GEN-LAST:event_LogingWindowDeactivated

    private void LogingWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_LogingWindowClosing
        int r = JOptionPane.showConfirmDialog(null, "Seguro que desea salir", "Atencion", JOptionPane.OK_CANCEL_OPTION);
        if ((r == JOptionPane.YES_OPTION)) {
            System.exit(0);
        } else {
            Loging.setUndecorated(true);
            Loging.setVisible(true);
        }
    }//GEN-LAST:event_LogingWindowClosing

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited

    }//GEN-LAST:event_jPanel3MouseExited

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        if (visible == true) {
            id.setEchoChar((char) 0);
            visible = false;

        } else {
            id.setEchoChar('\u2022');
            visible = true;
        }
    }//GEN-LAST:event_verActionPerformed

    private void rSButtonMetro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro4ActionPerformed
        // Verificamos el usuario y cerramos
        if (validarUser()) {
            Usuario = new Cliente(Integer.parseInt(id.getText()), nom.getText());
            Loging.dispose();
        }
    }//GEN-LAST:event_rSButtonMetro4ActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased

    }//GEN-LAST:event_idKeyReleased

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Logear");
        }
    }//GEN-LAST:event_idKeyPressed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void nomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyReleased

    }//GEN-LAST:event_nomKeyReleased

    private void nomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Logear");
        }
    }//GEN-LAST:event_nomKeyPressed

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        Ventanas.Deposito.main(null, Usuario);
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void rSButtonMetro6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMetro6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginError;
    private javax.swing.JDialog Loging;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Nombre3;
    private javax.swing.JLabel Nombre4;
    private javax.swing.JLabel Nombre5;
    private rojerusan.RSPasswordTextPlaceHolder id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private rojerusan.RSMetroTextPlaceHolder nom;
    private rojerusan.RSButtonMetro rSButtonMetro1;
    private rojerusan.RSButtonMetro rSButtonMetro2;
    private rojerusan.RSButtonMetro rSButtonMetro3;
    private rojerusan.RSButtonMetro rSButtonMetro4;
    private rojerusan.RSButtonMetro rSButtonMetro5;
    private rojerusan.RSButtonMetro rSButtonMetro6;
    private rojerusan.RSButtonMetro ver;
    // End of variables declaration//GEN-END:variables
    /* Metodo que modifica la ventana para actual */
    private void configurarVentana() {
        visible = true;
        id.setEchoChar('\u2022');
        this.setResizable(false);
    }

    /* Metodo que pregunta si se desea salir*/
    private void deseaSalir() {
        int r = JOptionPane.showConfirmDialog(null, "Seguro que desea salir", "Atencion", JOptionPane.OK_CANCEL_OPTION);
        if ((r == JOptionPane.YES_OPTION)) {
            System.exit(0);
        }
    }

    private void logger() {
        // configura la ventana
        Loging.setModal(true);
        Loging.pack();
        Loging.setResizable(false);
        Loging.setAlwaysOnTop(true);
        LoginError.setVisible(false);

        // hace visible la ventana
        Loging.setVisible(true);
    }

    private boolean validarUser() {
        if (nom.getText().compareTo("") != 0 || id.getText().compareTo("") != 0) {
            return true;
        }        
        LoginError.setVisible(true);
        return false;
    }

}
