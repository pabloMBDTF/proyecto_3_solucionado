/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProyectoDao;

import java.util.ArrayList;
import model.Directorio;
import model.InfoPersona;

/*
Pablo Becerrra G. - 2243506 - pablo.becerra@correounivalle.edu.co
Tiffany Torres F. - 2241747 - tiffany.torre@correounivalle.edu.do

Fundamentos de programacion orientada a eventos

*/


/**
 *
 * @author pablo
 */
public interface InterfaceInfoPersona {
    public void crearPersona(String nombre, String apellido, String tipo, String fecha, String id, ArrayList<String> lugar, ArrayList<String> direcciones, ArrayList<String> telefonos);
    public void eliminarPersona(String id, String tipo);
    public void actualizarPersona(String nombre, String apellido, String tipo, String fecha, String id, ArrayList<String> lugar,ArrayList<String> telefonos, ArrayList<String> direcciones, InfoPersona persona, String tipoViejo );
    public ArrayList<InfoPersona> getPersonas(String tipo);
    public InfoPersona getPersona(String tipo, String id);
    public void eliminarTelefono(String Telefono, ArrayList<String> telefonos, ArrayList<String> LugaresAsociados);
    public void eliminarDireccion(String direccion, ArrayList<String> direcciones);
    public Directorio getDirectorio();
    public void setDirectorio(Directorio directorio);
    public String getIdentificacionActualizar();
    public void setIdentificacionActualizar(String identificacionActualizar);
    public String getTipoActualizar();
    public void setTipoActualizar(String tipoActualizar);
    public String getIdentificacionVer();
    public void setIdentificacionVer(String identificacionVer);
    public String getTipoVer();
    public void setTipoVer(String tipoVer);
    
    
}