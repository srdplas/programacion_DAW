package srdplas.e6.e2;

import java.sql.*;

public class PruebaBaseDatosCountries {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = MariaDbConection.getconConnection();
			st = conn.createStatement();
			rs = st.executeQuery("Select * from countries");
			while(rs.next()) {
				String country_id = rs.getString(1);
				String country_name = rs.getString(2);
				Integer region_id = rs.getInt(3);
				System.out.println("Country_ID: "+country_id+", Country_Name: "+country_name+", Region_ID: "+region_id);
			}
			
			
		}catch (SQLException e) {
			System.out.println("Se produjo una excepcion en la conexion a la BBDD");
			System.out.println(e);
		}finally {
			try {
				if(st!=null)
					st.close();
				if(rs!=null)
					rs.close();
				MariaDbConection.close(conn);
				
				
			}catch (SQLException e) {
				System.out.println("Se produjo una excepcion al cerrar la BBDD");
				System.out.println(e);
			}
		}
		

	}

}
