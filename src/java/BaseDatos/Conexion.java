/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author daniel
 */
public class Conexion {
    protected  Connection con= null;
    public Statement sentencia;
    public ResultSet resultado;
    public void conexionbd(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/zoologico","root","1234");
            sentencia=con.createStatement();
            if (con!= null){
                System.out.println("exito");
            }
        }catch(SQLException ex){
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "error ");
            System.exit(1);            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void desconectarBaseDeDatos(){
        try{
            if(con !=null){
                if(sentencia!=null){
                    sentencia.close();
                }   
                con.close();
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
