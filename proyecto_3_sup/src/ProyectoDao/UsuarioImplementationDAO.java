/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoDao;

import java.util.ArrayList;
import java.util.Iterator;
import model.Directorio;
import model.InfoPersona;

/**
 *
 * @author pablo
 */

/*
Pablo Becerrra G. - 2243506 - pablo.becerra@correounivalle.edu.co
Tiffany Torres F. - 2241747 - tiffany.torre@correounivalle.edu.do

Fundamentos de programacion orientada a eventos

*/

public class UsuarioImplementationDAO implements InterfaceInfoPersona{
    
    private String identificacionActualizar = "";
    private String tipoActualizar = "";
    private String identificacionVer = "";
    private String tipoVer = "";        
    private Directorio directorio = new Directorio(); 

    
    @Override
    public Directorio getDirectorio() {
        return directorio;
    }

    @Override
    public void setDirectorio(Directorio directorio) {
        this.directorio = directorio;
    }

    @Override
    public void crearPersona(String nombre, String apellido, String tipo, String fecha, String id, ArrayList<String> lugar, ArrayList<String> direcciones, ArrayList<String> telefonos) {
        InfoPersona persona = new InfoPersona(nombre, apellido, tipo, fecha, id, lugar, direcciones, telefonos);
        
        if (persona.getTipoContacto() == "empleado") {
            directorio.getEmpleados().add(persona);
            System.out.println("contacto añadido");
        }else if(persona.getTipoContacto() == "estudiante"){
            directorio.getEstudiantes().add(persona);
            System.out.println("contacto añadido");
        }else if(persona.getTipoContacto() == "profesor"){
            directorio.getProfesores().add(persona);
            System.out.println("contacto añadido");
        }
        
    }

    @Override
    public void eliminarPersona(String id, String tipo) {
        if (tipo == "empleado") {
            for (Iterator<InfoPersona> iterator = directorio.getEmpleados().iterator(); iterator.hasNext();) {
                InfoPersona persona = iterator.next();
                if (persona.getIdentificacion() == id) {
                    iterator.remove(); // Elimina el objeto de la lista
                }
            }
        }else if(tipo == "estudiante"){
            for (Iterator<InfoPersona> iterator = directorio.getEstudiantes().iterator(); iterator.hasNext();) {
                InfoPersona persona = iterator.next();
                if (persona.getIdentificacion() == id) {
                    iterator.remove(); // Elimina el objeto de la lista
                }
            } 
        }else if(tipo == "profesor"){
            for (Iterator<InfoPersona> iterator = directorio.getProfesores().iterator(); iterator.hasNext();) {
                InfoPersona persona = iterator.next();
                if (persona.getIdentificacion() == id) {
                    iterator.remove(); // Elimina el objeto de la lista
                }
            }
        }
    }

    @Override
    public void actualizarPersona(String nombre, String apellido, String tipo, String fecha, String id, ArrayList<String> lugar, ArrayList<String> telefonos, ArrayList<String> direcciones, InfoPersona persona, String tipoViejo) {
        
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setTipoContacto(tipo);
        persona.setFechaNacimiento(fecha);
        persona.setIdentificacion(id);
        for(String telefono : telefonos){
            persona.getTelefonos().add(telefono);
        }
        for(String direccion : direcciones){
            persona.getDirecciones().add(direccion);
        }
        for(String lugares : lugar){
            persona.getLugarAsociado().add(lugares);
        }
        
        
        if(!tipo.equals(tipoViejo)){
            eliminarPersona(id, tipoViejo);
            if (persona.getTipoContacto() == "empleado") {
            directorio.getEmpleados().add(persona);
            System.out.println("contacto añadido");
            }else if(persona.getTipoContacto() == "estudiante"){
                directorio.getEstudiantes().add(persona);
                System.out.println("contacto añadido");
            }else if(persona.getTipoContacto() == "profesor"){
                directorio.getProfesores().add(persona);
                System.out.println("contacto añadido");
            }
        }
        
        //if (persona.getTipoContacto() == "empleado") {
        //    directorio.getEmpleados().add(persona);
          //  System.out.println("contacto añadido");
        //}else if(persona.getTipoContacto() == "estudiante"){
        //    directorio.getEstudiantes().add(persona);
        //    System.out.println("contacto añadido");
        //}else if(persona.getTipoContacto() == "profesor"){
        //    directorio.getProfesores().add(persona);
        //    System.out.println("contacto añadido");
        //}
        
    }

    

    @Override
    public ArrayList<InfoPersona> getPersonas(String tipo) {
        if (tipo == "empleado") {
            return directorio.getEmpleados();
        }else if(tipo == "estudiante"){
            return directorio.getEstudiantes();
        }else if(tipo == "profesor"){
            return directorio.getProfesores();
        }else{
            return null;
        }
    }

    @Override
    public InfoPersona getPersona(String tipo, String id) {
        if ("empleado".equals(tipo)) {
            for (InfoPersona persona : directorio.getEmpleados()) {
                if (persona.getIdentificacion().equals(id)) {
                    return persona;
                }
            }
        } else if ("estudiante".equals(tipo)) {
            for (InfoPersona persona : directorio.getEstudiantes()) {
                if (persona.getIdentificacion().equals(id)) {
                    return persona;
                }
            }
        } else if ("profesor".equals(tipo)) {
            for (InfoPersona persona : directorio.getProfesores()) {
                if (persona.getIdentificacion().equals(id)) {
                    return persona;
                }
            }
        }
        return null; // Se llega aquí si no se encontró la persona en ninguna de las listas
    }

    @Override
    public String getIdentificacionActualizar() {
        return identificacionActualizar;
    }
    
    
    @Override
    public void setIdentificacionActualizar(String identificacionActualizar) {
        this.identificacionActualizar = "";
        this.identificacionActualizar = identificacionActualizar;
    }

    @Override
    public String getTipoActualizar() {
        return tipoActualizar;
    }

    @Override
    public void setTipoActualizar(String tipoActualizar) {
        this.tipoActualizar = "";
        this.tipoActualizar = tipoActualizar;
        
    }

    @Override
    public void eliminarTelefono(String Telefono, ArrayList<String> telefonos, ArrayList<String> lugaresAsociados) {
        if (telefonos.size() > 1) {
            for (int i = 0; i < telefonos.size(); i++) {
                if (telefonos.get(i).equals(Telefono)) {
                    telefonos.remove(i);
                    lugaresAsociados.remove(i);
                    break; // Salir del bucle después de eliminar el elemento
                }
            }
        }
    }

    @Override
    public void eliminarDireccion(String direccion, ArrayList<String> direcciones) {
        if (direcciones.size() > 1) {
            for (int i = 0; i < direcciones.size(); i++) {
                if (direcciones.get(i).equals(direccion)) {
                    direcciones.remove(i);
                    break; // Salir del bucle después de eliminar el elemento
                }
            }
        }
    }

    @Override
    public String getIdentificacionVer() {
        return identificacionVer;
    }

    @Override
    public void setIdentificacionVer(String identificacionVer) {
        this.identificacionVer = identificacionVer;
    }

    @Override
    public String getTipoVer() {
        return tipoVer;
    }

    @Override
    public void setTipoVer(String tipoVer) {
        this.tipoVer = tipoVer;
    }
    
    
    
    
    
    
    
    
            
    
}
