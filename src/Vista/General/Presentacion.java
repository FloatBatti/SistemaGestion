/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.General;

import Datos.Conexion;
import Datos.GeneralConnection;
import java.awt.Color;
import Entidades.*;
import java.util.*;
import Vista.Usuario.PanelUsuarios;
import java.sql.*;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;



public class Presentacion extends javax.swing.JFrame {

    private int xMouse, yMouse;
    private Timer timer = new Timer();
    private TimerTask nueva = new TimerTask() {
        @Override
        public void run() {
             
            PreparedStatement ps;
            String query = "SELECT * FROM CONEXION";
            try {
                    ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                    ps.executeQuery(query);
                    System.out.println("hola");
                    
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
        
        ActualUserTxt.setText(actualUser.getNombreCompleto());
        BienvenidaTxt.setText(actualUser.getNombreCompleto()+"!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGeneral = new javax.swing.JPanel();
        BarraHerramientas = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        TituloSistema = new javax.swing.JLabel();
        AreaBotones = new javax.swing.JPanel();
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
        ActualUser = new javax.swing.JLabel();
        ActualUserTxt = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        ExitButton = new javax.swing.JPanel();
        Equis = new javax.swing.JLabel();
        AreaPestañas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BienvenidaTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelGeneral.setBackground(new java.awt.Color(255, 255, 255));
        PanelGeneral.setName(""); // NOI18N
        PanelGeneral.setPreferredSize(new java.awt.Dimension(1500, 630));
        PanelGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraHerramientas.setBackground(new java.awt.Color(0, 102, 102));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        TituloSistema.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TituloSistema.setForeground(new java.awt.Color(255, 255, 255));
        TituloSistema.setText("Gestion DePez");

        AreaBotones.setBackground(new java.awt.Color(31, 116, 116));
        AreaBotones.setPreferredSize(new java.awt.Dimension(230, 230));

        AreaUsuario.setBackground(new java.awt.Color(31, 116, 116));
        AreaUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 116, 116)));

        ManuUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        ManuUsuarios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ManuUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        ManuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addUser.png"))); // NOI18N
        ManuUsuarios.setText("Usuarios");
        ManuUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManuUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManuUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManuUsuariosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AreaUsuarioLayout = new javax.swing.GroupLayout(AreaUsuario);
        AreaUsuario.setLayout(AreaUsuarioLayout);
        AreaUsuarioLayout.setHorizontalGroup(
            AreaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaUsuarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ManuUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AreaUsuarioLayout.setVerticalGroup(
            AreaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManuUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        AreaInventario.setBackground(new java.awt.Color(31, 116, 116));
        AreaInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 116, 116)));

        MenuInventario.setBackground(new java.awt.Color(255, 255, 255));
        MenuInventario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuInventario.setForeground(new java.awt.Color(255, 255, 255));
        MenuInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario.png"))); // NOI18N
        MenuInventario.setText("Inventario");
        MenuInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaInventarioLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(MenuInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AreaInventarioLayout.setVerticalGroup(
            AreaInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        AreaClientes.setBackground(new java.awt.Color(31, 116, 116));
        AreaClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 116, 116)));

        MenuClientes.setBackground(new java.awt.Color(255, 255, 255));
        MenuClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuClientes.setForeground(new java.awt.Color(255, 255, 255));
        MenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.png"))); // NOI18N
        MenuClientes.setText("Clientes");
        MenuClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaClientesLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(MenuClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AreaClientesLayout.setVerticalGroup(
            AreaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        AreaProveedores.setBackground(new java.awt.Color(31, 116, 116));
        AreaProveedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 116, 116)));

        MenuProveedores.setBackground(new java.awt.Color(255, 255, 255));
        MenuProveedores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuProveedores.setForeground(new java.awt.Color(255, 255, 255));
        MenuProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedores.png"))); // NOI18N
        MenuProveedores.setText("Proveedores");
        MenuProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaProveedoresLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(MenuProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AreaProveedoresLayout.setVerticalGroup(
            AreaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        AreaCompras.setBackground(new java.awt.Color(31, 116, 116));
        AreaCompras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 116, 116)));

        MenuCompras.setBackground(new java.awt.Color(255, 255, 255));
        MenuCompras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuCompras.setForeground(new java.awt.Color(255, 255, 255));
        MenuCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compras.png"))); // NOI18N
        MenuCompras.setText("Compras");
        MenuCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaComprasLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(MenuCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AreaComprasLayout.setVerticalGroup(
            AreaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuCompras, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        AreaVentas.setBackground(new java.awt.Color(31, 116, 116));
        AreaVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 116, 116)));

        MenuVentas.setBackground(new java.awt.Color(255, 255, 255));
        MenuVentas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuVentas.setForeground(new java.awt.Color(255, 255, 255));
        MenuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventas.png"))); // NOI18N
        MenuVentas.setText("Ventas");
        MenuVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaVentasLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(MenuVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AreaVentasLayout.setVerticalGroup(
            AreaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        AreaViajes.setBackground(new java.awt.Color(31, 116, 116));
        AreaViajes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 116, 116)));

        MenuViajes.setBackground(new java.awt.Color(255, 255, 255));
        MenuViajes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuViajes.setForeground(new java.awt.Color(255, 255, 255));
        MenuViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Viaje.png"))); // NOI18N
        MenuViajes.setText("Viajes");
        MenuViajes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaViajesLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(MenuViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AreaViajesLayout.setVerticalGroup(
            AreaViajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuViajes, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        AreaReportes.setBackground(new java.awt.Color(31, 116, 116));
        AreaReportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 116, 116)));

        MenuReportes.setBackground(new java.awt.Color(255, 255, 255));
        MenuReportes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MenuReportes.setForeground(new java.awt.Color(255, 255, 255));
        MenuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.png"))); // NOI18N
        MenuReportes.setText("Reportes");
        MenuReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaReportesLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(MenuReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AreaReportesLayout.setVerticalGroup(
            AreaReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AreaBotonesLayout = new javax.swing.GroupLayout(AreaBotones);
        AreaBotones.setLayout(AreaBotonesLayout);
        AreaBotonesLayout.setHorizontalGroup(
            AreaBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AreaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AreaInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AreaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AreaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AreaCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AreaVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AreaViajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AreaReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AreaBotonesLayout.setVerticalGroup(
            AreaBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaBotonesLayout.createSequentialGroup()
                .addComponent(AreaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AreaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AreaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AreaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AreaCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AreaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AreaViajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AreaReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ActualUser.setForeground(new java.awt.Color(255, 255, 255));
        ActualUser.setText("Usuario Actual:");

        ActualUserTxt.setForeground(new java.awt.Color(255, 255, 255));
        ActualUserTxt.setText("Default");

        javax.swing.GroupLayout BarraHerramientasLayout = new javax.swing.GroupLayout(BarraHerramientas);
        BarraHerramientas.setLayout(BarraHerramientasLayout);
        BarraHerramientasLayout.setHorizontalGroup(
            BarraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AreaBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BarraHerramientasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BarraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarraHerramientasLayout.createSequentialGroup()
                        .addComponent(ActualUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ActualUserTxt))
                    .addGroup(BarraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TituloSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BarraHerramientasLayout.setVerticalGroup(
            BarraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraHerramientasLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(TituloSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BarraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActualUser)
                    .addComponent(ActualUserTxt))
                .addGap(18, 18, 18)
                .addComponent(AreaBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        PanelGeneral.add(BarraHerramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 630));

        Header.setBackground(new java.awt.Color(0, 102, 102));
        Header.setPreferredSize(new java.awt.Dimension(1010, 37));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(0, 102, 102));
        ExitButton.setToolTipText("");
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
        });

        Equis.setBackground(new java.awt.Color(0, 0, 0));
        Equis.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Equis.setForeground(new java.awt.Color(0, 0, 0));
        Equis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Equis.setText("X");
        Equis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EquisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EquisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EquisMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExitButtonLayout = new javax.swing.GroupLayout(ExitButton);
        ExitButton.setLayout(ExitButtonLayout);
        ExitButtonLayout.setHorizontalGroup(
            ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Equis, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );
        ExitButtonLayout.setVerticalGroup(
            ExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Equis, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 1037, Short.MAX_VALUE)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanelGeneral.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        AreaPestañas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("haz cosas pequeñas de una gran manera.\"");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("¡Hola ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("\"Si hoy no puedes hacer grandes cosas,");

        BienvenidaTxt.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        BienvenidaTxt.setForeground(new java.awt.Color(0, 0, 0));
        BienvenidaTxt.setText("default");

        javax.swing.GroupLayout AreaPestañasLayout = new javax.swing.GroupLayout(AreaPestañas);
        AreaPestañas.setLayout(AreaPestañasLayout);
        AreaPestañasLayout.setHorizontalGroup(
            AreaPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaPestañasLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(AreaPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaPestañasLayout.createSequentialGroup()
                        .addGroup(AreaPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaPestañasLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(41, 41, 41)))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaPestañasLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BienvenidaTxt)
                        .addGap(178, 178, 178))))
        );
        AreaPestañasLayout.setVerticalGroup(
            AreaPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaPestañasLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(AreaPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BienvenidaTxt))
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        PanelGeneral.add(AreaPestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 850, 590));

        getContentPane().add(PanelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="MenuHover 1">
    private void ManuUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManuUsuariosMouseEntered
        AreaUsuario.setBackground(new Color(73,127,127));
        AreaUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_ManuUsuariosMouseEntered

    private void ManuUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManuUsuariosMouseExited
        AreaUsuario.setBackground(new Color(31,116,116));
        AreaUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31,116,116)));
    }//GEN-LAST:event_ManuUsuariosMouseExited

    private void MenuInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuInventarioMouseEntered
        AreaInventario.setBackground(new Color(73,127,127));
        AreaInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_MenuInventarioMouseEntered

    private void MenuInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuInventarioMouseExited
        AreaInventario.setBackground(new Color(31,116,116));
        AreaInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31,116,116)));
    }//GEN-LAST:event_MenuInventarioMouseExited
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Hover y Boton de Exit"> 
    private void EquisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EquisMouseClicked
        System.exit(0);
    }//GEN-LAST:event_EquisMouseClicked

    private void EquisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EquisMouseEntered
        ExitButton.setBackground(Color.RED);
        Equis.setForeground(Color.WHITE);
    }//GEN-LAST:event_EquisMouseEntered

    private void EquisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EquisMouseExited
        ExitButton.setBackground(new Color(0,102,102));
        Equis.setForeground(Color.BLACK);
    }//GEN-LAST:event_EquisMouseExited

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="MenuHover 2">
    private void MenuClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuClientesMouseEntered
        AreaClientes.setBackground(new Color(73,127,127));
        AreaClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_MenuClientesMouseEntered

    private void MenuClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuClientesMouseExited
        AreaClientes.setBackground(new Color(31,116,116));
        AreaClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31,116,116)));
    }//GEN-LAST:event_MenuClientesMouseExited

    private void MenuProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuProveedoresMouseEntered
        AreaProveedores.setBackground(new Color(73,127,127));
        AreaProveedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_MenuProveedoresMouseEntered

    private void MenuProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuProveedoresMouseExited
        AreaProveedores.setBackground(new Color(31,116,116));
        AreaProveedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31,116,116)));
    }//GEN-LAST:event_MenuProveedoresMouseExited

    private void MenuComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuComprasMouseEntered
        AreaCompras.setBackground(new Color(73,127,127));
        AreaCompras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_MenuComprasMouseEntered

    private void MenuComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuComprasMouseExited
        AreaCompras.setBackground(new Color(31,116,116));
        AreaCompras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31,116,116)));
    }//GEN-LAST:event_MenuComprasMouseExited

    private void MenuVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuVentasMouseEntered
        AreaVentas.setBackground(new Color(73,127,127));
        AreaVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_MenuVentasMouseEntered

    private void MenuVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuVentasMouseExited
        AreaVentas.setBackground(new Color(31,116,116));
        AreaVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31,116,116)));
    }//GEN-LAST:event_MenuVentasMouseExited

    private void MenuViajesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuViajesMouseEntered
        AreaViajes.setBackground(new Color(73,127,127));
        AreaViajes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_MenuViajesMouseEntered

    private void MenuViajesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuViajesMouseExited
        AreaViajes.setBackground(new Color(31,116,116));
        AreaViajes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31,116,116)));
    }//GEN-LAST:event_MenuViajesMouseExited

    private void MenuReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuReportesMouseEntered
        AreaReportes.setBackground(new Color(73,127,127));
        AreaReportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_MenuReportesMouseEntered

    private void MenuReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuReportesMouseExited
        AreaReportes.setBackground(new Color(31,116,116));
        AreaReportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31,116,116)));
    }//GEN-LAST:event_MenuReportesMouseExited
    //</editor-fold>
    
    private void ManuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManuUsuariosMouseClicked
        
        GeneralConnection.firewallConnection();
        
        PanelUsuarios pestañaUsuarios = new PanelUsuarios();
        
        pestañaUsuarios.setSize(850,600);
        
        showPanel(pestañaUsuarios);
    }//GEN-LAST:event_ManuUsuariosMouseClicked
    
    private void showPanel(JPanel panel){
        
        panel.setSize(850,600);
        
        AreaPestañas.removeAll();
        AreaPestañas.add(panel, new AbsoluteConstraints(0,0,-1,-1));
        AreaPestañas.revalidate();
        AreaPestañas.repaint();
    }
    
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
    private javax.swing.JPanel AreaBotones;
    private javax.swing.JPanel AreaClientes;
    private javax.swing.JPanel AreaCompras;
    private javax.swing.JPanel AreaInventario;
    private javax.swing.JPanel AreaPestañas;
    private javax.swing.JPanel AreaProveedores;
    private javax.swing.JPanel AreaReportes;
    private javax.swing.JPanel AreaUsuario;
    private javax.swing.JPanel AreaVentas;
    private javax.swing.JPanel AreaViajes;
    private javax.swing.JPanel BarraHerramientas;
    public static javax.swing.JLabel BienvenidaTxt;
    private javax.swing.JLabel Equis;
    private javax.swing.JPanel ExitButton;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
