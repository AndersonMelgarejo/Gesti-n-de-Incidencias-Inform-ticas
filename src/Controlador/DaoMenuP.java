
package Controlador;

import Vista.*;
import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DaoMenuP implements ActionListener {

    MenuPrincipal vistaMenu;
    
    public DaoMenuP(MenuPrincipal vistaM) {
        
        vistaMenu= vistaM;
        
        
        vistaMenu.btnTIncidencias.addActionListener(this);
        vistaMenu.btnREmpleados.addActionListener(this);
        vistaMenu.btnRAreas.addActionListener(this);
        vistaMenu.btnAPersonal.addActionListener(this);
        vistaMenu.btnRSolución.addActionListener(this);
        vistaMenu.btnIncidencias.addActionListener(this);
        vistaMenu.btnSalir.addActionListener(this);
      
    }
    

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getSource() == vistaMenu.btnTIncidencias) {
            
            vistaMenu.btnTIncidencias.setSelected(true);
            vistaMenu.btnREmpleados.setSelected(false);
            vistaMenu.btnRAreas.setSelected(false);
            vistaMenu.btnAPersonal.setSelected(false);
            vistaMenu.btnRSolución.setSelected(false);
            vistaMenu.btnIncidencias.setSelected(false);
            
            TipoIncidencias TipoIncidencia=new TipoIncidencias();
            TipoIncidencia.PIncidencias.setSize(740, 540);
            TipoIncidencia.setLocation(0,0);

            vistaMenu.contenedor.removeAll();
            vistaMenu.contenedor.add(TipoIncidencia.PIncidencias,BorderLayout.CENTER);
            vistaMenu.contenedor.revalidate();
            vistaMenu.contenedor.repaint(); 
            
        }
        
        if (e.getSource() == vistaMenu.btnREmpleados) {
            
            vistaMenu.btnTIncidencias.setSelected(false);
            vistaMenu.btnREmpleados.setSelected(true);
            vistaMenu.btnRAreas.setSelected(false);
            vistaMenu.btnAPersonal.setSelected(false);
            vistaMenu.btnRSolución.setSelected(false);
            vistaMenu.btnIncidencias.setSelected(false);
            
            RegistroEmpleado RegistroEmpleado=new RegistroEmpleado();
            RegistroEmpleado.PanelRE.setSize(740, 540);
            RegistroEmpleado.setLocation(0,0);

            vistaMenu.contenedor.removeAll();
            vistaMenu.contenedor.add(RegistroEmpleado.PanelRE,BorderLayout.CENTER);
            vistaMenu.contenedor.revalidate();
            vistaMenu.contenedor.repaint(); 
            
        }
        
        if(e.getSource()== vistaMenu.btnSalir){
            
            System.exit(0);
        }
        
        
    }
    
}
