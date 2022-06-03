/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Paneles;

import Datos.GeneralConnection;
import Entidades.Categoria;
import Entidades.Producto;
import Entidades.Proveedor;
import Entidades.Rol;
import Entidades.Usuario;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AgusGonza
 */
public class ModuloInventario extends javax.swing.JFrame {


    public ModuloInventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarTableProducto();
        TablaProductos.addMouseListener(new MouseAdapter(){
            
            public void mousePressed(MouseEvent Mouse_evt){
                
                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if (Mouse_evt.getClickCount() == 1){
                    
                    IdProductTxt.setText((String) TablaProductos.getValueAt(TablaProductos.getSelectedRow(), 0));
                    NombreTxt.setText((String) TablaProductos.getValueAt(TablaProductos.getSelectedRow(), 3));
                    DescripcionTxt.setText((String) TablaProductos.getValueAt(TablaProductos.getSelectedRow(), 4));
                    CodigoTxt.setText((String) TablaProductos.getValueAt(TablaProductos.getSelectedRow(), 1));
                    PrecioCompraTxt.setText((String) TablaProductos.getValueAt(TablaProductos.getSelectedRow(), 7));
                    PrecioVentaTxt.setText((String) TablaProductos.getValueAt(TablaProductos.getSelectedRow(), 8));
                            
                    
                    CategoriaComBox.setSelectedItem(TablaProductos.getValueAt(TablaProductos.getSelectedRow(), 2));
                    
                    ProveedorComboBox.setSelectedItem(TablaProductos.getValueAt(TablaProductos.getSelectedRow(), 9));
                    
                    EstadoComBox.setSelectedItem(TablaProductos.getValueAt(TablaProductos.getSelectedRow(), 10));
                }
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGeneral = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AreaTabla = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        NombreTitle = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        DescripcionTitle = new javax.swing.JLabel();
        DescripcionTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        CodigoTitle = new javax.swing.JLabel();
        CodigoTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        EstadoTitle = new javax.swing.JLabel();
        EstadoComBox = new javax.swing.JComboBox<>();
        CategoriaTitle = new javax.swing.JLabel();
        CategoriaComBox = new javax.swing.JComboBox<>();
        IdProductTxt = new javax.swing.JTextField();
        CheckConfirmar = new javax.swing.JCheckBox();
        PanelCrear = new javax.swing.JPanel();
        BotonCrear = new javax.swing.JLabel();
        PanelActualizar = new javax.swing.JPanel();
        BotonActualizar = new javax.swing.JLabel();
        PanelEliminar = new javax.swing.JPanel();
        BotonEliminar = new javax.swing.JLabel();
        PanelLimpiar = new javax.swing.JPanel();
        BotonLimpiar = new javax.swing.JLabel();
        PanelGestionCat = new javax.swing.JPanel();
        BotonGestionCat = new javax.swing.JLabel();
        PreciCompraTitle = new javax.swing.JLabel();
        PrecioCompraTxt = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        PrecioVentaTitle = new javax.swing.JLabel();
        PrecioVentaTxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        ProveedorTitle = new javax.swing.JLabel();
        ProveedorComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelGeneral.setBackground(new java.awt.Color(255, 255, 255));
        PanelGeneral.setPreferredSize(new java.awt.Dimension(870, 592));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Detalle Productos");

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Categoria", "Nombre", "Descripcion", "Rifer", "Camion", "PrecioCompra", "PrecioVenta", "Proveedor", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AreaTabla.setViewportView(TablaProductos);
        if (TablaProductos.getColumnModel().getColumnCount() > 0) {
            TablaProductos.getColumnModel().getColumn(0).setPreferredWidth(10);
            TablaProductos.getColumnModel().getColumn(1).setPreferredWidth(25);
            TablaProductos.getColumnModel().getColumn(5).setPreferredWidth(15);
            TablaProductos.getColumnModel().getColumn(6).setPreferredWidth(15);
        }

        NombreTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        NombreTitle.setForeground(new java.awt.Color(0, 0, 0));
        NombreTitle.setText("Nombre Producto");

        NombreTxt.setBackground(new java.awt.Color(255, 255, 255));
        NombreTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        NombreTxt.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        DescripcionTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        DescripcionTitle.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionTitle.setText("Descripcion (opcional)");

        DescripcionTxt.setBackground(new java.awt.Color(255, 255, 255));
        DescripcionTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        DescripcionTxt.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        CodigoTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        CodigoTitle.setForeground(new java.awt.Color(0, 0, 0));
        CodigoTitle.setText("Codigo");

        CodigoTxt.setBackground(new java.awt.Color(255, 255, 255));
        CodigoTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        CodigoTxt.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        EstadoTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        EstadoTitle.setForeground(new java.awt.Color(0, 0, 0));
        EstadoTitle.setText("Estado");

        EstadoComBox.setBackground(new java.awt.Color(255, 255, 255));
        EstadoComBox.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        EstadoComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "No Activo" }));
        EstadoComBox.setBorder(null);

        CategoriaTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        CategoriaTitle.setForeground(new java.awt.Color(0, 0, 0));
        CategoriaTitle.setText("Categoria");

        CategoriaComBox.setBackground(new java.awt.Color(255, 255, 255));
        CategoriaComBox.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        CategoriaComBox.setBorder(null);

        IdProductTxt.setEditable(false);
        IdProductTxt.setBackground(new java.awt.Color(255, 255, 255));
        IdProductTxt.setForeground(new java.awt.Color(255, 255, 255));
        IdProductTxt.setBorder(null);

        CheckConfirmar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        CheckConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        CheckConfirmar.setText("Confirmar");
        CheckConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CheckConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckConfirmarActionPerformed(evt);
            }
        });

        PanelCrear.setBackground(new java.awt.Color(0, 153, 51));
        PanelCrear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BotonCrear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonCrear.setForeground(new java.awt.Color(255, 255, 255));
        BotonCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addUser.png"))); // NOI18N
        BotonCrear.setText("Crear");
        BotonCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelCrearLayout = new javax.swing.GroupLayout(PanelCrear);
        PanelCrear.setLayout(PanelCrearLayout);
        PanelCrearLayout.setHorizontalGroup(
            PanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        PanelCrearLayout.setVerticalGroup(
            PanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        PanelActualizar.setBackground(new java.awt.Color(0, 153, 153));
        PanelActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BotonActualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        BotonActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualziar.png"))); // NOI18N
        BotonActualizar.setText("Actualizar");
        BotonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonActualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelActualizarLayout = new javax.swing.GroupLayout(PanelActualizar);
        PanelActualizar.setLayout(PanelActualizarLayout);
        PanelActualizarLayout.setHorizontalGroup(
            PanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
            .addGroup(PanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BotonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
        );
        PanelActualizarLayout.setVerticalGroup(
            PanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(PanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(BotonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
        );

        PanelEliminar.setBackground(new java.awt.Color(153, 0, 51));
        PanelEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BotonEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        BotonEliminar.setText("Eliminar");
        BotonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelEliminarLayout = new javax.swing.GroupLayout(PanelEliminar);
        PanelEliminar.setLayout(PanelEliminarLayout);
        PanelEliminarLayout.setHorizontalGroup(
            PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        PanelEliminarLayout.setVerticalGroup(
            PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        PanelLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        PanelLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        PanelLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotonLimpiar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        BotonLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        BotonLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelLimpiarLayout = new javax.swing.GroupLayout(PanelLimpiar);
        PanelLimpiar.setLayout(PanelLimpiarLayout);
        PanelLimpiarLayout.setHorizontalGroup(
            PanelLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        PanelLimpiarLayout.setVerticalGroup(
            PanelLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        PanelGestionCat.setBackground(new java.awt.Color(255, 255, 255));
        PanelGestionCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelGestionCat.setForeground(new java.awt.Color(0, 0, 0));
        PanelGestionCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotonGestionCat.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        BotonGestionCat.setForeground(new java.awt.Color(0, 0, 0));
        BotonGestionCat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonGestionCat.setText("Gestionar Categorias");
        BotonGestionCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGestionCatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelGestionCatLayout = new javax.swing.GroupLayout(PanelGestionCat);
        PanelGestionCat.setLayout(PanelGestionCatLayout);
        PanelGestionCatLayout.setHorizontalGroup(
            PanelGestionCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGestionCatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonGestionCat, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelGestionCatLayout.setVerticalGroup(
            PanelGestionCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonGestionCat, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        PreciCompraTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        PreciCompraTitle.setForeground(new java.awt.Color(0, 0, 0));
        PreciCompraTitle.setText("Precio Compra");

        PrecioCompraTxt.setBackground(new java.awt.Color(255, 255, 255));
        PrecioCompraTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        PrecioCompraTxt.setBorder(null);
        PrecioCompraTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrecioCompraTxtKeyTyped(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        PrecioVentaTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        PrecioVentaTitle.setForeground(new java.awt.Color(0, 0, 0));
        PrecioVentaTitle.setText("Nombre Venta");

        PrecioVentaTxt.setBackground(new java.awt.Color(255, 255, 255));
        PrecioVentaTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        PrecioVentaTxt.setBorder(null);
        PrecioVentaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrecioVentaTxtKeyTyped(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        ProveedorTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        ProveedorTitle.setForeground(new java.awt.Color(0, 0, 0));
        ProveedorTitle.setText("Proveedor");

        ProveedorComboBox.setBackground(new java.awt.Color(255, 255, 255));
        ProveedorComboBox.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        ProveedorComboBox.setBorder(null);

        javax.swing.GroupLayout PanelGeneralLayout = new javax.swing.GroupLayout(PanelGeneral);
        PanelGeneral.setLayout(PanelGeneralLayout);
        PanelGeneralLayout.setHorizontalGroup(
            PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGeneralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelGeneralLayout.createSequentialGroup()
                                .addComponent(NombreTitle)
                                .addGap(52, 52, 52)
                                .addComponent(DescripcionTitle)
                                .addGap(51, 51, 51)
                                .addComponent(CodigoTitle)
                                .addGap(107, 107, 107))
                            .addGroup(PanelGeneralLayout.createSequentialGroup()
                                .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(DescripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(CodigoTxt)
                                .addGap(31, 31, 31)))
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelGeneralLayout.createSequentialGroup()
                                .addComponent(EstadoTitle)
                                .addGap(119, 119, 119)
                                .addComponent(CategoriaTitle))
                            .addGroup(PanelGeneralLayout.createSequentialGroup()
                                .addComponent(EstadoComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CategoriaComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PanelGeneralLayout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelGeneralLayout.createSequentialGroup()
                                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGeneralLayout.createSequentialGroup()
                                        .addComponent(PrecioCompraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PrecioVentaTitle)
                                    .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator5)
                                        .addComponent(PrecioVentaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)))
                        .addGap(43, 43, 43)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addComponent(PreciCompraTitle)
                        .addGap(59, 59, 59)
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelGeneralLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(PanelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CheckConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PanelActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(PanelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelGeneralLayout.createSequentialGroup()
                                .addComponent(IdProductTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProveedorTitle)
                                    .addComponent(ProveedorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(107, 107, 107)
                                .addComponent(PanelLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGeneralLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelGestionCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AreaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 16, Short.MAX_VALUE))
        );
        PanelGeneralLayout.setVerticalGroup(
            PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGeneralLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelGestionCat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(AreaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreTitle)
                    .addComponent(DescripcionTitle)
                    .addComponent(CodigoTitle)
                    .addComponent(EstadoTitle)
                    .addComponent(CategoriaTitle))
                .addGap(6, 6, 6)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EstadoComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriaComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdProductTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PreciCompraTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrecioCompraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelGeneralLayout.createSequentialGroup()
                                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                                        .addComponent(ProveedorTitle)
                                        .addGap(6, 6, 6)
                                        .addComponent(ProveedorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PanelLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelGeneralLayout.createSequentialGroup()
                                .addComponent(PrecioVentaTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PrecioVentaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)))
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(CheckConfirmar)))
                .addContainerGap())
        );

        getContentPane().add(PanelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void limpiarTabla(){
        
        DefaultTableModel modelo = (DefaultTableModel) TablaProductos.getModel();
        
        for(int i = modelo.getRowCount() - 1; i >= 0; i-- ) {
            modelo.removeRow(i);
        }
         
    }
    
    private void llenarTableProducto(){
        
        limpiarTabla();
        CategoriaComBox.removeAllItems();
        ProveedorComboBox.removeAllItems();
        
        List<Producto> listaProductos = Producto.listarProductos();
        List<Categoria> listaCategorias = Categoria.listarCategorias();
        List<Proveedor> listaProveedores = Proveedor.listarProveedores();
        
        DefaultTableModel modelo = (DefaultTableModel) TablaProductos.getModel();
        
        String [] datos = new String[11];
        
        for(Categoria aux : listaCategorias){
            
            CategoriaComBox.addItem(aux.getNombre());
        }
        
        for(Proveedor aux : listaProveedores){
            
            ProveedorComboBox.addItem(aux.getRazonSocial());
        }
        
  
        for (Producto aux : listaProductos){
           
            datos[0] = Integer.toString(aux.getIdProducto());
            datos[1] = aux.getCodigo();
            datos[2] = aux.getCategoriaR().getNombre();
            datos[3] = aux.getNombre();
            datos[4] = aux.getDescripcion();
            datos[5] = Double.toString(aux.getStockRifer());
            datos[6] = Double.toString(aux.getStockCamion());
            datos[7] = Double.toString(aux.getPrecioCompra());
            datos[8] = Double.toString(aux.getPrecioVenta());
            datos[9] = aux.getProveedorR().getRazonSocial();
            datos[10] = (aux.isEstado()) ? "Activo" : "No Activo";
         
            modelo.addRow(datos);
        }
        
    }
    
    private Producto prodTextFields(){
        
        Producto auxProd = new Producto();
        Categoria auxCat = new Categoria();
        Proveedor auxProv = new Proveedor();
        List<Categoria> listaCategorias = Categoria.listarCategorias();
        List<Proveedor> listaProveedores = Proveedor.listarProveedores();
        
        if (!(IdProductTxt.getText().equals(""))){
           
           auxProd.setIdProducto(Integer.parseInt(IdProductTxt.getText()));
        }
        else{
            auxProd.setIdProducto(0);
        }
        
        auxProd.setNombre(NombreTxt.getText());
        auxProd.setDescripcion(DescripcionTxt.getText());
        auxProd.setCodigo(CodigoTxt.getText());
        
        if (PrecioCompraTxt.getText().equals("")){
            
            auxProd.setPrecioCompra(0.0);
            
        }else{
            
            auxProd.setPrecioCompra(Double.parseDouble(PrecioCompraTxt.getText()));
        }
        
        if (PrecioVentaTxt.getText().equals("")){
            
            auxProd.setPrecioCompra(0.0);
            
        }else{
            
            auxProd.setPrecioVenta(Double.parseDouble(PrecioVentaTxt.getText()));
        }
      
        
        for (Categoria aux : listaCategorias){
            
            if (CategoriaComBox.getSelectedItem().equals(aux.getNombre())){
                    
                    auxCat = aux;
                    break;
                }    
        }
        
        for (Proveedor aux : listaProveedores){
            
            if (ProveedorComboBox.getSelectedItem().equals(aux.getRazonSocial())){
                
                auxProv = aux;
                break;
            }
        }
        
        auxProd.setCategoriaR(auxCat);
        auxProd.setProveedorR(auxProv);
        auxProd.setEstado(EstadoComBox.getSelectedItem().equals("Activo"));
      
        
        return auxProd;
    }
    
    private void limpiarFields(){
        
        IdProductTxt.setText("");
        NombreTxt.setText("");
        DescripcionTxt.setText("");
        CodigoTxt.setText("");
        PrecioCompraTxt.setText("0.0");
        PrecioVentaTxt.setText("0.0");
        EstadoComBox.setSelectedItem("Activo");
        CategoriaComBox.setSelectedIndex(0);
        ProveedorComboBox.setSelectedIndex(0);
        CheckConfirmar.setSelected(false);
    }
    private void CheckConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckConfirmarActionPerformed

    private void BotonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseClicked

        GeneralConnection.firewallConnection();

        if(CheckConfirmar.isSelected()){

            if(Producto.registrarProducto(prodTextFields())){

                llenarTableProducto();
                limpiarFields();
            }
        }
        else{

            JOptionPane.showMessageDialog(null, "Debe confirmar para crear el producto");
        }
    }//GEN-LAST:event_BotonCrearMouseClicked

    private void BotonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMouseClicked

        GeneralConnection.firewallConnection();

        if(CheckConfirmar.isSelected()){

            if(Producto.actualizarProducto(prodTextFields())){

                llenarTableProducto();
                limpiarFields();
            }
        }
        else{

            JOptionPane.showMessageDialog(null, "Debe confirmar para actualizar el producto");
        }
    }//GEN-LAST:event_BotonActualizarMouseClicked

    private void BotonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseClicked

        GeneralConnection.firewallConnection();

        if(CheckConfirmar.isSelected()){

            if(Producto.eliminarProducto(prodTextFields())){

                llenarTableProducto();
                limpiarFields();
            }
        }
        else{

            JOptionPane.showMessageDialog(null, "Debe confirmar para eliminar el producto");
        }
    }//GEN-LAST:event_BotonEliminarMouseClicked

    private void BotonLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLimpiarMouseClicked

        limpiarFields();
    }//GEN-LAST:event_BotonLimpiarMouseClicked

    private void BotonGestionCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGestionCatMouseClicked
        
        SubModuloInventario subModuloInventario = new SubModuloInventario();
        subModuloInventario.setVisible(true);
    }//GEN-LAST:event_BotonGestionCatMouseClicked

    private void validarNumeros(java.awt.event.KeyEvent evt){
        
        char c = evt.getKeyChar();
        
        if ((c <'0' || c > '9') && PrecioCompraTxt.getText().contains(".") && (c != (char) KeyEvent.VK_BACK_SPACE)){
            
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo debe ingresar numeros");
            
        }else if ((c <'0' || c > '9') && (c != '.') && (c != (char) KeyEvent.VK_BACK_SPACE)){
            
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo debe ingresar numeros");
        }
    }
    
    private void PrecioCompraTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioCompraTxtKeyTyped
        
        validarNumeros(evt);
         
    }//GEN-LAST:event_PrecioCompraTxtKeyTyped

    private void PrecioVentaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioVentaTxtKeyTyped
        
        validarNumeros(evt);
    }//GEN-LAST:event_PrecioVentaTxtKeyTyped

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
            java.util.logging.Logger.getLogger(ModuloInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuloInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AreaTabla;
    private javax.swing.JLabel BotonActualizar;
    private javax.swing.JLabel BotonCrear;
    private javax.swing.JLabel BotonEliminar;
    private javax.swing.JLabel BotonGestionCat;
    private javax.swing.JLabel BotonLimpiar;
    private javax.swing.JComboBox<String> CategoriaComBox;
    private javax.swing.JLabel CategoriaTitle;
    private javax.swing.JCheckBox CheckConfirmar;
    private javax.swing.JLabel CodigoTitle;
    private javax.swing.JTextField CodigoTxt;
    private javax.swing.JLabel DescripcionTitle;
    private javax.swing.JTextField DescripcionTxt;
    private javax.swing.JComboBox<String> EstadoComBox;
    private javax.swing.JLabel EstadoTitle;
    private javax.swing.JTextField IdProductTxt;
    private javax.swing.JLabel NombreTitle;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JPanel PanelActualizar;
    private javax.swing.JPanel PanelCrear;
    private javax.swing.JPanel PanelEliminar;
    private javax.swing.JPanel PanelGeneral;
    private javax.swing.JPanel PanelGestionCat;
    private javax.swing.JPanel PanelLimpiar;
    private javax.swing.JLabel PreciCompraTitle;
    private javax.swing.JTextField PrecioCompraTxt;
    private javax.swing.JLabel PrecioVentaTitle;
    private javax.swing.JTextField PrecioVentaTxt;
    private javax.swing.JComboBox<String> ProveedorComboBox;
    private javax.swing.JLabel ProveedorTitle;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
