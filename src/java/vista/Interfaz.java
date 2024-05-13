/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;


public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pnlPedido = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblAlertOpeUsu = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblDistr = new javax.swing.JLabel();
        btnRegPed = new javax.swing.JButton();
        lblAlertOpera = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        spnCantidad = new javax.swing.JSpinner();
        lblAlertOpeSal = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        cbxMedic = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        lblTipoM = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblSucursal = new javax.swing.JLabel();
        pnlBuscar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblMedi = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        lblAlerElim = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        txtUserReg = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        btn_Eliminar = new javax.swing.JButton();
        btn_crear = new javax.swing.JButton();
        btn_volverP = new javax.swing.JButton();
        pnlCrear = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtIdM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreM = new javax.swing.JPasswordField();
        btnBuscarP = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngre = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblAlertInic = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxTipoM = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtDescM = new javax.swing.JPasswordField();
        btnPedido1 = new javax.swing.JButton();
        pnlVistaPedido = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtIdM1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombreM1 = new javax.swing.JPasswordField();
        btnBuscarP1 = new javax.swing.JButton();
        jSeparator18 = new javax.swing.JSeparator();
        btnIngre1 = new javax.swing.JButton();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        lblAlertInic1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbxTipoM1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtDescM1 = new javax.swing.JPasswordField();
        btnPedido2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPedido.setBackground(new java.awt.Color(0, 153, 102));
        pnlPedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Crear Pedido:");
        pnlPedido.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lblAlertOpeUsu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlPedido.add(lblAlertOpeUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 130, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setText("Sucursal:");
        pnlPedido.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        lblDistr.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDistr.setText("----");
        pnlPedido.add(lblDistr, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        btnRegPed.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegPed.setText("Registrar");
        pnlPedido.add(btnRegPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        lblAlertOpera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pnlPedido.add(lblAlertOpera, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 260, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setText("Cantidad:");
        pnlPedido.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setText("Medicamento:");
        pnlPedido.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        pnlPedido.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 170, 10));
        pnlPedido.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 460, 10));
        pnlPedido.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 170, 10));

        spnCantidad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        pnlPedido.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 160, -1));

        lblAlertOpeSal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlPedido.add(lblAlertOpeSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 150, 30));
        pnlPedido.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 160, 10));
        pnlPedido.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 460, 10));

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSalir.setText("Cancelar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlPedido.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        cbxMedic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlPedido.add(cbxMedic, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setText("Tipo Medicamento:");
        pnlPedido.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblTipoM.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTipoM.setText("----");
        pnlPedido.add(lblTipoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setText("Distribuidor:");
        pnlPedido.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lblSucursal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSucursal.setText("----");
        pnlPedido.add(lblSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        getContentPane().add(pnlPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 510));

        pnlBuscar.setBackground(new java.awt.Color(0, 153, 102));
        pnlBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Buscar Medicamento");
        pnlBuscar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Ingrese el nombre:");
        pnlBuscar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Medicamento:");
        pnlBuscar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        lblMedi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblMedi.setText("----");
        pnlBuscar.add(lblMedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 170, 60));

        btn_buscar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_buscar.setText("Buscar");
        pnlBuscar.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        lblAlerElim.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAlerElim.setForeground(new java.awt.Color(0, 153, 0));
        lblAlerElim.setText(" éxito");
        pnlBuscar.add(lblAlerElim, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 180, -1));
        pnlBuscar.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 470, 20));
        pnlBuscar.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 170, 20));
        pnlBuscar.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 170, 20));

        txtUserReg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlBuscar.add(txtUserReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 170, -1));
        pnlBuscar.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 170, 20));
        pnlBuscar.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 470, 20));

        btn_Eliminar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_Eliminar.setText("Eliminar");
        pnlBuscar.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        btn_crear.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_crear.setText("Crear");
        pnlBuscar.add(btn_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        btn_volverP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_volverP.setText("Volver");
        pnlBuscar.add(btn_volverP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        getContentPane().add(pnlBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 510));

        pnlCrear.setBackground(new java.awt.Color(0, 153, 102));
        pnlCrear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Crear Producto");
        pnlCrear.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));
        pnlCrear.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 460, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Id:");
        pnlCrear.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtIdM.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlCrear.add(txtIdM, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 220, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Nombre:");
        pnlCrear.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtNombreM.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlCrear.add(txtNombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 230, -1));

        btnBuscarP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBuscarP.setText("Buscar");
        btnBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPActionPerformed(evt);
            }
        });
        pnlCrear.add(btnBuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));
        pnlCrear.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 230, 10));

        btnIngre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIngre.setText("Ingresar");
        pnlCrear.add(btnIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));
        pnlCrear.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 460, 10));
        pnlCrear.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 230, 10));
        pnlCrear.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 230, 10));
        pnlCrear.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 460, 10));

        lblAlertInic.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblAlertInic.setForeground(new java.awt.Color(255, 0, 51));
        lblAlertInic.setText("Usuario no existe o las credenciales son incorrectas ");
        pnlCrear.add(lblAlertInic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Tipo Med:");
        pnlCrear.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        cbxTipoM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlCrear.add(cbxTipoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Descripcion:");
        pnlCrear.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtDescM.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlCrear.add(txtDescM, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 230, -1));

        btnPedido1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPedido1.setText("Pedido");
        btnPedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedido1ActionPerformed(evt);
            }
        });
        pnlCrear.add(btnPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        getContentPane().add(pnlCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 515));

        pnlVistaPedido.setBackground(new java.awt.Color(0, 153, 102));
        pnlVistaPedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Crear Producto");
        pnlVistaPedido.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));
        pnlVistaPedido.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 460, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Id:");
        pnlVistaPedido.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtIdM1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlVistaPedido.add(txtIdM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 220, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Nombre:");
        pnlVistaPedido.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtNombreM1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlVistaPedido.add(txtNombreM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 230, -1));

        btnBuscarP1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBuscarP1.setText("Buscar");
        btnBuscarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarP1ActionPerformed(evt);
            }
        });
        pnlVistaPedido.add(btnBuscarP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));
        pnlVistaPedido.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 230, 10));

        btnIngre1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIngre1.setText("Ingresar");
        pnlVistaPedido.add(btnIngre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));
        pnlVistaPedido.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 460, 10));
        pnlVistaPedido.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 230, 10));
        pnlVistaPedido.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 230, 10));
        pnlVistaPedido.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 460, 10));

        lblAlertInic1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblAlertInic1.setForeground(new java.awt.Color(255, 0, 51));
        lblAlertInic1.setText("Usuario no existe o las credenciales son incorrectas ");
        pnlVistaPedido.add(lblAlertInic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("Tipo Med:");
        pnlVistaPedido.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        cbxTipoM1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlVistaPedido.add(cbxTipoM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setText("Descripcion:");
        pnlVistaPedido.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtDescM1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlVistaPedido.add(txtDescM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 230, -1));

        btnPedido2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPedido2.setText("Pedido");
        btnPedido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedido2ActionPerformed(evt);
            }
        });
        pnlVistaPedido.add(btnPedido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        getContentPane().add(pnlVistaPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 515));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarPActionPerformed

    private void btnPedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPedido1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarP1ActionPerformed

    private void btnPedido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPedido2ActionPerformed

    public JButton getBtn_crear() {
        return btn_crear;
    }

    public void setBtn_crear(JButton btn_crear) {
        this.btn_crear = btn_crear;
    }

    public JButton getBtn_volverP() {
        return btn_volverP;
    }

    public void setBtn_volverP(JButton btn_volverP) {
        this.btn_volverP = btn_volverP;
    }

    
    
    
    public JButton getBtn_ValiRegUsu() {
        return btn_buscar;
    }

    public JLabel getLblAlerReg() {
        return lblAlerElim;
    }

    public void setLblAlerReg(JLabel lblAlerReg) {
        this.lblAlerElim = lblAlerReg;
    }


    public JTextField getTxtUserReg() {
        return txtUserReg;
    }

    public JLabel getLblAlertOpeSal() {
        return lblAlertOpeSal;
    }

    public void setLblAlertOpeSal(JLabel lblAlertOpeSal) {
        this.lblAlertOpeSal = lblAlertOpeSal;
    }

    public JLabel getLblAlertOpeUsu() {
        return lblAlertOpeUsu;
    }

    public void setLblAlertOpeUsu(JLabel lblAlertOpeUsu) {
        this.lblAlertOpeUsu = lblAlertOpeUsu;
    }

    public JLabel getLblAlertOpera() {
        return lblAlertOpera;
    }

    public void setLblAlertOpera(JLabel lblAlertOpera) {
        this.lblAlertOpera = lblAlertOpera;
    }

    public void setTxtUserReg(JTextField txtUserReg) {
        this.txtUserReg = txtUserReg;
    }

    public JButton getBtnIngre() {
        return btnIngre;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public void setBtnIngre(JButton btnIngre) {
        this.btnIngre = btnIngre;
    }

    public JLabel getLblAlertInic() {
        return lblAlertInic;
    }

    public JButton getBtnRegOpe() {
        return btnRegPed;
    }

    public void setBtnRegOpe(JButton btnRegOpe) {
        this.btnRegPed = btnRegOpe;
    }

    public JSpinner getSpnCantidad() {
        return spnCantidad;
    }

    public void setSpnCantidad(JSpinner spnCantidad) {
        this.spnCantidad = spnCantidad;
    }

    public void setLblAlertInic(JLabel lblAlertInic) {
        this.lblAlertInic = lblAlertInic;
    }

    public JPasswordField getTxtPass() {
        return txtNombreM;
    }

    public void setTxtPass(JPasswordField txtPass) {
        this.txtNombreM = txtPass;
    }

    public JTextField getTxtUser() {
        return txtIdM;
    }

    public void setTxtUser(JTextField txtUser) {
        this.txtIdM = txtUser;
    }

    public void setBtn_ValiRegUsu(JButton btn_ValiRegUsu) {
        this.btn_buscar = btn_ValiRegUsu;
    }

    public JButton getBtnBuscarP() {
        return btnBuscarP;
    }

    public void setBtnBuscarP(JButton btnBuscarP) {
        this.btnBuscarP = btnBuscarP;
    }

    public JButton getBtnBuscarP1() {
        return btnBuscarP1;
    }

    public void setBtnBuscarP1(JButton btnBuscarP1) {
        this.btnBuscarP1 = btnBuscarP1;
    }

    public JButton getBtnIngre1() {
        return btnIngre1;
    }

    public void setBtnIngre1(JButton btnIngre1) {
        this.btnIngre1 = btnIngre1;
    }

    public JButton getBtnPedido1() {
        return btnPedido1;
    }

    public void setBtnPedido1(JButton btnPedido1) {
        this.btnPedido1 = btnPedido1;
    }

    public JButton getBtnPedido2() {
        return btnPedido2;
    }

    public void setBtnPedido2(JButton btnPedido2) {
        this.btnPedido2 = btnPedido2;
    }

    public JButton getBtnRegPed() {
        return btnRegPed;
    }

    public void setBtnRegPed(JButton btnRegPed) {
        this.btnRegPed = btnRegPed;
    }

    public JButton getBtn_Eliminar() {
        return btn_Eliminar;
    }

    public void setBtn_Eliminar(JButton btn_Eliminar) {
        this.btn_Eliminar = btn_Eliminar;
    }

    public JButton getBtn_buscar() {
        return btn_buscar;
    }

    public void setBtn_buscar(JButton btn_buscar) {
        this.btn_buscar = btn_buscar;
    }

    public JComboBox<String> getCbxMedic() {
        return cbxMedic;
    }

    public void setCbxMedic(JComboBox<String> cbxMedic) {
        this.cbxMedic = cbxMedic;
    }

    public JComboBox<String> getCbxTipoM() {
        return cbxTipoM;
    }

    public void setCbxTipoM(JComboBox<String> cbxTipoM) {
        this.cbxTipoM = cbxTipoM;
    }

    public JComboBox<String> getCbxTipoM1() {
        return cbxTipoM1;
    }

    public void setCbxTipoM1(JComboBox<String> cbxTipoM1) {
        this.cbxTipoM1 = cbxTipoM1;
    }

    public JLabel getLblAlerElim() {
        return lblAlerElim;
    }

    public void setLblAlerElim(JLabel lblAlerElim) {
        this.lblAlerElim = lblAlerElim;
    }

    public JLabel getLblAlertInic1() {
        return lblAlertInic1;
    }

    public void setLblAlertInic1(JLabel lblAlertInic1) {
        this.lblAlertInic1 = lblAlertInic1;
    }

    public JLabel getLblDistr() {
        return lblDistr;
    }

    public void setLblDistr(JLabel lblDistr) {
        this.lblDistr = lblDistr;
    }

    public JLabel getLblMedi() {
        return lblMedi;
    }

    public void setLblMedi(JLabel lblMedi) {
        this.lblMedi = lblMedi;
    }

    public JLabel getLblSucursal() {
        return lblSucursal;
    }

    public void setLblSucursal(JLabel lblSucursal) {
        this.lblSucursal = lblSucursal;
    }

    public JLabel getLblTipoM() {
        return lblTipoM;
    }

    public void setLblTipoM(JLabel lblTipoM) {
        this.lblTipoM = lblTipoM;
    }

    public JPanel getPnlBuscar() {
        return pnlBuscar;
    }

    public void setPnlBuscar(JPanel pnlBuscar) {
        this.pnlBuscar = pnlBuscar;
    }

    public JPanel getPnlCrear() {
        return pnlCrear;
    }

    public void setPnlCrear(JPanel pnlCrear) {
        this.pnlCrear = pnlCrear;
    }

    public JPanel getPnlPedido() {
        return pnlPedido;
    }

    public void setPnlPedido(JPanel pnlPedido) {
        this.pnlPedido = pnlPedido;
    }

    public JPanel getPnlVistaPedido() {
        return pnlVistaPedido;
    }

    public void setPnlVistaPedido(JPanel pnlVistaPedido) {
        this.pnlVistaPedido = pnlVistaPedido;
    }

    public JPasswordField getTxtDescM() {
        return txtDescM;
    }

    public void setTxtDescM(JPasswordField txtDescM) {
        this.txtDescM = txtDescM;
    }

    public JPasswordField getTxtDescM1() {
        return txtDescM1;
    }

    public void setTxtDescM1(JPasswordField txtDescM1) {
        this.txtDescM1 = txtDescM1;
    }

    public JTextField getTxtIdM() {
        return txtIdM;
    }

    public void setTxtIdM(JTextField txtIdM) {
        this.txtIdM = txtIdM;
    }

    public JTextField getTxtIdM1() {
        return txtIdM1;
    }

    public void setTxtIdM1(JTextField txtIdM1) {
        this.txtIdM1 = txtIdM1;
    }

    public JPasswordField getTxtNombreM() {
        return txtNombreM;
    }

    public void setTxtNombreM(JPasswordField txtNombreM) {
        this.txtNombreM = txtNombreM;
    }

    public JPasswordField getTxtNombreM1() {
        return txtNombreM1;
    }

    public void setTxtNombreM1(JPasswordField txtNombreM1) {
        this.txtNombreM1 = txtNombreM1;
    }

    public JPanel getPnlOperaciones() {
        return pnlPedido;
    }

    public void setPnlOperaciones(JPanel pnlOperaciones) {
        this.pnlPedido = pnlOperaciones;
    }

    public JPanel getPnlRegistro() {
        return pnlBuscar;
    }

    public void setPnlRegistro(JPanel pnlRegistro) {
        this.pnlBuscar = pnlRegistro;
    }

    public JButton getBtnRegUsu() {
        return btnBuscarP;
    }

    public void setBtnRegUsu(JButton btnRegUsu) {
        this.btnBuscarP = btnRegUsu;
    }

    public JPanel getPnlInicio() {
        return pnlCrear;
    }

    public void setPnlInicio(JPanel pnlInicio) {
        this.pnlCrear = pnlInicio;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarP;
    private javax.swing.JButton btnBuscarP1;
    private javax.swing.JButton btnIngre;
    private javax.swing.JButton btnIngre1;
    private javax.swing.JButton btnPedido1;
    private javax.swing.JButton btnPedido2;
    private javax.swing.JButton btnRegPed;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_volverP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbxMedic;
    private javax.swing.JComboBox<String> cbxTipoM;
    private javax.swing.JComboBox<String> cbxTipoM1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAlerElim;
    private javax.swing.JLabel lblAlertInic;
    private javax.swing.JLabel lblAlertInic1;
    private javax.swing.JLabel lblAlertOpeSal;
    private javax.swing.JLabel lblAlertOpeUsu;
    private javax.swing.JLabel lblAlertOpera;
    private javax.swing.JLabel lblDistr;
    private javax.swing.JLabel lblMedi;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JLabel lblTipoM;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlCrear;
    private javax.swing.JPanel pnlPedido;
    private javax.swing.JPanel pnlVistaPedido;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JPasswordField txtDescM;
    private javax.swing.JPasswordField txtDescM1;
    private javax.swing.JTextField txtIdM;
    private javax.swing.JTextField txtIdM1;
    private javax.swing.JPasswordField txtNombreM;
    private javax.swing.JPasswordField txtNombreM1;
    private javax.swing.JTextField txtUserReg;
    // End of variables declaration//GEN-END:variables
}
