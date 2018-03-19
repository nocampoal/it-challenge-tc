package main.java.com.nocampo.jersey.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import main.java.com.nocampo.jersey.service.OperationRateService;
import main.java.com.nocampo.jersey.service.OperationRateServiceImpl;

import org.json.JSONException;
import org.json.JSONObject;


@Path("/operationRate")
public class OperacionApi {

	
	@Path("{name}")
	@GET
	@Produces("application/json")
	public Response operationRate(@PathParam("name") String name)throws JSONException {
		
		OperationRateService service = new OperationRateServiceImpl();
		Double rate; 
		JSONObject json = new JSONObject();
		try{		
				rate = service.getOperationRate(name);
				
		}catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity("there is no credit card").build();
		}
		json.put("tasa", rate);
		json.put("marca", name);
		return Response.status(Response.Status.OK).entity(json.toString()).build();
		
	}
	
	
	
	@GET
	@Path("/verify")
	@Produces(MediaType.TEXT_PLAIN)
	public Response verifyRESTService() {
		String result = "Operation Rate for Credit Card Rest Successfully started..";
 
		// return HTTP response 200 in case of success
		return Response.status(200).entity(result).build();
	}
	
	
}
