/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.Usuario;

import Datos.GeneralConnection;
import Entidades.Rol;
import Entidades.Usuario;
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
public class PanelUsuarios extends javax.swing.JPanel implements Runnable{

    
    public PanelUsuarios() {
        initComponents();
        GeneralConnection.firewallConnection();
        llenarTableUsuario();
        TablaUsuarios.addMouseListener(new MouseAdapter(){
            
            public void mousePressed(MouseEvent Mouse_evt){
                
                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if (Mouse_evt.getClickCount() == 1){
                    
                    IdUsuerTxt.setText((String) TablaUsuarios.getValueAt(TablaUsuarios.getSelectedRow(), 0));
                    NombreTxt.setText((String) TablaUsuarios.getValueAt(TablaUsuarios.getSelectedRow(), 1));
                    DocumentoTxt.setText((String) TablaUsuarios.getValueAt(TablaUsuarios.getSelectedRow(), 2));
                    CorreoTxt.setText((String) TablaUsuarios.getValueAt(TablaUsuarios.getSelectedRow(), 3));
                    TelefonoTxt.setText((String) TablaUsuarios.getValueAt(TablaUsuarios.getSelectedRow(), 4));
                    ClaveTxt.setText((String) TablaUsuarios.getValueAt(TablaUsuarios.getSelectedRow(), 5));
                    RolComBox.setSelectedItem(TablaUsuarios.getValueAt(TablaUsuarios.getSelectedRow(), 6));
                    EstadoComBox.setSelectedItem(TablaUsuarios.getValueAt(TablaUsuarios.getSelectedRow(), 7));
                }
            }
        });
        
    }

    private void llenarTableUsuario(){
        
        limpiarTabla();
        
        List<Usuario> listaUsuarios = Usuario.listarUsuarios();
        List<Rol> listaRoles = Rol.listarRoles();
        
        DefaultTableModel modelo = (DefaultTableModel) TablaUsuarios.getModel();
        
        String [] datos = new String[8];
        
        for(Rol aux : listaRoles){
            
            RolComBox.addItem(aux.getDescripcion());
        }
        
        RolComBox.setSelectedItem(listaRoles.get(0));
  
        for (Usuario aux : listaUsuarios){
           
            datos[0] = Integer.toString(aux.getIdUsuario());
            datos[1] = aux.getNombreCompleto();
            datos[2] = aux.getDocumento();
            datos[3] = aux.getCorreo();
            datos[4] = aux.getTelefono();
            datos[5] = aux.getClave();
            datos[6] = aux.getRolR().getDescripcion();
            datos[7] = (aux.isEstado()) ? "Activo" : "No Activo";
         
            modelo.addRow(datos);
        }
        
    }
    
    private void limpiarTabla(){
        
        DefaultTableModel modelo = (DefaultTableModel) TablaUsuarios.getModel();
        
        for( int i = modelo.getRowCount() - 1; i >= 0; i-- ) {
            modelo.removeRow(i);
        }
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGeneral = new javax.swing.JPanel();
        AreaTabla = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        NombreTitle = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        DocumentoTitle = new javax.swing.JLabel();
        DocumentoTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        CorreoTitle = new javax.swing.JLabel();
        CorreoTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        TelefonoTitle = new javax.swing.JLabel();
        TelefonoTxt = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        ClaveTitle = new javax.swing.JLabel();
        ClaveTxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        RolTitle = new javax.swing.JLabel();
        RolComBox = new javax.swing.JComboBox<>();
        EstadoTitle = new javax.swing.JLabel();
        EstadoComBox = new javax.swing.JComboBox<>();
        PanelCrear = new javax.swing.JPanel();
        BotonCrear = new javax.swing.JLabel();
        PanelActualizar = new javax.swing.JPanel();
        BotonActualizar = new javax.swing.JLabel();
        PanelEliminar = new javax.swing.JPanel();
        BotonEliminar = new javax.swing.JLabel();
        PanelLimpiar = new javax.swing.JPanel();
        BotonLimpiar = new javax.swing.JLabel();
        IdUsuerTxt = new javax.swing.JTextField();
        CheckConfirmar = new javax.swing.JCheckBox();

        PanelGeneral.setBackground(new java.awt.Color(255, 255, 255));
        PanelGeneral.setPreferredSize(new java.awt.Dimension(850, 590));

        TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre Completo", "Documento", "Correo", "Telefono", "Clave", "Rol", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AreaTabla.setViewportView(TablaUsuarios);
        if (TablaUsuarios.getColumnModel().getColumnCount() > 0) {
            TablaUsuarios.getColumnModel().getColumn(0).setPreferredWidth(20);
            TablaUsuarios.getColumnModel().getColumn(1).setPreferredWidth(130);
            TablaUsuarios.getColumnModel().getColumn(3).setPreferredWidth(125);
            TablaUsuarios.getColumnModel().getColumn(5).setPreferredWidth(50);
            TablaUsuarios.getColumnModel().getColumn(7).setPreferredWidth(50);
        }

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Detalle Usuarios");

        NombreTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        NombreTitle.setForeground(new java.awt.Color(0, 0, 0));
        NombreTitle.setText("Nombre Completo");

        NombreTxt.setBackground(new java.awt.Color(255, 255, 255));
        NombreTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        NombreTxt.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        DocumentoTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        DocumentoTitle.setForeground(new java.awt.Color(0, 0, 0));
        DocumentoTitle.setText("Documento");

        DocumentoTxt.setBackground(new java.awt.Color(255, 255, 255));
        DocumentoTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        DocumentoTxt.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        CorreoTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        CorreoTitle.setForeground(new java.awt.Color(0, 0, 0));
        CorreoTitle.setText("Correo");

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

        ClaveTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        ClaveTitle.setForeground(new java.awt.Color(0, 0, 0));
        ClaveTitle.setText("Clave");

        ClaveTxt.setBackground(new java.awt.Color(255, 255, 255));
        ClaveTxt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        ClaveTxt.setBorder(null);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        RolTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        RolTitle.setForeground(new java.awt.Color(0, 0, 0));
        RolTitle.setText("Rol");

        RolComBox.setBackground(new java.awt.Color(255, 255, 255));
        RolComBox.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        RolComBox.setBorder(null);

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

        IdUsuerTxt.setEditable(false);
        IdUsuerTxt.setBackground(new java.awt.Color(255, 255, 255));
        IdUsuerTxt.setForeground(new java.awt.Color(255, 255, 255));
        IdUsuerTxt.setBorder(null);

        CheckConfirmar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        CheckConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        CheckConfirmar.setText("Confirmar");

        javax.swing.GroupLayout PanelGeneralLayout = new javax.swing.GroupLayout(PanelGeneral);
        PanelGeneral.setLayout(PanelGeneralLayout);
        PanelGeneralLayout.setHorizontalGroup(
            PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGeneralLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addComponent(EstadoComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreTitle)
                            .addComponent(DocumentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DocumentoTitle)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CorreoTitle)
                            .addComponent(CorreoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefonoTitle)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClaveTitle)
                            .addComponent(IdUsuerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(AreaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RolTitle)
                            .addComponent(RolComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClaveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addComponent(EstadoTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CheckConfirmar)
                        .addGap(278, 278, 278))))
            .addGroup(PanelGeneralLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(PanelLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelGeneralLayout.setVerticalGroup(
            PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGeneralLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addComponent(IdUsuerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NombreTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DocumentoTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DocumentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(ClaveTitle))
                    .addComponent(AreaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClaveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addComponent(RolTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RolComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EstadoTitle)
                    .addComponent(CheckConfirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EstadoComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(PanelLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseClicked
            
        GeneralConnection.firewallConnection();
        
        if(CheckConfirmar.isSelected()){
            
            if(Usuario.registrarUsuario(userTextFields())){
               
                 llenarTableUsuario();
                 limpiarFields();
            }
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Debe confirmar para crear el usuario");
        }
        
        
    }//GEN-LAST:event_BotonCrearMouseClicked

    private void BotonLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLimpiarMouseClicked

        limpiarFields();
    }//GEN-LAST:event_BotonLimpiarMouseClicked

    private void BotonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMouseClicked
         
        GeneralConnection.firewallConnection();
        
        if(CheckConfirmar.isSelected()){
            
            if(Usuario.actualizarUsuario(userTextFields())){
               
                 llenarTableUsuario();
                 limpiarFields();
            }
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Debe confirmar para actualizar el usuario");
        }
        
    }//GEN-LAST:event_BotonActualizarMouseClicked

    private void BotonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseClicked
        
        GeneralConnection.firewallConnection();
             
        if(CheckConfirmar.isSelected()){
            
            if(Usuario.eliminarUsuario(userTextFields())){
               
                 llenarTableUsuario();
                 limpiarFields();
            }
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Debe confirmar para eliminar el usuario");
        }
        
        
    }//GEN-LAST:event_BotonEliminarMouseClicked

    private void limpiarFields(){
        
        IdUsuerTxt.setText("");
        NombreTxt.setText("");
        DocumentoTxt.setText("");
        CorreoTxt.setText("");
        TelefonoTxt.setText("");
        ClaveTxt.setText("");
        RolComBox.setSelectedItem("Ventas");
        EstadoComBox.setSelectedItem("Activo");
        CheckConfirmar.setSelected(false);
    }
    
    private Usuario userTextFields(){
        
        Usuario auxUser = new Usuario();
        Rol auxRol = new Rol();
        List<Rol> listaRoles = Rol.listarRoles();
        
        if (!(IdUsuerTxt.getText().equals(""))){
           
           auxUser.setIdUsuario(Integer.parseInt(IdUsuerTxt.getText()));
        }
        else{
            auxUser.setIdUsuario(0);
        }
        
        auxUser.setNombreCompleto(NombreTxt.getText());
        auxUser.setDocumento(DocumentoTxt.getText());
        auxUser.setCorreo(CorreoTxt.getText());
        auxUser.setTelefono(TelefonoTxt.getText());
        auxUser.setClave(ClaveTxt.getText());
        
        for (Rol aux : listaRoles){
            
            if (RolComBox.getSelectedItem().equals(aux.getDescripcion())){
                    
                    auxRol.setIdRol(aux.getIdRol());
                    auxRol.setDescripcion(aux.getDescripcion());
                    break;
                }    
        }
        
        auxUser.setRolR(auxRol);
        auxUser.setEstado(EstadoComBox.getSelectedItem().equals("Activo"));
      
        
        return auxUser;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AreaTabla;
    private javax.swing.JLabel BotonActualizar;
    private javax.swing.JLabel BotonCrear;
    private javax.swing.JLabel BotonEliminar;
    private javax.swing.JLabel BotonLimpiar;
    private javax.swing.JCheckBox CheckConfirmar;
    private javax.swing.JLabel ClaveTitle;
    private javax.swing.JTextField ClaveTxt;
    private javax.swing.JLabel CorreoTitle;
    private javax.swing.JTextField CorreoTxt;
    private javax.swing.JLabel DocumentoTitle;
    private javax.swing.JTextField DocumentoTxt;
    private javax.swing.JComboBox<String> EstadoComBox;
    private javax.swing.JLabel EstadoTitle;
    private javax.swing.JTextField IdUsuerTxt;
    private javax.swing.JLabel NombreTitle;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JPanel PanelActualizar;
    private javax.swing.JPanel PanelCrear;
    private javax.swing.JPanel PanelEliminar;
    private javax.swing.JPanel PanelGeneral;
    private javax.swing.JPanel PanelLimpiar;
    private javax.swing.JComboBox<String> RolComBox;
    private javax.swing.JLabel RolTitle;
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JLabel TelefonoTitle;
    private javax.swing.JTextField TelefonoTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        
        
        
    }
}

