package srdplas.dispositivo;

public class PruebaDIspositivo {

	public static void main(String[] args) {
		Raton r = new Raton();
		Teclado t = new Teclado();
		Pantalla p = new Pantalla();
		Impresora i = new Impresora();
		Entrada e = t;
		Dispositivo d = p;
		
		Entrada ent = r;
		Dispositivo dis = e;
		//Salida sal = t; //teclado es de entrada no de salida
		//Impresora imp = (Impresora) t; //impresora no es entrada sino entradaSalida y casting en horizontal no se puede
		EntradaSalida es = i;
		Salida s = (Salida) d;
		//Pantalla pant = d; //uppdercasting pierde informacion
		//Teclado tec = e;//uppdercasting pierde informacion
		//Raton rat = (Raton) t;//raton no puede ser teclado, no se puede hacer casting en horizontal
		
	}

}
