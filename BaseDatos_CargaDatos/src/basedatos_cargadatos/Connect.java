/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos_cargadatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Nando
 */
public class Connect {
    Connection con;
    public Connect(){
        try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // el del video era: "com.mysql.jdbc.Driver"
	    final String dbName="db_fiestas_taurinas"; //el nombre de la base de datos
	    final String url="jdbc:mysql://localhost/"; //el del video era: "jdbc:mysql://localhost:3306/"
	    con=DriverManager.getConnection(url+dbName,"root","12345678");//el num es la contrasenia del mysql
	    
        } catch (Exception e) {
            System.err.println("Error:"+e);
        }      
    }
    public Connection getConnection(){
        return con;
    }
}
