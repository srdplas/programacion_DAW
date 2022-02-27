package srdplas.e1;

public class PruebaTeclado {

	public static void main(String[] args) {
		Teclado t = new Teclado();
		
//		int lee=t.leeEntero(); //NUMERO ENTERO
//		int lee2=t.leeEntero(1, 4); //NUMERO ENTERO PERO ENTRE UN MINIMO Y MAXIMO
//		int lee3=t.leeEnteroMax(11);
//		int lee4=t.leeEnteroMin(4);
		
		int lee5=t.leerBinario();
		int lee6=t.leerHexadecimal();
		int lee7=t.leerOctal();

	}

}
