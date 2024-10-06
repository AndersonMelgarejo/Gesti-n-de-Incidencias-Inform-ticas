package Controlador;

import Vista.RegistroEmpleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;
import javax.swing.JOptionPane;

public class DaoEmpleado implements ActionListener {

    RegistroEmpleado vista;            
    //constru
    public DaoEmpleado(RegistroEmpleado vista) {
        this.vista = vista;
        this.vista.btnAutoGenerarUsuario.addActionListener(this);
        this.vista.btnRegistrar.addActionListener(this);

    }
     
    
    
     public void iniciar() {
        vista.setTitle("Registro de empleados");
        vista.setLocationRelativeTo(null);
        vista.setSize(740, 540);
        vista.setVisible(false);
    }
     
     
    // GENERAR USUARIO ALEATORIO
    public String autoUsuario() {
        String uuid = UUID.randomUUID().toString().substring(0, 4);
        String nombres = vista.txtNombreRE.getText().replace(" ", "");
        String apellidos = vista.txtApellidoRE.getText().replace(" ", "");
        return (nombres + '.' + apellidos + '.' + uuid).toLowerCase();
    }
    
    public void registrarEmpleado() {
        // Verificar que nombres, apellidos, usuario y clave no estén vacíos
        String nombres = vista.txtNombreRE.getText();
        boolean txtNombreCheck = !nombres.isBlank();
        String apellidos = vista.txtApellidoRE.getText();
        boolean txtApellidoCheck = !nombres.isBlank();
        String usuario = vista.txtUsuarioRE.getText();
        boolean txtUsuarioCheck = !usuario.isBlank();
        String clave = vista.passClaveRE.getText();
        boolean txtClaveCheck = !clave.isBlank();
        // Confirmar la clave repetida
        String clave2 = vista.passClaveRepetidaRE.getText();
        boolean confirmarClaveCheck = clave.equals(clave2);

        
        // Evaluar
        if (txtNombreCheck == false) {
            JOptionPane.showMessageDialog(vista, "El campo Nombres no puede estar vacío.");
        } else if (txtApellidoCheck == false) {
            JOptionPane.showMessageDialog(vista, "El campo Apellidos no puede estar vacío.");
        } else if (txtUsuarioCheck == false) {
            JOptionPane.showMessageDialog(vista, "El campo Nombre de Usuario no puede estar vacío.");
        } else if (txtClaveCheck == false) {
            JOptionPane.showMessageDialog(vista, "El campo Contraseña no puede estar vacío.");
        } else if (confirmarClaveCheck == false) {
            JOptionPane.showMessageDialog(vista, "Los campos de Contraseña no coinciden.");
        } else {
            // Toda está validado. Leer datos
            String email = vista.txtEmailRE.getText();
            String telefono = vista.txtTelefonoRE.getText();
            
            // Formar objeto con los atributos
            //Empleado empleadoNuevo = new Empleado();
            //empleadoNuevo.setNombres(nombres);
            //empleadoNuevo.setApellidos(apellidos);
            //empleadoNuevo.setEmail(email);
            //empleadoNuevo.setTelefono(telefono);
            //empleadoNuevo.setUsuario(usuario);
            //empleadoNuevo.setClave(clave);
            

        }
    }
    public void limpiarFormularioRegistroEmpleado() {
        // Limpiar las cajas de texto 
        vista.txtNombreRE.setText("");
        vista.txtApellidoRE.setText("");
        vista.txtEmailRE.setText("");
        vista.txtTelefonoRE.setText("");
        vista.txtUsuarioRE.setText("");
        vista.passClaveRE.setText("");
        vista.passClaveRepetidaRE.setText("");
        // Desmarcar botones
       
    }
    
    //MANEJOS DE EVENTOS
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnRegistrar) {
            registrarEmpleado();
            limpiarFormularioRegistroEmpleado();
        }
        if (e.getSource() == vista.btnAutoGenerarUsuario) {            
            vista.txtUsuarioRE.setText(autoUsuario());
        } 
        
    }
    
    
    
}
