/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_3_sup;

import ProyectoDao.UsuarioImplementationDAO;
import controller.usuControler;
import vista.VentanaPrincipal;

/**
 *
 * @author pablo
 */
public class Proyecto_3_sup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VistaAgregarContacto agregar = new VistaAgregarContacto();
        //AgregarController agg = new AgregarController(new UsuarioImplementationDAO(), agregar);
        UsuarioImplementationDAO info = new UsuarioImplementationDAO();
        VentanaPrincipal ven = new VentanaPrincipal();
        usuControler principal = new usuControler(info, ven);
        //ven.setVisible(true);
        //new VentanaPrincipal().setVisible(true);
    }
    
}
