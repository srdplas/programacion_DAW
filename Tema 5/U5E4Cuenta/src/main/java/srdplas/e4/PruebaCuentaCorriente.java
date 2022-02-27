package srdplas.e4;

public class PruebaCuentaCorriente {

	public static void main(String[] args) {

		try {
			CuentaCorriente c = new CuentaCorriente(1246, 200, null);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		try {
			CuentaCorriente c = new CuentaCorriente(-1222, 200, "12345");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		try {
			CuentaCorriente c = new CuentaCorriente(1426, -1, "1234");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		CuentaCorriente c = new CuentaCorriente(1426, 200, "1234");
		try {
			c.ingresa(-1);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		try {
			c.abona(0);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		try {
			c.abona(3000);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("\nNumero de la cuenta "+c.getNumeroCuenta());
		
		c.ingresa(200);
		c.abona(100);
		
		System.out.println("\nSaldo de la cuenta "+c.consultaSaldo()+" €");

	}

}
