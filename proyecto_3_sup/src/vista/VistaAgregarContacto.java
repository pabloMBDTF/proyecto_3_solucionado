/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author pablo
 */

/*
Pablo Becerrra G. - 2243506 - pablo.becerra@correounivalle.edu.co
Tiffany Torres F. - 2241747 - tiffany.torre@correounivalle.edu.do

Fundamentos de programacion orientada a eventos

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.InfoPersona;

public class VistaAgregarContacto extends JFrame {

    private JFrame ventanaAgregar;
    private JTextField nombreTextField, apellidoTextField, lugarAsociadoField, fechaNacimientoTextField, identificacionTextField, direccionTextField, telefonosTextField;
    private JComboBox<String> tipoContactoTextCombo;
    private JTextArea direccionesTextArea;
    private JButton btnCrearContacto, btnAgregarDireccion, btnAgregarTelefono;

    public VistaAgregarContacto() {
        ventanaAgregar = new JFrame("Agregar contacto");
        ventanaAgregar.setSize(600, 800);
        ventanaAgregar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Etiquetas
        JLabel nombreLabel = new JLabel("Nombre:");
        JLabel apellidoLabel = new JLabel("Apellido:");
        JLabel tipoContactoLabel = new JLabel("Tipo de Contacto:");
        JLabel fechaNacimientoLabel = new JLabel("Fecha de Nacimiento:");
        JLabel identificacionLabel = new JLabel("Identificación:");
        JLabel lugarAsociadoLabel = new JLabel("Lugar Asociado:");
        JLabel direccionesLabel = new JLabel("Direcciones:");
        JLabel telefonosLabel = new JLabel("Telefonos:");

        // Campos de texto
        nombreTextField = new JTextField();
        apellidoTextField = new JTextField();
        lugarAsociadoField = new JTextField();
        fechaNacimientoTextField = new JTextField();
        identificacionTextField = new JTextField();
        direccionTextField = new JTextField();
        telefonosTextField = new JTextField();

        // ComboBox para el lugar asociado
        String[] opcionesLugarAsociado = {"empleado", "estudiante", "profesor"};
        tipoContactoTextCombo = new JComboBox<>(opcionesLugarAsociado);

        // Botones
        btnCrearContacto = new JButton("Crear Contacto");
        btnAgregarDireccion = new JButton("Agregar dirección");
        btnAgregarTelefono = new JButton("Agregar telefono");

        btnCrearContacto.setBounds(190, 660, 200, 60);
        btnAgregarDireccion.setBounds(340, 590, 200, 20);
        btnAgregarTelefono.setBounds(340, 35, 200, 20);

        telefonosLabel.setBounds(40, 1, 150, 90);
        nombreLabel.setBounds(40, 80, 150, 90);
        apellidoLabel.setBounds(40, 160, 150, 90);
        tipoContactoLabel.setBounds(40, 240, 150, 90);
        fechaNacimientoLabel.setBounds(40, 325, 190, 90);
        identificacionLabel.setBounds(40, 400, 150, 90);
        lugarAsociadoLabel.setBounds(40, 480, 150, 90);
        direccionesLabel.setBounds(40, 560, 150, 90);

        telefonosTextField.setBounds(220, 35, 100, 20);
        nombreTextField.setBounds(220, 115, 100, 20);
        apellidoTextField.setBounds(220, 195, 100, 20);
        tipoContactoTextCombo.setBounds(220, 275, 100, 20);
        fechaNacimientoTextField.setBounds(220, 360, 100, 20);
        identificacionTextField.setBounds(220, 440, 100, 20);
        lugarAsociadoField.setBounds(220, 515, 100, 20);
        direccionTextField.setBounds(220, 590, 100, 20);
        
        
        panel.add(btnCrearContacto);
        panel.add(btnAgregarDireccion);
        panel.add(btnAgregarTelefono);

        panel.add(nombreLabel);
        panel.add(apellidoLabel);
        panel.add(tipoContactoLabel);
        panel.add(fechaNacimientoLabel);
        panel.add(identificacionLabel);
        panel.add(lugarAsociadoLabel);
        panel.add(direccionesLabel);
        panel.add(telefonosLabel);

        panel.add(nombreTextField);
        panel.add(apellidoTextField);
        panel.add(lugarAsociadoField);
        panel.add(fechaNacimientoTextField);
        panel.add(identificacionTextField);
        panel.add(tipoContactoTextCombo);
        panel.add(direccionTextField);
        panel.add(telefonosTextField);
        
        

        ventanaAgregar.add(panel);
        panel.setVisible(true);
        ventanaAgregar.setVisible(true);

    }
    
    public void addBtnCrearListener(ActionListener listener) {
        btnCrearContacto.addActionListener(listener);
    }
    
    
    public void addBtnDireccionListener(ActionListener listener) {
        btnAgregarDireccion.addActionListener(listener);
    }
    
    public void addBtnTelefonosListener(ActionListener listener) {
        btnAgregarTelefono.addActionListener(listener);
    }

    public JFrame getVentanaAgregar() {
        return ventanaAgregar;
    }

    public void setVentanaAgregar(JFrame ventanaAgregar) {
        this.ventanaAgregar = ventanaAgregar;
    }

    public JTextField getNombreTextField() {
        return nombreTextField;
    }

    public void setNombreTextField(JTextField nombreTextField) {
        this.nombreTextField = nombreTextField;
    }

    public JTextField getApellidoTextField() {
        return apellidoTextField;
    }

    public void setApellidoTextField(JTextField apellidoTextField) {
        this.apellidoTextField = apellidoTextField;
    }

    public JComboBox<String> getTipoContactoTextField() {
        return tipoContactoTextCombo;
    }

    public void setTipoContactoTextField(JComboBox<String> tipoContactoTextField) {
        this.tipoContactoTextCombo = tipoContactoTextField;
    }

    public JTextField getFechaNacimientoTextField() {
        return fechaNacimientoTextField;
    }

    public void setFechaNacimientoTextField(JTextField fechaNacimientoTextField) {
        this.fechaNacimientoTextField = fechaNacimientoTextField;
    }

    public JTextField getIdentificacionTextField() {
        return identificacionTextField;
    }

    public void setIdentificacionTextField(JTextField identificacionTextField) {
        this.identificacionTextField = identificacionTextField;
    }

    public JTextField getDireccionTextField() {
        return direccionTextField;
    }

    public void setDireccionTextField(JTextField direccionTextField) {
        this.direccionTextField = direccionTextField;
    }

    public JTextField getLugarAsociado() {
        return lugarAsociadoField;
    }

    public void setLugarAsociado(JTextField lugarAsociado) {
        this.lugarAsociadoField = lugarAsociado;
    }
    
    public String getTipoSeleccionado() {
        return (String) tipoContactoTextCombo.getSelectedItem();
    }

    public JTextArea getDireccionesTextArea() {
        return direccionesTextArea;
    }

    public void setDireccionesTextArea(JTextArea direccionesTextArea) {
        this.direccionesTextArea = direccionesTextArea;
    }

    public JButton getBtnCrearContacto() {
        return btnCrearContacto;
    }

    public void setBtnCrearContacto(JButton btnCrearContacto) {
        this.btnCrearContacto = btnCrearContacto;
    }

    public JButton getBtnAgregarDireccion() {
        return btnAgregarDireccion;
    }

    public void setBtnAgregarDireccion(JButton btnAgregarDireccion) {
        this.btnAgregarDireccion = btnAgregarDireccion;
    }

    public JTextField getTelefonosTextField() {
        return telefonosTextField;
    }

    public void setTelefonosTextField(JTextField telefonosTextField) {
        this.telefonosTextField = telefonosTextField;
    }

    public JButton getBtnAgregarTelefono() {
        return btnAgregarTelefono;
    }

    public void setBtnAgregarTelefono(JButton btnAgregarTelefono) {
        this.btnAgregarTelefono = btnAgregarTelefono;
    }
    
    
    
}