package srdplas.u6.e4;

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
			
			try {//EXECUTAMOS ESTE TRY/CATCH PARA QUE BORRE SI EXISTEN LOS DATOS Y SI NO, QUE NO MUESTRE MENSAJE ALGUNO Y CONTINUE
				st.executeUpdate("delete from inventories where product_id=7 and warehouse_id=7");
				st.executeUpdate("delete from inventories where product_id=8 and warehouse_id=7");
				st.executeUpdate("delete from inventories where product_id=9 and warehouse_id=7");

			}catch (SQLException e) {
				
			}
			int numFilas = st.executeUpdate("insert into inventories values (7, 7, 10);");
			System.out.println("Filas afectadas " + numFilas);
			numFilas = 0;
			numFilas = st.executeUpdate("insert into inventories values (8, 7, 10);");
			System.out.println("Filas afectadas " + numFilas);
			numFilas = 0;
			numFilas = st.executeUpdate("insert into inventories values (9, 7, 10);");
			System.out.println("Filas afectadas " + numFilas);

			/*
			 * delete from inventories where product_id=7 and warehouse_id=7; 
			 * delete from inventories where product_id=8 and warehouse_id=7; 
			 * delete from inventories where product_id=9 and warehouse_id=7;
			 * 
			 * Borrar datos de la tabla para comprobaciones
			 */

			rs = st.executeQuery("Select product_name, warehouse_name,quantity  from inventories natural join warehouses natural join products "+
					"where (product_id=7 or product_id=8 or product_id=9) and "+ 
					"warehouse_id in(select warehouse_id from warehouses where warehouse_name like 'Mexico City')");
			System.out.println("\nConsulta al Inventario de la Tienda de Mexico\n");
			while(rs.next()) {
				String producto = rs.getString(1);
				String warehouse = rs.getString(2);
				Integer cantidad = rs.getInt(3);
				
				System.out.println("Producto: "+producto+", Tienda: "+warehouse+", Cantidad: "+cantidad);
			}
					
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
