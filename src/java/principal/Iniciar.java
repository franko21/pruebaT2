/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import control.Control;
import sw.Distribuidor;
import sw.Medicamento;
import sw.Pedido;
import sw.Sucursal;
import sw.TipoMedicamento;

import vista.Interfaz;

public class Iniciar {

    public static void main(String[] args) {

        Interfaz inter = new Interfaz();
        Pedido pedSW=new Pedido();
        Medicamento medSW=new Medicamento();
        TipoMedicamento tipoMSW=new TipoMedicamento();
        Sucursal sucSW=new Sucursal();
        Distribuidor disSW=new Distribuidor();
        Control cnt = new Control(inter,pedSW,medSW,tipoMSW,sucSW,disSW);

        cnt.iniciarControl();
    }
}
