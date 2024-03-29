/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Paneles;

import Datos.GeneralConnection;
import Entidades.Proveedor;
import java.awt.Point;
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
public class ModuloProveedor extends javax.swing.JFrame {

    /**
     * Creates new form Proveedor
     */
    public ModuloProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarTableProveedor();
        TablaProveedores.addMouseListener(new MouseAdapter(){
            
            public void mousePressed(MouseEvent Mouse_evt){
                
                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if (Mouse_evt.getClickCount() == 1){
                    
                    IdProveedorTxt.setText((String) TablaProveedores.getValueAt(TablaProveedores.getSelectedRow(), 0));
                    NombreTxt.setText((String) TablaProveedores.getValueAt(TablaProveedores.getSelectedRow(), 1));
                    RazonSocialTxt.setText((String) TablaProveedores.getValueAt(TablaProveedores.getSelectedRow(), 2));
                    CorreoTxt.setText((String) TablaProveedores.getValueAt(TablaProveedores.getSelectedRow(), 3));
                    TelefonoTxt.setText((String) TablaProveedores.getValueAt(TablaProveedores.getSelectedRow(), 4));
                    DescripcionTxt.setText((String) TablaProveedores.getValueAt(TablaProveedores.getSelectedRow(), 5));
                    
                    EstadoComBox.setSelectedItem(TablaProveedores.getValueAt(TablaProveedores.getSelectedRow(), 6));
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGeneral = new javax.swing.JPanel();
        AreaTabla = new javax.swing.JScrollPane();
        TablaProveedores = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        NombreTitle = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        RazonSocialTitle = new javax.swing.JLabel();
        RazonSocialTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        CorreoTitle = new javax.swing.JLabel();
        CorreoTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        TelefonoTitle = new javax.swing.JLabel();
        TelefonoTxt = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        DescripcionTitle = new javax.swing.JLabel();
        DescripcionTxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        EstadoTitle = new javax.swing.JLabel();
        EstadoComBox = new javax.swing.JComboBox<>();
        PanelCrear = new javax.swing.JPanel();
        BotonCrear = new javax.swing.JLabel();
        PanelActualizar = new javax.swing.JPanel();
        BotonActualizar = new javax.swing.JLabel();
        PanelEliminar = new javax.swing.JPanel();
        BotonEliminar = new javax.swing.JLabel();
        IdProveedorTxt = new javax.swing.JTextField();
        CheckConfirmar = new javax.swing.JCheckBox();
        PanelLimpiar = new javax.swing.JPanel();
        BotonLimpiar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelGeneral.setBackground(new java.awt.Color(255, 255, 255));
        PanelGeneral.setPreferredSize(new java.awt.Dimension(850, 590));

        TablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Razon Social", "Correo", "Telefono", "Descripcion", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AreaTabla.setViewportView(TablaProveedores);
        if (TablaProveedores.getColumnModel().getColumnCount() > 0) {
            TablaProveedores.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Detalle Proveedores");

        NombreTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        NombreTitle.setForeground(new java.awt.Color(0, 0, 0));
        NombreTitle.setText("Nombre (opcional) ");

        NombreTxt.setBackground(new java.awt.Color(255, 255, 255));
        NombreTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        NombreTxt.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        RazonSocialTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        RazonSocialTitle.setForeground(new java.awt.Color(0, 0, 0));
        RazonSocialTitle.setText("Razon Social");

        RazonSocialTxt.setBackground(new java.awt.Color(255, 255, 255));
        RazonSocialTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        RazonSocialTxt.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        CorreoTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        CorreoTitle.setForeground(new java.awt.Color(0, 0, 0));
        CorreoTitle.setText("Correo (opcional)");

        CorreoTxt.setBackground(new java.awt.Color(255, 255, 255));
        CorreoTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        CorreoTxt.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        TelefonoTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        TelefonoTitle.setForeground(new java.awt.Color(0, 0, 0));
        TelefonoTitle.setText("Telefono");

        TelefonoTxt.setBackground(new java.awt.Color(255, 255, 255));
        TelefonoTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        TelefonoTxt.setBorder(null);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        DescripcionTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        DescripcionTitle.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionTitle.setText("Descripción (opcional)");

        DescripcionTxt.setBackground(new java.awt.Color(255, 255, 255));
        DescripcionTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        DescripcionTxt.setBorder(null);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        EstadoTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        EstadoTitle.setForeground(new java.awt.Color(0, 0, 0));
        EstadoTitle.setText("Estado");

        EstadoComBox.setBackground(new java.awt.Color(255, 255, 255));
        EstadoComBox.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        EstadoComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "No Activo" }));
        EstadoComBox.setBorder(null);

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

        IdProveedorTxt.setEditable(false);
        IdProveedorTxt.setBackground(new java.awt.Color(255, 255, 255));
        IdProveedorTxt.setForeground(new java.awt.Color(255, 255, 255));
        IdProveedorTxt.setBorder(null);

        CheckConfirmar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        CheckConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        CheckConfirmar.setText("Confirmar");
        CheckConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        javax.swing.GroupLayout PanelGeneralLayout = new javax.swing.GroupLayout(PanelGeneral);
        PanelGeneral.setLayout(PanelGeneralLayout);
        PanelGeneralLayout.setHorizontalGroup(
            PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGeneralLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreTitle)
                            .addComponent(RazonSocialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RazonSocialTitle)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CorreoTitle)
                            .addComponent(CorreoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefonoTitle)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescripcionTitle)
                            .addComponent(IdProveedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(AreaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EstadoComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EstadoTitle))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(PanelGeneralLayout.createSequentialGroup()
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(PanelLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249)
                        .addComponent(PanelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelGeneralLayout.createSequentialGroup()
                                .addComponent(PanelActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PanelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelGeneralLayout.setVerticalGroup(
            PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGeneralLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addComponent(IdProveedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(NombreTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RazonSocialTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RazonSocialTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CorreoTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CorreoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TelefonoTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescripcionTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AreaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EstadoTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EstadoComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(CheckConfirmar)
                        .addGap(172, 172, 172))
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(PanelLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(PanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 592, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Proveedor provTextFields(){
        
        Proveedor auxProv = new Proveedor();
    
        if (!(IdProveedorTxt.getText().equals(""))){
           
           auxProv.setIdProveedor(Integer.parseInt(IdProveedorTxt.getText()));
        }
        else{
            auxProv.setIdProveedor(0);
        }
        
        auxProv.setNombre(NombreTxt.getText());
        auxProv.setRazonSocial(RazonSocialTxt.getText());
        auxProv.setCorreo(CorreoTxt.getText());
        auxProv.setTelefono(TelefonoTxt.getText());
        auxProv.setDescripcion(DescripcionTxt.getText());
        auxProv.setEstado(EstadoComBox.getSelectedItem().equals("Activo"));
      
        
        return auxProv;
    }
    
    private void limpiarTabla(){
        
        DefaultTableModel modelo = (DefaultTableModel) TablaProveedores.getModel();
        
        for(int i = modelo.getRowCount() - 1; i >= 0; i-- ) {
            modelo.removeRow(i);
        }
         
    }
    
    private void llenarTableProveedor(){
        
        Proveedor auxProv = new Proveedor();
        
        limpiarTabla();
        
        List<Proveedor> listaProveedores = auxProv.listarEntidades();
        
        DefaultTableModel modelo = (DefaultTableModel) TablaProveedores.getModel();
        
        String [] datos = new String[7];
        
  
        for (Proveedor aux : listaProveedores){
           
            datos[0] = Integer.toString(aux.getIdProveedor());
            datos[1] = aux.getNombre();
            datos[2] = aux.getRazonSocial();
            datos[3] = aux.getCorreo();
            datos[4] = aux.getTelefono();
            datos[5] = aux.getDescripcion();
            datos[6] = (aux.isEstado()) ? "Activo" : "No Activo";
         
            modelo.addRow(datos);
        }
        
    }

    private void limpiarFields(){

        IdProveedorTxt.setText("");
        NombreTxt.setText("");
        RazonSocialTxt.setText("");
        CorreoTxt.setText("");
        TelefonoTxt.setText("");
        DescripcionTxt.setText("");
        EstadoComBox.setSelectedItem("Activo");
        CheckConfirmar.setSelected(false); 
    }
    
    private void BotonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseClicked

        Proveedor auxProv = provTextFields();
        
        GeneralConnection.firewallConnection();

        if(CheckConfirmar.isSelected()){

            if(auxProv.registrarEntidad(auxProv)){

                llenarTableProveedor();
                limpiarFields();
            }
        }
        else{

            JOptionPane.showMessageDialog(null, "Debe confirmar para crear un proveedor");
        }
    }//GEN-LAST:event_BotonCrearMouseClicked

    private void BotonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMouseClicked

        Proveedor auxProv = provTextFields();
        
        GeneralConnection.firewallConnection();

        if(CheckConfirmar.isSelected()){

            if(auxProv.actualizarEntidad(auxProv)){

                llenarTableProveedor();
                limpiarFields();
            }
        }
        else{

            JOptionPane.showMessageDialog(null, "Debe confirmar para actualizar el proveedor");
        }
    }//GEN-LAST:event_BotonActualizarMouseClicked

    private void BotonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseClicked

        Proveedor auxProv = provTextFields();
        
        GeneralConnection.firewallConnection();

        if(CheckConfirmar.isSelected()){

            if(auxProv.eliminarEntidad(auxProv)){

                llenarTableProveedor();
                limpiarFields();
            }
        }
        else{

            JOptionPane.showMessageDialog(null, "Debe confirmar para eliminar el proveedor");
        }
    }//GEN-LAST:event_BotonEliminarMouseClicked

    private void BotonLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLimpiarMouseClicked

       limpiarFields();
    }//GEN-LAST:event_BotonLimpiarMouseClicked

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
            java.util.logging.Logger.getLogger(ModuloProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuloProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AreaTabla;
    private javax.swing.JLabel BotonActualizar;
    private javax.swing.JLabel BotonCrear;
    private javax.swing.JLabel BotonEliminar;
    private javax.swing.JLabel BotonLimpiar;
    private javax.swing.JCheckBox CheckConfirmar;
    private javax.swing.JLabel CorreoTitle;
    private javax.swing.JTextField CorreoTxt;
    private javax.swing.JLabel DescripcionTitle;
    private javax.swing.JTextField DescripcionTxt;
    private javax.swing.JComboBox<String> EstadoComBox;
    private javax.swing.JLabel EstadoTitle;
    private javax.swing.JTextField IdProveedorTxt;
    private javax.swing.JLabel NombreTitle;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JPanel PanelActualizar;
    private javax.swing.JPanel PanelCrear;
    private javax.swing.JPanel PanelEliminar;
    private javax.swing.JPanel PanelGeneral;
    private javax.swing.JPanel PanelLimpiar;
    private javax.swing.JLabel RazonSocialTitle;
    private javax.swing.JTextField RazonSocialTxt;
    private javax.swing.JTable TablaProveedores;
    private javax.swing.JLabel TelefonoTitle;
    private javax.swing.JTextField TelefonoTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
