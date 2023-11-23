/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author pablo
 */

/*
Pablo Becerrra G. - 2243506 - pablo.becerra@correounivalle.edu.co
Tiffany Torres F. - 2241747 - tiffany.torre@correounivalle.edu.do

Fundamentos de programacion orientada a eventos

*/

public class VentanaMostrar extends javax.swing.JFrame{
    
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> jComboDirecciones;
    private javax.swing.JComboBox<String> jComboTelefonos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblLugarAsociado;
    private javax.swing.JLabel lblNacimiendo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTipoContacto;
    private javax.swing.JLabel lblidentificacion;
    //private JFrame ventana;

    public VentanaMostrar() {
        //ventana = new JFrame();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 800);
        initComponents();
        
    }
    private void initComponents(){
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblTipoContacto = new javax.swing.JLabel();
        lblNacimiendo = new javax.swing.JLabel();
        lblidentificacion = new javax.swing.JLabel();
        lblLugarAsociado = new javax.swing.JLabel();
        jComboTelefonos = new javax.swing.JComboBox<>();
        jComboDirecciones = new javax.swing.JComboBox<>();
        
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/download.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 220, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estudiante.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 370, 560));

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Direcciones:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 140, -1));

        jLabel4.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Dubai Medium", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Universidad del valle");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 290, 60));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Telefonos:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 120, -1));

        jLabel7.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tipo de contacto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, -1));

        jLabel8.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 230, -1));

        jLabel9.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Identificacion:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 160, -1));

        jLabel10.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Lugar Asociado:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 180, -1));

        btnVolver.setBackground(new java.awt.Color(255, 0, 0));
        btnVolver.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 100, 50));
    
        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nombre:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, -1));

        lblNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("name");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 100, -1));

        lblApellido.setBackground(new java.awt.Color(255, 255, 255));
        lblApellido.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(0, 0, 0));
        lblApellido.setText("apell");
        jPanel1.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 100, -1));

        lblTipoContacto.setBackground(new java.awt.Color(255, 255, 255));
        lblTipoContacto.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        lblTipoContacto.setForeground(new java.awt.Color(0, 0, 0));
        lblTipoContacto.setText("Nombre:");
        jPanel1.add(lblTipoContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 100, -1));

        lblNacimiendo.setBackground(new java.awt.Color(255, 255, 255));
        lblNacimiendo.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        lblNacimiendo.setForeground(new java.awt.Color(0, 0, 0));
        lblNacimiendo.setText("Nombre:");
        jPanel1.add(lblNacimiendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 100, -1));

        lblidentificacion.setBackground(new java.awt.Color(255, 255, 255));
        lblidentificacion.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        lblidentificacion.setForeground(new java.awt.Color(0, 0, 0));
        lblidentificacion.setText("Nombre:");
        jPanel1.add(lblidentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 100, 40));

        lblLugarAsociado.setBackground(new java.awt.Color(255, 255, 255));
        lblLugarAsociado.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        lblLugarAsociado.setForeground(new java.awt.Color(0, 0, 0));
        lblLugarAsociado.setText("Nombre:");
        jPanel1.add(lblLugarAsociado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 100, -1));

        jComboTelefonos.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jComboTelefonos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboTelefonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 110, 40));

        jComboDirecciones.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jComboDirecciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboDirecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 110, 40));
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        
        pack();
    }
    
    public void addBtnVolver(ActionListener listener) {
        btnVolver.addActionListener(listener);
    }
    
    public void addJComboNumero(ActionListener listener) {
        jComboTelefonos.addActionListener(listener);
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JComboBox<String> getjComboDirecciones() {
        return jComboDirecciones;
    }

    public void setjComboDirecciones(JComboBox<String> jComboDirecciones) {
        this.jComboDirecciones = jComboDirecciones;
    }

    public JComboBox<String> getjComboTelefonos() {
        return jComboTelefonos;
    }

    public void setjComboTelefonos(JComboBox<String> jComboTelefonos) {
        this.jComboTelefonos = jComboTelefonos;
    }

    public JLabel getLblApellido() {
        return lblApellido;
    }

    public void setLblApellido(JLabel lblApellido) {
        this.lblApellido = lblApellido;
    }

    public JLabel getLblLugarAsociado() {
        return lblLugarAsociado;
    }

    public void setLblLugarAsociado(JLabel lblLugarAsociado) {
        this.lblLugarAsociado = lblLugarAsociado;
    }

    public JLabel getLblNacimiendo() {
        return lblNacimiendo;
    }

    public void setLblNacimiendo(JLabel lblNacimiendo) {
        this.lblNacimiendo = lblNacimiendo;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblTipoContacto() {
        return lblTipoContacto;
    }

    public void setLblTipoContacto(JLabel lblTipoContacto) {
        this.lblTipoContacto = lblTipoContacto;
    }

    public JLabel getLblidentificacion() {
        return lblidentificacion;
    }

    public void setLblidentificacion(JLabel lblidentificacion) {
        this.lblidentificacion = lblidentificacion;
    }
    
    
    
    
}
