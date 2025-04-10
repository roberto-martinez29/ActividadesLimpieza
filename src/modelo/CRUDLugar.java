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
public class CRUDLugar extends Conectar{
    public boolean registrar(Lugar em){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="INSERT INTO lugar (descripcion) values(?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getDescripcion());           
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
    public boolean actualizar(int id, Lugar em){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="UPDATE lugar SET descripcion=? where idLugar=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getDescripcion());
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
        String sql="DELETE FROM lugar where idLugar=?";
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
    public Lugar buscar(int id){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="SELECT * FROM lugar WHERE idLugar = ?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            Lugar em=new Lugar();
            if(rs.next()){
                em=new Lugar();
                em.setIdLugar(id);
                em.setDescripcion(rs.getString(2));
            }            
            return em;
        }
        catch (Exception e){
            System.err.println(e);
            Lugar em=new Lugar();
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
    public ArrayList<Lugar> lista(){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="SELECT * FROM lugar";
        try {
            ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery(sql);
            Lugar em=new Lugar();
            ArrayList<Lugar> lista=new ArrayList();
            while(rs.next()){
                em.setIdLugar(rs.getInt(1));
                em.setDescripcion(rs.getString(2));
                lista.add(em);
            }
            return lista;
        }
        catch (Exception e){
            ArrayList<Lugar> lista=new ArrayList();
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
