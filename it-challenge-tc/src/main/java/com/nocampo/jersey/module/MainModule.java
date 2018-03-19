/**
 * 
 */
package main.java.com.nocampo.jersey.module;


import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import main.java.com.nocampo.jersey.entities.Operacion;
import main.java.com.nocampo.jersey.entities.Tarjeta;
import main.java.com.nocampo.jersey.entities.TarjetaPERE;
import main.java.com.nocampo.jersey.entities.TarjetaSQUA;
import main.java.com.nocampo.jersey.utils.ComparatorUtils;
import main.java.com.nocampo.jersey.utils.ValidatorUtils;

/**
 * @author nocampo
 *
 */
public class MainModule {

	/**
	 * @param args
	 */
	private static final Double SALDO_CONSUMIR = 550.0;
	private static final Double SALDO_MAXIMO_CONSUMIR = 1000.0;
	
	public static void main(String[] args) {
	
		Tarjeta tarjetaOperacion = new TarjetaPERE("PERE","000244558985", "PERE GOLD", new GregorianCalendar(2019,05,03).getTime());	
		Operacion operacion = new Operacion(tarjetaOperacion, SALDO_CONSUMIR);
		Tarjeta tarjeta = new TarjetaSQUA("SQUA", "556665656995", "SQUA PLATINUIM", new GregorianCalendar(2020,05,03).getTime());
		
		getCreditCardInformation(operacion.getTarjetaCredito());
		if(ValidatorUtils.isValidOperation(operacion.getSaldoConsumir(), SALDO_MAXIMO_CONSUMIR)){
			System.out.println("\n"+"Operacion v\u00e1lida");
		}else{
			System.out.println("\n"+"Operacion inv\u00e1lida");
			
		}
		
		if(ValidatorUtils.isValidCreditCard(tarjeta)){
			System.out.println("Tarjeta v\u00e1lida para operar.");
		}else{
			System.out.println("Tarjeta inv\u00e1lida para operar.");
		}
		
		
		if(ComparatorUtils.isDifferentTo(tarjetaOperacion, tarjeta)){
			System.out.println("Las tarjetas de la operacion son diferentes ("+tarjetaOperacion.getMarca()+" y "+tarjeta.getMarca()+")");
		}else{
			System.out.println("Las tarjetas de la operacion son iguales");
		}
		
		getTasaOperation(operacion);
	
	}

	
	/**
	 * 
	 * @param operacion
	 */
	private static void getTasaOperation(Operacion operacion) {
		System.out.println("\n"+"IMPORTE: "+operacion.getTarjetaCredito().getTasaPorServicio());
		System.out.println("MARCA: "+operacion.getTarjetaCredito().getMarca());
	}

	

	/**
	 * devuelve toda la informacion de la tarjeta
	 * @param tarjeta
	 */
	private static void getCreditCardInformation(Tarjeta tarjeta) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Marca: "+tarjeta.getMarca());
		System.out.println("Numero de tarjeta: "+tarjeta.getNumero());
		System.out.println("Cardholder: "+tarjeta.getCardholder());
		System.out.println("Fecha de vencimiento: "+format.format(tarjeta.getFechaVencimiento()));
	}
	

}
