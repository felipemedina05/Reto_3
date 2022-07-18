
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Carlos
 */
public class Conexion {
	Connection connection;
	//attributes
	String driver ="com.mysql.cj.jdbc.Driver";
	//db access route
	String cadenaConexion= "jdbc:mysql://localhost:3306/reto1_g53_db";
	String usuario = "root";
	String contrasena = "";
       
	 // connection class
	public Conexion() {
		try{
			Class.forName(driver);
			connection = DriverManager.getConnection(cadenaConexion, usuario, contrasena);
			if (connection !=null ){
				System.out.println("Conexion exitosa");
			}
			
			
		}catch(ClassNotFoundException | SQLException e){
			System.out.println("No se pudo establecer conexion con la base datos");
			
		}
	}
	
	
	// get connection class 
	public Connection getConnection(){
		return connection;
	}
	
	
}
