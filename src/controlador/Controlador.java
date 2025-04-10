/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.*;

/**
 *
 * @author rober
 */
public class Controlador {
    public void registrarEmp(Empleado p){
        CRUDEmpleado cr=new CRUDEmpleado();
        cr.registrar(p);
    }
}
