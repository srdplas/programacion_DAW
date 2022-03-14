package srdplas.u6.e3;

import java.sql.*;

public class PruebaConexionBD {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = MariaDbConection.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("Select country_name, region_name from countries natural join regions group by country_name order by country_name asc;");
			
			while(rs.next()) {
				String country_name = rs.getString(1);
				String region_name = rs.getString(2);
				System.out.println("Pais_Nombre: "+country_name+", Region_Nombre: "+region_name);
			}
			
		}catch (SQLException e) {
			System.out.println("Se ha producido una excepcion con la conexion a la BD");
		}finally {
			try {
				if(st!=null)
					st.close();
				
				if(rs!=null)
					rs.close();
				
				MariaDbConection.close(conn);
					}catch (SQLException e) {
						System.out.println("Se produjo una excepcion al cerrar la Conexion a la BD");
						System.out.println(e);
					}
		}
		
		
	}

}
