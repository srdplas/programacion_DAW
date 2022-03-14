package srdplas.u6.e1;

import java.sql.*;

public class PruebaBaseDatosRegiones {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			conn = MariaDbConection.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("Select * from regions");
			
			while(rs.next()) {
				Integer id_region = rs.getInt(1);
				String nombre_region = rs.getString(2);
				System.out.println("ID_Region: "+id_region+", Nombre_Region: "+nombre_region);
			}
			
		}catch (SQLException e) {
			System.out.println("Ocurrió una excepcion a la hora de conectar con la BBDD");
			System.out.println(e);
		}finally {
			try {
				if(st!=null)
					st.close();
					
					if(rs!=null)
						rs.close();
					
					MariaDbConection.close(conn);
			}catch (SQLException e) {
				System.out.println("Ocurrió una excepción al cerrar la BBDD");
			}
		}
		
	}

}
