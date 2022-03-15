package srdplas.u6.e6;

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
			
			int numFilas = st.executeUpdate("delete from inventories where warehouse_id in(select warehouse_id from warehouses where warehouse_name like 'Mexico City') and product_id in "
					+ "(select product_id from products where category_id in "
					+ "(select category_id from product_categories where category_name like 'CPU'));");
			System.out.println("Borrando CPUs de Mexico City ");
			System.out.print("Filas afectadas " + numFilas);

	
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
