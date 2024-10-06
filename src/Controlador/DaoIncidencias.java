/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class DaoIncidencias implements ActionListener{

    TipoIncidencias vista; 
    
    public DaoIncidencias(TipoIncidencias vista) {
        this.vista = vista;
        
        this.vista.btnRegistrar.addActionListener(this);
        
      
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
     
      
      
    }
    
}
