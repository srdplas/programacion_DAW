package srdplas.u6.e6;
import java.sql.*;
public class MariaDbConection {
	
	public static Connection getConnection() throws SQLException{
		final String usuario ="company";
		final String contrasenia ="company";
		final String BaseDatos ="company_db";
		final String BaseDatosUrl ="jdbc:mariadb://localhost:3306/"+BaseDatos;

		Connection conexion = null;
		conexion = DriverManager.getConnection(BaseDatosUrl, usuario, contrasenia);
		
		return conexion;
	}
	

	public static void close(Connection conn)throws SQLException{
		if(conn!=null) {
			conn.close();
		}
	}
	
	public static void close(Statement st)throws SQLException{
		if(st!=null) {
			st.close();
		}
	}
	
	
	
}
