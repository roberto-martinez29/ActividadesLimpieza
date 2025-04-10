/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class CRUDEmpleado extends Conectar{
    public boolean registrar(Empleado em){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="INSERT INTO actividadeslimpieza.empleado (nombre,paterno,materno,numCuadrilla,esJefe) values(?,?,?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getNombre());
            ps.setString(2, em.getPaterno());
            ps.setString(3, em.getMaterno());
            ps.setInt(4, em.getNumCuadrilla());
            ps.setInt(5, em.getEsJefe());
            ps.execute();
            return true;
        }
        catch (Exception e){
            System.err.println(e);
            return false;
        }
        finally {
            try {
                con.close();

            }
            catch (SQLException e){
                System.err.println(e);
            }
        }
    }
    public boolean actualizar(int id, Empleado em){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="UPDATE empleado SET nombre=?, paterno=?,materno=?,numCuadrilla=?,esJefe=? where idEmpleado=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getNombre());
            ps.setString(2, em.getPaterno());
            ps.setString(3, em.getMaterno());
            ps.setInt(4, em.getNumCuadrilla());
            ps.setInt(5, em.getEsJefe());
            ps.setInt(6, id);
            ps.execute();
            return true;
        }
        catch (Exception e){
            System.err.println(e);
            return false;
        }
        finally {
            try {
                con.close();

            }
            catch (SQLException e){
                System.err.println(e);
            }
        }

    }
    public boolean eliminar(int id){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="DELETE FROM empelado where idEmpleado=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        }
        catch (Exception e){
            System.err.println(e);
            return false;
        }
        finally {
            try {
                con.close();

            }
            catch (SQLException e){
                System.err.println(e);
            }
        }

    }
    public Empleado buscar(int id){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="SELECT * FROM empleado WHERE idEmpleado = ?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            Empleado em=new Empleado();
            if(rs.next()){
                em=new Empleado();
                em.setIdEmpleado(rs.getInt(1));
                em.setNombre(rs.getString(2));
                em.setPaterno(rs.getString(3));
                em.setMaterno(rs.getString(4));
                em.setNumCuadrilla(rs.getInt(5));
                em.setEsJefe(rs.getInt(5));
            }            
            return em;
        }
        catch (Exception e){
            System.err.println(e);
            Empleado em=new Empleado();
            return em;
        }
        finally {
            try {
                con.close();

            }
            catch (SQLException e){
                System.err.println(e);
            }
        }

    }
    public ArrayList<Empleado> lista(){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="SELECT * FROM empleado";
        try {
            ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery(sql);
            Empleado em=new Empleado();
            ArrayList<Empleado> lista=new ArrayList();
            while(rs.next()){
                em.setIdEmpleado(rs.getInt(1));
                em.setNombre(rs.getString(2));
                em.setPaterno(rs.getString(3));
                em.setMaterno(rs.getString(4));
                em.setNumCuadrilla(rs.getInt(5));
                em.setEsJefe(rs.getInt(5));
                lista.add(em);
            }
            return lista;
        }
        catch (Exception e){
            ArrayList<Empleado> lista=new ArrayList();
            return lista;
        }
        finally {
            try {
                con.close();

            }
            catch (SQLException e){
                System.err.println(e);
            }
        }
    }
}
