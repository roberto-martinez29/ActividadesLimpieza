/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author rober
 */
public class Actividad {
    private int idActividad;
    private String descripcion;
    private int numCuadrilla;
    private String imagen;
    private int idLugar;

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumCuadrilla() {
        return numCuadrilla;
    }

    public void setNumCuadrilla(int numCuadrilla) {
        this.numCuadrilla = numCuadrilla;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }    

    public int getLugar() {
        return idLugar;
    }

    public void setLugar(int lugar) {
        this.idLugar = lugar;
    }
        
}
