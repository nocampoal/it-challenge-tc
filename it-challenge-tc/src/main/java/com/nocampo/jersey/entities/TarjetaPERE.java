package main.java.com.nocampo.jersey.entities;

import java.util.Calendar;
import java.util.Date;

public class TarjetaPERE extends Tarjeta{

	
	
	public TarjetaPERE(String marca, String numero, String cardholder,Date fechaVencimiento) {
			super(marca,numero,cardholder,fechaVencimiento);
	}
	
	@Override
	public Double getTasaPorServicio() {
		// tasa PERE  = mes*0.1
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		return month * 0.1;
	}
	
}
