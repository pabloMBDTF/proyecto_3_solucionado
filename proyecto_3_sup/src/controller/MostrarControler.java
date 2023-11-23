/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author pablo
 */

/*
Pablo Becerrra G. - 2243506 - pablo.becerra@correounivalle.edu.co
Tiffany Torres F. - 2241747 - tiffany.torre@correounivalle.edu.do

Fundamentos de programacion orientada a eventos

*/


import ProyectoDao.UsuarioImplementationDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.InfoPersona;
import vista.VentanaMostrar;
import vista.VentanaPrincipal;

/**
 *
 * @author pablo
 */
public class MostrarControler {
    private VentanaMostrar ventana;
    private UsuarioImplementationDAO usuarioDao;
    private InfoPersona persona;

    public MostrarControler(VentanaMostrar ventana, UsuarioImplementationDAO usuarioDao) {
        this.ventana = ventana;
        this.usuarioDao = usuarioDao;
        this.ventana.setVisible(true);
        this.ventana.getLblLugarAsociado().setText("");
        ventana.addBtnVolver(new btnVolverListener());
        ventana.addJComboNumero(new btnJcomboListener());
        persona = usuarioDao.getPersona(usuarioDao.getTipoVer(), usuarioDao.getIdentificacionVer());
        cargarValores();
    }
    
    
    
    
    class btnVolverListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            ventana.dispose();
            usuControler principal = new usuControler(usuarioDao, new VentanaPrincipal());
            
        }
    }
    
    class btnJcomboListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("hola");
            int indiceSeleccionado = ventana.getjComboTelefonos().getSelectedIndex();

            // Verificar si se ha seleccionado algún elemento
            if (indiceSeleccionado != -1) {
                // Verificar si el índice seleccionado es válido para el array
                if (indiceSeleccionado < persona.getLugarAsociado().size()) {
                    ventana.getLblLugarAsociado().setText(persona.getLugarAsociado().get(indiceSeleccionado));
                } else {
                    System.err.println("Índice fuera de los límites del array.");
                }
            } else {
                System.err.println("Ningún elemento seleccionado en el JComboBox.");
            }
        }
    }
    
    public void cargarValores(){
        ventana.getLblNombre().setText(persona.getNombre());
        ventana.getLblApellido().setText(persona.getApellido());
        ventana.getLblTipoContacto().setText(persona.getTipoContacto());
        ventana.getLblNacimiendo().setText(persona.getFechaNacimiento());
        ventana.getLblidentificacion().setText(persona.getIdentificacion());
        ponerDatos();
    
    }
    
    public void ponerDatos() {
        // Obtener la persona actualizada
        
        // Limpiar el JComboBox antes de agregar nuevos elementos
        ventana.getjComboTelefonos().removeAllItems();
        ventana.getjComboDirecciones().removeAllItems();

        // Recorrer los teléfonos y agregarlos al JComboBox
        for (String telefono : persona.getTelefonos()) {
            ventana.getjComboTelefonos().addItem(telefono);
        }


        for (String direcciones : persona.getDirecciones()) {
            ventana.getjComboDirecciones().addItem(direcciones);
        }
}
    
    
    
}
