package main.java.com.nocampo.jersey.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;


@Path("/ftoc")
public class TestApiRest {
	
	

	@GET
	@Produces("application/json")
	public Response convertFloat() throws JSONException{
		JSONObject json = new JSONObject();
		double f = 98.4;
		double c;
		c = (f-32) * 5/9;
		json.put("F", f);
		json.put("C", c);
		String result = "result produces jason convert Floats"+ json;
		return Response.status(200).entity(result).build();
	}
	
	@Path("{f}")
	@GET
	@Produces("application/json")
	public Response convertJsonInput(@PathParam("f") float f)throws JSONException {
		JSONObject json = new JSONObject();
		float c;
		c = (f-32) * 5/9;
		json.put("F", f);
		json.put("C", c);
		String result = "Result produces jason convert Floats whidt parameter"+json;
		return Response.status(200).entity(result).build();
	}

}
