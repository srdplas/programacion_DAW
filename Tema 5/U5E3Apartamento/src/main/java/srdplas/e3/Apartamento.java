package srdplas.e3;

public class Apartamento {
	private int numHabitaciones, numCamas;
	private boolean ocupado;
	private String direccionPostal;

	public Apartamento(String direccionPostal, int numHabitaciones, int numCamas, boolean ocupado) throws Exception {
		
		this.direccionPostal = direccionPostal;
		this.numHabitaciones = numHabitaciones;
		this.numCamas = numCamas;
		this.ocupado = ocupado;
		
		if(direccionPostal==null||numCamas==0||numHabitaciones==0) {
			throw new NullPointerException("NO PUEDE HABER VALORES NULOS");
		
		}
		if(!(numCamas>0&&numCamas<10)||!(numHabitaciones>0&&numHabitaciones<10)) {
			
			throw new IllegalArgumentException("SE HAN INTRODUCIDO VALORES NO REALES");
		}
		
	}
	
	public void ocupar() {
		if(ocupado==true)
			throw new IllegalStateException("ERROR EL APARTAMENTO YA ESTABA  OCUPADO");
			
		ocupado=true;
	}

	public void liberar() {
		if(ocupado==false)
			throw new IllegalStateException("ERROR EL APARTAMENTO YA ESTABA  LIBRE");
			
		ocupado=false;
	}
}
