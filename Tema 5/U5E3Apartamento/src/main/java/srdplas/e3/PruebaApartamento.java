package srdplas.e3;

public class PruebaApartamento {

	public static void main(String[] args) throws Exception {
		
		
		try {
			Apartamento a = new Apartamento(null, 2, 2, false);
			
		} catch (Exception e) {
			
			System.out.println(e.toString());
		}

		Apartamento a4 = new Apartamento("Caamas", 2, 2, false);

		try {
			Apartamento a2 = new Apartamento("tomares", 2, 900, true);
			
		} catch (Exception e) {
			
			System.out.println(e.toString());

		}

		try {
			Apartamento a3 = new Apartamento("san juan", -2, 6, true);
			
		} catch (Exception e) {

			System.out.println(e.toString());
		}
		
		try {
			a4.liberar();
			
		}catch(Exception e){
			
			System.out.println(e.toString());
		}
		
		a4.ocupar();
		
		try {
			a4.ocupar();
			
		}catch(Exception e){
			
			System.out.println(e.toString());
		}
		
		try {
			Apartamento a5 = new Apartamento(null, 0, 0, false);
			
		}catch(Exception e) {
			
			System.out.println(e.toString());
		}

	}

}
