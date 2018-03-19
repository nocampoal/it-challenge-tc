/**
 * 
 */
package main.java.com.nocampo.jersey.entities;

import java.util.Date;

/**
 * @author nocampo
 *
 */
public abstract class Tarjeta {
	protected String marca;
	protected String numero;
	protected String cardholder;
	protected Date fechaVencimiento;
	
		
	public Tarjeta() {
		
	}


	public Tarjeta(String marca, String numero, String cardholder,
			Date fechaVencimiento) {
		this.marca = marca;
		this.numero = numero;
		this.cardholder = cardholder;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCardholder() {
		return cardholder;
	}


	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}


	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}


	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}


	public abstract Double getTasaPorServicio();
	

}
