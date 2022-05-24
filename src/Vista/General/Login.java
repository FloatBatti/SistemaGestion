package Vista.General;

import Datos.Conexion;
import Datos.GeneralConnection;
import java.awt.Color;
import Entidades.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;


public class Login extends javax.swing.JFrame implements Runnable {

    int xMouse, yMouse;
    
    
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        UserTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        PassLabel = new javax.swing.JLabel();
        PassTxt = new javax.swing.JPasswordField();
        AreaBotonEntrar = new javax.swing.JPanel();
        BontonEntrar = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        ExitButton = new javax.swing.JPanel();
        Equis = new javax.swing.JLabel();
        SimboloRegistrado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/de pez (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        Titulo.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("INICIAR SESION");

        UserLabel.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(0, 0, 0));
        UserLabel.setText("USUARIO");

        UserTxt.setBackground(java.awt.Color.white);
        UserTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        UserTxt.setForeground(new java.awt.Color(153, 153, 153));
        UserTxt.setText("Ingrese su numero de documento");
        UserTxt.setBorder(null);
        UserTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserTxtMousePressed(evt);
            }
        });
        UserTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTxtActionPerformed(evt);
            }
        });

        PassLabel.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        PassLabel.setForeground(new java.awt.Color(0, 0, 0));
        PassLabel.setText("CONTRASEÑA");

        PassTxt.setBackground(java.awt.Color.white);
        PassTxt.setForeground(new java.awt.Color(153, 153, 153));
        PassTxt.setText("********");
        PassTxt.setBorder(null);
        PassTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PassTxtMousePressed(evt);
            }
        });

        AreaBotonEntrar.setBackground(new java.awt.Color(0, 117, 176));

        BontonEntrar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BontonEntrar.setForeground(java.awt.Color.white);
        BontonEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BontonEntrar.setText("ENTRAR");
        BontonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BontonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BontonEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BontonEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BontonEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AreaBotonEntrarLayout = new javax.swing.GroupLayout(AreaBotonEntrar);
        AreaBotonEntrar.setLayout(AreaBotonEntrarLayout);
        AreaBotonEntrarLayout.setHorizontalGroup(
            AreaBotonEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BontonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );
        AreaBotonEntrarLayout.setVerticalGroup(
            AreaBotonEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BontonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        Header.setBackground(java.awt.Color.white);
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

        ExitButton.setBackground(java.awt.Color.white);
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
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SimboloRegistrado.setForeground(new java.awt.Color(0, 0, 0));
        SimboloRegistrado.setText("Batti's Systems ©");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo)
                            .addComponent(UserLabel)
                            .addComponent(UserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(PassTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AreaBotonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SimboloRegistrado)
                        .addGap(115, 115, 115)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(64, 64, 64)
                .addComponent(UserLabel)
                .addGap(18, 18, 18)
                .addComponent(UserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(PassLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(AreaBotonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(SimboloRegistrado))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // <editor-fold defaultstate="collapsed" desc="Vista del Login"> 
    private void UserTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTxtActionPerformed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
        
    }//GEN-LAST:event_HeaderMouseDragged

    private void EquisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EquisMouseClicked
        System.exit(0);
    }//GEN-LAST:event_EquisMouseClicked

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void EquisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EquisMouseEntered
        ExitButton.setBackground(Color.RED);
        Equis.setForeground(Color.WHITE);
    }//GEN-LAST:event_EquisMouseEntered

    private void EquisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EquisMouseExited
        ExitButton.setBackground(Color.WHITE);
        Equis.setForeground(Color.BLACK);
    }//GEN-LAST:event_EquisMouseExited

    private void BontonEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BontonEntrarMouseEntered
        AreaBotonEntrar.setBackground(new Color(0,156,223));
     
    }//GEN-LAST:event_BontonEntrarMouseEntered

    private void BontonEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BontonEntrarMouseExited
        AreaBotonEntrar.setBackground(new Color(0,117,176));
    }//GEN-LAST:event_BontonEntrarMouseExited

    private void UserTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTxtMousePressed
        if (UserTxt.getText().equals("Ingrese su numero de documento")){       
            UserTxt.setText("");
            UserTxt.setForeground(Color.BLACK);
        }
        
        if(String.valueOf(PassTxt.getPassword()).isEmpty()){
            PassTxt.setText("********");
            PassTxt.setForeground(Color.GRAY);
        }
  
    }//GEN-LAST:event_UserTxtMousePressed

    private void PassTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassTxtMousePressed
        
        if(String.valueOf(PassTxt.getPassword()).equals("********")){ 
            PassTxt.setText("");
            PassTxt.setForeground(Color.BLACK);
        }
        
        if (UserTxt.getText().isEmpty()){
            UserTxt.setText("Ingrese su numero de documento");
            UserTxt.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_PassTxtMousePressed

    // </editor-fold>
    
    private void BontonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BontonEntrarMouseClicked
                  
        Thread t = new Thread(this);
        
        t.start();
                
    }//GEN-LAST:event_BontonEntrarMouseClicked
     
    
    static public Usuario loginUser(){
        
        List<Usuario> listaUsuarios = Usuario.listarUsuarios();
          
        Usuario actualUser = null;
        
        for(Usuario aux : listaUsuarios){
            
            if (UserTxt.getText().equals(aux.getDocumento()) && PassTxt.getText().equals(aux.getClave())){
                
                actualUser= aux;
                break;
            }
        }
        
        return actualUser;
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Login login = new Login();
                login.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AreaBotonEntrar;
    private javax.swing.JLabel BontonEntrar;
    private javax.swing.JLabel Equis;
    private javax.swing.JPanel ExitButton;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel PassLabel;
    public static javax.swing.JPasswordField PassTxt;
    private javax.swing.JLabel SimboloRegistrado;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel UserLabel;
    public static javax.swing.JTextField UserTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        
        AvisoCarga espere = new AvisoCarga();
        
        espere.setVisible(true);
        
        GeneralConnection.setGeneralConnection(new Conexion().conectar());
        
        Usuario actualUser = Login.loginUser();
        
        if (actualUser != null){
            
            Presentacion presentacion = new Presentacion();
            Presentacion.setUsuarioActual(actualUser);
            presentacion.setVisible(true);
            dispose();
        }
        else{
            
            JOptionPane.showMessageDialog(null, "El usuario no se ha encontrado");
        }
             
        espere.setVisible(false);
    }
}
