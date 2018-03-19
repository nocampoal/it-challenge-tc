/**
 * 
 */
package main.java.com.nocampo.jersey.service;

import main.java.com.nocampo.jersey.entities.Tarjeta;
import main.java.com.nocampo.jersey.entities.TarjetaPERE;
import main.java.com.nocampo.jersey.entities.TarjetaSCO;
import main.java.com.nocampo.jersey.entities.TarjetaSQUA;

/**
 * @author nocampo
 *
 */
public class OperationRateServiceImpl implements OperationRateService{

	@Override
	public Double getOperationRate(String marcaTarjeta) throws Exception {
		Tarjeta tarjeta = null;
		if(marcaTarjeta.equalsIgnoreCase("PERE")){
			tarjeta = new TarjetaPERE();
		}else if(marcaTarjeta.equalsIgnoreCase("SQUA")){
			tarjeta = new TarjetaSQUA();
		}else if(marcaTarjeta.equalsIgnoreCase("SCO")){
			tarjeta = new TarjetaSCO();
		}else{
			throw new Exception();
		}
		
		return tarjeta.getTasaPorServicio();
	}

}
