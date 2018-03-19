package main.java.com.nocampo.jersey.entities;

import java.util.Calendar;
import java.util.Date;

public class TarjetaSQUA extends Tarjeta{
	
	
	public TarjetaSQUA(String marca, String numero, String cardholder,Date fechaVencimiento) {
		super(marca,numero,cardholder,fechaVencimiento);
	}
	
	@Override
	public Double getTasaPorServicio() {
		//  Tasa SQUA = año / mes

		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);
		return (double) (year / month);
	}
	
	
	

}
