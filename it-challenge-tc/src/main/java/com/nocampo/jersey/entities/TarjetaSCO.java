package main.java.com.nocampo.jersey.entities;

import java.util.Calendar;
import java.util.Date;

public class TarjetaSCO extends Tarjeta{
	
	
	
	public TarjetaSCO() {
	
	}

	public TarjetaSCO(String marca, String numero, String cardholder,Date fechaVencimiento) {
		super(marca,numero,cardholder,fechaVencimiento);
	}
	
	@Override
	public Double getTasaPorServicio() {
		// Tasa SCO    = dia del mes *0.5
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		return day * 0.5;
	}

}
