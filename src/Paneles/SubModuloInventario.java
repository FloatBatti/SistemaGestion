/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Paneles;

import Datos.GeneralConnection;
import Entidades.Categoria;
import Entidades.Producto;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AgusGonza
 */
public class SubModuloInventario extends javax.swing.JFrame {

  
    public SubModuloInventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarTableCategoria();
        TablaCategorias.addMouseListener(new MouseAdapter(){
            
            public void mousePressed(MouseEvent Mouse_evt){
                
                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if (Mouse_evt.getClickCount() == 1){
                    
                    IdCategoriaTxt.setText((String) TablaCategorias.getValueAt(TablaCategorias.getSelectedRow(), 0));
                    NombreTxt.setText((String) TablaCategorias.getValueAt(TablaCategorias.getSelectedRow(), 1));
                    DescripcionTxt.setText((String) TablaCategorias.getValueAt(TablaCategorias.getSelectedRow(), 2));
                    EstadoComBox.setSelectedItem(TablaCategorias.getValueAt(TablaCategorias.getSelectedRow(), 9));
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
        TablaCategorias = new javax.swing.JTable();
        NombreTitle = new javax.swing.JLabel();
        NombreTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        DescripcionTitle = new javax.swing.JLabel();
        DescripcionTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        EstadoTitle = new javax.swing.JLabel();
        EstadoComBox = new javax.swing.JComboBox<>();
        PanelLimpiar = new javax.swing.JPanel();
        BotonLimpiar = new javax.swing.JLabel();
        PanelCrear = new javax.swing.JPanel();
        BotonCrear = new javax.swing.JLabel();
        PanelActualizar = new javax.swing.JPanel();
        BotonActualizar = new javax.swing.JLabel();
        PanelEliminar = new javax.swing.JPanel();
        BotonEliminar = new javax.swing.JLabel();
        CheckConfirmar = new javax.swing.JCheckBox();
        IdCategoriaTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelGeneral.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Detalle Categorias");

        TablaCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AreaTabla.setViewportView(TablaCategorias);
        if (TablaCategorias.getColumnModel().getColumnCount() > 0) {
            TablaCategorias.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        NombreTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        NombreTitle.setForeground(new java.awt.Color(0, 0, 0));
        NombreTitle.setText("Nombre");

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

        EstadoTitle.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        EstadoTitle.setForeground(new java.awt.Color(0, 0, 0));
        EstadoTitle.setText("Estado");

        EstadoComBox.setBackground(new java.awt.Color(255, 255, 255));
        EstadoComBox.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        EstadoComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "No Activo" }));
        EstadoComBox.setBorder(null);

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

        CheckConfirmar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        CheckConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        CheckConfirmar.setText("Confirmar");
        CheckConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CheckConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckConfirmarActionPerformed(evt);
            }
        });

        IdCategoriaTxt.setEditable(false);
        IdCategoriaTxt.setBackground(new java.awt.Color(255, 255, 255));
        IdCategoriaTxt.setForeground(new java.awt.Color(255, 255, 255));
        IdCategoriaTxt.setBorder(null);

        javax.swing.GroupLayout PanelGeneralLayout = new javax.swing.GroupLayout(PanelGeneral);
        PanelGeneral.setLayout(PanelGeneralLayout);
        PanelGeneralLayout.setHorizontalGroup(
            PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGeneralLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelGeneralLayout.createSequentialGroup()
                                .addComponent(NombreTitle)
                                .addGap(52, 52, 52)
                                .addComponent(DescripcionTitle))
                            .addGroup(PanelGeneralLayout.createSequentialGroup()
                                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(NombreTxt)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DescripcionTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EstadoTitle)
                            .addComponent(EstadoComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(PanelLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
            .addGroup(PanelGeneralLayout.createSequentialGroup()
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelGeneralLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IdCategoriaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AreaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(PanelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CheckConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(PanelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelGeneralLayout.setVerticalGroup(
            PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGeneralLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IdCategoriaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AreaTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelGeneralLayout.createSequentialGroup()
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreTitle)
                            .addComponent(DescripcionTitle))
                        .addGap(6, 6, 6)
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescripcionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(EstadoTitle)
                        .addGap(6, 6, 6)
                        .addComponent(EstadoComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CheckConfirmar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(PanelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarTabla(){
        
        DefaultTableModel modelo = (DefaultTableModel) TablaCategorias.getModel();
        
        for(int i = modelo.getRowCount() - 1; i >= 0; i-- ) {
            modelo.removeRow(i);
        }
         
    }
    private void llenarTableCategoria(){
        
        limpiarTabla();
        
        List<Categoria> listaCategorias = Categoria.listarCategorias();
        
        DefaultTableModel modelo = (DefaultTableModel) TablaCategorias.getModel();
        
        String [] datos = new String[4];
           
  
        for (Categoria aux : listaCategorias){
           
            datos[0] = Integer.toString(aux.getIdCategoria());
            datos[1] = aux.getNombre();
            datos[2] = aux.getDescripcion();
            datos[3] = (aux.isEstado()) ? "Activo" : "No Activo";
         
            modelo.addRow(datos);
        }
        
    }
    private void BotonLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLimpiarMouseClicked

        //limpiarFields();
    }//GEN-LAST:event_BotonLimpiarMouseClicked

    private void BotonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseClicked

//        GeneralConnection.firewallConnection();
//
//        if(CheckConfirmar.isSelected()){
//
//                if(Producto.registrarUsuario(TextFields())){
//
//                        llenarTableUsuario();
//                        limpiarFields();
//                    }
//            }
//        else{
//
//                JOptionPane.showMessageDialog(null, "Debe confirmar para crear el usuario");
//            }
    }//GEN-LAST:event_BotonCrearMouseClicked

    private void BotonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonActualizarMouseClicked

        //        GeneralConnection.firewallConnection();
        //
        //        if(CheckConfirmar.isSelected()){
            //
            //            if(Usuario.actualizarUsuario(userTextFields())){
                //
                //                llenarTableUsuario();
                //                limpiarFields();
                //            }
            //        }
        //        else{
            //
            //            JOptionPane.showMessageDialog(null, "Debe confirmar para actualizar el usuario");
            //        }
    }//GEN-LAST:event_BotonActualizarMouseClicked

    private void BotonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseClicked

        //        GeneralConnection.firewallConnection();
        //
        //        if(CheckConfirmar.isSelected()){
            //
            //            if(Usuario.eliminarUsuario(userTextFields())){
                //
                //                llenarTableUsuario();
                //                limpiarFields();
                //            }
            //        }
        //        else{
            //
            //            JOptionPane.showMessageDialog(null, "Debe confirmar para eliminar el usuario");
            //        }
    }//GEN-LAST:event_BotonEliminarMouseClicked

    private void CheckConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(SubModuloInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubModuloInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubModuloInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubModuloInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubModuloInventario().setVisible(true);
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
    private javax.swing.JLabel DescripcionTitle;
    private javax.swing.JTextField DescripcionTxt;
    private javax.swing.JComboBox<String> EstadoComBox;
    private javax.swing.JLabel EstadoTitle;
    private javax.swing.JTextField IdCategoriaTxt;
    private javax.swing.JLabel NombreTitle;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JPanel PanelActualizar;
    private javax.swing.JPanel PanelCrear;
    private javax.swing.JPanel PanelEliminar;
    private javax.swing.JPanel PanelGeneral;
    private javax.swing.JPanel PanelLimpiar;
    private javax.swing.JTable TablaCategorias;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
