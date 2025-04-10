/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author rober
 */
public class CRUDUsuario extends Conectar{
    public boolean buscar(String username, String password){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql="SELECT * FROM usuario WHERE username=? AND password=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs=ps.executeQuery();            
            if(rs.next()){
                return true;
            }            
            else{
                return false;
            }
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
}
