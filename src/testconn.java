
import java.sql.Connection;
import modelo.Conectar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rober
 */
public class testconn {
    public static void main(String []args){
        Conectar con = new Conectar();
        Connection c= con.getConexion();
    }
}
