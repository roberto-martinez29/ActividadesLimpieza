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
public class CRUDCuadrilla extends Conectar{
    public boolean registrar(Cuadrilla c){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="INSERT INTO cuadrilla (nombre) values(?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, c.getNombre());            
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
    public boolean actualizar(int id, Cuadrilla c){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="UPDATE cuadrilla SET nombre=? where numCuadrilla=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, c.getNombre());            
            ps.setInt(2, id);    
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
        String sql="DELETE FROM cuadrilla where numCuadrilla=?";
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
    public Cuadrilla buscar(int id){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="SELECT * FROM cuadrilla WHERE numCuadrilla = ?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            Cuadrilla c=new Cuadrilla();
            if(rs.next()){
                c=new Cuadrilla();
                c.setNumCuadrilla(id);
                c.setNombre(rs.getString(2));
            }            
            return c;
        }
        catch (Exception e){
            System.err.println(e);
            Cuadrilla c=new Cuadrilla();
            return c;
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
    public ArrayList<Cuadrilla> lista(){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="SELECT * FROM cuadrilla";
        try {
            ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery(sql);
            Cuadrilla c=new Cuadrilla();
            ArrayList<Cuadrilla> lista=new ArrayList();
            while(rs.next()){
                c.setNumCuadrilla(rs.getInt(1));
                c.setNombre(rs.getString(2));                
                lista.add(c);
            }
            return lista;
        }
        catch (Exception e){
            ArrayList<Cuadrilla> lista=new ArrayList();
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
