/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class Cuadrilla {
    private int numCuadrilla;
    private String nombre;
    private ArrayList<Empleado> empleados=new ArrayList<Empleado>();

    public int getNumCuadrilla() {
        return numCuadrilla;
    }

    public void setNumCuadrilla(int numCuadrilla) {
        this.numCuadrilla = numCuadrilla;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    public void agregarEmpleado(Empleado e){
        empleados.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
