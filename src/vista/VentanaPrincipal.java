/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pablo
 */
public class VentanaPrincipal extends javax.swing.JFrame{
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioEmpleados;
    private javax.swing.JRadioButton jRadioEstudiantes;
    private javax.swing.JRadioButton jRadioProfesores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContactos;                   
    private DefaultTableModel modeloTabla;
    //private JFrame ventana;

    public VentanaPrincipal() {
        //ventana = new JFrame("Principal");
        setSize(600, 800);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //add(jPanel1);
        initComponents();
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioEmpleados = new javax.swing.JRadioButton();
        jRadioEstudiantes = new javax.swing.JRadioButton();
        jRadioProfesores = new javax.swing.JRadioButton();
        btnVer = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContactos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        jRadioEmpleados.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jRadioEmpleados.setText("Empleados");
        jRadioEmpleados.setFocusPainted(false);
        
        jPanel1.add(jRadioEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jRadioEstudiantes.setBackground(new java.awt.Color(255, 255, 255));
        jRadioEstudiantes.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jRadioEstudiantes.setText("Estudiantes");
        jRadioEstudiantes.setFocusPainted(false);
        jPanel1.add(jRadioEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 120, 40));

        jRadioProfesores.setBackground(new java.awt.Color(255, 255, 255));
        jRadioProfesores.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jRadioProfesores.setText("Profesores");
        jRadioProfesores.setFocusPainted(false);
        
        jPanel1.add(jRadioProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        btnVer.setBackground(new java.awt.Color(255, 0, 0));
        btnVer.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        btnVer.setForeground(new java.awt.Color(255, 255, 255));
        btnVer.setText("ver");
        btnVer.setFocusPainted(false);
        
        jPanel1.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("eliminar");
        btnEliminar.setFocusPainted(false);
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(255, 0, 0));
        btnActualizar.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("actualizar");
        btnActualizar.setFocusPainted(false);
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 90, 30));

        btnCrear.setBackground(new java.awt.Color(255, 0, 0));
        btnCrear.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("crear");
        btnCrear.setFocusPainted(false);
        
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/download.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 220, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estudiante.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 380, 560));

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel2.setText("Universidad del valle");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, -1));

        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Número");
        modeloTabla.addColumn("Tipo");
        modeloTabla.addColumn("Identificacion");
        jTableContactos.setModel(modeloTabla);
        jScrollPane1.setViewportView(jTableContactos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 400, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    
    }
    
    
    
    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }
    
    public void addBtnCrearListener(ActionListener listener) {
        btnCrear.addActionListener(listener);
    }
    public void addJradioEstudiantesListener(ActionListener listener) {
        jRadioEstudiantes.addActionListener(listener);
    }
    public void addJradioProfesoresListener(ActionListener listener) {
        jRadioProfesores.addActionListener(listener);
    }
    public void addJradioEmpleadosListener(ActionListener listener) {
        jRadioEmpleados.addActionListener(listener);
    }
    
    public void addBtnActualizarListener(ActionListener listener) {
        btnActualizar.addActionListener(listener);
    }
    
    public void addBtnEliminarListener(ActionListener listener) {
        btnEliminar.addActionListener(listener);
    }
    
    public void addBtnVerListener(ActionListener listener) {
        btnVer.addActionListener(listener);
    }
    
    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public void setBtnCrear(JButton btnCrear) {
        this.btnCrear = btnCrear;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnVer() {
        return btnVer;
    }

    public void setBtnVer(JButton btnVer) {
        this.btnVer = btnVer;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JRadioButton getjRadioEmpleados() {
        return jRadioEmpleados;
    }

    public void setjRadioEmpleados(JRadioButton jRadioEmpleados) {
        this.jRadioEmpleados = jRadioEmpleados;
    }

    public JRadioButton getjRadioEstudiantes() {
        return jRadioEstudiantes;
    }

    public void setjRadioEstudiantes(JRadioButton jRadioEstudiantes) {
        this.jRadioEstudiantes = jRadioEstudiantes;
    }

    public JRadioButton getjRadioProfesores() {
        return jRadioProfesores;
    }

    public void setjRadioProfesores(JRadioButton jRadioProfesores) {
        this.jRadioProfesores = jRadioProfesores;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getjTableContactos() {
        return jTableContactos;
    }

    public void setjTableContactos(JTable jTableContactos) {
        this.jTableContactos = jTableContactos;
    }

        
    
}

