package srdplas.u6.e5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebaInsert {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			conn = MariaDbConection.getConnection();
			st = conn.createStatement();
			
			int numFilas = st.executeUpdate("update inventories set quantity = quantity+10;");
			System.out.println("Filas afectadas " + numFilas);
			//COMENTAR EL SIGUIENTE CODIGO PARA QUE HAGA LOS CAMBIOS Y LOS REVIERTA PARA DEJAR LA BBDD COMO ESTABA
			numFilas = st.executeUpdate("update inventories set quantity = quantity-10;");
	
		} catch (SQLException e) {
			System.out.println("Se ha producido una excepcion en la conexion a la BD");
			System.out.println(e);
		} finally {
			try {
				if(rs!=null)
					rs.close();
				
				MariaDbConection.close(conn);
				MariaDbConection.close(st);
				

			} catch (SQLException e) {
				System.out.println("Se produjo una excepcion al cerrar la conexion a BD");
				System.out.println(e);
			}
		}

		
	}

}
