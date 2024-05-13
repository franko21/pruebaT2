/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;
import sw.Distribuidor;
import sw.Medicamento;
//import sw.Operacion;
//import sw.TransaccionSW;
//import sw.TransaccionSW_Service;
//import sw.Usuario;
import sw.OperacionesWS;
import sw.OperacionesWS_Service;
import sw.Pedido;
import sw.Sucursal;
import sw.TipoMedicamento;
import vista.Interfaz;

/**
 *
 * @author Henry
 */
public class Control {

    private Interfaz vInter;

    private OperacionesWS_Service servicio=new OperacionesWS_Service();
    private OperacionesWS trans=servicio.getOperacionesWSPort();
    private Pedido pedSW;
    private Medicamento medSW;
    private TipoMedicamento tipoMSW;
    private Sucursal sucSW;
    private Distribuidor disSW;
//    private TransaccionSW_Service servicio = new TransaccionSW_Service();
//    private TransaccionSW trans = servicio.getTransaccionSWPort();
//    private Usuario usuSW;
//    private Operacion opeSW;

//    public Control(Interfaz vInter, Usuario usuSW, Operacion opeSW) {
//        this.opeSW = opeSW;
//        this.usuSW = usuSW;
//        this.vInter = vInter;
//
//        vInter.setVisible(true);
//        referenciarObjetos();
//    }
    public Control(Interfaz vInter, Pedido pedSW, Medicamento medSW,TipoMedicamento tipoMSW,Sucursal sucSW,Distribuidor disSW) {
        this.pedSW=pedSW;
        this.medSW=medSW;
        this.tipoMSW=tipoMSW;
        this.sucSW=sucSW;
        this.disSW=disSW;
        this.vInter = vInter;

        vInter.setVisible(true);
        referenciarObjetos();
    }

    public void iniciarControl() {
        //vInter.getBtnRegUsu().addActionListener(l -> irPanelRegistro());
        
        vInter.getBtnBuscarP().addActionListener(l->irPanelBuscar());
//        vInter.getBtn_ValiRegUsu().addActionListener(l -> verificarRegistro());
//        vInter.getBtnIngre().addActionListener(l -> login());
//        vInter.getBtnRegOpe().addActionListener(l -> registrarOperaciones());
        vInter.getBtnSalir().addActionListener(l->irPanelBuscar());
        vInter.getBtn_crear().addActionListener(l->irPanelRegistro());
        vInter.getBtn_volverP().addActionListener(l->referenciarObjetos());
        
    }

    private void referenciarObjetos() {//Pedido
        vInter.getPnlRegistro().setVisible(false);//Biscar
        vInter.getPnlOperaciones().setVisible(true);//Pedido
        vInter.getLblAlertInic().setVisible(false);
        vInter.getPnlInicio().setVisible(false);//crearP
        vInter.getPnlVistaPedido().setVisible(false);
    }

    private void irPanelRegistro() {//crear
        vInter.getPnlRegistro().setVisible(false);//Biscar
        vInter.getPnlOperaciones().setVisible(false);//Pedido
        vInter.getLblAlertInic().setVisible(false);
        vInter.getPnlInicio().setVisible(true);//crearP
        vInter.getPnlVistaPedido().setVisible(false);

    }

    private void irPanelBuscar() {//Buscar
         vInter.getPnlRegistro().setVisible(true);//Biscar
        vInter.getPnlOperaciones().setVisible(false);//Pedido
        vInter.getLblAlertInic().setVisible(false);
        vInter.getPnlInicio().setVisible(false);//crearP
        vInter.getPnlVistaPedido().setVisible(false);

    }

    private void irPanelOperaciones() {//VistaPedido
         vInter.getPnlRegistro().setVisible(false);//Biscar
        vInter.getPnlOperaciones().setVisible(false);//Pedido
        vInter.getLblAlertInic().setVisible(false);
        vInter.getPnlInicio().setVisible(false);//crearP
        vInter.getPnlVistaPedido().setVisible(true);
    }
    
    private void crearM(){
        int id=0;
        String nomnre="";
        String des="";
        int tipoM=0;
        
    }
    

//    private void verificarRegistro() {
//        String usuario = "";
//        String pass = "";
//        String pass2 = "";
//
//        usuario = vInter.getTxtUserReg().getText().trim();
//        pass = vInter.getTxtPassReg().getText().trim();
//        pass2 = vInter.getTxtPass2Reg().getText().trim();
//
//        if (usuario.equals("") || pass.equals("") || pass2.equals("")) {
//            JOptionPane.showMessageDialog(null, "Llene todos los campos");
//
//        } else {
//            if (pass.equals(pass2)) {
//                usuSW.setNombre(usuario);
//                usuSW.setClave(pass2);
//                usuSW.setSaldo(100);
//
//                if (trans.registrar(usuSW)) {
//
//                    vInter.getLblAlerReg().setVisible(true);
//                    Timer timer = new Timer();
//                    timer.schedule(new TimerTask() {
//                        @Override
//                        public void run() {
//
//                            irPanelInicio();
//                        }
//                    }, 1500);
//
//                } else {
//                    JOptionPane.showMessageDialog(null, "Error al registrar");
//                }
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
//            }
//
//        }
//
//    }
//
//    private void login() {
//        vInter.getLblAlertInic().setVisible(false);
//        String user = "";
//
//        user = vInter.getTxtUser().getText().trim();
//        char clave[] = vInter.getTxtPass().getPassword();
//        String clavedef = new String(clave);
//        usuSW.setNombre(user);
//        usuSW.setClave(clavedef);
//
//        usuSW = trans.logeo(usuSW);
//
//        if (usuSW.getNombre() == null) {
//
//            vInter.getLblAlertInic().setVisible(true);
//        } else {
//
//            irPanelOperaciones();
//        }
//    }
//
//    private void registrarOperaciones() {
//        int saldo = Integer.parseInt(vInter.getSpnCantidad().getValue().toString());
//        if (vInter.getRdbRetiro().isSelected()) {
//            opeSW.setSaldo(saldo);
//            opeSW.setUsuario(usuSW.getNombre());
//
//            opeSW = trans.retirar(opeSW);
//      
//
//            if (opeSW.isExito()) {
//                vInter.getLblAlertOpera().setText("exito");
//                vInter.getLblAlertOpera().setForeground(Color.GREEN);
//                vInter.getLblAlertOpeSal().setText(opeSW.getSaldo() + "");
//            } else {
//                vInter.getLblAlertOpera().setText("Saldo insuficiente");
//                vInter.getLblAlertOpera().setForeground(Color.RED);
//            }
//        } else {
//            opeSW.setSaldo(saldo);
//            opeSW.setUsuario(usuSW.getNombre());
//            opeSW=trans.depositar(opeSW);
//             System.out.println(opeSW.getSaldo()+"Depo");
//            if(opeSW.isExito()){
//                vInter.getLblAlertOpera().setText("exito");
//                vInter.getLblAlertOpera().setForeground(Color.GREEN);
//                vInter.getLblAlertOpeSal().setText(opeSW.getSaldo() + "");
//            }else{
//                
//                JOptionPane.showMessageDialog(null, "error al depositar");
//            }
//        }
//
//    }
}
