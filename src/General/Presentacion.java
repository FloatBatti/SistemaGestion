/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package General;

import Datos.Conexion;
import Datos.GeneralConnection;
import java.awt.Color;
import Entidades.*;
import Paneles.ModuloUsuario;
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;


public class Presentacion extends javax.swing.JFrame {

    private int xMouse, yMouse;
    static private Usuario usuarioActual;
    
    private Timer timer = new Timer();
    
    private TimerTask nueva = new TimerTask() {
        @Override
        public void run() {
             
            PreparedStatement ps;
            String query = "SELECT * FROM CONEXION";
            try {
                    ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                    ps.executeQuery(query);
                    
            } catch (Exception e) {
            }
            
        }
    };
    
    
    public Presentacion(){
        initComponents();
        this.setLocationRelativeTo(null);
        timer.schedule(nueva, 0, 10000);
        
    }

   
    static public void setUsuarioActual(Usuario actualUser){
        
        usuarioActual = actualUser;
        ActualUserTxt.setText(actualUser.getNombreCompleto());
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGeneral = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        TituloSistema = new javax.swing.JLabel();
        ActualUser = new javax.swing.JLabel();
        ActualUserTxt = new javax.swing.JLabel();
        AreaUsuario = new javax.swing.JPanel();
        ManuUsuarios = new javax.swing.JLabel();
        AreaInventario = new javax.swing.JPanel();
        MenuInventario = new javax.swing.JLabel();
        AreaClientes = new javax.swing.JPanel();
        MenuClientes = new javax.swing.JLabel();
        AreaProveedores = new javax.swing.JPanel();
        MenuProveedores = new javax.swing.JLabel();
        AreaCompras = new javax.swing.JPanel();
        MenuCompras = new javax.swing.JLabel();
        AreaVentas = new javax.swing.JPanel();
        MenuVentas = new javax.swing.JLabel();
        AreaViajes = new javax.swing.JPanel();
        MenuViajes = new javax.swing.JLabel();
        AreaReportes = new javax.swing.JPanel();
        MenuReportes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PanelGeneral.setBackground(new java.awt.Color(0, 102, 102));
        PanelGeneral.setName(""); // NOI18N
        PanelGeneral.setPreferredSize(new java.awt.Dimension(770, 542));
        PanelGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(31, 116, 116));
        Header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HeaderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HeaderMouseExited(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        TituloSistema.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TituloSistema.setForeground(new java.awt.Color(255, 255, 255));
        TituloSistema.setText("Bienvenido al sistema de Gestion DePez");

        ActualUser.setForeground(new java.awt.Color(255, 255, 255));
        ActualUser.setText("Usuario Actual:");

        ActualUserTxt.setForeground(new java.awt.Color(255, 255, 255));
        ActualUserTxt.setText("Default");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                        .addComponent(ActualUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ActualUserTxt)
                        .addGap(313, 313, 313))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                        .addComponent(TituloSistema)
                        .addGap(130, 130, 130))))
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TituloSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActualUser)
                    .addComponent(ActualUserTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelGeneral.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 770, 100));

        AreaUsuario.setBackground(new java.awt.Color(31, 116, 116));
        AreaUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ManuUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        ManuUsuarios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ManuUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        ManuUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addUser.png"))); // NOI18N
        ManuUsuarios.setText("Usuarios");
        ManuUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManuUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ManuUsuarios.setPreferredSize(new java.awt.Dimension(114, 95));
        ManuUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ManuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManuUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManuUsuariosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManuUsuariosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout AreaUsuarioLayout = new javax.swing.GroupLayout(AreaUsuario);
        AreaUsuario.setLayout(AreaUsuarioLayout);
        AreaUsuarioLayout.setHorizontalGroup(
            AreaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManuUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        AreaUsuarioLayout.setVerticalGroup(
            AreaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManuUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        PanelGeneral.add(AreaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        AreaInventario.setBackground(new java.awt.Color(31, 116, 116));
        AreaInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AreaInventario.setPreferredSize(new java.awt.Dimension(114, 95));

        MenuInventario.setBackground(new java.awt.Color(255, 255, 255));
        MenuInventario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuInventario.setForeground(new java.awt.Color(255, 255, 255));
        MenuInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario.png"))); // NOI18N
        MenuInventario.setText("Inventario");
        MenuInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuInventario.setFocusable(false);
        MenuInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuInventario.setPreferredSize(new java.awt.Dimension(114, 95));
        MenuInventario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MenuInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuInventarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AreaInventarioLayout = new javax.swing.GroupLayout(AreaInventario);
        AreaInventario.setLayout(AreaInventarioLayout);
        AreaInventarioLayout.setHorizontalGroup(
            AreaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuInventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        AreaInventarioLayout.setVerticalGroup(
            AreaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuInventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        PanelGeneral.add(AreaInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        AreaClientes.setBackground(new java.awt.Color(31, 116, 116));
        AreaClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AreaClientes.setPreferredSize(new java.awt.Dimension(114, 95));

        MenuClientes.setBackground(new java.awt.Color(255, 255, 255));
        MenuClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuClientes.setForeground(new java.awt.Color(255, 255, 255));
        MenuClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.png"))); // NOI18N
        MenuClientes.setText("Clientes");
        MenuClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuClientes.setPreferredSize(new java.awt.Dimension(114, 95));
        MenuClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MenuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuClientesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AreaClientesLayout = new javax.swing.GroupLayout(AreaClientes);
        AreaClientes.setLayout(AreaClientesLayout);
        AreaClientesLayout.setHorizontalGroup(
            AreaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        AreaClientesLayout.setVerticalGroup(
            AreaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        PanelGeneral.add(AreaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 110, -1));

        AreaProveedores.setBackground(new java.awt.Color(31, 116, 116));
        AreaProveedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AreaProveedores.setPreferredSize(new java.awt.Dimension(114, 95));

        MenuProveedores.setBackground(new java.awt.Color(255, 255, 255));
        MenuProveedores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuProveedores.setForeground(new java.awt.Color(255, 255, 255));
        MenuProveedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedores.png"))); // NOI18N
        MenuProveedores.setText("Proveedores");
        MenuProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuProveedores.setPreferredSize(new java.awt.Dimension(114, 95));
        MenuProveedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MenuProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuProveedoresMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AreaProveedoresLayout = new javax.swing.GroupLayout(AreaProveedores);
        AreaProveedores.setLayout(AreaProveedoresLayout);
        AreaProveedoresLayout.setHorizontalGroup(
            AreaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        AreaProveedoresLayout.setVerticalGroup(
            AreaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        PanelGeneral.add(AreaProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        AreaCompras.setBackground(new java.awt.Color(31, 116, 116));
        AreaCompras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AreaCompras.setPreferredSize(new java.awt.Dimension(114, 95));

        MenuCompras.setBackground(new java.awt.Color(255, 255, 255));
        MenuCompras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuCompras.setForeground(new java.awt.Color(255, 255, 255));
        MenuCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compras.png"))); // NOI18N
        MenuCompras.setText("Compras");
        MenuCompras.setToolTipText("");
        MenuCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuCompras.setPreferredSize(new java.awt.Dimension(114, 95));
        MenuCompras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MenuCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuComprasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AreaComprasLayout = new javax.swing.GroupLayout(AreaCompras);
        AreaCompras.setLayout(AreaComprasLayout);
        AreaComprasLayout.setHorizontalGroup(
            AreaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuCompras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        AreaComprasLayout.setVerticalGroup(
            AreaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuCompras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        PanelGeneral.add(AreaCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        AreaVentas.setBackground(new java.awt.Color(31, 116, 116));
        AreaVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AreaVentas.setPreferredSize(new java.awt.Dimension(114, 95));

        MenuVentas.setBackground(new java.awt.Color(255, 255, 255));
        MenuVentas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuVentas.setForeground(new java.awt.Color(255, 255, 255));
        MenuVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventas.png"))); // NOI18N
        MenuVentas.setText("Ventas");
        MenuVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuVentas.setPreferredSize(new java.awt.Dimension(114, 95));
        MenuVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MenuVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuVentasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AreaVentasLayout = new javax.swing.GroupLayout(AreaVentas);
        AreaVentas.setLayout(AreaVentasLayout);
        AreaVentasLayout.setHorizontalGroup(
            AreaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        AreaVentasLayout.setVerticalGroup(
            AreaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuVentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        PanelGeneral.add(AreaVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        AreaViajes.setBackground(new java.awt.Color(31, 116, 116));
        AreaViajes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AreaViajes.setPreferredSize(new java.awt.Dimension(114, 95));

        MenuViajes.setBackground(new java.awt.Color(255, 255, 255));
        MenuViajes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuViajes.setForeground(new java.awt.Color(255, 255, 255));
        MenuViajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Viaje.png"))); // NOI18N
        MenuViajes.setText("Viajes");
        MenuViajes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuViajes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuViajes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MenuViajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuViajesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuViajesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AreaViajesLayout = new javax.swing.GroupLayout(AreaViajes);
        AreaViajes.setLayout(AreaViajesLayout);
        AreaViajesLayout.setHorizontalGroup(
            AreaViajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuViajes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AreaViajesLayout.setVerticalGroup(
            AreaViajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuViajes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        PanelGeneral.add(AreaViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        AreaReportes.setBackground(new java.awt.Color(31, 116, 116));
        AreaReportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AreaReportes.setPreferredSize(new java.awt.Dimension(114, 95));

        MenuReportes.setBackground(new java.awt.Color(255, 255, 255));
        MenuReportes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuReportes.setForeground(new java.awt.Color(255, 255, 255));
        MenuReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.png"))); // NOI18N
        MenuReportes.setText("Reportes");
        MenuReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuReportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuReportes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MenuReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuReportesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AreaReportesLayout = new javax.swing.GroupLayout(AreaReportes);
        AreaReportes.setLayout(AreaReportesLayout);
        AreaReportesLayout.setHorizontalGroup(
            AreaReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        AreaReportesLayout.setVerticalGroup(
            AreaReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        PanelGeneral.add(AreaReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Modulos">
    private void MenuClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuClientesMouseEntered
        AreaClientes.setBackground(new Color(73,127,127));
    }//GEN-LAST:event_MenuClientesMouseEntered

    private void MenuClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuClientesMouseExited
        AreaClientes.setBackground(new Color(31,116,116));
    }//GEN-LAST:event_MenuClientesMouseExited

    private void MenuProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuProveedoresMouseEntered
        AreaProveedores.setBackground(new Color(73,127,127));
    }//GEN-LAST:event_MenuProveedoresMouseEntered

    private void MenuProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuProveedoresMouseExited
        AreaProveedores.setBackground(new Color(31,116,116));
    }//GEN-LAST:event_MenuProveedoresMouseExited

    private void MenuComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuComprasMouseEntered
        AreaCompras.setBackground(new Color(73,127,127));
    }//GEN-LAST:event_MenuComprasMouseEntered

    private void MenuComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuComprasMouseExited
        AreaCompras.setBackground(new Color(31,116,116));
    }//GEN-LAST:event_MenuComprasMouseExited

    private void MenuVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuVentasMouseEntered
        AreaVentas.setBackground(new Color(73,127,127));
    }//GEN-LAST:event_MenuVentasMouseEntered

    private void MenuVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuVentasMouseExited
        AreaVentas.setBackground(new Color(31,116,116));
    }//GEN-LAST:event_MenuVentasMouseExited

    private void MenuViajesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuViajesMouseEntered
        AreaViajes.setBackground(new Color(73,127,127));
    }//GEN-LAST:event_MenuViajesMouseEntered

    private void MenuViajesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuViajesMouseExited
        AreaViajes.setBackground(new Color(31,116,116));
    }//GEN-LAST:event_MenuViajesMouseExited

    private void MenuReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuReportesMouseEntered
        AreaReportes.setBackground(new Color(73,127,127));
    }//GEN-LAST:event_MenuReportesMouseEntered

    private void MenuReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuReportesMouseExited
        AreaReportes.setBackground(new Color(31,116,116));
    }//GEN-LAST:event_MenuReportesMouseExited

    private void MenuInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuInventarioMouseExited
        AreaInventario.setBackground(new Color(31,116,116));
    }//GEN-LAST:event_MenuInventarioMouseExited

    private void MenuInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuInventarioMouseEntered
        AreaInventario.setBackground(new Color(73,127,127));
    }//GEN-LAST:event_MenuInventarioMouseEntered

    private void ManuUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManuUsuariosMouseExited
        AreaUsuario.setBackground(new Color(31,116,116));
    }//GEN-LAST:event_ManuUsuariosMouseExited

    private void ManuUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManuUsuariosMouseEntered
        AreaUsuario.setBackground(new Color(73,127,127));
    }//GEN-LAST:event_ManuUsuariosMouseEntered
    //</editor-fold>
    
    private void HeaderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseEntered
        Header.setBackground(new Color(73,127,127));
    }//GEN-LAST:event_HeaderMouseEntered

    private void HeaderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseExited
        Header.setBackground(new Color(31,116,116));
    }//GEN-LAST:event_HeaderMouseExited

    private void ManuUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManuUsuariosMousePressed
        
        if (usuarioActual.getRolR().getIdRol() == 1){         
            ModuloUsuario moduloUsuario = new ModuloUsuario();
            moduloUsuario.setVisible(true);
        }
        else{
            
            JOptionPane.showMessageDialog(null, "No tiene permiso para utilizar este modulo");
        }
   
    }//GEN-LAST:event_ManuUsuariosMousePressed
    
        
//    private void showPanel(JPanel panel){
//        
//        panel.setSize(850,600);
//        
//        AreaPestañas.removeAll();
//        AreaPestañas.add(panel, new AbsoluteConstraints(0,0,-1,-1));
//        AreaPestañas.revalidate();
//        AreaPestañas.repaint();
//    }
    
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
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActualUser;
    public static javax.swing.JLabel ActualUserTxt;
    private javax.swing.JPanel AreaClientes;
    private javax.swing.JPanel AreaCompras;
    private javax.swing.JPanel AreaInventario;
    private javax.swing.JPanel AreaProveedores;
    private javax.swing.JPanel AreaReportes;
    private javax.swing.JPanel AreaUsuario;
    private javax.swing.JPanel AreaVentas;
    private javax.swing.JPanel AreaViajes;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel ManuUsuarios;
    private javax.swing.JLabel MenuClientes;
    private javax.swing.JLabel MenuCompras;
    private javax.swing.JLabel MenuInventario;
    private javax.swing.JLabel MenuProveedores;
    private javax.swing.JLabel MenuReportes;
    private javax.swing.JLabel MenuVentas;
    private javax.swing.JLabel MenuViajes;
    private javax.swing.JPanel PanelGeneral;
    private javax.swing.JLabel TituloSistema;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
