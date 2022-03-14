package srdplas.e6.e2;
import java.sql.*;
public class MariaDbConection {
	
	public static Connection getconConnection() throws SQLException{
		final String usuario = "company";
		final String contrasenia= "company";
		final String baseDatos = "company_db";
		final String BaseDatosUrl = "jdbc:mariadb://localhost:3306/"+baseDatos;
		Connection conexion = null;
		
		conexion = DriverManager.getConnection(BaseDatosUrl, usuario, contrasenia);
		return conexion;
	}
	
	public static void close(Connection conn) throws SQLException{
		if(conn!=null)
			conn.close();
	}
	

}
