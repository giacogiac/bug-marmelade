package crm.ha.product;

import javax.ws.rs.*; 
import javax.ws.rs.core.Response; 
import javax.ws.rs.core.Response.Status; 

@Path("/product")
public class Product {

	@GET
	@Path("/getPreferred/{customerID}")
	@Produces("txt/json")
	public Response getPreferred(@PathParam("customerID") String id) { 
		// Validate id
		if (id.equals("unknown"))
			return Response.status(Status.NOT_FOUND).build();
		// DB req to take all products's infos
		String resp = "The customer's preferred  product.";
		return Response.status(Status.OK).entity(resp).build(); 
	}
	
	@GET
	@Path("/search/{type}/{key}")
	@Produces("txt/json")
	public Response search(@PathParam("type") String type, @PathParam("key") String key) { 
		// Validate id
		if (type.equals("unknown"))
			return Response.status(Status.NOT_FOUND).build();
		//if (key.equals("unknown"))
			//return Response.status(Status.NOT_FOUND).build();
		// TODO
		String resp = "Result of search by "+type+": results_" + key;
		return Response.status(Status.OK).entity(resp).build(); 
	}

}
