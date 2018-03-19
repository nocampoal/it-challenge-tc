package main.java.com.nocampo.jersey.entities;

import java.io.Serializable;

public class Operacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1629473175703168206L;
	private Tarjeta tarjetaCredito;
	private Double saldoConsumir;
	
	
	
	public Operacion() {
		
	}
	
	public Operacion(Tarjeta tarjetaCredito, Double saldoConsumir) {
		super();
		this.tarjetaCredito = tarjetaCredito;
		this.saldoConsumir = saldoConsumir;
	}
	public Tarjeta getTarjetaCredito() {
		return tarjetaCredito;
	}
	public void setTarjetaCredito(Tarjeta tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	public Double getSaldoConsumir() {
		return saldoConsumir;
	}
	public void setSaldoConsumir(Double saldoConsumir) {
		this.saldoConsumir = saldoConsumir;
	}
	
	
	

}
