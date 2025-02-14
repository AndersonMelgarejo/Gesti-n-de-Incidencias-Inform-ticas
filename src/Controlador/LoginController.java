/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.MenuPrincipal;
import Vista.TipoIncidencias;
import Vista.UI_Login;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author franc
 */
public class LoginController implements ActionListener {

    UI_Login login;

    public LoginController(UI_Login login) {
        this.login = login;
        login.txtEmail.putClientProperty("JTextField.placeholderText", "Ingresa tu usuario");
        login.txtEmail.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        login.txtAccess.putClientProperty("JTextField.placeholderText", "Ingresa tu contraseña");
        if (login.jPanel2 != null) {
            login.jPanel2.putClientProperty(FlatClientProperties.STYLE, "arc: 90");
            login.jPanel2.setOpaque(false);
        }
        login.btnAccess.addActionListener(this);
        initialize();
    }

    void initialize() {
        login.setLocationRelativeTo(null);
        login.getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.WHITE);
        login.getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(23, 180, 252));
        login.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.btnAccess) {
            login.txtAccess.putClientProperty("JComponent.outline", "error");
            login.txtEmail.putClientProperty("JComponent.outline", "error");
            
            
            
            MenuPrincipal menuPrincipal = new MenuPrincipal(); // Cambia el nombre de la variable
            menuPrincipal.setLocationRelativeTo(null);
            menuPrincipal.setVisible(true);

            menuPrincipal.getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.WHITE);
            menuPrincipal.getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(153,0,51));
            
            // Crea una instancia de DaoMenuP y le pasas la instancia de MenuPrincipal
            DaoMenuP daoMenuP = new DaoMenuP(menuPrincipal); 

            login.dispose();

            // Crea la instancia de TipoIncidencias y configúralo
            TipoIncidencias TI = new TipoIncidencias();
            TI.setSize(706, 547);
            TI.setLocation(0, 0);

            menuPrincipal.contenedor.removeAll(); // Cambia 'm' por 'menuPrincipal'
            menuPrincipal.contenedor.add(TI.PIncidencias, BorderLayout.CENTER);
            menuPrincipal.contenedor.revalidate();
            menuPrincipal.contenedor.repaint();

            
        }
    }

}
