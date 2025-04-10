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
    public void actualizarEmp(int id, Empleado e){
        CRUDEmpleado cr=new CRUDEmpleado();
        cr.actualizar(id,e);
    }
    public void eliminarEmp(int id){
        CRUDEmpleado cr=new CRUDEmpleado();
        cr.eliminar(id);
    }
    public Empleado buscarEmp(int id){
        CRUDEmpleado cr=new CRUDEmpleado();
        return cr.buscar(id);
    }
    public void registrarCuadrilla(Cuadrilla c){
        CRUDCuadrilla cr=new CRUDCuadrilla();
        cr.registrar(c);
    }
    public void actualizarCuadrilla(int id, Cuadrilla c){
        CRUDCuadrilla cr=new CRUDCuadrilla();
        cr.actualizar(id,c);
    }
    public void eliminarCuadrilla(int id){
        CRUDCuadrilla cr=new CRUDCuadrilla();
        cr.eliminar(id);
    }
    public Cuadrilla buscarCuadrilla(int id){
        CRUDCuadrilla cr=new CRUDCuadrilla();
        return cr.buscar(id);
    }
    public void registrarAct(Actividad p){
        CRUDActividad cr=new CRUDActividad();
        cr.registrar(p);
    }
    public void actualizarAct(int id, Actividad e){
        CRUDActividad cr=new CRUDActividad();
        cr.actualizar(id,e);
    }
    public void eliminarAct(int id){
        CRUDActividad cr=new CRUDActividad();
        cr.eliminar(id);
    }
    public Actividad buscarAct(int id){
        CRUDActividad cr=new CRUDActividad();
        return cr.buscar(id);
    }
    public void registrarLugar(Lugar p){
        CRUDLugar cr=new CRUDLugar();
        cr.registrar(p);
    }
    public void actualizarLugar(int id, Lugar e){
        CRUDLugar cr=new CRUDLugar();
        cr.actualizar(id,e);
    }
    public void eliminarLugar(int id){
        CRUDLugar cr=new CRUDLugar();
        cr.eliminar(id);
    }
    public Lugar buscarLugar(int id){
        CRUDLugar cr=new CRUDLugar();
        return cr.buscar(id);
    }
}
