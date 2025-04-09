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
public class CRUDActividad extends Conectar{
    public boolean registrar(Actividad mat){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="INSERT INTO actividad (descripcion,numCuadrilla,imagen) values(?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, mat.getDescripcion());
            ps.setInt(2, mat.getNumCuadrilla());
            ps.setString(3, mat.getImagen());
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
    public boolean actualizar(int id, Actividad mat){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="UPDATE actividad SET descripcion=?,numCuadrilla=?,imagen=? where idActividad=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, mat.getDescripcion());
            ps.setInt(2, mat.getNumCuadrilla());            
            ps.setString(3, mat.getImagen());
            ps.setInt(4, id);    
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
        String sql="DELETE FROM actividad where idActividad=?";
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
    public Actividad buscar(int id){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="SELECT * FROM actividad WHERE idActividad = ?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            Actividad m=new Actividad();
            if(rs.next()){
                m=new Actividad();
                m.setIdActividad(rs.getInt(1));
                m.setDescripcion(rs.getString(2));
                m.setNumCuadrilla(rs.getInt(3));
                m.setImagen(rs.getString(4));
            }            
            return m;
        }
        catch (Exception e){
            System.err.println(e);
            Actividad m=new Actividad();
            return m;
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
    public ArrayList<Actividad> lista(){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="SELECT * FROM actividad";
        try {
            ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery(sql);
            Actividad m=new Actividad();
            ArrayList<Actividad> lista=new ArrayList();
            while(rs.next()){
                m.setIdActividad(rs.getInt(1));
                m.setDescripcion(rs.getString(2));
                m.setNumCuadrilla(rs.getInt(3));
                m.setImagen(rs.getString(4));
                lista.add(m);
            }
            return lista;
        }
        catch (Exception e){
            ArrayList<Actividad> lista=new ArrayList();
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
