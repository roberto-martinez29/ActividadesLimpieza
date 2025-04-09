/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rober
 */
public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String paterno;
    private String materno;
    private int numCuadrilla; 
    private int esJefe;

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getNumCuadrilla() {
        return numCuadrilla;
    }

    public void setNumCuadrilla(int idCuadrilla) {
        this.numCuadrilla = idCuadrilla;
    }

    public int getEsJefe() {
        return esJefe;
    }

    public void setEsJefe(int esJefe) {
        this.esJefe = esJefe;
    }
    
}
