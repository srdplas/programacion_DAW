package srdplas.e4;

import javax.security.auth.login.AccountException;

public class CuentaCorriente {
	private Integer codigo;
	private double saldo;
	private String pin;

	public CuentaCorriente(Integer codigo, double saldo, String pin) {
		this.codigo = codigo;
		this.saldo = saldo;
		this.pin = pin;
		
		
		if (pin == null)
			throw new NullPointerException("ERROR NO ES POSIBLE UN PIN NULO");
		
		if (pin.length() > 4 || pin.length() < 0)
			throw new IllegalArgumentException("ERROR EN EL TAMANIO DEL PIN");
		
		if (codigo < 0 || codigo >9999)
			throw new IllegalArgumentException("ERROR EN EL CODIGO INTRODUCIDO");
		
		if (saldo <= 0)
			throw new IllegalArgumentException("ERROR SALDO NEGATIVO");
	}

	public double consultaSaldo() {
		return this.saldo;
	}

	public boolean intentaAccesoConPin(String pin) {
		if (pin.equals(this.pin))
			return true;

		return false;
	}

	public Integer getNumeroCuenta() {
		return this.codigo;
	}

	public void ingresa(double importe) {
		if (0 >= importe)
			throw new IllegalArgumentException("ERROR IMPORTE INGRESO NEGATIVO O INCORRECTO");
		else
			this.saldo += importe;

	}

	public void abona(double importe) {
		if (importe <= 0)
			throw new IllegalArgumentException("ERROR IMPORTE RETIRO NEGATIVO O INCORRECTO");

		if (importe > this.saldo)
			throw new IndexOutOfBoundsException("ERROR SALDO INSUFICIENTE PARA RETIRAR DE LA CUENTA");
		this.saldo-=importe;
	}

}
