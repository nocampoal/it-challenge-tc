/**
 * 
 */
package main.java.com.nocampo.jersey.utils;

import java.util.Calendar;

import main.java.com.nocampo.jersey.entities.Tarjeta;



/**
 * @author nocampo
 *
 */
public class ValidatorUtils {
	
	/**
	 * informa si la operacion es valida a partir de 2 saldos.
	 * @param saldoConsumir
	 * @param SaldomaximoPermitido
	 * @return
	 */
	public static Boolean isValidOperation(Double saldoConsumir, Double SaldomaximoPermitido){
		return (Double.compare(saldoConsumir, SaldomaximoPermitido) < 0)?true:false;
	}
	
	/**
	 * verifica que la fecha de vencimiento sea posterior a lafecha actual.
	 * @param tarjeta
	 * @return
	 */
	public static Boolean isValidCreditCard(Tarjeta tarjeta){
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(tarjeta.getFechaVencimiento());
		
		return (c1.compareTo(c2) > 0)?true:false;
	}
		
	
}
