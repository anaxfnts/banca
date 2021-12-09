package Banca;

import java.util.Scanner;


public class CuentaCorriente {
	
	Scanner sc = new Scanner (System.in);

//	Clase "CuentaCorriente" con los atributos: numeroCuenta, saldo, titular
	private int numeroCuenta;
	private double saldo;
	private String titular;
	

//Constructores
	

//Getters y Setters
	public int getNumeroCuenta() {
		return numeroCuenta;
	}


	/**
 * @param numeroCuenta
 * @param titular
 */
public CuentaCorriente(int numeroCuenta, String titular) {
	super();
	this.numeroCuenta = numeroCuenta;
	this.titular = titular;
	this.saldo=0;
}


	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Métodos
	public void sumarCantidad (double cantidad) {
		this.saldo= this.saldo + cantidad;
	}
	
	public void restarCantidad (double cantidad) {
		this.saldo= this.saldo - cantidad;
	}
	
	
	//To String

	@Override
	public String toString() {
		return "CuentaCorriente [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
	}

	
}
