/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Vista;

/**
 *
 * @author LENOVO
 */
public class RegistroEmpleado extends javax.swing.JFrame {

    /** Creates new form REmpleados */
    public RegistroEmpleado() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRE = new javax.swing.JPanel();
        rSButtonMaterialIconDos2 = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblEmpleados = new javax.swing.JLabel();
        jpanelRound2 = new Styles.JpanelRound();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new RSMaterialComponent.RSButtonMaterialIconDos();
        txtUsuarioRE = new javax.swing.JTextField();
        txtNombreRE = new javax.swing.JTextField();
        txtApellidoRE = new javax.swing.JTextField();
        txtEmailRE = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelefonoRE = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        passClaveRE = new javax.swing.JPasswordField();
        passClaveRepetidaRE = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        btnAutoGenerarUsuario = new RSMaterialComponent.RSButtonMaterialDos();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnConsultar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnActualizar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminar = new RSMaterialComponent.RSButtonMaterialIconDos();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelRE.setBackground(new java.awt.Color(255, 255, 255));
        PanelRE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMaterialIconDos2.setBackground(new java.awt.Color(153, 0, 51));
        rSButtonMaterialIconDos2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.GROUP_ADD);
        rSButtonMaterialIconDos2.setInheritsPopupMenu(true);
        rSButtonMaterialIconDos2.setRound(25);
        rSButtonMaterialIconDos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconDos2ActionPerformed(evt);
            }
        });
        PanelRE.add(rSButtonMaterialIconDos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRAR EMPLEADOS");
        PanelRE.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setText("N° de Empleados");
        PanelRE.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, 20));

        lblEmpleados.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblEmpleados.setText("0");
        PanelRE.add(lblEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        jpanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound2.setRoundBottomLeft(25);
        jpanelRound2.setRoundBottomRight(25);
        jpanelRound2.setRoundTopLeft(25);
        jpanelRound2.setRoundTopRight(25);
        jpanelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña");
        jpanelRound2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombres");
        jpanelRound2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Apellidos");
        jpanelRound2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("E-mail de contacto");
        jpanelRound2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(153, 0, 51));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnRegistrar.setRound(25);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jpanelRound2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 140, 40));
        jpanelRound2.add(txtUsuarioRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 170, 30));
        jpanelRound2.add(txtNombreRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 30));
        jpanelRound2.add(txtApellidoRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, 30));
        jpanelRound2.add(txtEmailRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 170, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Teléfono movil");
        jpanelRound2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jpanelRound2.add(txtTelefonoRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("N. Usuario");
        jpanelRound2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        passClaveRE.setText("jPasswordField1");
        jpanelRound2.add(passClaveRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 170, 30));

        passClaveRepetidaRE.setText("jPasswordField1");
        jpanelRound2.add(passClaveRepetidaRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 170, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Repetir Contraseña");
        jpanelRound2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        btnAutoGenerarUsuario.setBackground(new java.awt.Color(153, 0, 51));
        btnAutoGenerarUsuario.setText("Autogenerar");
        btnAutoGenerarUsuario.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btnAutoGenerarUsuario.setRound(25);
        btnAutoGenerarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoGenerarUsuarioActionPerformed(evt);
            }
        });
        jpanelRound2.add(btnAutoGenerarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 90, 30));

        PanelRE.add(jpanelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 500));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        PanelRE.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 47, 520, 450));

        btnConsultar.setBackground(new java.awt.Color(153, 0, 51));
        btnConsultar.setText("Consultar");
        btnConsultar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnConsultar.setRound(25);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        PanelRE.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 140, 40));

        btnActualizar.setBackground(new java.awt.Color(153, 0, 51));
        btnActualizar.setText("Actualizar");
        btnActualizar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnActualizar.setRound(25);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        PanelRE.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 140, 40));

        btnEliminar.setBackground(new java.awt.Color(153, 0, 51));
        btnEliminar.setText("Eliminar");
        btnEliminar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btnEliminar.setRound(25);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PanelRE.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialIconDos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconDos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialIconDos2ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAutoGenerarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoGenerarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAutoGenerarUsuarioActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelRE;
    public RSMaterialComponent.RSButtonMaterialIconDos btnActualizar;
    public RSMaterialComponent.RSButtonMaterialDos btnAutoGenerarUsuario;
    public RSMaterialComponent.RSButtonMaterialIconDos btnConsultar;
    public RSMaterialComponent.RSButtonMaterialIconDos btnEliminar;
    public RSMaterialComponent.RSButtonMaterialIconDos btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private Styles.JpanelRound jpanelRound2;
    private javax.swing.JLabel lblEmpleados;
    public javax.swing.JPasswordField passClaveRE;
    public javax.swing.JPasswordField passClaveRepetidaRE;
    private RSMaterialComponent.RSButtonMaterialIconDos rSButtonMaterialIconDos2;
    public javax.swing.JTextField txtApellidoRE;
    public javax.swing.JTextField txtEmailRE;
    public javax.swing.JTextField txtNombreRE;
    public javax.swing.JTextField txtTelefonoRE;
    public javax.swing.JTextField txtUsuarioRE;
    // End of variables declaration//GEN-END:variables

}
