package srdplas.u6.e1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDbConection {
	
	public static Connection getConnection () throws SQLException{
		
		final String usuario="company";
		final String contrasenia="company";
		final String base_datos="company_db";
		final String url_conexion="jdbc:mariadb://localhost:3306/"+base_datos;
		
		Connection conexion = null;
		
		conexion = DriverManager.getConnection(url_conexion, usuario, contrasenia);
		return conexion;
		
	}
	
	public static void close (Connection conexion) throws SQLException{
		if(conexion!=null) {
			conexion.close();
		}
	}

}
