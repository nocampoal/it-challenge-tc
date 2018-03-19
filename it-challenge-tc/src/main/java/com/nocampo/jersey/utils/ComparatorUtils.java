/**
 * 
 */
package main.java.com.nocampo.jersey.utils;

import main.java.com.nocampo.jersey.entities.Tarjeta;

/**
 * @author nocampo
 *
 */
public class ComparatorUtils {
	
	public static boolean isDifferentTo(Tarjeta t1,Tarjeta t2){
		return (t1.getMarca().equals(t2) && t1.getNumero().equals(t2))?false:true;
	}

}
